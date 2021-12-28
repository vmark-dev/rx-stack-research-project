package dev.vmark.rxstackresearchproject.binance.client.domain.event;

//{"stream":"adausdt@kline_5m","data":{"e":"kline","E":1618146341218,"s":"ADAUSDT","k":{"t":1618146300000,"T":1618146599999,"s":"ADAUSDT","i":"5m","f":120783821,"L":120786291,"o":"1.27658000","c":"1.27282000","h":"1.27697000","l":"1.26800000","v":"1294286.80000000","n":2471,"x":false,"q":"1646596.97257800","V":"469899.90000000","Q":"597888.25749000","B":"0"}}}
public class CandlestickStreamEvent {
    private String stream;
    CandlestickEvent data;

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public CandlestickEvent getData() {
        return data;
    }

    public void setData(CandlestickEvent data) {
        this.data = data;
    }
}
