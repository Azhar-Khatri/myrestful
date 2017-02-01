package com.my.facades;

import java.math.BigDecimal;

import com.my.model.Wallet;

public interface IWalletFacade {
	public void createWallet(Wallet wallet) throws Exception;

	public Wallet getWallet(String jsonRequest) throws Exception;

	public void updateWallet(Wallet wallet) throws Exception;

	public void transfer(String jsonRequest) throws Exception;

	public BigDecimal getBalance(long srcId, String srcType) throws Exception;
}
