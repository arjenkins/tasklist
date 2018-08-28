package com.grandcircus.tasklist.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TaskDao {

	
	@Autowired
	EntityManager entityManager;
	
	
	//add add, remove, list task to here
}
