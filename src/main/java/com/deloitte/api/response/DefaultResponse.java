package com.deloitte.api.response;

import org.springframework.stereotype.Component;

@Component
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

	public String addError() {
		return "Record already exists";
	}

	public String addMessage() {
		return "Record inserted successfully";
	}

	public String updateError() {
		return "Record does not exists";
	}

	public String updateMessage() {
		return "Updated successfully";
	}

	public String deleteError() {
		return "Record does not exists";
	}

	public String deleteMessage() {
		return "Deleted successfully";
	}
}
