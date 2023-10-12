package com.velocity.telecom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CanNotPerformOperation extends ResponseStatusException{
	
	public CanNotPerformOperation(String errorMessage) {
		super(HttpStatus.BAD_REQUEST,errorMessage);
	}

}