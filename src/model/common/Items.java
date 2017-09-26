package model.common;

import com.google.gson.annotations.SerializedName;

public class Items {
	
	@SerializedName(value = "Name", alternate = {"name"})
	private String Name;
	
	@SerializedName(value = "Description", alternate = {"description"})
	private String Description;

	@SerializedName(value = "UnitPrice", alternate = {"unitPrice", "unitprice"})
	private Long UnitPrice;

	@SerializedName(value = "Quantity", alternate = {"quantity"})
	private Long Quantity;

	@SerializedName(value = "Type", alternate = {"type"})
	private String Type;
	
	@SerializedName(value = "Sku", alternate = {"sku"})
	private String Sku;

	@SerializedName(value = "Weight", alternate = {"weight"})
	private Long Weight;
	 
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Long getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(Long unitPrice) {
		UnitPrice = unitPrice;
	}
	public Long getQuantity() {
		return Quantity;
	}
	public void setQuantity(Long quantity) {
		Quantity = quantity;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getSku() {
		return Sku;
	}
	public void setSku(String sku) {
		Sku = sku;
	}
	public Long getWeight() {
		return Weight;
	}
	public void setWeight(Long weight) {
		Weight = weight;
	}
	
}