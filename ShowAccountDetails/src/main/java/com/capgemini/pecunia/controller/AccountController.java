package com.capgemini.pecunia.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecunia.entity.Customer;
import com.capgemini.pecunia.exceptions.Id_NotFound_Exception;
import com.capgemini.pecunia.service.AccountManagementService;


@RestController
@RequestMapping("/detailsservice")
@CrossOrigin("http://localhost:4200")
public class AccountController {

	@Autowired
	private AccountManagementService service;
	
	@GetMapping("/find/{accountId}")
	public Customer findByAccountId(@PathVariable String accountId) throws Id_NotFound_Exception {
		Customer result=service.findByAccountId(accountId);
		if(result!= null)
		{
			return result;
		}
		else
		{
			return null;
			
		}
	}
}
	
	
	

