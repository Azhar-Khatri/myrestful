package com.my.services;

import java.math.BigDecimal;

import com.my.model.Wallet;
import com.my.model.WalletTransaction;

public interface IWalletService {
	public void createWallet(Wallet wallet) throws Exception;

	public Wallet getWallet(long srcId, String srcType) throws Exception;

	public void updateWallet(Wallet wallet) throws Exception;

	public void recordTrans(WalletTransaction walletTransaction) throws Exception;
	
	public BigDecimal getBalance(long srcId, String srcType) throws Exception;
}
