package com.my.dao;

import com.my.model.CustomerRegistration;

public interface IRegistrationDao {
	public CustomerRegistration registerCustomer(CustomerRegistration cusReg) throws Exception;
}
