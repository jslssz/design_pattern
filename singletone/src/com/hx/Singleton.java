package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-05-26 20:44
 */
public class Singleton {
	
	
	private static Singleton instance =null;
	
	private Singleton(){
	}
	
	//这样性能不好，消耗资源
	public  static synchronized Singleton getInstance(){
		//此处会出问题，方法上加一个同步锁
		if (instance ==null){
			instance =new Singleton();
		}
		return instance;
	}
}
