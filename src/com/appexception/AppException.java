package com.appexception;

public final class AppException extends Exception {

	private String exceptionMessage;
	
	public AppException() {
		super();
	}

	public AppException(String exceptionMessage) {
		super();
		this.exceptionMessage = "Error " + exceptionMessage;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = "Error " + exceptionMessage;
	}

}
