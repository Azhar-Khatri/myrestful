package com.my.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.my.dao.IRetailerDao;
import com.my.model.Retailer;

public class RetailerDao implements IRetailerDao {

	@Autowired
	private SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public void addRetailer(Retailer retailer) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(retailer);
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
