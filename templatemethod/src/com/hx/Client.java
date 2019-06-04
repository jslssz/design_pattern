package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-06-04 08:40
 */
public class Client {
	public static void main(String[] args) {
		Account account = new CurrentAccount();
		account.handle("zhangsan","123");
	}
}
