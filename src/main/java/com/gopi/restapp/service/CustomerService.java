package com.gopi.restapp.service;

import java.util.List;

import com.gopi.restapp.model.Customer;


public interface CustomerService {
	
	public String addCustomer(Customer customer);

	Customer getCustomer(int id);

	List<Customer> getAllCustomer();

	String updateCustomer(Customer customer);

	String deleteCustomer(int id);
}
