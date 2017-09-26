package util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

import com.google.gson.Gson;

import model.token.TokenResponse;

public abstract class TokenUtil {
	
	// merchantId == clientId
	public static TokenResponse getToken(String merchantId, String clientSecret, String tokenUrl) throws IOException {
		Gson gson = new Gson();
		
		URL url;
		HttpURLConnection connection;
		BufferedReader bufferedReader;
	
	    url = new URL( tokenUrl );
	    
	    String encoding = Base64.getEncoder().encodeToString( (merchantId +":"+ clientSecret).getBytes( "UTF-8" ) );
	    
	    connection = (HttpURLConnection) url.openConnection();
	    connection.setRequestMethod("POST");
	    connection.setRequestProperty("Authorization", "Basic " + encoding );
	    connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
	    connection.setDoOutput(true);

	    DataOutputStream jsonRequest = new DataOutputStream(connection.getOutputStream());
	    jsonRequest.writeBytes( "" ); // empty request
	    jsonRequest.flush();
	    jsonRequest.close();

	    bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

	    String responseLine;
	    StringBuffer jsonResponse = new StringBuffer();

	    while ((responseLine = bufferedReader.readLine()) != null) {
	        jsonResponse.append(responseLine);
	    }
	    
	    TokenResponse response = gson.fromJson(jsonResponse.toString(), TokenResponse.class);
	    response.setJsonRequest( "" );
	    response.setJsonResponse( jsonResponse.toString() );
	    
	    bufferedReader.close();

	    connection.disconnect();
	
	    return response;
	}
	
}