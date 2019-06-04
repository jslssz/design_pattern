package com.hx.book;

/**
 * @author jxlgcmh
 * @create 2019-06-02 09:11
 */

/**
 * 具体的适配器
 */
public class PoliceCarAdapter extends CarController {
	
	private PliceSound pliceSound;
	private PliceLamp pliceLamp;
	
	public PoliceCarAdapter() {
		pliceSound = new PliceSound();
		pliceLamp = new PliceLamp();
	}
	
	@Override
	public void phonate() {
		pliceSound.alarmSound();
	}
	
	@Override
	public void twinkle() {
		pliceLamp.alarLamp();
	}
}
