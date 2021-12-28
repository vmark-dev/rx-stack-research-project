package dev.vmark.rxstackresearchproject.config;

import dev.vmark.rxstackresearchproject.binance.client.BinanceFuturesApiClientFactory;
import dev.vmark.rxstackresearchproject.binance.client.BinanceFuturesApiWebSocketClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BinanceConnectionConfig {

    public static final List<String> SYMBOLS = List.of("RAYUSDT","SUSHIUSDT","CVCUSDT","BTSUSDT","HOTUSDT","ZRXUSDT","QTUMUSDT",
            "IOTAUSDT","BTCBUSD","WAVESUSDT","ADAUSDT","LITUSDT","NUUSDT","XTZUSDT","BNBUSDT","AKROUSDT","HNTUSDT",
            "ETCUSDT","XMRUSDT","YFIUSDT","FTTBUSD","ETHUSDT","ALICEUSDT","ALPHAUSDT","SFPUSDT","REEFUSDT","BATUSDT",
            "DOGEUSDT","TRXUSDT","RLCUSDT","STORJUSDT","SNXUSDT","1000XECUSDT","AUDIOUSDT","XLMUSDT","IOTXUSDT",
            "NEOUSDT","UNFIUSDT","SANDUSDT","DASHUSDT","KAVAUSDT","RUNEUSDT","CTKUSDT","LINKUSDT","CELRUSDT","RSRUSDT",
            "ADABUSD","DGBUSDT","SKLUSDT","RENUSDT","LPTUSDT","TOMOUSDT","MTLUSDT","LTCUSDT","DODOUSDT","EGLDUSDT",
            "KSMUSDT","BNBBUSD","ONTUSDT","VETUSDT","TRBUSDT","MANAUSDT","COTIUSDT","CHRUSDT","BAKEUSDT","GRTUSDT",
            "FLMUSDT","MASKUSDT","EOSUSDT","OGNUSDT","SCUSDT","BALUSDT","STMXUSDT","BTTUSDT","LUNAUSDT","DENTUSDT",
            "KNCUSDT","SRMUSDT","ENJUSDT","C98USDT","ZENUSDT","ATOMUSDT","NEARUSDT","SOLBUSD","ENSUSDT","BCHUSDT",
            "ATAUSDT","IOSTUSDT","HBARUSDT","ZECUSDT","1000SHIBUSDT","TLMUSDT","ANTUSDT","ETHBUSD","GALAUSDT",
            "AAVEUSDT","GTCUSDT","ALGOUSDT","ICPUSDT","LRCUSDT","AVAXUSDT","BTCUSDT_220325","ARPAUSDT","CELOUSDT",
            "MATICUSDT","1INCHUSDT","MKRUSDT","PEOPLEUSDT","THETAUSDT","UNIUSDT","LINAUSDT","ARUSDT","RVNUSDT","FILUSDT"
            ,"NKNUSDT","KLAYUSDT","DEFIUSDT","COMPUSDT","BTCDOMUSDT","SOLUSDT","BTCUSDT","OMGUSDT","ICXUSDT","BLZUSDT",
            "FTMUSDT","YFIIUSDT","KEEPUSDT","BANDUSDT","XRPBUSD","DOGEBUSD","XRPUSDT","SXPUSDT","CRVUSDT","BELUSDT",
            "DOTUSDT","XEMUSDT","ONEUSDT","ZILUSDT","AXSUSDT","DYDXUSDT","OCEANUSDT","CHZUSDT","ANKRUSDT","CTSIUSDT");

    @Bean
    public BinanceFuturesApiWebSocketClient binanceFuturesApiWebSocketClient()  {
        return BinanceFuturesApiClientFactory.newInstance().newWebSocketClient();
    }
}
