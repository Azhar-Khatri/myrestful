package com.my.services;

import com.my.model.CustomerRegistration;

public interface IRegistrationService {
	public CustomerRegistration registerCustomer(CustomerRegistration cusReg) throws Exception;
}
