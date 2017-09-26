package model.orders;

import com.google.gson.annotations.SerializedName;

import model.ModelGson;
import model.common.Cart;
import model.common.Customer;
import model.common.Shipping;

public class OrdersResponse extends ModelGson {
	
	@SerializedName(value = "merchantId", alternate = {"MerchantId", "merchantid"})
	private String merchantId;
	@SerializedName(value = "orderNumber", alternate = {"OrderNumber", "ordernumber"})
	private String orderNumber;
	@SerializedName(value = "softDescriptor", alternate = {"SoftDescriptor", "softdescriptor"})
	private String softDescriptor;
	@SerializedName(value = "cart", alternate = {"Cart"})
	private Cart cart;
	@SerializedName(value = "shipping", alternate = {"Shipping"})
	private Shipping shipping = new Shipping();
	@SerializedName(value = "customer", alternate = {"Customer"})
	private Customer customer;
	@SerializedName(value = "options", alternate = {"Options"})
	private Options options = new Options();
	@SerializedName(value = "message", alternate = {"Message"})
	private String message;
	@SerializedName(value = "settings", alternate = {"Settings"})
	private Settings Settings;
	
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
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
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Shipping getShipping() {
		return shipping;
	}
	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Options getOptions() {
		return options;
	}
	public void setOptions(Options options) {
		this.options = options;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Settings getSettings() {
		return Settings;
	}
	public void setSettings(Settings settings) {
		Settings = settings;
	}
	
}