package com.my.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.my.facades.IWalletFacade;
import com.my.model.Wallet;
import com.my.util.MyUtil;
import com.my.vo.Status;

@RestController
@RequestMapping(value = "/wallet")
public class WalletController {

	@Autowired
	private IWalletFacade walletFacade;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody Status createWallet(@RequestBody Wallet wallet) {
		try {
			walletFacade.createWallet(wallet);
		} catch (Exception e) {
			return MyUtil.errorResponse(e, null);
		}
		return MyUtil.successResponse();
	}

	@RequestMapping(value = "/transfer", method = RequestMethod.POST)
	public @ResponseBody Status transfer(@RequestBody String jsonRequest) {
		try {
			walletFacade.transfer(jsonRequest);
		} catch (Exception e) {
			return MyUtil.errorResponse(e, null);
		}
		return MyUtil.successResponse();
	}

	@RequestMapping(value = "/get", method = RequestMethod.POST)
	public @ResponseBody Status getWallet(@RequestBody String jsonRequest) {
		Wallet wallet = null;
		try {
			wallet = walletFacade.getWallet(jsonRequest);
		} catch (Exception e) {
			return MyUtil.errorResponse(e, null);
		}
		return MyUtil.successResponse(wallet);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public @ResponseBody Status updateWallet(@RequestBody Wallet wallet) {
		try {
			walletFacade.updateWallet(wallet);
		} catch (Exception e) {
			return MyUtil.errorResponse(e, null);
		}
		return MyUtil.successResponse();
	}
}
