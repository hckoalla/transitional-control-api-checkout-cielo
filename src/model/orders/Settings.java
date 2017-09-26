package model.orders;

public class Settings {
	
	private String checkoutUrl;
	private String profile;
	private String integrationType;
	private Long version;
	
	public String getCheckoutUrl() {
		return checkoutUrl;
	}
	public void setCheckoutUrl(String checkoutUrl) {
		this.checkoutUrl = checkoutUrl;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getIntegrationType() {
		return integrationType;
	}
	public void setIntegrationType(String integrationType) {
		this.integrationType = integrationType;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	
}