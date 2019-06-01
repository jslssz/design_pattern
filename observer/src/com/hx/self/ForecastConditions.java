package com.hx.self;

/**
 * @author jxlgcmh
 * @create 2019-05-23 09:28
 */
public class ForecastConditions implements Observer {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		//更新后调用更新方法
		display();
	}
	
	public void display(){
		System.out.println("明天天气:"+temperature+"\t"+humidity+"\t"+pressure);
	}
}
