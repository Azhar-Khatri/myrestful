package com.my.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cust_registration")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerRegistration implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

	@Column(name = "FIRST_NM")
	private String firstName;

	@Column(name = "LAST_NM")
	private String lastName;

	@Column(name = "PHONE")
	private String phone;

	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "DOB")
	private String dob;

	@Column(name = "SRC_ID")
	private long srcId;
	
	@Column(name = "SRC_TYP")
	private String srcType;

	@Column(name = "BRAND_NAME")
	private String brandName;

	@Column(name = "MODEL_NO")
	private String modelNo;

	@Column(name = "IMEI_NO")
	private String imeiNo;

	@Column(name = "INVOICE_NO")
	private String invoiceNo;
	
	@Column(name = "INVOICE_AMT")
	private BigDecimal invoiceAmt;

	@Column(name = "INVOICE_DT")
	private String invoiceDate;
	
	@Column(name = "ADDR_LN_1")
	private String addressLine1;

	@Column(name = "ADDR_LN_2")
	private String addressLine2;

	@Column(name = "ADDR_LN_3")
	private String addressLine3;

	@Column(name = "CITY")
	private String city;

	@Column(name = "STATE")
	private String state;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "ZIP")
	private String zip;

	@Column(name = "INVOICE_CPY")
	private Blob invoiceCopy;

	@Column(name = "INS_TYP")
	private String insType;
	
	@Column(name = "EXTENDED_WRTY_IND")
	private boolean extendedWrntyInd;

	@Column(name = "STNDBY_IND")
	private boolean standbyInd;

	@Column(name = "PICK_N_DROP_IND")
	private boolean pickNdropInd;

	@Column(name = "REG_TYP")
	private String regType;

	@Column(name = "CATEGORY")
	private String category;

	@Column(name = "PRODUCT")
	private String product;

	@Column(name = "WRTY_DUR")
	private String warrantyDuration;

	@Column(name = "PRICE_RNG")
	private String priceRange;

	@Column(name = "MFR_WRTY")
	private String mfrWarranty;
    
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
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
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
	 * @return the brandName
	 */
	public String getBrandName() {
		return brandName;
	}

	/**
	 * @param brandName the brandName to set
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/**
	 * @return the modelNo
	 */
	public String getModelNo() {
		return modelNo;
	}

	/**
	 * @param modelNo the modelNo to set
	 */
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	/**
	 * @return the imeiNo
	 */
	public String getImeiNo() {
		return imeiNo;
	}

	/**
	 * @param imeiNo the imeiNo to set
	 */
	public void setImeiNo(String imeiNo) {
		this.imeiNo = imeiNo;
	}

	/**
	 * @return the invoiceNo
	 */
	public String getInvoiceNo() {
		return invoiceNo;
	}

	/**
	 * @param invoiceNo the invoiceNo to set
	 */
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	/**
	 * @return the invoiceAmt
	 */
	public BigDecimal getInvoiceAmt() {
		return invoiceAmt;
	}

	/**
	 * @param invoiceAmt the invoiceAmt to set
	 */
	public void setInvoiceAmt(BigDecimal invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	/**
	 * @return the invoiceDate
	 */
	public String getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * @param invoiceDate the invoiceDate to set
	 */
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * @return the addressLine3
	 */
	public String getAddressLine3() {
		return addressLine3;
	}

	/**
	 * @param addressLine3 the addressLine3 to set
	 */
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @return the invoiceCopy
	 */
	public Blob getInvoiceCopy() {
		return invoiceCopy;
	}

	/**
	 * @param invoiceCopy the invoiceCopy to set
	 */
	public void setInvoiceCopy(Blob invoiceCopy) {
		this.invoiceCopy = invoiceCopy;
	}

	/**
	 * @return the insType
	 */
	public String getInsType() {
		return insType;
	}

	/**
	 * @param insType the insType to set
	 */
	public void setInsType(String insType) {
		this.insType = insType;
	}

	/**
	 * @return the extendedWrntyInd
	 */
	public boolean isExtendedWrntyInd() {
		return extendedWrntyInd;
	}

	/**
	 * @param extendedWrntyInd the extendedWrntyInd to set
	 */
	public void setExtendedWrntyInd(boolean extendedWrntyInd) {
		this.extendedWrntyInd = extendedWrntyInd;
	}

	/**
	 * @return the standbyInd
	 */
	public boolean isStandbyInd() {
		return standbyInd;
	}

	/**
	 * @param standbyInd the standbyInd to set
	 */
	public void setStandbyInd(boolean standbyInd) {
		this.standbyInd = standbyInd;
	}

	/**
	 * @return the pickNdropInd
	 */
	public boolean isPickNdropInd() {
		return pickNdropInd;
	}

	/**
	 * @param pickNdropInd the pickNdropInd to set
	 */
	public void setPickNdropInd(boolean pickNdropInd) {
		this.pickNdropInd = pickNdropInd;
	}

	/**
	 * @return the regType
	 */
	public String getRegType() {
		return regType;
	}

	/**
	 * @param regType the regType to set
	 */
	public void setRegType(String regType) {
		this.regType = regType;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * @return the warrantyDuration
	 */
	public String getWarrantyDuration() {
		return warrantyDuration;
	}

	/**
	 * @param warrantyDuration the warrantyDuration to set
	 */
	public void setWarrantyDuration(String warrantyDuration) {
		this.warrantyDuration = warrantyDuration;
	}

	/**
	 * @return the priceRange
	 */
	public String getPriceRange() {
		return priceRange;
	}

	/**
	 * @param priceRange the priceRange to set
	 */
	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	/**
	 * @return the mfrWarranty
	 */
	public String getMfrWarranty() {
		return mfrWarranty;
	}

	/**
	 * @param mfrWarranty the mfrWarranty to set
	 */
	public void setMfrWarranty(String mfrWarranty) {
		this.mfrWarranty = mfrWarranty;
	}

	/**
	 * @return the createUserId
	 */
	public String getCreateUserId() {
		return createUserId;
	}

	/**
	 * @param createUserId the createUserId to set
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
	 * @param createTS the createTS to set
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
	 * @param updateUserId the updateUserId to set
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
	 * @param updateTS the updateTS to set
	 */
	public void setUpdateTS(Timestamp updateTS) {
		this.updateTS = updateTS;
	}

}
