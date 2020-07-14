package com.ucn.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ucn.web.entity.User;
import com.ucn.web.message.userForm;
import com.ucn.web.service.UserService;

@Controller
@RequestMapping (value = "/user")
public class UserController {
	
	private static Logger logger = LogManager.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value="/doShowEntry")
	public String doShowEntry(userForm form, HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
		try {
			
		}catch (Exception e) {
			logger.error("Exception", e);
			form.setErrorMessage(e.getMessage());
		}
		return "user/user_listing";
	}
	
	@PostMapping(value="/doSave")
	public String doSave(userForm form, HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
		try {
			User user = new User();
			user.setCode(form.getCode());
			user.setName(form.getName());
			user.setEmail(form.getEmail());
			user.setNik(form.getNik());
			
			this.userService.save(user);
		}catch (Exception e) {
			logger.error("Exception", e);
			form.setErrorMessage(e.getMessage());
		}
		return "user/user_entry";
	}
	
}
