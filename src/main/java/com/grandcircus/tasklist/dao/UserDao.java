package com.grandcircus.tasklist.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	EntityManager entityManager;
	
	
	
	
}
