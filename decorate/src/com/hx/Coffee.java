package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-05-23 14:41
 */
public class Coffee extends Drink {
	@Override
	public double cost() {
		return super.getPrice();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription();
	}
}
