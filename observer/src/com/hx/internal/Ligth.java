package com.hx.internal;



import java.util.Observable;

/**
 * 使用jdk自带的观察者模式
 * @author jxlgcmh
 * @create 2019-05-23 13:46
 */
public class Ligth extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
	
	public void setData(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		//更新后调用更新方法
		dataChange();
	}
	
	private void dataChange() {
		//必须要setChange(),否则通知无效
		this.setChanged();
		this.notifyObservers(new Data(getTemperature(), getHumidity(), getPressure()));
	}
	
	
	
	public class Data{
		private float temperature;
		private float humidity;
		private float pressure;
		
		public Data(float temperature, float humidity, float pressure) {
			this.temperature = temperature;
			this.humidity = humidity;
			this.pressure = pressure;
		}
		
		public float getTemperature() {
			return temperature;
		}
		
		public float getHumidity() {
			return humidity;
		}
		
		public float getPressure() {
			return pressure;
		}
	}
}
