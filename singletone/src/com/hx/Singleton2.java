package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-05-26 20:44
 */
public class Singleton2 {
	
	
	private static Singleton2 instance =new Singleton2();
	
	private Singleton2(){
	}
	

	public  static  Singleton2 getInstance(){
		return instance;
	}
}
