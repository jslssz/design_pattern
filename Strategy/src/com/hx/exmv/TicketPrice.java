package com.hx.exmv;

/**
 * @author jxlgcmh
 * @create 2019-05-22 19:47
 */
public abstract class TicketPrice {
	
	private Discount discount;
	
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	
	public void getDiscount(){
		discount.getDiscount();
	}
}
