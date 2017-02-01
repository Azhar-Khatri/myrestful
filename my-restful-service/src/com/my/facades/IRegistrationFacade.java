package com.my.facades;

import com.my.model.CustomerRegistration;

public interface IRegistrationFacade {
	public CustomerRegistration registerCustomer(CustomerRegistration cusReg) throws Exception;
}
