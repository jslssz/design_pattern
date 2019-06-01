package com.hx.bean;

import com.hx.interfacedemo.Bray;
import com.hx.interfacedemo.Fly;

/**
 * @author jxlgcmh
 * @create 2019-05-22 14:09
 */
public abstract class Duck {
	/**
	 * 下面俩个属性如果设为私有
	 * 则子类要通过set的方法赋值
	 */
	 private Fly fly;
	 private Bray bray;
	
	public void swimming(){
		System.out.println("i am swimming");
	}
	
	public abstract void show();
	
	public Duck() {
	}
	
	public void getFly() {
		 this.fly.isFly();
	}
	
	public void setFly(Fly fly) {
		this.fly = fly;
	}
	
	public void getBray() {
		 this.bray.braying();
	}
	
	public void setBray(Bray bray) {
		this.bray = bray;
	}
}
