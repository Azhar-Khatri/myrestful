package com.my.dao.impl;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.my.dao.IWalletDao;
import com.my.model.Wallet;
import com.my.model.WalletTransaction;

public class WalletDao implements IWalletDao {

	@Autowired
	private SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public void createWallet(Wallet wallet) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(wallet);
		tx.commit();
		session.close();
	}

	@Override
	public Wallet getWallet(long srcId, String srcType) throws Exception {
		session = sessionFactory.openSession();
		String hql = "from Wallet w where w.srcId=:srcId and w.srcType=:srcType";
		Wallet wallet = (Wallet) session.createQuery(hql).setParameter("srcId", srcId).setParameter("srcType", srcType)
				.list().get(0);
		session.close();
		return wallet;
	}

	@Override
	public void updateWallet(Wallet wallet) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.update(wallet);
		tx.commit();
		session.close();
	}

	@Override
	public void recordTrans(WalletTransaction walletTransaction) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(walletTransaction);
		tx.commit();
		session.close();
	}

	@Override
	public BigDecimal getBalance(long srcId, String srcType) throws Exception {
		session = sessionFactory.openSession();
		String hql = "from Wallet w where w.srcId=:srcId and w.srcType=:srcType";
		Wallet wallet = (Wallet) session.createQuery(hql).setParameter("srcId", srcId).setParameter("srcType", srcType)
				.list().get(0);
		session.close();
		return wallet.getAccountBal();
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
