package com.hx.bean;

/**
 * @author jxlgcmh
 * @create 2019-05-22 14:18
 */

import com.hx.interfacedemo.impl.BigBray;
import com.hx.interfacedemo.impl.FastFly;

/**
 * 放养的鸭子
 */
public class FyDuck  extends Duck{
	
	/**
	 * 特别强调，super只是为了说明调用的是父类的
	 *
	 * 同时，如果要在此处调用以下方法，父类中的以下两个的属性不能是私有的
	 *
	 */
	/*public FyDuck(){
		super.fly=new FastFly();
		super.bray=new BigBray();
	}*/
	
	
	@Override
	public void show() {
		System.out.println("我是放养的鸭子");
	}
	
	
}
