package dev.vmark.rxstackresearchproject.processor;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.vmark.rxstackresearchproject.binance.client.BinanceFuturesApiWebSocketClient;
import dev.vmark.rxstackresearchproject.binance.client.domain.event.CandlestickStreamEvent;
import dev.vmark.rxstackresearchproject.binance.client.domain.market.CandlestickInterval;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static dev.vmark.rxstackresearchproject.config.BinanceConnectionConfig.SYMBOLS;

@Slf4j
@Component
public class CandlestickProcessor {

    private final BinanceFuturesApiWebSocketClient futuresApiWebSocketClient;
    private final ObjectMapper objectMapper;
    private final List<String> symbols = new ArrayList<>(SYMBOLS);

    public CandlestickProcessor(BinanceFuturesApiWebSocketClient futuresApiWebSocketClient,
                                ObjectMapper objectMapper) {
        this.futuresApiWebSocketClient = futuresApiWebSocketClient;
        this.objectMapper = objectMapper;
        init();
    }

    public void init(){
        val first = symbols.stream().findFirst()
                .orElseThrow(() -> new NoSuchElementException("Binance Futures Symbols set is empty"));
        symbols.remove(first);
        futuresApiWebSocketClient.onCandlestickEventForMultipleSymbols(List.of(first),  // Primary subscription by one character
                CandlestickInterval.FIVE_MINUTES, this::process,  // In the callback, the candlestick data is processed in a separate thread.
        symbols // The rest (except for the first) characters to which the subscription is made
        );
    }

    @SneakyThrows
    private void process(CandlestickStreamEvent se) {
        log.debug(objectMapper.writeValueAsString(se));
    }

}
