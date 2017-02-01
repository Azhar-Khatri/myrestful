package com.my.services.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import com.my.dao.IWalletDao;
import com.my.model.Wallet;
import com.my.model.WalletTransaction;
import com.my.services.IWalletService;

public class WalletService implements IWalletService {

	@Autowired
	IWalletDao walletDao;

	@Override
	public void createWallet(Wallet wallet) throws Exception {
		walletDao.createWallet(wallet);
	}

	@Override
	public Wallet getWallet(long srcId, String srcType) throws Exception{
		return walletDao.getWallet(srcId, srcType);
	}

	@Override
	public void updateWallet(Wallet wallet) throws Exception {
		walletDao.updateWallet(wallet);
	}
	@Override
	public void recordTrans(WalletTransaction walletTransaction) throws Exception {
		walletDao.recordTrans(walletTransaction);
	}

	@Override
	public BigDecimal getBalance(long srcId, String srcType) throws Exception{
		return walletDao.getBalance(srcId, srcType);
	}
	
	/**
	 * @return the walletDao
	 */
	public IWalletDao getWalletDao() {
		return walletDao;
	}

	/**
	 * @param walletDao
	 *            the walletDao to set
	 */
	public void setWalletDao(IWalletDao walletDao) {
		this.walletDao = walletDao;
	}

}
