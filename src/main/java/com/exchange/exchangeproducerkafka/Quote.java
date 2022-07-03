package com.exchange.exchangeproducerkafka;

import org.springframework.stereotype.Component;

@Component
public class Quote {
	private String type;
	private String source;
	private Payload payload;
	
	public Quote() {}
	
	public Quote(String type, String source, Payload payload) {
		super();
		this.type = type;
		this.source = source;
		this.payload = payload;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}
	
	
	
}
