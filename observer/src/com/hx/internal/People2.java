package com.hx.internal;

import java.util.Observable;
import java.util.Observer;

/**
 * @author jxlgcmh
 * @create 2019-05-23 14:15
 */
public class People2 implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		show();
	}
	
	private void show() {
		System.out.println("测试内置观察者模式");
	}
}
