package com.hx.book;

import java.util.List;

/**
 * @author jxlgcmh
 * @create 2019-06-05 19:05
 *
 * 具体爹代器
 *
 */
public class ProductIterator implements AbstractIterator {
	
	private List<Object>  products;
	
	/**
	 * 反向遍历游标
	 */
	private int previous;
	
	/**
	 * 正向遍历游标
	 */
	private int next;
	
	
	public ProductIterator(ProductList list) {
		this.products = list.getObjects();
		this. next= 0;
		this.previous = products.size() -1;
	}
	
	@Override
	public void next() {
		if (next < products.size()) {
			next++;
		}
	}
	
	@Override
	public void previous() {
		if (previous > -1) {
			previous --;
		}
	}
	
	@Override
	public boolean isLast() {
		
		return next == products.size();
	}
	
	@Override
	public boolean isFirst() {
		return previous == -1;
	}
	
	@Override
	public Object getNextItem() {
		return  products.get(next);
	}
	
	@Override
	public Object getPreviousItem() {
		return products.get(previous);
	}
}
