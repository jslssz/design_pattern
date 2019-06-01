package abstractfactory.product;

import abstractfactory.Refrigerator;

/**
 * @author jxlgcmh
 * @create 2019-05-28 11:12
 */
public class HaierRefrigerator implements Refrigerator {
	@Override
	public void display() {
		System.out.println("我是《海尔》家生产的冰箱");
	}
}
