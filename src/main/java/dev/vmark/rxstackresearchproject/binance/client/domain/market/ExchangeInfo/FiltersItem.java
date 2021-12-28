package dev.vmark.rxstackresearchproject.binance.client.domain.market.ExchangeInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FiltersItem{

	@JsonProperty("multiplierDown")
	private String multiplierDown;

	@JsonProperty("multiplierUp")
	private String multiplierUp;

	@JsonProperty("multiplierDecimal")
	private String multiplierDecimal;

	@JsonProperty("filterType")
	private String filterType;

	@JsonProperty("notional")
	private String notional;

	@JsonProperty("limit")
	private int limit;

	@JsonProperty("stepSize")
	private String stepSize;

	@JsonProperty("maxQty")
	private String maxQty;

	@JsonProperty("minQty")
	private String minQty;

	@JsonProperty("minPrice")
	private String minPrice;

	@JsonProperty("maxPrice")
	private String maxPrice;

	@JsonProperty("tickSize")
	private String tickSize;

	public void setMultiplierDown(String multiplierDown){
		this.multiplierDown = multiplierDown;
	}

	public String getMultiplierDown(){
		return multiplierDown;
	}

	public void setMultiplierUp(String multiplierUp){
		this.multiplierUp = multiplierUp;
	}

	public String getMultiplierUp(){
		return multiplierUp;
	}

	public void setMultiplierDecimal(String multiplierDecimal){
		this.multiplierDecimal = multiplierDecimal;
	}

	public String getMultiplierDecimal(){
		return multiplierDecimal;
	}

	public void setFilterType(String filterType){
		this.filterType = filterType;
	}

	public String getFilterType(){
		return filterType;
	}

	public void setNotional(String notional){
		this.notional = notional;
	}

	public String getNotional(){
		return notional;
	}

	public void setLimit(int limit){
		this.limit = limit;
	}

	public int getLimit(){
		return limit;
	}

	public void setStepSize(String stepSize){
		this.stepSize = stepSize;
	}

	public String getStepSize(){
		return stepSize;
	}

	public void setMaxQty(String maxQty){
		this.maxQty = maxQty;
	}

	public String getMaxQty(){
		return maxQty;
	}

	public void setMinQty(String minQty){
		this.minQty = minQty;
	}

	public String getMinQty(){
		return minQty;
	}

	public void setMinPrice(String minPrice){
		this.minPrice = minPrice;
	}

	public String getMinPrice(){
		return minPrice;
	}

	public void setMaxPrice(String maxPrice){
		this.maxPrice = maxPrice;
	}

	public String getMaxPrice(){
		return maxPrice;
	}

	public void setTickSize(String tickSize){
		this.tickSize = tickSize;
	}

	public String getTickSize(){
		return tickSize;
	}

	@Override
 	public String toString(){
		return 
			"FiltersItem{" + 
			"multiplierDown = '" + multiplierDown + '\'' + 
			",multiplierUp = '" + multiplierUp + '\'' + 
			",multiplierDecimal = '" + multiplierDecimal + '\'' + 
			",filterType = '" + filterType + '\'' + 
			",notional = '" + notional + '\'' + 
			",limit = '" + limit + '\'' + 
			",stepSize = '" + stepSize + '\'' + 
			",maxQty = '" + maxQty + '\'' + 
			",minQty = '" + minQty + '\'' + 
			",minPrice = '" + minPrice + '\'' + 
			",maxPrice = '" + maxPrice + '\'' + 
			",tickSize = '" + tickSize + '\'' + 
			"}";
		}
}