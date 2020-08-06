package com.movierating.api.exception;

public class InvalidRequestHeaderException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1939592871124215160L;
	
	private String message;

	public InvalidRequestHeaderException() {
		super();
	}

	public InvalidRequestHeaderException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidRequestHeaderException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidRequestHeaderException(String message) {
		super(message);
		this.message=message;
	}

	public InvalidRequestHeaderException(Throwable cause) {
		super(cause);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
