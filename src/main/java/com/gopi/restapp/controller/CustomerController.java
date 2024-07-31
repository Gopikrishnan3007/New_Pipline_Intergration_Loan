package com.gopi.restapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gopi.restapp.model.Customer;
import com.gopi.restapp.service.CustomerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin("*")
public class CustomerController {

	
	CustomerService service;

	public CustomerController(CustomerService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public String insertCustomer(@RequestBody Customer customer) {
		String msgString = "";

		try {
			service.addCustomer(customer);
			msgString = "Insertion Success";
		} catch (Exception e) {
			msgString = "InsertionFailure";
		}
		return msgString;
	}

	@GetMapping("{id}")
	public Customer getCustomerById(@PathVariable("id") int id) {
		return service.getCustomer(id);
	}

	@GetMapping("/all")
	public List<Customer> getCustomer() {
		return service.getAllCustomer();
	}

	@PutMapping
	public String updateCustomer(@RequestBody Customer customer) {
		String msgString = "";

		try {
			service.updateCustomer(customer);
			msgString = "Updation Success";
		} catch (Exception e) {
			msgString = "Updation Failure";
		}
		return msgString;
	}

	@DeleteMapping("{id}")
	public String deleteCustomerById(@PathVariable("id") int id) {
		String msgString = "";
		try {
			service.deleteCustomer(id);
			msgString = "Deletion Success";
		} catch (Exception e) {
			msgString = "Deletion Failure";
		}
		return msgString;
	}
	
}
