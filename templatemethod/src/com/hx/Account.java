package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-06-04 08:30
 */
public abstract class Account {
	
	public final boolean validate(String username, String password) {
		System.out.println("账号：" + username);
		System.out.println("密码：" + password);
		if (username.equals("zhangsan") && password.equals("123")) {
			return true;
		} else {
			return false;
		}
	}
	
	public abstract void calculateInterest();
	
	public final void display() {
		System.out.println("显示利息");
	}
	
	//模板方法
	public void handle(String username, String password) {
		if (!validate(username, password)) {
			System.out.println("账号或密码错误");
		}
		calculateInterest();
		display();
	}
}
