package com.hx.internal;

import java.util.Observable;

/**
 * @author jxlgcmh
 * @create 2019-05-23 14:14
 */
public class Light2 extends Observable {
	public void setData(){
		dataChange();
	}
	
	private void dataChange() {
		//必须要setChange(),否则通知无效
		this.setChanged();
		this.notifyObservers();
	}
}
