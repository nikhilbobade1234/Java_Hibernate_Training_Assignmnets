package com.exceptionhandling.assignment2;

public class LeaveExceedLimitException extends Exception {
	private String message;

	public LeaveExceedLimitException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
