package model.orders;

import com.google.gson.annotations.SerializedName;

public class Options {
	
	@SerializedName(value = "antifraudEnabled", alternate = {"AntifraudEnabled", "antifraudenabled"})
	private boolean antifraudEnabled = false;
	
	@SerializedName(value = "returnUrl", alternate = {"ReturnUrl", "returnurl"})
	private String returnUrl; 

	public boolean isAntifraudEnabled() {
		return antifraudEnabled;
	}

	public void setAntifraudEnabled(boolean antifraudEnabled) {
		this.antifraudEnabled = antifraudEnabled;
	}
	
	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}
	
}