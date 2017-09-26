package model.consultTransaction;

import com.google.gson.annotations.SerializedName;

public class CreditCard {
	
	@SerializedName(value = "CardNumber", alternate = {"cardNumber", "cardnumber"})
	private String CardNumber;
	@SerializedName(value = "Holder", alternate = {"holder"})
	private String Holder;
	@SerializedName(value = "ExpirationDate", alternate = {"expirationDate", "expirationdate"})
	private String ExpirationDate;
	@SerializedName(value = "SecurityCode", alternate = {"securityCode", "securitycode"})
	private String SecurityCode;
	@SerializedName(value = "SaveCard", alternate = {"saveCard", "savecard"})
	private String SaveCard = "false";
	@SerializedName(value = "Brand", alternate = {"brand"})
	private String Brand;
	
	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	public String getHolder() {
		return Holder;
	}
	public void setHolder(String holder) {
		Holder = holder;
	}
	public String getExpirationDate() {
		return ExpirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		ExpirationDate = expirationDate;
	}
	public String getSecurityCode() {
		return SecurityCode;
	}
	public void setSecurityCode(String securityCode) {
		SecurityCode = securityCode;
	}
	public String getSaveCard() {
		return SaveCard;
	}
	public void setSaveCard(String saveCard) {
		SaveCard = saveCard;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	
}