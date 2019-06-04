package com.hx.book;

/**
 * @author jxlgcmh
 * @create 2019-06-02 09:05
 */

/**
 * 目标抽象类
 */
public abstract class CarController {
	public void move() {
		System.out.println("车移动");
	}
	//发出声音
	public abstract void phonate();
	//闪烁
	public abstract void twinkle();
}
