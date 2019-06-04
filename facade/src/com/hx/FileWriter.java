package com.hx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author jxlgcmh
 * @create 2019-06-03 09:52
 */
public class FileWriter {
	public void write(String encryptText, String filePath) {
		System.out.println("保存密文：");
		FileOutputStream outputStream =null;
		try {
			outputStream =new FileOutputStream(filePath);
			outputStream.write(encryptText.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
