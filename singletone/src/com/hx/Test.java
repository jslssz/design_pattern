package com.hx;

import java.util.concurrent.*;

/**
 * @author jxlgcmh
 * @create 2019-05-26 21:11
 */
public class Test {
	public static void main(String[] args) throws Exception{
		Callable<Singleton> callable = Singleton::getInstance;
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<Singleton> future1 = service.submit(callable);
		Future<Singleton> future2 = service.submit(callable);
		Singleton singleton1 = future1.get();
		Singleton singleton2 = future2.get();
		System.out.println(singleton1==singleton2);
		service.shutdown();
	}
}
