package com.capgemini.pecunia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecunia.dao.CustomerDao;
import com.capgemini.pecunia.entity.Customer;


@Service
public class AccountManagementServiceImpl implements AccountManagementService {

	@Autowired
	private CustomerDao dao;
	
	@Override
	public String addAccount(Customer customer) {
	 dao.save(customer);
	 return "account successfully created";
	}

}
