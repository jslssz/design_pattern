package com.hx.exmv;

/**
 * @author jxlgcmh
 * @create 2019-05-22 19:52
 */
public class Test {
	public static void main(String[] args) {
		FinalPrice finalPrice =new FinalPrice();
		finalPrice.setDiscount(new KidDiscount());
		finalPrice.getDiscount();
	}
}
