package model.common;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Cart {
	
	@SerializedName(value = "Items", alternate = {"items"})
	private List<Items> Items = new ArrayList<Items>();

	public List<Items> getItems() {
		return Items;
	}

	public void setItems(List<Items> items) {
		Items = items;
	}
	
}