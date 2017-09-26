package model.orders;

import com.google.gson.annotations.SerializedName;

import model.ModelGson;
import model.common.Cart;
import model.common.Customer;
import model.common.Shipping;

public class OrdersRequest extends ModelGson {
	
	@SerializedName(value = "orderNumber", alternate = {"OrderNumber", "ordernumber"})
	private String orderNumber;
	@SerializedName(value = "softDescriptor", alternate = {"SoftDescriptor", "softdescriptor"})
	private String softDescriptor;
	@SerializedName(value = "Cart", alternate = {"cart"})
	private Cart Cart;
	@SerializedName(value = "Shipping", alternate = {"shipping"})
	private Shipping Shipping = new Shipping();
	@SerializedName(value = "Customer", alternate = {"customer"})
	private Customer Customer;
	@SerializedName(value = "Options", alternate = {"options"})
	private Options Options = new Options();
	
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getSoftDescriptor() {
		return softDescriptor;
	}
	public void setSoftDescriptor(String softDescriptor) {
		this.softDescriptor = softDescriptor;
	}
	public Cart getCart() {
		return Cart;
	}
	public void setCart(Cart cart) {
		Cart = cart;
	}
	public Shipping getShipping() {
		return Shipping;
	}
	public void setShipping(Shipping shipping) {
		Shipping = shipping;
	}
	public Customer getCustomer() {
		return Customer;
	}
	public void setCustomer(Customer customer) {
		Customer = customer;
	}
	public Options getOptions() {
		return Options;
	}
	public void setOptions(Options options) {
		Options = options;
	}
	
}