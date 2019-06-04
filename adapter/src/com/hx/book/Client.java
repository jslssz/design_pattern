package com.hx.book;

/**
 * @author jxlgcmh
 * @create 2019-06-02 09:14
 */
public class Client {
	public static void main(String[] args) {
		CarController controller =new PoliceCarAdapter();
		controller.move();
		controller.phonate();
		controller.twinkle();
	}
}
