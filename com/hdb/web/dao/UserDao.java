package com.hdb.web.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hdb.web.dto.User;

@Component
public class UserDao {

	@Autowired
	private SessionFactory factory;
	
	public void save(User user) {
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(user);
		tx.commit();
		session.close();
	}
	
}
