package model.consultTransaction;

import com.google.gson.annotations.SerializedName;

public class Payment {
	
	@SerializedName(value = "status", alternate = {"Status"})
	private String status;
	@SerializedName(value = "antifraud", alternate = {"Antifraud", "AntiFraud"})
	private Antifraud antifraud;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Antifraud getAntifraud() {
		return antifraud;
	}
	public void setAntifraud(Antifraud antifraud) {
		this.antifraud = antifraud;
	}
	
}