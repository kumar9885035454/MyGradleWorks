package com.tc.app.exchangemonitor.entitybase;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.tc.app.exchangemonitor.model.ExternalComment;
import com.tc.app.exchangemonitor.model.ExternalTrade;

public interface IExchToolsTradeEntity extends Serializable
{
	public abstract Integer getExternalTradeOid();

	public abstract void setExternalTradeOid(Integer externalTradeOid);

	public abstract String getAcceptedAction();

	public abstract void setAcceptedAction(String acceptedAction);

	public abstract String getAcceptedBroker();

	public abstract void setAcceptedBroker(String acceptedBroker);

	public abstract String getAcceptedCompany();

	public abstract void setAcceptedCompany(String acceptedCompany);

	public abstract String getAcceptedTrader();

	public abstract void setAcceptedTrader(String acceptedTrader);

	public abstract String getBuyerAccount();

	public abstract void setBuyerAccount(String buyerAccount);

	public abstract String getCommodity();

	public abstract void setCommodity(String commodity);

	public abstract Date getCreationDate();

	public abstract void setCreationDate(Date creationDate);

	public abstract String getExchToolsTradeNum();

	public abstract void setExchToolsTradeNum(String exchToolsTradeNum);

	public abstract String getInputAction();

	public abstract void setInputAction(String inputAction);

	public abstract String getInputBroker();

	public abstract void setInputBroker(String inputBroker);

	public abstract String getInputCompany();

	public abstract void setInputCompany(String inputCompany);

	public abstract String getInputTrader();

	public abstract void setInputTrader(String inputTrader);

	public abstract double getPrice();

	public abstract void setPrice(double price);

	public abstract double getQuantity();

	public abstract void setQuantity(double quantity);

	public abstract String getSellerAccount();

	public abstract void setSellerAccount(String sellerAccount);

	public abstract String getTradingPeriod();

	public abstract void setTradingPeriod(String tradingPeriod);

	public abstract Date getBeginDate();

	public abstract void setBeginDate(Date beginDate);

	public abstract Date getEndDate();

	public abstract void setEndDate(Date endDate);

	public abstract String getCallPut();

	public abstract void setCallPut(String callPut);

	public abstract Double getStrikePrice();

	public abstract void setStrikePrice(Double strikePrice);

	public abstract Double getBuyerCommCost();

	public abstract void setBuyerCommCost(Double buyerCommCost);

	public abstract String getBuyerCommCurr();

	public abstract void setBuyerCommCurr(String buyerCommCurr);

	public abstract Double getSellerCommCost();

	public abstract void setSellerCommCost(Double sellerCommCost);

	public abstract String getSellerCommCurr();

	public abstract void setSellerCommCurr(String sellerCommCurr);

	public abstract int getTransId();

	public abstract void setTransId(int transId);

	public abstract String getBuyerClrngBroker();

	public abstract void setBuyerClrngBroker(String buyerClrngBroker);

	public abstract String getSellerClrngBroker();

	public abstract void setSellerClrngBroker(String sellerClrngBroker);

	public abstract String getAcctContact();

	public abstract void setAcctContact(String acctContact);

	public abstract String getGtc();

	public abstract void setGtc(String gtc);

	public abstract String getTradeType();

	public abstract void setTradeType(String tradeType);

	public abstract String getRiskMarket();

	public abstract void setRiskMarket(String riskMarket);

	public abstract String getTitleMarket();

	public abstract void setTitleMarket(String titleMarket);

	public abstract String getQtyUom();

	public abstract void setQtyUom(String qtyUom);

	public abstract Date getDelDateFrom();

	public abstract void setDelDateFrom(Date delDateFrom);

	public abstract Date getDelDateTo();

	public abstract void setDelDateTo(Date delDateTo);

	public abstract String getMot();

	public abstract void setMot(String mot);

	public abstract String getTitleTransfer();

	public abstract void setTitleTransfer(String titleTransfer);

	public abstract Character getPriceType();

	public abstract void setPriceType(Character priceType);

	public abstract String getFormulaName();

	public abstract void setFormulaName(String formulaName);

	public abstract Date getEventDeemedDate();

	public abstract void setEventDeemedDate(Date eventDeemedDate);

	public abstract String getPriceUom();

	public abstract void setPriceUom(String priceUom);

	public abstract String getPriceCurrency();

	public abstract void setPriceCurrency(String priceCurrency);

	public abstract Integer getTemplateTradeNum();

	public abstract void setTemplateTradeNum(Integer templateTradeNum);

	public abstract String getFloatMarketQuote1();

	public abstract void setFloatMarketQuote1(String floatMarketQuote1);

	public abstract String getFloatMarketQuote2();

	public abstract void setFloatMarketQuote2(String floatMarketQuote2);

	public abstract BigDecimal getFloatQty1();

	public abstract void setFloatQty1(BigDecimal floatQty1);

	public abstract BigDecimal getFloatQty2();

	public abstract void setFloatQty2(BigDecimal floatQty2);

	public abstract Date getPremiumDate();

	public abstract void setPremiumDate(Date premiumDate);

	public abstract Character getAutoExercInd();

	public abstract void setAutoExercInd(Character autoExercInd);

	public abstract Integer getProductId();

	public abstract void setProductId(Integer productId);

	public abstract ExternalComment getExternalCommentOid();

	public abstract void setExternalCommentOid(ExternalComment externalCommentOid);

	public abstract ExternalTrade getExternalTrade();

	public abstract void setExternalTrade(ExternalTrade externalTrade);
}