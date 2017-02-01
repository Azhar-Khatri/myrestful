package com.my.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.my.dao.ICompanyDao;
import com.my.model.Company;

public class CompanyDao implements ICompanyDao {
	@Autowired
	private SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public void addCompany(Company company) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(company);
		tx.commit();
		session.close();
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
