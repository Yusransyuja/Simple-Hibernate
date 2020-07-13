package com.ucn.web.repository;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDAOImpl implements BaseDAO {

	@Autowired
	private EntityManager entityManagerRequest;
	
	public void save(Object obj) throws Exception {
		Session session = entityManagerRequest.unwrap(Session.class);
		session.save(obj);
	}
	
	public void update(Object obj) throws Exception {
		Session session = entityManagerRequest.unwrap(Session.class);
		session.update(obj);
	}
	
	public void delete(Object obj) throws Exception {
		Session session = entityManagerRequest.unwrap(Session.class);
		session.delete(obj);
	}
}
