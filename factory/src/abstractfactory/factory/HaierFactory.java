package abstractfactory.factory;

import abstractfactory.AirConditioning;
import abstractfactory.ApplianceFactory;
import abstractfactory.Refrigerator;
import abstractfactory.product.HaierConditioning;
import abstractfactory.product.HaierRefrigerator;

/**
 * @author jxlgcmh
 * @create 2019-05-28 11:22
 */
public class HaierFactory implements ApplianceFactory {
	@Override
	public AirConditioning createAirConditioning() {
		return new HaierConditioning();
	}
	
	@Override
	public Refrigerator createRefrigerator() {
		return new HaierRefrigerator();
	}
}
