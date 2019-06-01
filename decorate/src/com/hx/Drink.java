package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-05-23 14:38
 */
public abstract class Drink {
	public String description="";
	private double price=0.0;
	
	
	public abstract double cost();
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
