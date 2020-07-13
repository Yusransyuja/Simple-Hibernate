package com.ucn.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ucn.web.message.transactionForm;

@Controller
@RequestMapping (value = "/user")
public class UserController {
	
	private static Logger logger = LogManager.getLogger(UserController.class);
	
	@PostMapping(value="/doShowEntry")
	public String doShowEntry(transactionForm form, HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
		try {
			
		}catch (Exception e) {
			logger.error("Exception", e);
			form.setErrorMessage(e.getMessage());
		}
		return "user/user_listing";
	}
	
	@PostMapping(value="/doSave")
	public String doSave(transactionForm form, HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
		try {
			
		}catch (Exception e) {
			logger.error("Exception", e);
			form.setErrorMessage(e.getMessage());
		}
		return "user/user_entry";
	}
	
	@PostMapping(value="/doUpdate")
	public String doUpdate(transactionForm form, HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
		try {
			
		}catch (Exception e) {
			logger.error("Exception", e);
			form.setErrorMessage(e.getMessage());
		}
		return "user/user_entry";
	}
	
	@PostMapping(value="/doDelete")
	public String doDelete(transactionForm form, HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
		try {
			
		}catch (Exception e) {
			logger.error("Exception", e);
			form.setErrorMessage(e.getMessage());
		}
		return "user/user_listing";
	}
	
}
