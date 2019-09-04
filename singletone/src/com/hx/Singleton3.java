package com.hx;

/**
 * 双端检索机制
 * @author jxlgcmh
 * @create 2019-05-26 20:44
 */
public class Singleton3 {
	
	
	private static volatile Singleton3 instance =null;
	
	private Singleton3(){
	}
	
	//这样性能不好，消耗资源
	public  static  Singleton3 getInstance(){
		//此处会出问题，方法上加一个同步锁
		if (instance ==null){
			synchronized (Singleton3.class){
				if (instance == null) {
					instance =new Singleton3();
				}
			}
			
		}
		return instance;
	}
}
