package com.hx.book;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jxlgcmh
 * @create 2019-06-05 18:55
 *
 * 抽象聚合类
 *
 *
 */
public abstract class AbstractObjectList {
	protected List<Object> objects =new ArrayList<>();
	
	public AbstractObjectList(List<Object> objects) {
		this.objects = objects;
	}
	
	public void addObject(Object object) {
		objects.add(object);
	}
	
	public void removeObject(Object object) {
		objects.remove(object);
	}
	
	public List<Object> getObjects() {
		return objects;
	}
	
	/**
	 * 申明迭代器的抽象工厂方法
	 * @return
	 */
	public abstract AbstractIterator createIterator();
}
