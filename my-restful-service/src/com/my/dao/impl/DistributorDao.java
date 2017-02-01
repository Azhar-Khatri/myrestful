package com.my.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.my.dao.IDistributorDao;
import com.my.model.Distributor;

public class DistributorDao implements IDistributorDao {

	@Autowired
	private SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public void addDistributor(Distributor distributor) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(distributor);
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
