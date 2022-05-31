package com.deloitte.api.response;

import org.springframework.stereotype.Component;

public class DefaultResponse {
	public String status;
	public String errorMsg;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
