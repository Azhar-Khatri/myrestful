package com.my.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "wallet")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Wallet implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

	@Column(name = "SRC_ID")
	private long srcId;

	@Column(name = "SRC_TYP")
	private String srcType;

	@Column(name = "ACCT_BAL")
	private BigDecimal accountBal;

	@Column(name = "COMMENTS")
	private String comments;

	@Column(name = "CRT_USR_ID")
	private String createUserId;

	@Column(name = "CRT_TS")
	private Timestamp createTS;

	@Column(name = "UPDT_USR_ID")
	private String updateUserId;

	@Column(name = "UPDT_TS")
	private Timestamp updateTS;

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
	 * @return the srcId
	 */
	public long getSrcId() {
		return srcId;
	}

	/**
	 * @param srcId the srcId to set
	 */
	public void setSrcId(long srcId) {
		this.srcId = srcId;
	}

	/**
	 * @return the srcType
	 */
	public String getSrcType() {
		return srcType;
	}

	/**
	 * @param srcType the srcType to set
	 */
	public void setSrcType(String srcType) {
		this.srcType = srcType;
	}

	/**
	 * @return the accountBal
	 */
	public BigDecimal getAccountBal() {
		return accountBal;
	}

	/**
	 * @param accountBal
	 *            the accountBal to set
	 */
	public void setAccountBal(BigDecimal accountBal) {
		this.accountBal = accountBal;
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

	/**
	 * @return the updateUserId
	 */
	public String getUpdateUserId() {
		return updateUserId;
	}

	/**
	 * @param updateUserId
	 *            the updateUserId to set
	 */
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	/**
	 * @return the updateTS
	 */
	public Timestamp getUpdateTS() {
		return updateTS;
	}

	/**
	 * @param updateTS
	 *            the updateTS to set
	 */
	public void setUpdateTS(Timestamp updateTS) {
		this.updateTS = updateTS;
	}

}
