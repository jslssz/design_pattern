package com.hx.typeofdecorator;

import com.hx.Decorator;
import com.hx.Drink;

/**
 * @author jxlgcmh
 * @create 2019-05-23 14:58
 */
public class Sugar extends Decorator {
	
	public Sugar(Drink drink) {
		super(drink);
		super.setDescription("sugar");
		super.setPrice(5);
	}
}
