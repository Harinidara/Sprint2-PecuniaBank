package com.capgemini.pecunia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.pecunia.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer> {
    
}
