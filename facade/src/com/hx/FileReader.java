package com.hx;

import java.io.*;

/**
 * @author jxlgcmh
 * @create 2019-06-03 09:28
 */
public class FileReader {
	
	public String read(String filePath) {
		System.out.println("读取文件，获取明文：");
		BufferedReader bf =null;
		StringBuffer buffer =new StringBuffer();
		try {
			bf =new BufferedReader(new java.io.FileReader(filePath));
			int len;
			char [] buff =new char[1024];
			while ((len=bf.read(buff)) !=-1){
				buffer.append(buff,0,len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (bf != null) {
				try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return buffer.toString();
	}
}
