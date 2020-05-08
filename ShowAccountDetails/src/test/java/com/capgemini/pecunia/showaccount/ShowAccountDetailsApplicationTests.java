package com.capgemini.pecunia.showaccount;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.capgemini.pecunia.entity.Customer;

import junit.framework.Assert;


@SuppressWarnings("deprecation")
@SpringBootTest
public class ShowAccountDetailsApplicationTests {

	
	
	@SuppressWarnings("unused")
	@Test
	public void showAccountDetailsTest() throws URISyntaxException {
		RestTemplate restTemplate=new RestTemplate();
		final String Url= "http://localhost:9983/detailsservice/find/999999999999";
		URI uri=new URI(Url);
		 ResponseEntity<Customer> result = restTemplate.getForEntity(uri, Customer.class);
		    Customer customer = result.getBody();
		    Assert.assertEquals(200, result.getStatusCodeValue());
		    Assert.assertNotNull(customer);
	}
}
	
		
	


