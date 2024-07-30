package com.gopi.restapp.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gopi.restapp.model.Loan;
import com.gopi.restapp.repository.LoanRepo;
import com.gopi.restapp.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService {

	LoanRepo repo;

	public LoanServiceImpl(LoanRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Loan getLoan(int stationId) {
		return repo.findById(stationId);
	}

	@Override
	public List<Loan> getAllLoans() {
		return repo.findAll();
	}

	@Override
	public String updateLoan(Loan loan) {
		return repo.update(loan);

	}

	@Override
	public List<Integer> getLoanIds() {
		return repo.fetchId();
	}

	@Override
	public String addLoan(Loan loan) {
		return repo.save(loan);
	}

	@Override
	public String deleteLoan(int id) {
		return repo.deleteById(id);
	}
}
