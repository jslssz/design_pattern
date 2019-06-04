package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-06-04 08:38
 */
public class CurrentAccount extends Account {
	@Override
	public void calculateInterest() {
		System.out.println("活期利息！");
	}
}
