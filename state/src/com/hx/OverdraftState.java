package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-06-14 09:37
 */
public class OverdraftState extends AccountState {
	public OverdraftState(AccountState accountState) {
		this.account =accountState.account;
	}
	
	@Override
	public void deposit(double amount) {
		account.setBalance(account.getBalance()+amount);
		stateCheck();
	}
	
	@Override
	public void withdraw(double amount) {
		account.setBalance(account.getBalance()-amount);
		stateCheck();
	}
	
	@Override
	public void computeInterest() {
		System.out.println("计算支付利息！");
	}
	
	@Override
	public void stateCheck() {
		if (account.getBalance() > 0) {
			account.setAccountState(new NormalState(this));
		} else if (account.getBalance() == -2000) {
			account.setAccountState(new RestrictedState(this));
		} else if (account.getBalance() < -2000) {
			System.out.println("操作受限");
		}
	}
}
