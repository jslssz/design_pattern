package com.hx.internal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author jxlgcmh
 * @create 2019-05-23 15:50
 */
public class Test {
	public static void main(String[] args) throws IOException {
		InputStream inputStream =new UpperInputStream(new FileInputStream("D:/a.txt"));
		int len ;
		while ((len=inputStream.read())!=-1){
			System.out.print((char)len);
		}
	}
}
