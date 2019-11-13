package com.hx;

import com.hx.typeofcoffee.LatteCoffee;
import com.hx.typeofcoffee.MochaCoffee;
import com.hx.typeofdecorator.Chocolate;
import com.hx.typeofdecorator.Sugar;

/**
 * @author jxlgcmh
 * @create 2019-05-23 15:04
 */
public class Client {
	public static void main(String[] args) {
//		MochaCoffee mochaCoffee=new MochaCoffee();
//		double cost = mochaCoffee.cost();
//		System.out.println(cost);
		
		Drink drink=new LatteCoffee();
		drink=new Sugar(drink);
		drink=new Chocolate(drink);
		drink=new Chocolate(drink);
		System.out.println(drink.cost());
		System.out.println(drink.getDescription());
	
	}
}
