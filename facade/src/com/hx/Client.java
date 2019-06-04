package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-06-03 09:58
 */
public class Client {
	public static void main(String[] args) {
		EncryptFacade facade =new EncryptFacade();
		facade.fileEncrypt("D:/a.txt","D:/b.txt");
	}
}
