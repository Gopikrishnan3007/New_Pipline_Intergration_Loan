package com.gopi.restapp.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gopi.restapp.model.Customer;
import com.gopi.restapp.repository.CustomerRepo;
import com.gopi.restapp.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	CustomerRepo repo;

	public CustomerServiceImpl(CustomerRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addCustomer(Customer customer) {
		return repo.save(customer);
	}

	@Override
	public Customer getCustomer(int id) {
		return repo.findById(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return repo.findAll();
	}

	@Override
	public String updateCustomer(Customer customer) {
		return repo.update(customer);

	}

	@Override
	public String deleteCustomer(int id) {
		return repo.deleteById(id);
	}
}
