package com.hx.book;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jxlgcmh
 * @create 2019-06-05 19:16
 *
 * 客户端测试
 */
public class Client {
	public static void main(String[] args) {
		List<Object> products = new ArrayList<>();
		products.add("倚天剑");
		products.add("屠龙刀");
		products.add("打狗棒");
		products.add("九阳神功");
		products.add("玄冥神掌");
		
		AbstractObjectList list;
		AbstractIterator iterator;
		
		list=new ProductList(products);
		
		iterator =list.createIterator();
		System.out.println("正向遍历：");
		while (! iterator.isLast()) {
			System.out.print(iterator.getNextItem()+",");
			iterator.next();
		}
		System.out.println();
		System.out.println("反向遍历：");
		while (! iterator.isFirst()) {
			System.out.print(iterator.getPreviousItem()+",");
			iterator.previous();
		}
		
	}
}
