package dev.vmark.rxstackresearchproject.binance.client.domain.market.ExchangeInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ExchangeInfo {

	@JsonProperty("futuresType")
	private String futuresType;

	@JsonProperty("rateLimits")
	private List<RateLimitsItem> rateLimits;

	@JsonProperty("exchangeFilters")
	private List<Object> exchangeFilters;

	@JsonProperty("timezone")
	private String timezone;

	@JsonProperty("serverTime")
	private long serverTime;

	@JsonProperty("symbols")
	private List<SymbolsItem> symbols;

	@JsonProperty("assets")
	private List<Asset> assets;

	public void setFuturesType(String futuresType){
		this.futuresType = futuresType;
	}

	public String getFuturesType(){
		return futuresType;
	}

	public void setRateLimits(List<RateLimitsItem> rateLimits){
		this.rateLimits = rateLimits;
	}

	public List<RateLimitsItem> getRateLimits(){
		return rateLimits;
	}

	public void setExchangeFilters(List<Object> exchangeFilters){
		this.exchangeFilters = exchangeFilters;
	}

	public List<Object> getExchangeFilters(){
		return exchangeFilters;
	}

	public void setTimezone(String timezone){
		this.timezone = timezone;
	}

	public String getTimezone(){
		return timezone;
	}

	public void setServerTime(long serverTime){
		this.serverTime = serverTime;
	}

	public long getServerTime(){
		return serverTime;
	}

	public void setSymbols(List<SymbolsItem> symbols){
		this.symbols = symbols;
	}

	public List<SymbolsItem> getSymbols(){
		return symbols;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"futuresType = '" + futuresType + '\'' + 
			",rateLimits = '" + rateLimits + '\'' + 
			",exchangeFilters = '" + exchangeFilters + '\'' + 
			",timezone = '" + timezone + '\'' + 
			",serverTime = '" + serverTime + '\'' + 
			",symbols = '" + symbols + '\'' + 
			"}";
		}
}