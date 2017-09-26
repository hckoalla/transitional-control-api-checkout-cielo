package model.consultTransaction;

import com.google.gson.annotations.SerializedName;

import model.ModelGson;
import model.common.Cart;
import model.common.Customer;
import model.common.Link;
import model.common.Shipping;

public class ConsultTransactionResponse extends ModelGson {
	
	@SerializedName(value = "merchantId", alternate = {"MerchantId", "merchantid"})
	private String merchantId;
	@SerializedName(value = "orderNumber", alternate = {"OrderNumber", "ordernumber"})
	private String orderNumber;
	@SerializedName(value = "softDescriptor", alternate = {"SoftDescriptor", "softdescriptor"})
	private String softDescriptor;
	@SerializedName(value = "cart", alternate = {"Cart"})
	private Cart cart;
	@SerializedName(value = "shipping", alternate = {"Shipping"})
	private Shipping shipping;
	@SerializedName(value = "payment", alternate = {"Payment"})
	private Payment payment;
	@SerializedName(value = "customer", alternate = {"Customer"})
	private Customer customer;
	@SerializedName(value = "links", alternate = {"Links"})
	private Link[] links;
	
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
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Link[] getLinks() {
		return links;
	}
	public void setLinks(Link[] links) {
		this.links = links;
	}
	
}