package com.gopi.restapp.repositoryimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.gopi.restapp.model.Customer;
import com.gopi.restapp.repository.CustomerRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class CustomerRepoImpl implements CustomerRepo {

	EntityManager entityManager;

	public CustomerRepoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public String save(Customer customer) {
		if(customer !=null) {
		entityManager.merge(customer);
		return "Success";
		}
		else{
			return "Fail to Add";
		}
	}

	@Override
	public Customer findById(int id) {
		return entityManager.find(Customer.class, id);
	}

	@Override
	public List<Customer> findAll() {
		String jpql = "SELECT c FROM Customer c";
		TypedQuery<Customer> query = entityManager.createQuery(jpql, Customer.class);
		return query.getResultList();
	}

	@Override
	public String update(Customer customer) {
		if(customer != null) {
		entityManager.merge(customer);
		return "Success";
		}
		else {
			return "Fail to Update";
		}
	}

	@Override
	public String deleteById(int id) {
		Optional<Customer> id1 = Optional.ofNullable(findById(id));
		if(id1.isPresent()) {
		String jpql = "DELETE FROM Customer WHERE customerId = " + id;
		entityManager.createQuery(jpql).executeUpdate(); // not id only object
		return "Success";
		}
		else {
			return "Fail to Delete";
		}
	}
	
}
