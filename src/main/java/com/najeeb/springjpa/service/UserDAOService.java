package com.najeeb.springjpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.najeeb.springjpa.entity.User;

@Repository
@Transactional
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
}

/*
public class SomeEntityDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(SomeEntity entity) {
		entityManager.persist(entity);
		return entity.getId();
	}
}
*/