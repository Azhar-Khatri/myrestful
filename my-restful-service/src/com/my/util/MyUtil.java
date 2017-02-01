package com.my.util;

import org.springframework.util.StringUtils;

import com.my.vo.Status;

public class MyUtil {
	public static Status successResponse(Object... responseObj) {
		Status status = new Status();
		status.setResult("success");
		status.setResponseObj(responseObj);
		return status;
	}

	public static Status errorResponse(Exception e, String faultCode) {
		Status status = new Status();
		status.setResult("failure");
		if (!StringUtils.isEmpty(faultCode)) {
			status.setCode(faultCode);
		} else {
			status.setCode("EXCP001");
		}
		status.setMessage(e.getMessage());
		return status;
	}

}
