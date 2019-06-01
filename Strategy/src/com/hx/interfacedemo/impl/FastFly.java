package com.hx.interfacedemo.impl;

import com.hx.interfacedemo.Fly;

/**
 * @author jxlgcmh
 * @create 2019-05-22 14:08
 */
public class FastFly implements Fly {
	
	
	@Override
	public void isFly() {
		System.out.println("i am fly fast");
	}
}
