package abstractfactory.factory;

import abstractfactory.AirConditioning;
import abstractfactory.ApplianceFactory;
import abstractfactory.Refrigerator;
import abstractfactory.product.GreeAirConditioning;
import abstractfactory.product.GreeRefrigerator;

/**
 * @author jxlgcmh
 * @create 2019-05-28 11:21
 */
public class GreeFactory implements ApplianceFactory {
	@Override
	public AirConditioning createAirConditioning() {
		return new GreeAirConditioning();
	}
	
	@Override
	public Refrigerator createRefrigerator() {
		return new GreeRefrigerator();
	}
}
