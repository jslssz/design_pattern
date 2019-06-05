package com.hx.book;

/**
 * @author jxlgcmh
 * @create 2019-06-05 19:00
 *
 * 抽象迭代器
 */
public interface AbstractIterator {
	/**
	 * 下一个元素
	 */
	void next();
	
	/**
	 * 前一个元素
	 */
	void previous();
	
	/**
	 * 是否是最后一个
	 * @return
	 */
	boolean isLast();
	
	/**
	 * 是否是第一个
	 * @return
	 */
	boolean isFirst();
	
	/**
	 * 获取下一个
	 * @return
	 */
	Object getNextItem();
	
	/**
	 * 获取前一个
	 * @return
	 */
	Object getPreviousItem();
	
}
