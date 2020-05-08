package com.capgemini.pecunia.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.pecunia.entity.Account;
import com.capgemini.pecunia.entity.Customer;


@Repository
public interface AccountManagementDao extends JpaRepository<Customer, Integer>{


		
	@Query("select f from Account f where account_Id=?1")
	List<Account> findByAccountId(String accountId);
	
	
	@Modifying
	@Query("delete from Account e where account_Id=?1")
	void deleteAccount(String accountId);
	
	
	@Modifying
	@Query("delete from Customer e where account_Id=?1")
	void deletecustomer(String accountId);
    

	
	
	
	



}
	
	  

	
	
	


