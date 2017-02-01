package com.my.facades.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.my.facades.IDistributorFacade;
import com.my.model.Distributor;
import com.my.services.IDistributorService;

public class DistributorFacade implements IDistributorFacade {

	@Autowired
	IDistributorService distributorService;

	@Override
	public void addDistributor(Distributor distributor) throws Exception {
		distributorService.addDistributor(distributor);
	}

	/**
	 * @return the distributorService
	 */
	public IDistributorService getDistributorService() {
		return distributorService;
	}

	/**
	 * @param distributorService
	 *            the distributorService to set
	 */
	public void setDistributorService(IDistributorService distributorService) {
		this.distributorService = distributorService;
	}

}
