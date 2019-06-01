package com.hx.self;

/**
 * @author jxlgcmh
 * @create 2019-05-23 09:44
 */
public class InternetWeather {
	public static void main(String[] args) {
		WeatherData weatherData =new WeatherData();
		weatherData.registerObserver(new CurrentConditions());
		weatherData.registerObserver(new ForecastConditions());
		weatherData.removeObserver(new CurrentConditions());
		weatherData.setData(20,30,50);
	}
}
