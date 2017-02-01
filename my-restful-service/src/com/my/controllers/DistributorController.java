package com.my.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.my.facades.IDistributorFacade;
import com.my.model.Distributor;
import com.my.util.MyUtil;
import com.my.vo.Status;

@RestController
@RequestMapping(value = "/distributor")
public class DistributorController {

	@Autowired
	private IDistributorFacade distributorFacade;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody Status addDistrbutor(@RequestBody Distributor distributor) {
		try {
			distributorFacade.addDistributor(distributor);
		} catch (Exception e) {
			return MyUtil.errorResponse(e, null);
		}
		return MyUtil.successResponse();

	}

	/**
	 * @return the distributorFacade
	 */
	public IDistributorFacade getDistributorFacade() {
		return distributorFacade;
	}

	/**
	 * @param distributorFacade
	 *            the distributorFacade to set
	 */
	public void setDistributorFacade(IDistributorFacade distributorFacade) {
		this.distributorFacade = distributorFacade;
	}

}
