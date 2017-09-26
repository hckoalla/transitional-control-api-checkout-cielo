package model.refund;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import model.ModelGson;
import model.common.Link;

public class VoidResponse extends ModelGson {
	
	@SerializedName(value = "success", alternate = {"Success"})
	private String success;
	@SerializedName(value = "status", alternate = {"Status"})
	private String status;
	@SerializedName(value = "returnCode", alternate = {"ReturnCode", "returncode"})
	private Long returnCode;
	@SerializedName(value = "returnMessage", alternate = {"ReturnMessage", "returnmessage"})
	private Long returnMessage;
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
	public Long getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(Long returnCode) {
		this.returnCode = returnCode;
	}
	public Long getReturnMessage() {
		return returnMessage;
	}
	public void setReturnMessage(Long returnMessage) {
		this.returnMessage = returnMessage;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
}