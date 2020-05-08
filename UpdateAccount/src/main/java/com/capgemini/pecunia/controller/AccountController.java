package com.capgemini.pecunia.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.capgemini.pecunia.service.AccountManagementServiceImpl;

@RestController
@RequestMapping("/updateservice")
@CrossOrigin("http://localhost:4200")
public class AccountController {

	@Autowired
	private AccountManagementServiceImpl service;

	@PutMapping("/update/{account_Id}/{customerName}/{contactNumber}/{address}")
	public ResponseEntity<String> updateAccount(@PathVariable("account_Id")String accountId,@PathVariable("customerName")String customerName,
			@PathVariable("contactNumber")String contactNumber,@PathVariable("address")String address) {
		
		ResponseEntity<String> rs=  new ResponseEntity<String>(service.updateAccount(accountId, customerName, contactNumber, address),HttpStatus.OK);
		{
               System.out.println(rs);
               return rs;
               
		}
	}	






}