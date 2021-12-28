package dev.vmark.rxstackresearchproject.binance.client;

import dev.vmark.rxstackresearchproject.binance.client.impl.BinanceApiAsyncRestClientImpl;
import dev.vmark.rxstackresearchproject.binance.client.impl.BinanceFuturesApiRestClientImpl;
import dev.vmark.rxstackresearchproject.binance.client.impl.BinanceFuturesApiWebSocketClientImpl;

/**
 * A factory for creating BinanceApi client objects.
 */
public class BinanceFuturesApiClientFactory {

  /**
   * API Key
   */
  private String apiKey;

  /**
   * Secret.
   */
  private String secret;

  /**
   * Instantiates a new binance api client factory.
   *
   * @param apiKey the API key
   * @param secret the Secret
   */
  private BinanceFuturesApiClientFactory(String apiKey, String secret) {
    this.apiKey = apiKey;
    this.secret = secret;
  }

  /**
   * New instance.
   *
   * @param apiKey the API key
   * @param secret the Secret
   *
   * @return the binance api client factory
   */
  public static BinanceFuturesApiClientFactory newInstance(String apiKey, String secret) {
    return new BinanceFuturesApiClientFactory(apiKey, secret);
  }

  /**
   * New instance without authentication.
   *
   * @return the binance api client factory
   */
  public static BinanceFuturesApiClientFactory newInstance() {
    return new BinanceFuturesApiClientFactory(null, null);
  }

  /**
   * Creates a new synchronous/blocking REST client.
   */
  public BinanceFuturesApiRestClientImpl newRestClient() {
    return new BinanceFuturesApiRestClientImpl(apiKey, secret);
  }

  /**
   * Creates a new asynchronous/non-blocking REST client.
   */
  public BinanceApiAsyncRestClient newAsyncRestClient() {return new BinanceApiAsyncRestClientImpl(apiKey, secret);
  }

  /**
   * Creates a new web socket client used for handling data streams.
   */
  public BinanceFuturesApiWebSocketClient newWebSocketClient() {
    return new BinanceFuturesApiWebSocketClientImpl();
  }
}
