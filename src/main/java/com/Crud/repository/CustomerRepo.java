package com.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Crud.model.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

	

}
