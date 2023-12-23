package com.Crud.service;

import com.Crud.model.Customer;



public interface CustomerService {

	public Object saveCustomer(Customer customer);

	public Object getAllCustomer();

	public Object getCusById(int cusid);

	public Object updateCustomer(Customer customer);

	public Object DeleteCustomerById(int id);

	

}
