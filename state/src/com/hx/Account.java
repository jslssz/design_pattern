package com.hx;

/**
 * 充当具体环境类
 *
 * @author jxlgcmh
 * @create 2019-06-14 09:19
 */
public class Account {
	private AccountState accountState;
	private String owner;
	private double balance;
	
	public Account(String owner, double init) {
		this.owner = owner;
		this.balance = balance;
		this.accountState =new NormalState(this);
		System.out.println(this.owner+"开户，初始金额为："+init);
		System.out.println("--------------------------------");
		
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAccountState(AccountState accountState) {
		this.accountState = accountState;
	}
	
	public void deposit(double amount) {
		System.out.println(this.owner+"存款"+amount);
		accountState.deposit(amount);
		System.out.println("余额为"+this.balance);
		System.out.println("账户状态为："+this.accountState.getClass().getName());
		System.out.println("--------------------------------");
	}
	
	public void withdraw(double amount) {
		System.out.println(this.owner+"取款"+amount);
		accountState.withdraw(amount);
		System.out.println("余额为"+this.balance);
		System.out.println("账户状态为："+this.accountState.getClass().getName());
		System.out.println("--------------------------------");
	}
	
	public void computeInterest() {
		accountState.computeInterest();
	}
}
