package com.hx.bean;

import com.hx.interfacedemo.impl.SlowFly;
import com.hx.interfacedemo.impl.SmallBray;

/**
 * @author jxlgcmh
 * @create 2019-05-22 14:19
 */
public class QyDuck extends Duck {
	
	/*public QyDuck(){
		fly=new SlowFly();
		bray=new SmallBray();
	}*/
	
	@Override
	public void show() {
		System.out.println("我是圈养的鸭子");
	}
}
