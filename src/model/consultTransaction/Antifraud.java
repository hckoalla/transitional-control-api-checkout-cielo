package model.consultTransaction;

import com.google.gson.annotations.SerializedName;

public class Antifraud {
	
	@SerializedName(value = "description", alternate = {"Description"})
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}