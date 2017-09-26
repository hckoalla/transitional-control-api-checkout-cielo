package model.consultTransaction;

import com.google.gson.annotations.SerializedName;

public class CustomerConsultTransaction {
	
	@SerializedName(value = "Name", alternate = {"name"})
	private String Name;
	@SerializedName(value = "Identity", alternate = {"identity"})
	private String Identity;
	@SerializedName(value = "IdentityType", alternate = {"identityType", "identitytype"})
	private String IdentityType;
	@SerializedName(value = "Email", alternate = {"email"})
	private String Email;
	@SerializedName(value = "Birthdate", alternate = {"birthDate", "birthdate"})
	private String Birthdate;
	@SerializedName(value = "Address", alternate = {"address"})
	private Address Address;
	@SerializedName(value = "DeliveryAddress", alternate = {"deliveryAddress", "deliveryaddress"})
	private DeliveryAddress DeliveryAddress;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getIdentity() {
		return Identity;
	}
	public void setIdentity(String identity) {
		Identity = identity;
	}
	public String getIdentityType() {
		return IdentityType;
	}
	public void setIdentityType(String identityType) {
		IdentityType = identityType;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(String birthdate) {
		Birthdate = birthdate;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	public DeliveryAddress getDeliveryAddress() {
		return DeliveryAddress;
	}
	public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
		DeliveryAddress = deliveryAddress;
	}
	
}