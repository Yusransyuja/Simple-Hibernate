package com.ucn.web.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucn.web.entity.User;
import com.ucn.web.repository.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	private static Logger logger = LogManager.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserDAO userDAO;
	
	public void save(User user)throws Exception{
		try{
			
			userDAO.save(user);
			
		}catch (Exception e) {
			logger.error("Exception", e);
			throw new Exception("Contact Your Adminstrator");
		}
	}
}
