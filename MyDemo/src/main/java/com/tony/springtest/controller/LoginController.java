package com.tony.springtest.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tony.springtest.entity.User;
import com.tony.springtest.service.UserService;
import com.tony.springtest.service.UserServiceImpl;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@Autowired
	 private UserService userService;
	 
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("Show login.jsp", locale);

		User u = userService.findUserById(1);
		
		logger.info("Show login.jsp", u.getAccout());
		return "login";
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET,params="login_error")
	public String loginError(@RequestParam(value="login_error",required = true) String error, Model model) {
		logger.info("login return", error);
		
		return "loginerror";
	}
}
