package com.hx.internal;

/**
 * @author jxlgcmh
 * @create 2019-05-23 14:06
 */
public class Test {
	public static void main(String[] args) {
//		Ligth ligth=new Ligth();
//		//1.先添加
//		ligth.addObserver(new People());
//		//2.后设置数据
//		ligth.setData(1,2,3);
		
		Light2 light2 = new Light2();
		light2.addObserver(new People2());
		light2.setData();
		
	}
}
