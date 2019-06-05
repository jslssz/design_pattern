package com.hx.book;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jxlgcmh
 * @create 2019-06-05 21:45
 */
public class Folder extends  AbstractFile {
	
	public List<AbstractFile> fileList =new ArrayList<>();
	private String folderName;
	
	public Folder(String folderName) {
		this.folderName = folderName;
	}
	
	@Override
	public void add(AbstractFile file) {
		fileList.add(file);
	}
	
	@Override
	public void remove(AbstractFile file) {
		fileList.remove(file);
	}
	
	@Override
	public AbstractFile getChild(int i) {
		
		return fileList.get(i);
	}
	
	@Override
	public void killVirus() {
		System.out.println("对文件夹"+folderName+"进行杀毒");
		for (AbstractFile abstractFile : fileList) {
			abstractFile.killVirus();
		}
		
	}
}
