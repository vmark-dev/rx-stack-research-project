package dev.vmark.rxstackresearchproject.binance.client.impl;

import dev.vmark.rxstackresearchproject.binance.client.BinanceApiCallback;
import dev.vmark.rxstackresearchproject.binance.client.BinanceFuturesApiWebSocketClient;
import dev.vmark.rxstackresearchproject.binance.client.constant.BinanceApiConstants;
import dev.vmark.rxstackresearchproject.binance.client.domain.Subscription;
import dev.vmark.rxstackresearchproject.binance.client.domain.event.*;
import dev.vmark.rxstackresearchproject.binance.client.domain.market.CandlestickInterval;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Binance API WebSocket client implementation using OkHttp.
 */
public class BinanceFuturesApiWebSocketClientImpl implements BinanceFuturesApiWebSocketClient, Closeable {

  private OkHttpClient client;

  public BinanceFuturesApiWebSocketClientImpl() {
    this.client = new OkHttpClient();
  }

  public void onDepthEvent(String symbol, BinanceApiCallback<DepthEvent> callback) {
    final String channel = String.format("%s@depth", symbol);
    createNewWebSocket(channel, new BinanceApiWebSocketListener<>(callback, DepthEvent.class));
  }

  @Override
  public void onCandlestickEvent(String symbol, CandlestickInterval interval, BinanceApiCallback<CandlestickEvent> callback) {
    final String channel = String.format("%s@kline_%s", symbol, interval.getIntervalId());
    createNewWebSocket(channel, new BinanceApiWebSocketListener<>(callback, CandlestickEvent.class));
  }

  public void onAggTradeEvent(String symbol, BinanceApiCallback<AggTradeEvent> callback) {
    final String channel = String.format("%s@aggTrade", symbol);
    createNewWebSocket(channel, new BinanceApiWebSocketListener<>(callback, AggTradeEvent.class));
  }

  public void onUserDataUpdateEvent(String listenKey, BinanceApiCallback<UserDataUpdateEvent> callback) {
    createNewWebSocket(listenKey, new BinanceApiWebSocketListener<>(callback, UserDataUpdateEvent.class));
  }

  @Override
  public void onCandlestickEventForMultipleSymbols(Collection<String> initialSymbols, CandlestickInterval interval, BinanceApiCallback<CandlestickStreamEvent> callback, Collection<String> extraSymbols) {
    final String initialChannel = initialSymbols.stream().map(s -> String.format("%s@kline_%s", s.toLowerCase(),
            interval.getIntervalId())).collect(Collectors.joining("/"));
    final Collection<String> extraChannels = extraSymbols.stream().map(s -> String.format("%s@kline_%s", s.toLowerCase(),
            interval.getIntervalId())).collect(Collectors.toList());
    createNewWebSocketForCombinedStreams(initialChannel, new BinanceApiWebSocketListener<>(callback, CandlestickStreamEvent.class), extraChannels);
  }

  private void createNewWebSocket(String channel, BinanceApiWebSocketListener<?> listener) {
    String streamingUrl = String.format("%s/%s", BinanceApiConstants.WS_API_BASE_URL, channel);
    Request request = new Request.Builder().url(streamingUrl).build();
    client.newWebSocket(request, listener);
  }

  @Override
  public void close() throws IOException {
    client.dispatcher().executorService().shutdown();
  }

  /**
   * Расширенная подаписка. Дополнительные подписки оформлсяются отдельным действием Send.
   *
   * @param initialChannel - Стартовый канал для подписки.
   * @param listener
   * @param extraChannels - Дополнительные каналы для подписки. Подписка оформляется уже после создания
   *                      первичной подписки.
   */
  private void createNewWebSocketForCombinedStreams(String initialChannel, BinanceApiWebSocketListener<?> listener,
                                                    Collection<String> extraChannels) {
    String streamingUrl = String.format("%s%s", BinanceApiConstants.WS_API_COMBINED_STREAMS_URL, initialChannel);
    Request request = new Request.Builder().url(streamingUrl).build();
    WebSocket webSocket = client.newWebSocket(request, listener);
    Subscription subscription = new Subscription(extraChannels, 1);
    webSocket.send(subscription.toJson());
  }
}
