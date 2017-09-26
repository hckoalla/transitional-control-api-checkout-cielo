package model.common;

import com.google.gson.annotations.SerializedName;

public class Link {
	
	@SerializedName(value = "method", alternate = {"Method"})
	private String method;
	@SerializedName(value = "rel", alternate = {"Rel"})
	private String rel;
	@SerializedName(value = "href", alternate = {"Href"})
	private String href;
	
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getRel() {
		return rel;
	}
	public void setRel(String rel) {
		this.rel = rel;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	
}