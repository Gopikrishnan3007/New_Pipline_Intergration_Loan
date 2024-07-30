package com.gopi.restapp.repository;

import java.util.List;

import com.gopi.restapp.model.Customer;

public interface CustomerRepo {

	public String save(Customer customer);

	Customer findById(int id);

	List<Customer> findAll();

	String update(Customer customer);

	String deleteById(int id);
}
