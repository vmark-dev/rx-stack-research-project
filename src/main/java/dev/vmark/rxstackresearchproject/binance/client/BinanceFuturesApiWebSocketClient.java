package dev.vmark.rxstackresearchproject.binance.client;

import dev.vmark.rxstackresearchproject.binance.client.domain.event.*;
import dev.vmark.rxstackresearchproject.binance.client.domain.market.CandlestickInterval;

import java.util.Collection;

/**
 * Binance API data streaming façade, supporting streaming of events through web sockets.
 */
public interface BinanceFuturesApiWebSocketClient {

  void onDepthEvent(String symbol, BinanceApiCallback<DepthEvent> callback);

  void onCandlestickEvent(String symbol, CandlestickInterval interval, BinanceApiCallback<CandlestickEvent> callback);

  void onAggTradeEvent(String symbol, BinanceApiCallback<AggTradeEvent> callback);

  void onUserDataUpdateEvent(String listenKey, BinanceApiCallback<UserDataUpdateEvent> callback);

  void onCandlestickEventForMultipleSymbols(Collection<String> symbols, CandlestickInterval interval,
                                            BinanceApiCallback<CandlestickStreamEvent> callback,
                                            Collection<String> extraChannels);
}
