package com.my.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.my.dao.IRegistrationDao;
import com.my.model.CustomerRegistration;

public class RegistrationDao implements IRegistrationDao {
	@Autowired
	private SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public CustomerRegistration registerCustomer(CustomerRegistration cusReg) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(cusReg);
		tx.commit();
		session.close();
		return cusReg;
	}

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
