package com.hx.interfacedemo.impl;

import com.hx.interfacedemo.Fly;

/**
 * @author jxlgcmh
 * @create 2019-05-22 14:07
 */
public class SlowFly implements Fly {
	@Override
	public void isFly() {
		System.out.println("i am fly slow");
	}
}
