package model;

public abstract class ModelGson {
	
	private String jsonRequest;
	private String jsonResponse;
	
	public String getJsonRequest() {
		return jsonRequest;
	}
	public void setJsonRequest(String jsonRequest) {
		this.jsonRequest = jsonRequest;
	}
	public String getJsonResponse() {
		return jsonResponse;
	}
	public void setJsonResponse(String jsonResponse) {
		this.jsonResponse = jsonResponse;
	}

}