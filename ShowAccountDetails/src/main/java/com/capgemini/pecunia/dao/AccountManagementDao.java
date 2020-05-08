package com.capgemini.pecunia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.pecunia.entity.Customer;


@Repository
public interface AccountManagementDao extends JpaRepository<Customer,Integer> {

	
	@Query("select f from Customer f where account_Id=?1")
	Customer findByAccountId(String accountId);
	
	
	
	
}
