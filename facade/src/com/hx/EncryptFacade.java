package com.hx;

/**
 * @author jxlgcmh
 * @create 2019-06-03 09:55
 */
public class EncryptFacade {
	private FileReader fileReader;
	private CipherMachine cipherMachine;
	private FileWriter fileWriter;
	
	public EncryptFacade() {
		fileReader = new FileReader();
		cipherMachine = new CipherMachine();
		fileWriter = new FileWriter();
	}
	
	public void fileEncrypt(String srcPath, String dstPath) {
		String plainText = fileReader.read(srcPath);
		String encrypt = cipherMachine.encrypt(plainText);
		fileWriter.write(encrypt,dstPath);
	}
}
