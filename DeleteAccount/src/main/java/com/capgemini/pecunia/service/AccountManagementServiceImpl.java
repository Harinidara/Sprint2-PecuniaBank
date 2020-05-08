package com.capgemini.pecunia.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecunia.dao.AccountManagementDao;



@Service
@Transactional
public class AccountManagementServiceImpl implements AccountManagementService {
 
	@Autowired
	private AccountManagementDao dao;

	@Override
	public String deleteAccount(String accountId){
		
		
		  dao.deletecustomer(accountId);
		  dao.deleteAccount(accountId);
		 return "deleted account";
	
	}
	}



	
