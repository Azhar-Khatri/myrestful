package com.my.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@RequestMapping(value = "/authenticateUser", method = RequestMethod.GET, headers = "Accept=application/json")
	public String authenticateUser() {
		return "true";
	}
}
