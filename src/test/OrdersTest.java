package test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ResourceBundle;

import com.google.gson.Gson;

import model.common.Cart;
import model.common.Customer;
import model.common.Items;
import model.orders.OrdersRequest;
import model.orders.OrdersResponse;

public class OrdersTest {
	
	private static final ResourceBundle properties = ResourceBundle.getBundle("config");
	private static final String ordersURL = properties.getString("url.orders");
	private static final String merchantId = properties.getString("merchant_id");
	
	@SuppressWarnings("unused")
	public static void main(String[] args){
		Gson gson = new Gson();
		
		OrdersRequest request = new OrdersRequest();
		request.setOrderNumber("99999999");
		request.setSoftDescriptor("Produto");
		
		// simple summary
		Items itemSimple = new Items();
		itemSimple.setName( "Produto 99999999" );
		itemSimple.setUnitPrice( 10000l ); 
		itemSimple.setQuantity( 2l );
		itemSimple.setType( "Service" );
		
		Cart cartSimple = new Cart();
		cartSimple.getItems().add( itemSimple );
		request.setCart( cartSimple );
		
		Customer customer = new Customer();
		customer.setIdentity( "88226162947" );
		customer.setFullName( "Koalla Story" );
		customer.setEmail( "a@a.com.br" );
		customer.setPhone( "11999999999" );
		request.setCustomer( customer );
		
		request.getOptions().setReturnUrl( "www.google.com.br" ); // optional
		
		URL url;
		HttpURLConnection connection;
		BufferedReader bufferedReader;
	
		try {
		    url = new URL( ordersURL );
	
		    connection = (HttpURLConnection) url.openConnection();
		    connection.setRequestMethod("POST");
		    connection.addRequestProperty("MerchantId", merchantId);
		    connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
		    connection.setDoOutput(true);
	
		    DataOutputStream jsonRequest = new DataOutputStream(connection.getOutputStream());
		    jsonRequest.writeBytes( gson.toJson( request ) );
		    jsonRequest.flush();
		    jsonRequest.close();
	
		    bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	
		    String responseLine;
		    StringBuffer jsonResponse = new StringBuffer();
	
		    while ((responseLine = bufferedReader.readLine()) != null) {
		        jsonResponse.append(responseLine);
		    }
		    
			OrdersResponse response = gson.fromJson(jsonResponse.toString(), OrdersResponse.class);
		    
		    System.out.println( jsonResponse.toString() );
		    
		    bufferedReader.close();
	
		    connection.disconnect();
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
}