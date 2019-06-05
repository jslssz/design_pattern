package com.hx.book;

import java.util.Queue;

/**
 * @author jxlgcmh
 * @create 2019-06-05 22:21
 */
public class Client {
	public static void main(String[] args) {
		AbstractFile file1,file2,file3,file4,folder1,folder2,folder3,folder4;
		//创建文件
		file1 =new ImageFile("av.gif");
		file2 =new ImageFile("av.png");
		file3 =new TextFile("av.txt");
		file4 =new TextFile("av.avi");
		//创建文件夹
		folder1=new Folder("photo");
		folder2=new Folder("document");
		folder3=new Folder("movie");
		folder4=new Folder("MYFILE");
		//文件夹添加文件
		folder1.add(file1);
		folder1.add(file2);
		folder2.add(file3);
		folder3.add(file4);
		
		//文件夹添加文件夹
		folder4.add(folder1);
		folder4.add(folder2);
		folder4.add(folder3);
		
		folder4.killVirus();
		
	}
}
