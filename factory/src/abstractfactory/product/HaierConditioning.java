package abstractfactory.product;

import abstractfactory.AirConditioning;

/**
 * @author jxlgcmh
 * @create 2019-05-28 11:17
 */
public class HaierConditioning implements AirConditioning {
	@Override
	public void display() {
		System.out.println("我是《海尔》家生产的空调");
	}
}
