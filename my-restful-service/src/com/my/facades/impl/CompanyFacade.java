package com.my.facades.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.my.facades.ICompanyFacade;
import com.my.model.Company;
import com.my.services.ICompanyService;

public class CompanyFacade implements ICompanyFacade {

	@Autowired
	private ICompanyService companyService;

	@Override
	public void addCompany(Company company) throws Exception {
		// TODO Auto-generated method stub
		companyService.addCompany(company);
	}

	/**
	 * @return the companyService
	 */
	public ICompanyService getCompanyService() {
		return companyService;
	}

	/**
	 * @param companyService
	 *            the companyService to set
	 */
	public void setCompanyService(ICompanyService companyService) {
		this.companyService = companyService;
	}

}
