package com.hx.exmv;

/**
 * @author jxlgcmh
 * @create 2019-05-22 19:48
 */
public class StuDisCount implements Discount {
	
	@Override
	public void getDiscount() {
		System.out.println("学生打八折");
	}
}
