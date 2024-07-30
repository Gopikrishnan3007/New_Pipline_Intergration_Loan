package com.gopi.restapp.serviceimpl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gopi.restapp.model.Loan;
import com.gopi.restapp.serviceimpl.LoanServiceImpl;

@SpringBootTest
class LoanServiceImplTest {

	@Autowired
	LoanServiceImpl loanServiceImpl;

	@Test
	void testAddLoan() {
		Loan loan = new Loan(0, "2,00,000", "Bike Loan", "50,000", "25,000");
		assertEquals("Success", loanServiceImpl.addLoan(loan));
	}

	@Test
	void testAddLoanFail() {
		Loan loan = null;
		assertEquals("Fail to Add", loanServiceImpl.addLoan(loan));
	}

	@Test
	void testGetLoan() {
		assertNotNull(loanServiceImpl.getLoan(7));
	}

	@Test
	void testGetLoanFail() {
		assertNull(loanServiceImpl.getLoan(110));
	}

	@Test
	void testGetAllLoans() {
		assertNotNull(loanServiceImpl.getAllLoans());
	}

	@Test
	void testUpdateLoan() {
		Loan loan = new Loan(5, "2,00,000", "Bike Loan", "50,000", "25,000");
		assertEquals("Success", loanServiceImpl.updateLoan(loan));
	}
	
	@Test
	void testUpdateLoanFail() {
		Loan loan = null;
		assertEquals("Fail to Update", loanServiceImpl.updateLoan(loan));
	}

	@Test
	void testGetLoanIds() {
		assertNotNull(loanServiceImpl.getLoanIds());
	}

	@Test
	void testDeleteLoan() {
		assertEquals("Success",loanServiceImpl.deleteLoan(53));
	}
	
	@Test
	void testDeleteLoanFail() {
		assertEquals("Fail to Delete",loanServiceImpl.deleteLoan(5));
	}

}
