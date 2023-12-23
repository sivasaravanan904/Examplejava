package com.Crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Crud.model.Customer;
import com.Crud.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/savecus")
		public Object saveCus(@RequestBody Customer customer) {
			return (customerService.saveCustomer(customer));
		}
	
	@GetMapping("/getcus")
	public Object getcus() {
		return (customerService.getAllCustomer());
	}
	
	@GetMapping("/cusbyid/{cusid}")
	public Object getCustomerbyid(@PathVariable int cusid) {
		return (customerService.getCusById(cusid));
	}
	
	@PutMapping("/updatecus")
	public Object updateCus(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
	
	@DeleteMapping("/deletecus/{id}")
	public Object deleteEmp(@PathVariable int id) {
		return customerService.DeleteCustomerById(id);
	}
}

