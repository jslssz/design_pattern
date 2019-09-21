package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-06-14 09:37
 */
public class RestrictedState extends AccountState {
	public RestrictedState(AccountState accountState) {
		this.account=accountState.account;
	}
	
	@Override
	public void deposit(double amount) {
		account.setBalance(account.getBalance()+amount);
		stateCheck();
	}
	
	@Override
	public void withdraw(double amount) {
		System.out.println("账号受限，取款失败！");
	}
	
	@Override
	public void computeInterest() {
		System.out.println("计算支付利息！");
	}
	
	@Override
	public void stateCheck() {
		if (account.getBalance() > 0) {
			account.setAccountState(new NormalState(this));
		}  else if (account.getBalance() > -2000) {
			account.setAccountState(new OverdraftState(this));
		}
	}
}
