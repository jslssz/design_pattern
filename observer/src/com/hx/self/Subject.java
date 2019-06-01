package com.hx.self;

/**
 * 注册中心
 * @author jxlgcmh
 * @create 2019-05-23 09:17
 */
public interface Subject {
	/**
	 * 注册观察者
	 * @param observer
	 */
	void registerObserver(Observer observer);
	
	/**
	 * 移除观察者
	 * @param observer
	 */
	void removeObserver(Observer observer);
	
	/**
	 * 通知观察者
	 */
	void notifyObservers();
}
