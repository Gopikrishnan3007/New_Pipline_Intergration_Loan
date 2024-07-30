package com.gopi.restapp.service;

import java.util.List;

import com.gopi.restapp.model.Loan;


public interface LoanService {

	Loan getLoan(int id);

	List<Loan> getAllLoans();

	String updateLoan(Loan loan);

	List<Integer> getLoanIds();

	String addLoan(Loan loan);

	String deleteLoan(int id);
}
