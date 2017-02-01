package com.my.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.my.dao.IRetailerDao;
import com.my.model.Retailer;
import com.my.services.IRetailerService;

public class RetailerService implements IRetailerService {

	@Autowired
	IRetailerDao retailerDao;
	
	@Override
	public void addRetailer(Retailer retailer) throws Exception {
		retailerDao.addRetailer(retailer);
	}

	/**
	 * @return the retailerDao
	 */
	public IRetailerDao getRetailerDao() {
		return retailerDao;
	}

	/**
	 * @param retailerDao the retailerDao to set
	 */
	public void setRetailerDao(IRetailerDao retailerDao) {
		this.retailerDao = retailerDao;
	}

}
