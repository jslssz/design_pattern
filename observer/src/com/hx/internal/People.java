package com.hx.internal;

import java.util.Observable;
import java.util.Observer;

/**
 * @author jxlgcmh
 * @create 2019-05-23 13:47
 */
public class People implements Observer {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	@Override
	public void update(Observable observable, Object object) {
		Ligth.Data data= (Ligth.Data) object;
		this.temperature=data.getTemperature();
		this.humidity=data.getHumidity();
		this.pressure=data.getPressure();
		display();
		
	}
	
	public void display(){
		System.out.println("明天天气:"+temperature+"\t"+humidity+"\t"+pressure);
	}
}
