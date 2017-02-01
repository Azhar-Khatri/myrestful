package com.my.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "wallet_trans_log")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class WalletTransaction implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "WALLET_ID", referencedColumnName = "ID", nullable = false)
	private Wallet wallet;

	@Column(name = "TRANS_TYP")
	private String transType;

	@Column(name = "TRANS_AMT")
	private BigDecimal transAmt;

	@Column(name = "COMMENTS")
	private String comments;

	@Column(name = "REG_ID")
	private long regId;

	@Column(name = "CRT_USR_ID")
	private String createUserId;

	@Column(name = "CRT_TS")
	private Timestamp createTS;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the wallet
	 */
	public Wallet getWallet() {
		return wallet;
	}

	/**
	 * @param wallet
	 *            the wallet to set
	 */
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	/**
	 * @return the transType
	 */
	public String getTransType() {
		return transType;
	}

	/**
	 * @param transType
	 *            the transType to set
	 */
	public void setTransType(String transType) {
		this.transType = transType;
	}

	/**
	 * @return the transAmt
	 */
	public BigDecimal getTransAmt() {
		return transAmt;
	}

	/**
	 * @param transAmt the transAmt to set
	 */
	public void setTransAmt(BigDecimal transAmt) {
		this.transAmt = transAmt;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments
	 *            the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	/**
	 * @return the regId
	 */
	public long getRegId() {
		return regId;
	}

	/**
	 * @param regId the regId to set
	 */
	public void setRegId(long regId) {
		this.regId = regId;
	}

	/**
	 * @return the createUserId
	 */
	public String getCreateUserId() {
		return createUserId;
	}

	/**
	 * @param createUserId
	 *            the createUserId to set
	 */
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	/**
	 * @return the createTS
	 */
	public Timestamp getCreateTS() {
		return createTS;
	}

	/**
	 * @param createTS
	 *            the createTS to set
	 */
	public void setCreateTS(Timestamp createTS) {
		this.createTS = createTS;
	}

}
