package model.capture;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import model.ModelGson;
import model.common.Link;

public class CaptureResponse extends ModelGson {
	
	@SerializedName(value = "success", alternate = {"Success"})
	private String success;
	@SerializedName(value = "status", alternate = {"Status"})
	private String status;
	@SerializedName(value = "links", alternate = {"Links"})
	private List<Link> links;
	
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
}