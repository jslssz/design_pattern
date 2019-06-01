package abstractfactory.product;

import abstractfactory.AirConditioning;

/**
 * @author jxlgcmh
 * @create 2019-05-28 11:17
 */
public class TCLConditioning implements AirConditioning {
	@Override
	public void display() {
		System.out.println("我是《TCL》家生产的空调");
	}
}
