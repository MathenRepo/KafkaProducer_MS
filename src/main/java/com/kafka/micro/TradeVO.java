package com.kafka.micro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TradeLog")
public class TradeVO {
	
	public TradeVO(long tradeID, String tradeFormat, String tradeSourceCurrency, String tradeDestinationCurrency,
			String tradeSourceValue) {
		super();
		this.tradeID = tradeID;
		this.tradeFormat = tradeFormat;
		this.tradeSourceCurrency = tradeSourceCurrency;
		this.tradeDestinationCurrency = tradeDestinationCurrency;
		this.tradeSourceValue = tradeSourceValue;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long tradeID;
	public String tradeFormat;
	public String tradeSourceCurrency;
	public String tradeDestinationCurrency;
	public String tradeSourceValue;
	
	public long getTradeID() {
		return tradeID;
	}
	public void setTradeID(long tradeID) {
		this.tradeID = tradeID;
	}
	public String getTradeFormat() {
		return tradeFormat;
	}
	public void setTradeFormat(String tradeFormat) {
		this.tradeFormat = tradeFormat;
	}
	public String getTradeSourceCurrency() {
		return tradeSourceCurrency;
	}
	public void setTradeSourceCurrency(String tradeSourceCurrency) {
		this.tradeSourceCurrency = tradeSourceCurrency;
	}
	public String getTradeDestinationCurrency() {
		return tradeDestinationCurrency;
	}
	public void setTradeDestinationCurrency(String tradeDestinationCurrency) {
		this.tradeDestinationCurrency = tradeDestinationCurrency;
	}
	public String getTradeSourceValue() {
		return tradeSourceValue;
	}
	public void setTradeSourceValue(String tradeSourceValue) {
		this.tradeSourceValue = tradeSourceValue;
	}
	@Override
	public String toString() {
		return "TradeVO [tradeID=" + tradeID + ", tradeFormat=" + tradeFormat + ", tradeSourceCurrency="
				+ tradeSourceCurrency + ", tradeDestinationCurrency=" + tradeDestinationCurrency + ", tradeSourceValue="
				+ tradeSourceValue + "]";
	}
	public TradeVO() {
		super();
	}

}
