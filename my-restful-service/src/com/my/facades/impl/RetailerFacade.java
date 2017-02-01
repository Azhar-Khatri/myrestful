package com.my.facades.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.my.facades.IRetailerFacade;
import com.my.model.Retailer;
import com.my.services.IRetailerService;

public class RetailerFacade implements IRetailerFacade {

	@Autowired
	IRetailerService retailerService;

	@Override
	public void addRetailer(Retailer retailer) throws Exception {
		retailerService.addRetailer(retailer);
	}

	/**
	 * @return the retailerService
	 */
	public IRetailerService getRetailerService() {
		return retailerService;
	}

	/**
	 * @param retailerService
	 *            the retailerService to set
	 */
	public void setRetailerService(IRetailerService retailerService) {
		this.retailerService = retailerService;
	}

}
