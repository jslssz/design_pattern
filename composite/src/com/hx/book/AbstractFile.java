package com.hx.book;

/**
 * @author jxlgcmh
 * @create 2019-06-05 21:38
 *
 * 抽象构建类
 *
 */
public abstract class AbstractFile {
	public abstract void add(AbstractFile file);
	public abstract void  remove(AbstractFile file);
	public abstract AbstractFile getChild(int i);
	public abstract void killVirus();
}
