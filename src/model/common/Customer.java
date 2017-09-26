package model.common;

import com.google.gson.annotations.SerializedName;

public class Customer {
	
	@SerializedName(value = "Identity", alternate = {"identity"})
	private String Identity;
	@SerializedName(value = "FullName", alternate = {"fullName", "fullname"})
	private String FullName;
	@SerializedName(value = "Email", alternate = {"email"})
	private String Email;
	@SerializedName(value = "Phone", alternate = {"phone"})
	private String Phone;
	 
	public String getIdentity() {
		return Identity;
	}
	public void setIdentity(String identity) {
		Identity = identity;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
}