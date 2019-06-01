package com.hx.typeofdecorator;

import com.hx.Decorator;
import com.hx.Drink;

/**
 * @author jxlgcmh
 * @create 2019-05-23 15:19
 */
public class Chocolate extends Decorator {
	public Chocolate(Drink drink) {
		super(drink);
		super.setPrice(99);
		super.setDescription("Chocolate");
	}
}
