package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-06-03 09:48
 */
public class CipherMachine {
	public String encrypt(String plainText) {
		System.out.println("数据加密：");
		String es= "";
		for (int i = 0; i < plainText.length(); i++) {
			String temp = String.valueOf(plainText.charAt(i) % 7);
			es+=temp;
		}
		System.out.println(es);
		return es;
	}
}
