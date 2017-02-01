package com.my.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.my.dao.ICompanyDao;
import com.my.model.Company;
import com.my.services.ICompanyService;

public class CompanyService implements ICompanyService {

	@Autowired
	ICompanyDao companyDao;
	
	@Override
	public void addCompany(Company company) throws Exception {
		// TODO Auto-generated method stub
		companyDao.addCompany(company);
	}

	/**
	 * @return the companyDao
	 */
	public ICompanyDao getCompanyDao() {
		return companyDao;
	}

	/**
	 * @param companyDao the companyDao to set
	 */
	public void setCompanyDao(ICompanyDao companyDao) {
		this.companyDao = companyDao;
	}
	
	
}
