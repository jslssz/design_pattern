package com.hx.self;

/**
 * @author jxlgcmh
 * @create 2019-05-23 09:16
 */
public interface Observer {
	/**
	 *  更新天气接口
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	 void update(float temperature,float humidity, float pressure);
}
