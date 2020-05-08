package com.capgemini.pecunia.service;

import com.capgemini.pecunia.entity.Customer;

public interface AccountManagementService {

	Customer findByAccountId(String accountId);

	
}
