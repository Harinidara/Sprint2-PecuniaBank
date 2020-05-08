package com.capgemini.pecunia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecunia.entity.Customer;
import com.capgemini.pecunia.service.AccountManagementService;

@RestController
@RequestMapping("/addservice")
@CrossOrigin("http://localhost:4200")
public class AccountController {

	@Autowired
	private AccountManagementService service;
	
	@PostMapping("/create")
public ResponseEntity<String> addAccount(@RequestBody Customer customer ){
		
		service.addAccount(customer);
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("Account created successfully",HttpStatus.OK);
		return responseEntity;
		
	}
	
	
}
