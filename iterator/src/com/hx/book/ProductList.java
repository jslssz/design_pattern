package com.hx.book;

import java.util.List;

/**
 * @author jxlgcmh
 * @create 2019-06-05 19:00
 *
 *
 * 具体聚合类
 */
public class ProductList extends AbstractObjectList {
	
	public ProductList(List<Object> products) {
		super(products);
	}
	
	
	@Override
	public AbstractIterator createIterator() {
		return new ProductIterator(this);
	}
}
