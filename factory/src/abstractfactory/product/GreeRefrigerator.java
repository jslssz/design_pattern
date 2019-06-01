package abstractfactory.product;

import abstractfactory.Refrigerator;

/**
 * @author jxlgcmh
 * @create 2019-05-28 11:12
 */
public class GreeRefrigerator implements Refrigerator {
	@Override
	public void display() {
		System.out.println("我是《格力》家生产的冰箱");
	}
}
