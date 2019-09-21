package com.hx;

/** 充当抽象状态类
 * @author jxlgcmh
 * @create 2019-06-14 09:20
 */
public abstract class AccountState {
	
	protected Account account;
	
	public abstract void deposit(double amount);
	
	public abstract void withdraw(double amount);
	
	public abstract void computeInterest();
	
	public abstract void stateCheck();
	
	
}
