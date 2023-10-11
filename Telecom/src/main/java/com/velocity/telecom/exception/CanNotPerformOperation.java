package com.velocity.telecom.exception;

public class CanNotPerformOperation extends RuntimeException{
	
	public CanNotPerformOperation(String errorMessage) {
		super(errorMessage);
	}

}
