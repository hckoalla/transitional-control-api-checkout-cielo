package model.consultTransaction;

import com.google.gson.annotations.SerializedName;

public class Address {
	
	@SerializedName(value = "Street", alternate = {"street"})
	private String Street;
	@SerializedName(value = "Number", alternate = {"number"})
	private String Number;
	@SerializedName(value = "Complement", alternate = {"complement"})
	private String Complement;
	@SerializedName(value = "ZipCode", alternate = {"zipCode", "zipcode"})
	private String ZipCode;
	@SerializedName(value = "City", alternate = {"city"})
	private String City;
	@SerializedName(value = "State", alternate = {"state"})
	private String State;
	@SerializedName(value = "Country", alternate = {"country"})
	private String Country;
	
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public String getComplement() {
		return Complement;
	}
	public void setComplement(String complement) {
		Complement = complement;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
}