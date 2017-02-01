package com.my.facades.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.my.facades.IRegistrationFacade;
import com.my.model.CustomerRegistration;
import com.my.model.Wallet;
import com.my.model.WalletTransaction;
import com.my.services.IRegistrationService;
import com.my.services.IWalletService;

public class RegistrationFacade implements IRegistrationFacade {

	@Autowired
	IRegistrationService registrationService;

	@Autowired
	IWalletService walletService;

	@Override
	public CustomerRegistration registerCustomer(CustomerRegistration cusReg) throws Exception {
		// TO DO - check balance in wallet and registration amount
		Wallet wallet = walletService.getWallet(cusReg.getSrcId(), cusReg.getSrcType());
		if (wallet.getAccountBal().compareTo(cusReg.getInvoiceAmt()) < 0) {
			throw new Exception("Balance Insufficient");
		}
		CustomerRegistration customerReg = registrationService.registerCustomer(cusReg);
		WalletTransaction walletTransaction = new WalletTransaction();
		walletTransaction.setRegId(customerReg.getId());
		walletTransaction.setTransAmt(cusReg.getInvoiceAmt());
		walletTransaction.setComments("Customer Registration");
		walletTransaction.setTransType("DR");
		walletTransaction.setWallet(wallet);
		walletService.recordTrans(walletTransaction);
		wallet.setAccountBal(wallet.getAccountBal().subtract(cusReg.getInvoiceAmt()));
		walletService.updateWallet(wallet);
		return customerReg;
	}

	/**
	 * @return the registrationService
	 */
	public IRegistrationService getRegistrationService() {
		return registrationService;
	}

	/**
	 * @param registrationService
	 *            the registrationService to set
	 */
	public void setRegistrationService(IRegistrationService registrationService) {
		this.registrationService = registrationService;
	}

	/**
	 * @return the walletService
	 */
	public IWalletService getWalletService() {
		return walletService;
	}

	/**
	 * @param walletService
	 *            the walletService to set
	 */
	public void setWalletService(IWalletService walletService) {
		this.walletService = walletService;
	}

}
