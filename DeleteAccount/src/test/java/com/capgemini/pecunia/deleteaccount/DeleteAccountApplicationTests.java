package com.capgemini.pecunia.deleteaccount;


import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import junit.framework.Assert;




@SuppressWarnings("deprecation")
@SpringBootTest
public class DeleteAccountApplicationTests {
	
	
	@Test
	public void deleteAccountTest() throws URISyntaxException {
		RestTemplate restTemplate=new RestTemplate();
		final String Url= "http://localhost:9985/deleteservice/delete/112233445566";
		URI uri=new URI(Url);
		ResponseEntity<String> result=restTemplate.exchange(uri,HttpMethod.DELETE,null,String.class);
				Assert.assertEquals(200,result.getStatusCodeValue());
	}
}
