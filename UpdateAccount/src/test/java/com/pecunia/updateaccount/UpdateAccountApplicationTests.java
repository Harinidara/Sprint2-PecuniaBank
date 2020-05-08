package com.pecunia.updateaccount;


import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.pecunia.entity.Customer;
import java.net.URI;
import java.net.URISyntaxException;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;



import junit.framework.Assert;


@SuppressWarnings("deprecation")
@SpringBootTest
public class UpdateAccountApplicationTests {

	//@Autowired
	//private AccountManagementServiceImpl service;
	
	
	
	@Test
	public void updateAccount() throws URISyntaxException{

		RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:" + 9980 + "/updateservice/update/999999999999/Karthik/7659873099/Khammam";
	    URI uri = new URI(baseUrl);
	 
	    Customer customer=new Customer();
        
		HttpHeaders headers = new HttpHeaders();
        headers.set("X-COM-MERGE", "successfully updated");      
        HttpEntity<Customer> request = new HttpEntity<>(customer, headers);
        
        ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertNotNull(customer);
   	 }
}
