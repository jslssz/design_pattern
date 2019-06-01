package com.hx.exmv;

/**
 * @author jxlgcmh
 * @create 2019-05-22 19:50
 */
public class VIPDiscount implements Discount {
	@Override
	public void getDiscount() {
		System.out.println("会员打五折");
	}
}
