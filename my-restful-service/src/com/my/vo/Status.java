package com.my.vo;

public class Status {
	private String result;
	private String code;
	private String message;
	private Object responseObj;

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the responseObj
	 */
	public Object getResponseObj() {
		return responseObj;
	}

	/**
	 * @param responseObj
	 *            the responseObj to set
	 */
	public void setResponseObj(Object responseObj) {
		this.responseObj = responseObj;
	}

}
