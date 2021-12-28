package dev.vmark.rxstackresearchproject.binance.client.domain.market.ExchangeInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SymbolsItem{

	@JsonProperty("quantityPrecision")
	private int quantityPrecision;

	@JsonProperty("symbol")
	private String symbol;

	@JsonProperty("pricePrecision")
	private int pricePrecision;

	@JsonProperty("requiredMarginPercent")
	private String requiredMarginPercent;

	@JsonProperty("contractType")
	private String contractType;

	@JsonProperty("onboardDate")
	private long onboardDate;

	@JsonProperty("baseAsset")
	private String baseAsset;

	@JsonProperty("filters")
	private List<FiltersItem> filters;

	@JsonProperty("baseAssetPrecision")
	private int baseAssetPrecision;

	@JsonProperty("settlePlan")
	private int settlePlan;

	@JsonProperty("pair")
	private String pair;

	@JsonProperty("triggerProtect")
	private String triggerProtect;

	@JsonProperty("marginAsset")
	private String marginAsset;

	@JsonProperty("quotePrecision")
	private int quotePrecision;

	@JsonProperty("underlyingType")
	private String underlyingType;

	@JsonProperty("orderTypes")
	private List<String> orderTypes;

	@JsonProperty("maintMarginPercent")
	private String maintMarginPercent;

	@JsonProperty("deliveryDate")
	private long deliveryDate;

	@JsonProperty("timeInForce")
	private List<String> timeInForce;

	@JsonProperty("quoteAsset")
	private String quoteAsset;

	@JsonProperty("status")
	private String status;

	@JsonProperty("liquidationFee")
	private String liquidationFee;

	@JsonProperty("marketTakeBound")
	private String marketTakeBound;

	@JsonProperty("underlyingSubType")
	private List<Object> underlyingSubType;

	public String getMarketTakeBound() {
		return marketTakeBound;
	}

	public void setMarketTakeBound(String marketTakeBound) {
		this.marketTakeBound = marketTakeBound;
	}

	public void setQuantityPrecision(int quantityPrecision){
		this.quantityPrecision = quantityPrecision;
	}

	public int getQuantityPrecision(){
		return quantityPrecision;
	}

	public void setSymbol(String symbol){
		this.symbol = symbol;
	}

	public String getSymbol(){
		return symbol;
	}

	public void setPricePrecision(int pricePrecision){
		this.pricePrecision = pricePrecision;
	}

	public int getPricePrecision(){
		return pricePrecision;
	}

	public void setRequiredMarginPercent(String requiredMarginPercent){
		this.requiredMarginPercent = requiredMarginPercent;
	}

	public String getRequiredMarginPercent(){
		return requiredMarginPercent;
	}

	public void setContractType(String contractType){
		this.contractType = contractType;
	}

	public String getContractType(){
		return contractType;
	}

	public void setOnboardDate(long onboardDate){
		this.onboardDate = onboardDate;
	}

	public long getOnboardDate(){
		return onboardDate;
	}

	public void setBaseAsset(String baseAsset){
		this.baseAsset = baseAsset;
	}

	public String getBaseAsset(){
		return baseAsset;
	}

	public void setFilters(List<FiltersItem> filters){
		this.filters = filters;
	}

	public List<FiltersItem> getFilters(){
		return filters;
	}

	public void setBaseAssetPrecision(int baseAssetPrecision){
		this.baseAssetPrecision = baseAssetPrecision;
	}

	public int getBaseAssetPrecision(){
		return baseAssetPrecision;
	}

	public void setSettlePlan(int settlePlan){
		this.settlePlan = settlePlan;
	}

	public int getSettlePlan(){
		return settlePlan;
	}

	public void setPair(String pair){
		this.pair = pair;
	}

	public String getPair(){
		return pair;
	}

	public void setTriggerProtect(String triggerProtect){
		this.triggerProtect = triggerProtect;
	}

	public String getTriggerProtect(){
		return triggerProtect;
	}

	public void setMarginAsset(String marginAsset){
		this.marginAsset = marginAsset;
	}

	public String getMarginAsset(){
		return marginAsset;
	}

	public void setQuotePrecision(int quotePrecision){
		this.quotePrecision = quotePrecision;
	}

	public int getQuotePrecision(){
		return quotePrecision;
	}

	public void setUnderlyingType(String underlyingType){
		this.underlyingType = underlyingType;
	}

	public String getUnderlyingType(){
		return underlyingType;
	}

	public void setOrderTypes(List<String> orderTypes){
		this.orderTypes = orderTypes;
	}

	public List<String> getOrderTypes(){
		return orderTypes;
	}

	public void setMaintMarginPercent(String maintMarginPercent){
		this.maintMarginPercent = maintMarginPercent;
	}

	public String getMaintMarginPercent(){
		return maintMarginPercent;
	}

	public void setDeliveryDate(long deliveryDate){
		this.deliveryDate = deliveryDate;
	}

	public long getDeliveryDate(){
		return deliveryDate;
	}

	public void setTimeInForce(List<String> timeInForce){
		this.timeInForce = timeInForce;
	}

	public List<String> getTimeInForce(){
		return timeInForce;
	}

	public void setQuoteAsset(String quoteAsset){
		this.quoteAsset = quoteAsset;
	}

	public String getQuoteAsset(){
		return quoteAsset;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setUnderlyingSubType(List<Object> underlyingSubType){
		this.underlyingSubType = underlyingSubType;
	}

	public List<Object> getUnderlyingSubType(){
		return underlyingSubType;
	}

	public String getLiquidationFee() {
		return liquidationFee;
	}

	public void setLiquidationFee(String liquidationFee) {
		this.liquidationFee = liquidationFee;
	}

	@Override
 	public String toString(){
		return 
			"SymbolsItem{" + 
			"quantityPrecision = '" + quantityPrecision + '\'' + 
			",symbol = '" + symbol + '\'' + 
			",pricePrecision = '" + pricePrecision + '\'' + 
			",requiredMarginPercent = '" + requiredMarginPercent + '\'' + 
			",contractType = '" + contractType + '\'' + 
			",onboardDate = '" + onboardDate + '\'' + 
			",baseAsset = '" + baseAsset + '\'' + 
			",filters = '" + filters + '\'' + 
			",baseAssetPrecision = '" + baseAssetPrecision + '\'' + 
			",settlePlan = '" + settlePlan + '\'' + 
			",pair = '" + pair + '\'' + 
			",triggerProtect = '" + triggerProtect + '\'' + 
			",marginAsset = '" + marginAsset + '\'' + 
			",quotePrecision = '" + quotePrecision + '\'' + 
			",underlyingType = '" + underlyingType + '\'' + 
			",orderTypes = '" + orderTypes + '\'' + 
			",maintMarginPercent = '" + maintMarginPercent + '\'' + 
			",deliveryDate = '" + deliveryDate + '\'' + 
			",timeInForce = '" + timeInForce + '\'' + 
			",quoteAsset = '" + quoteAsset + '\'' + 
			",status = '" + status + '\'' + 
			",underlyingSubType = '" + underlyingSubType + '\'' + 
			"}";
		}
}