package com.tony.springtest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/post")
public class PostController {

	private static final Logger logger = LoggerFactory.getLogger(PostController.class);
	
	@RequestMapping(value="/{version}/test.do", method=RequestMethod.GET)
	public String test(@PathVariable("version") String version, Model m, HttpRequest req){
		logger.info("version: ", version);
		return null;
		
	}
}
