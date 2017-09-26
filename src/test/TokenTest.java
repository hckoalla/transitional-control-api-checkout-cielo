package test;

import java.util.ResourceBundle;

import model.token.TokenResponse;
import util.TokenUtil;

public class TokenTest {
	
	private static final ResourceBundle properties = ResourceBundle.getBundle("config");
	private static final String merchantId = properties.getString("merchant_id");
	private static final String clientSecret = properties.getString("client_secret");
	private static final String tokenURL = properties.getString("url.token");
	
	public static void main(String[] args){
		try{
			TokenResponse token = TokenUtil.getToken(merchantId, clientSecret, tokenURL);
			System.out.println( "AccessToken: "+token.getAccessToken() +"\n" );
			System.out.println( "TokenType: "+token.getTokenType() +"\n" );
			System.out.println( "ExpiresIn: "+token.getExpiresIn() +"\n" );
			System.out.println( "###" +"\n" );
			System.out.println( "JSON RESPONSE: " + token.getJsonResponse() +"\n" );
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
}