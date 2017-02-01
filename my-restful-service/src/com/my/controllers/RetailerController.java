package com.my.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.my.facades.IRetailerFacade;
import com.my.model.Retailer;
import com.my.util.MyUtil;
import com.my.vo.Status;

@RestController
@RequestMapping(value = "/retailer")
public class RetailerController {

	@Autowired
	private IRetailerFacade retailerFacade;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody Status addCompany(@RequestBody Retailer retailer) {
		try {
			retailerFacade.addRetailer(retailer);
		} catch (Exception e) {
			return MyUtil.errorResponse(e, null);
		}
		return MyUtil.successResponse();
	}

	/**
	 * @return the retailerFacade
	 */
	public IRetailerFacade getRetailerFacade() {
		return retailerFacade;
	}

	/**
	 * @param retailerFacade
	 *            the retailerFacade to set
	 */
	public void setRetailerFacade(IRetailerFacade retailerFacade) {
		this.retailerFacade = retailerFacade;
	}

}
