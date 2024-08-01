package com.gopi.restapp.repositoryimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.gopi.restapp.model.Customer;
import com.gopi.restapp.model.Loan;
import com.gopi.restapp.repository.LoanRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LoanRepoImpl implements LoanRepo {

	EntityManager entityManager;

	public LoanRepoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Integer> fetchId() {
		String jpql = "SELECT l.loanId FROM Loan l";
		TypedQuery<Integer> query = entityManager.createQuery(jpql, Integer.class);
		return query.getResultList();

	}

	@Override
	public Loan findById(int id) {
		return entityManager.find(Loan.class, id);
	}

	@Override
	public List<Loan> findAll() {
		String jpql = "SELECT l FROM Loan l";
		TypedQuery<Loan> query = entityManager.createQuery(jpql, Loan.class);
		return query.getResultList();
	}

	@Override
	public String update(Loan loan) {
		if (loan != null) {
			entityManager.merge(loan);
			return "Success";
		} else {
			return "Fail to Update";
		}

	}

	@Override
	public String save(Loan loan) {
		if (loan != null) {
			entityManager.merge(loan);
			return "Success";
		} else {
			return "Fail to Add";
		}
	}

	@Override
	public String deleteById(int id) {
		Optional<Loan> id1 = Optional.ofNullable(findById(id));
		if (id1.isPresent()) {
			String jpql = "DELETE FROM Loan WHERE loanId = " + id;
			entityManager.createQuery(jpql).executeUpdate();
			return "Success";
		} else {
			return "Fail to Delete";
		}
	}
}
