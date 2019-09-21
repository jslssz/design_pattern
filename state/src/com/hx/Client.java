package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-06-14 09:47
 */
public class Client {
	public static void main(String[] args) {
		Account account =new Account("lucy",0);
		account.deposit(1000);
		account.withdraw(2000);
		account.deposit(3000);
		account.withdraw(4000);
		account.withdraw(1000);
		account.computeInterest();
	}
}
