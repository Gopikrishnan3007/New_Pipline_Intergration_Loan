package com.gopi.restapp.repositoryimpl;


import org.springframework.stereotype.Repository;

import com.gopi.restapp.model.User;
import com.gopi.restapp.repository.UserRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.NonUniqueResultException;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserRepoImpl implements UserRepository {

	EntityManager entityManager;


	public UserRepoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public User findByUserName(String userName) {
		 String jpql = "SELECT u FROM User u WHERE u.userName = :userName";
		    TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
		    query.setParameter("userName", userName);
		    
		    try {
		        return query.getSingleResult();
		    } catch (NoResultException | NonUniqueResultException e) {
		        return null;
		    }
	}

	@Override
	public String save(User user) {
		if(user != null) {
		entityManager.merge(user);
		return "success";
		}
		else {
			return "Fail to Add";
		}
	}
	
	
	
}