package com.exchange.exchangeproducerkafka;

import org.springframework.stereotype.Component;

@Component
public class Payload {
	private String pair;
	private String bid;
	private String ask;
	private String price_24h_change;
	private String volume_24h_change;
	private String price_24h_max;
	private String price_24h_min;
	private int volume;
	private String date_ts;
//	private LocalDateTime date_ts;

	public Payload() {
	}
	
	public Payload(String pair, String bid, String ask, String price_24h_change, String volume_24h_change,
			String price_24h_max, String price_24h_min, int volume, String date_ts) {
		super();
		this.pair = pair;
		this.bid = bid;
		this.ask = ask;
		this.price_24h_change = price_24h_change;
		this.volume_24h_change = volume_24h_change;
		this.price_24h_max = price_24h_max;
		this.price_24h_min = price_24h_min;
		this.volume = volume;
		this.date_ts = date_ts;
	}

	public String getPair() {
		return pair;
	}

	public void setPair(String pair) {
		this.pair = pair;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getAsk() {
		return ask;
	}

	public void setAsk(String ask) {
		this.ask = ask;
	}

	public String getPrice_24h_change() {
		return price_24h_change;
	}

	public void setPrice_24h_change(String price_24h_change) {
		this.price_24h_change = price_24h_change;
	}

	public String getVolume_24h_change() {
		return volume_24h_change;
	}

	public void setVolume_24h_change(String volume_24h_change) {
		this.volume_24h_change = volume_24h_change;
	}

	public String getPrice_24h_max() {
		return price_24h_max;
	}

	public void setPrice_24h_max(String price_24h_max) {
		this.price_24h_max = price_24h_max;
	}

	public String getPrice_24h_min() {
		return price_24h_min;
	}

	public void setPrice_24h_min(String price_24h_min) {
		this.price_24h_min = price_24h_min;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getDate_ts() {
		return date_ts;
	}

	public void setDate_ts(String date_ts) {
		this.date_ts = date_ts;
	}
	
	
}
