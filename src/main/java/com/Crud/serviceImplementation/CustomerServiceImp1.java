package com.Crud.serviceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Crud.model.Customer;
import com.Crud.repository.CustomerRepo;
import com.Crud.service.CustomerService;

@Service
public class CustomerServiceImp1 implements CustomerService{
		@Autowired
		private CustomerRepo customerRepo;

		@Override
		public Object saveCustomer(Customer customer) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(customer.getCusName().isEmpty()) {
			map.put("Status", "Error!!!");
			map.put("Msg", "Please Enter The Customer Name");
		}
		else if(customer.getCusLocation().isEmpty()){
			map.put("Status", "Error!!!");
			map.put("Msg", "Please Enter The Location");
		}
		else {
			customerRepo.save(customer);
			map.put("status", "success");
			map.put("msg", "Data Saved successfully");
		}
		
		return map;
	}

		@Override
		public Object getAllCustomer() {
			List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
			List<Customer> customer = customerRepo.findAll();
			for(Customer c:customer) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("Customer Id", c.getCusId());
				map.put("Customer Name", c.getCusName());
				map.put("Customer Location", c.getCusLocation());
				list.add(map);
			}
			return list;
		}

		@Override
		public Object getCusById(int cusid) {
			Map<String, Object> map = new HashMap<String, Object>();
			Customer customer = customerRepo.findById(cusid).orElse(null);
			if(customer != null) {
				map.put("Customer Id", customer.getCusId());
				map.put("Customer Name", customer.getCusName());
				map.put("Customer Dept", customer.getCusLocation());
				return map;
			}
			return null;
		}

		@Override
		public Object updateCustomer(Customer customer) {
			Map<String, Object> map = new HashMap<String, Object>();
			if(customer.getCusName().isEmpty()) {
				map.put("status", "error!!!");
				map.put("msg", "Please Enter The Customer Name");
			}
			else if(customer.getCusLocation().isEmpty()){
				map.put("status", "error!!!");
				map.put("msg", "Please Enter The Location");
			}			
			else {
				customerRepo.saveAndFlush(customer);
				map.put("status", "success");
				map.put("msg", "Data Saved successfully");
			}
			
			return map;
		}

		@Override
		public Object DeleteCustomerById(int id) {
			Map<String, Object> map = new HashMap<String, Object>();
			Customer customer = customerRepo.findById(id).orElse(null);
			if(customer != null) {
				customerRepo.delete(customer);
				map.put("status", "success");
				map.put("msg", "Data Deleted successfully");
				}
			else {
				map.put("status", "error");
				map.put("msg", "Employee Id is not Exist");
			}
			return map;
		}
		
		
}
