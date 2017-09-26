package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ResourceBundle;

import com.google.gson.Gson;

import model.consultTransaction.ConsultTransactionResponse;
import util.TokenUtil;

public class ConsultTransactionTest {
	
	private static final ResourceBundle properties = ResourceBundle.getBundle("config");
	private static final String consultTransactionURL = properties.getString("url.consult_transaction");
	private static final String orderNumber = "";
	private static final String merchantId = properties.getString("merchant_id");
	private static final String clientSecret = properties.getString("client_secret");
	private static final String tokenURL = properties.getString("url.token");
	
	public static void main(String[] args) throws Exception {
		URL url = new URL(consultTransactionURL.replace("{orderNumber}", orderNumber));
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		// By default it is GET request
		con.setRequestMethod("GET");
		
		// Add request header
		con.setRequestProperty("Authorization", "Bearer " + TokenUtil.getToken(merchantId, clientSecret, tokenURL).getAccessToken() );

		int responseCode = con.getResponseCode();
		System.out.println("Sending get request : "+ url);
		System.out.println("Response code : "+ responseCode);

		// Reading response from input Stream
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String output;
		StringBuffer response = new StringBuffer();

		while ((output = in.readLine()) != null) {
			response.append(output);
		}
		in.close();

		ConsultTransactionResponse obj = new Gson().fromJson(response.toString(), ConsultTransactionResponse.class);
		
		//printing result from response
		System.out.println(response.toString());
	}

}