package model.common;

public class Shipping {
	
	private ShippingTypes Type = ShippingTypes.WithoutShipping;

	public ShippingTypes getType() {
		return Type;
	}

	public void setType(ShippingTypes type) {
		Type = type;
	}
	
}