package com.capgemini.pecunia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecunia.dao.AccountManagementDao;
import com.capgemini.pecunia.entity.Customer;


@Service
public class AccountManagementServiceImpl implements AccountManagementService {

	@Autowired
	private AccountManagementDao dao;

	@Override
	public Customer findByAccountId(String accountId){
		return dao.findByAccountId(accountId);
	}

	
	

}
