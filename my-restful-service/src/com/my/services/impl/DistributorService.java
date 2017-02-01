package com.my.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.my.dao.IDistributorDao;
import com.my.model.Distributor;
import com.my.services.IDistributorService;

public class DistributorService implements IDistributorService {
	@Autowired
	IDistributorDao distributorDao;

	@Override
	public void addDistributor(Distributor distributor) throws Exception {
		distributorDao.addDistributor(distributor);
	}

	/**
	 * @return the distributorDao
	 */
	public IDistributorDao getDistributorDao() {
		return distributorDao;
	}

	/**
	 * @param distributorDao
	 *            the distributorDao to set
	 */
	public void setDistributorDao(IDistributorDao distributorDao) {
		this.distributorDao = distributorDao;
	}

}
