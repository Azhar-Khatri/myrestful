package com.my.facades.impl;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.my.facades.IWalletFacade;
import com.my.model.Wallet;
import com.my.model.WalletTransaction;
import com.my.services.IWalletService;

public class WalletFacade implements IWalletFacade {

	@Autowired
	IWalletService walletService;

	@Override
	public void createWallet(Wallet wallet) throws Exception {
		walletService.createWallet(wallet);
	}

	@Override
	public Wallet getWallet(String jsonRequest) throws Exception {
		JsonNode jsonObject = new ObjectMapper().readTree(jsonRequest);
		if (jsonObject == null) {
			throw new Exception("Request is null");
		} else {
			long srcId = jsonObject.get("srcId").asLong();
			String srcType = jsonObject.get("srcType").asText();
			return walletService.getWallet(srcId, srcType);
		}
	}

	@Override
	public void updateWallet(Wallet wallet) throws Exception {
		walletService.updateWallet(wallet);
	}

	@Override
	@Transactional
	public void transfer(String jsonRequest) throws Exception {
		JsonNode jsonObject = new ObjectMapper().readTree(jsonRequest);
		if (jsonObject == null) {
			throw new Exception("Request is null");
		} else {
			long requestorId = jsonObject.get("requestorId").asLong();
			long receiverId = jsonObject.get("receiverId").asLong();
			BigDecimal transAmt = new BigDecimal(jsonObject.get("transAmt").asText());
			String requestorSrcType = jsonObject.get("requestorSrc").asText();
			String receiverSrcType = jsonObject.get("receiverSrc").asText();
			String comments = jsonObject.get("comments").asText();
			String createUserId = jsonObject.get("createUserId").asText();
			if (requestorId > 0 && receiverId > 0 && transAmt != null) {
				Wallet requestorWallet = walletService.getWallet(requestorId, requestorSrcType);
				Wallet receiverWallet = walletService.getWallet(receiverId, receiverSrcType);
				if (requestorWallet != null && receiverWallet != null) {
					if (requestorWallet.getAccountBal().compareTo(transAmt) < 0) {
						throw new Exception("Balance Insufficient");
					}
					WalletTransaction requestor = new WalletTransaction();
					requestor.setTransType("DR");
					requestor.setWallet(requestorWallet);
					requestor.setTransAmt(transAmt);
					requestor.setComments(comments);
					requestor.setCreateUserId(createUserId);
					// DR
					walletService.recordTrans(requestor);
					requestorWallet.setAccountBal(requestorWallet.getAccountBal().subtract(transAmt));
					requestorWallet.setUpdateTS(null);
					walletService.updateWallet(requestorWallet);

					WalletTransaction receiver = new WalletTransaction();
					receiver.setTransType("CR");
					receiver.setWallet(receiverWallet);
					receiver.setTransAmt(transAmt);
					receiver.setComments(comments);
					receiver.setCreateUserId(createUserId);
					// CR
					walletService.recordTrans(receiver);
					receiverWallet.setAccountBal(receiverWallet.getAccountBal().add(transAmt));
					receiverWallet.setUpdateTS(null);
					walletService.updateWallet(receiverWallet);
				}
			} else {
				throw new Exception("Requested information is incorrect");
			}
		}
	}

	@Override
	public BigDecimal getBalance(long srcId, String srcType) throws Exception {
		return walletService.getBalance(srcId, srcType);
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
