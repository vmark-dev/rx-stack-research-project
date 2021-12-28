package dev.vmark.rxstackresearchproject.binance.client.domain.market.ExchangeInfo;

public class Asset{
    private String autoAssetExchange;
    private String asset;
    private boolean marginAvailable;

    public void setAutoAssetExchange(String autoAssetExchange){
        this.autoAssetExchange = autoAssetExchange;
    }

    public String getAutoAssetExchange(){
        return autoAssetExchange;
    }

    public void setAsset(String asset){
        this.asset = asset;
    }

    public String getAsset(){
        return asset;
    }

    public void setMarginAvailable(boolean marginAvailable){
        this.marginAvailable = marginAvailable;
    }

    public boolean isMarginAvailable(){
        return marginAvailable;
    }
}
