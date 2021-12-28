package dev.vmark.rxstackresearchproject.binance.client.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.vmark.rxstackresearchproject.binance.client.BinanceApiCallback;
import dev.vmark.rxstackresearchproject.binance.client.exception.BinanceApiException;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

import java.io.IOException;

/**
 * Binance API WebSocket listener.
 */
public class BinanceApiWebSocketListener<T> extends WebSocketListener {

    private BinanceApiCallback<T> callback;

    private Class<T> eventClass;

    private final ObjectMapper mapper = new ObjectMapper();

    public BinanceApiWebSocketListener(BinanceApiCallback<T> callback, Class<T> eventClass) {
        this.callback = callback;
        this.eventClass = eventClass;
    }

    @Override
    public void onMessage(WebSocket webSocket, String text) {
        if (text.contains("result") && text.contains("id")) {
            System.out.println("OK");
        } else {
            try {
                T event = mapper.readValue(text, eventClass);
                callback.onResponse(event);
            } catch (IOException e) {
                throw new BinanceApiException(e);
            }
        }
    }

    @Override
    public void onFailure(WebSocket webSocket, Throwable t, Response response) {
        throw new BinanceApiException(t);
    }
}