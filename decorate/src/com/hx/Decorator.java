package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-05-23 14:47
 */
public class Decorator  extends Drink{
	
	private Drink drink;
	
	public Decorator(Drink drink){
		this.drink =drink;
	}
	
	@Override
	public double cost() {
		return super.getPrice()+drink.cost();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+"\t"+drink.getDescription()+"\t";
	}
}
