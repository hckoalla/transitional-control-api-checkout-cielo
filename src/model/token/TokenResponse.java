package model.token;

import com.google.gson.annotations.SerializedName;

import model.ModelGson;

public class TokenResponse extends ModelGson {
	
	@SerializedName(value = "access_token", alternate = {"access_Token", "Access_Token"})
	private String accessToken;
	@SerializedName(value = "token_type", alternate = {"token_Type", "Token_Type"})
	private String tokenType;
	@SerializedName(value = "expires_in", alternate = {"expires_In", "Expires_In"})
	private Long expiresIn;
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getTokenType() {
		return tokenType;
	}
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
	public Long getExpiresIn() {
		return expiresIn;
	}
	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}
	
}