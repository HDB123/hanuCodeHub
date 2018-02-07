package com.hdb.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hdb.web.dao.UserDao;
import com.hdb.web.dto.User;
@Component
public class UserDaoService {
	@Autowired
	UserDao dao;
	
	public void saveUser(User user) {
		dao.save(user);
	}

}
