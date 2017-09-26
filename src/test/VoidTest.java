package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import util.TokenUtil;

public class VoidTest {

	private static final ResourceBundle properties = ResourceBundle.getBundle("config");
	private static final String voidURL = properties.getString("url.void");
	private static final String orderNumber = "";
	private static final String amount = "7500";
	private static final String merchantId = properties.getString("merchant_id");
	private static final String clientSecret = properties.getString("client_secret");
	private static final String tokenURL = properties.getString("url.token");
	
	public static void main(String[] args) throws Exception {
		Random random = new Random();
		URL url = new URL(voidURL.replace("{orderNumber}", orderNumber).replace("{amount}", amount));
		
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("PUT");
        connection.setDoOutput(true);
        connection.setRequestProperty("Authorization", "Bearer " + TokenUtil.getToken(merchantId, clientSecret, tokenURL).getAccessToken() );
        connection.setRequestProperty("Content-Type", "application/json");
		connection.setRequestProperty("Accept", "application/json");
		
        OutputStreamWriter osw = new OutputStreamWriter(connection.getOutputStream());
        osw.write(String.format("{\"pos\":{\"left\":%1$d,\"top\":%2$d}}", random.nextInt(30), random.nextInt(20)));
        osw.flush();
        osw.close();
        
        // Reading response from input Stream
 		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
 		String output;
 		StringBuffer response = new StringBuffer();

 		while ((output = in.readLine()) != null) {
 			response.append(output);
 		}
 		in.close();

 		//printing result from response
 		System.out.println(response.toString());
	}

}