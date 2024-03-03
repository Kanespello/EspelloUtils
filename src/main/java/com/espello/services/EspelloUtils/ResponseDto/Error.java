package com.espello.services.EspelloUtils.ResponseDto;

public class Error {

	private String errorDescription;

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	@Override
	public String toString() {
		return "Error [errorDescription=" + errorDescription + "]";
	}

}
