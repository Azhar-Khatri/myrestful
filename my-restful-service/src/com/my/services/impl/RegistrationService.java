package com.my.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.my.dao.impl.RegistrationDao;
import com.my.model.CustomerRegistration;
import com.my.services.IRegistrationService;

public class RegistrationService implements IRegistrationService {

	@Autowired
	private RegistrationDao registrationDao;

	@Override
	public CustomerRegistration registerCustomer(CustomerRegistration cusReg) throws Exception {
		return registrationDao.registerCustomer(cusReg);
	}

	/**
	 * @return the registrationDao
	 */
	public RegistrationDao getRegistrationDao() {
		return registrationDao;
	}

	/**
	 * @param registrationDao
	 *            the registrationDao to set
	 */
	public void setRegistrationDao(RegistrationDao registrationDao) {
		this.registrationDao = registrationDao;
	}
}
