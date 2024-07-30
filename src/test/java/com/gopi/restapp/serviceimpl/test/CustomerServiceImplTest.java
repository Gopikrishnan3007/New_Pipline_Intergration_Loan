package com.gopi.restapp.serviceimpl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gopi.restapp.model.Customer;
import com.gopi.restapp.model.Loan;
import com.gopi.restapp.serviceimpl.CustomerServiceImpl;

@SpringBootTest
class CustomerServiceImplTest {
	
	@Autowired
	CustomerServiceImpl customerServiceImpl;

	@Test
	void testAddCustomer() {
		Loan loan = new Loan(0, "1,20,000", "Bike Loan", "40,000", "20,000");
		Customer customer = new Customer(0, "Gopi", "1/167 VNR", "1234567890", "18-07-2024", "72197347653", loan);
		assertEquals("Success",customerServiceImpl.addCustomer(customer));
	}
	
	@Test
	void testAddCustomerFail() {
		Customer customer = null;
		assertEquals("Fail to Add",customerServiceImpl.addCustomer(customer));
	}

	@Test
	void testGetCustomer() {
		assertNotNull(customerServiceImpl.getCustomer(20));
	}
	
	@Test
	void testGetCustomerFail() {
		assertNull(customerServiceImpl.getCustomer(8));
	}

	@Test
	void testGetAllCustomer() {
		assertNotNull(customerServiceImpl.getAllCustomer());
	}

	@Test
	void testUpdateCustomer() {
		Loan loan = new Loan(8, "1,20,000", "Bike Loan", "40,000", "20,000");
		Customer customer = new Customer(8, "Gopi", "1/167 VNR", "1234567890", "18-07-2024", "72197347653", loan);
		assertEquals("Success",customerServiceImpl.updateCustomer(customer));
	}
	
	@Test
	void testUpdateCustomerFail() {
		Customer customer = null;
		assertEquals("Fail to Update",customerServiceImpl.updateCustomer(customer));
	}

	@Test
	void testDeleteCustomer() {
		assertEquals("Success",customerServiceImpl.deleteCustomer(1));
	}
	
	@Test
	void testDeleteCustomerFail() {
		assertEquals("Fail to Delete",customerServiceImpl.deleteCustomer(23));
	}

}
