package com.gopi.restapp.repository;

import java.util.List;

import com.gopi.restapp.model.Loan;

public interface LoanRepo {

	List<Integer> fetchId();

	Loan findById(int id);

	List<Loan> findAll();

	String update(Loan loan);

	String save(Loan loan);

	String deleteById(int id);
}
