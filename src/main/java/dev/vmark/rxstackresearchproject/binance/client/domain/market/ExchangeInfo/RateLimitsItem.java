package dev.vmark.rxstackresearchproject.binance.client.domain.market.ExchangeInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RateLimitsItem{

	@JsonProperty("intervalNum")
	private int intervalNum;

	@JsonProperty("limit")
	private int limit;

	@JsonProperty("interval")
	private String interval;

	@JsonProperty("rateLimitType")
	private String rateLimitType;

	public void setIntervalNum(int intervalNum){
		this.intervalNum = intervalNum;
	}

	public int getIntervalNum(){
		return intervalNum;
	}

	public void setLimit(int limit){
		this.limit = limit;
	}

	public int getLimit(){
		return limit;
	}

	public void setInterval(String interval){
		this.interval = interval;
	}

	public String getInterval(){
		return interval;
	}

	public void setRateLimitType(String rateLimitType){
		this.rateLimitType = rateLimitType;
	}

	public String getRateLimitType(){
		return rateLimitType;
	}

	@Override
 	public String toString(){
		return 
			"RateLimitsItem{" + 
			"intervalNum = '" + intervalNum + '\'' + 
			",limit = '" + limit + '\'' + 
			",interval = '" + interval + '\'' + 
			",rateLimitType = '" + rateLimitType + '\'' + 
			"}";
		}
}