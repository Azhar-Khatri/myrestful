package com.my.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.my.facades.IRegistrationFacade;
import com.my.model.CustomerRegistration;
import com.my.util.MyUtil;
import com.my.vo.Status;

@RestController
@RequestMapping(value = "/register")
public class RegistrationController {

	@Autowired
	IRegistrationFacade registrationFacade;

	/**
	 * @return the registrationFacade
	 */
	public IRegistrationFacade getRegistrationFacade() {
		return registrationFacade;
	}

	/**
	 * @param registrationFacade
	 *            the registrationFacade to set
	 */
	public void setRegistrationFacade(IRegistrationFacade registrationFacade) {
		this.registrationFacade = registrationFacade;
	}

	// @RequestMapping(value = "/customer", method = RequestMethod.GET, consumes
	// = MediaType.APPLICATION_JSON_VALUE)
	// public @ResponseBody String registerCustomer(@RequestBody String body) {
	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public @ResponseBody Status addCompany(@RequestBody CustomerRegistration cusReg) {
		try {
			registrationFacade.registerCustomer(cusReg);
		} catch (Exception e) {
			return MyUtil.errorResponse(e, null);
		}
		return MyUtil.successResponse();
	}
}
