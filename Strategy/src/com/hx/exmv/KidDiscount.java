package com.hx.exmv;

/**
 * @author jxlgcmh
 * @create 2019-05-22 19:49
 */
public class KidDiscount implements Discount {
	@Override
	public void getDiscount() {
		System.out.println("小孩在原票价减10元");
	}
}
