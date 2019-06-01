package com.hx.self;

import java.util.ArrayList;

/**
 * @author jxlgcmh
 * @create 2019-05-23 09:32
 */
public class WeatherData implements Subject {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	private ArrayList<Observer> arrayList;
	
	public void setData(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		//更新后调用更新方法
		dataChange();
	}
	
	private void dataChange() {
		notifyObservers();
	}
	
	
	public WeatherData() {
		arrayList = new ArrayList<>();
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
	
	@Override
	public void registerObserver(Observer observer) {
		arrayList.add(observer);
	}
	
	@Override
	public void removeObserver(Observer observer) {
		if (arrayList.contains(observer)) {
			arrayList.remove(observer);
		}
	}
	
	@Override
	public void notifyObservers() {
		
		for (Observer observer : arrayList) {
			observer.update(getTemperature(), getHumidity(), getPressure());
		}
	}
}
