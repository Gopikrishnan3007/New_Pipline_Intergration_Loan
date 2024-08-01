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

import com.gopi.restapp.model.Loan;
import com.gopi.restapp.service.LoanService;



@RestController
@RequestMapping("/loan")
@CrossOrigin("http://localhost:3000")
public class LoanController {

	LoanService service;

	public LoanController(LoanService service) {
			super();
			this.service = service;
		}

	@PostMapping
	public String insertLoan(@RequestBody Loan loan) {
		String msgString = "";

		try {
			service.addLoan(loan);
			msgString = "Insertion Success";
		} catch (Exception e) {
			msgString = "Insertion Failure";
		}
		return msgString;
	}

	@GetMapping("{id}")
	public Loan getLoanById(@PathVariable("id") int id) {
		return service.getLoan(id);
	}

	@GetMapping("/all")
	public List<Loan> getLoan() {
		return service.getAllLoans();
	}

	@PutMapping
	public String updateLoan(@RequestBody Loan loan) {
		String msgString = "";

		try {
			service.updateLoan(loan);
			msgString = "Updation Success";
		} catch (Exception e) {
			msgString = "Updation Failure";
		}
		return msgString;
	}

	@GetMapping("/getLoanid")
	public List<Integer> getLoanIds() {
		return service.getLoanIds();
	}

	@DeleteMapping("{id}")
	public String deleteLoanById(@PathVariable("id") int id) {
		String msgString = "";
		try {
			service.deleteLoan(id);
			msgString = "Deletion Success";
		} catch (Exception e) {
			msgString = "Deletion Failure";
		}
		return msgString;
	}
}
