package com.my.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.my.facades.ICompanyFacade;
import com.my.model.Company;
import com.my.util.MyUtil;
import com.my.vo.Status;

@RestController
@RequestMapping(value = "/company")
public class CompanyController {

	@Autowired
	private ICompanyFacade companyFacade;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody Status addCompany(@RequestBody Company company) {
		try {
			companyFacade.addCompany(company);
		} catch (Exception e) {
			return MyUtil.errorResponse(e, null);
		}
		return MyUtil.successResponse();
	}

	/**
	 * @return the companyFacade
	 */
	public ICompanyFacade getCompanyFacade() {
		return companyFacade;
	}

	/**
	 * @param companyFacade
	 *            the companyFacade to set
	 */
	public void setCompanyFacade(ICompanyFacade companyFacade) {
		this.companyFacade = companyFacade;
	}

}
