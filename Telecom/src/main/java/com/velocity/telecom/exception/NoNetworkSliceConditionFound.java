package com.velocity.telecom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class NoNetworkSliceConditionFound extends ResponseStatusException{
	
	public NoNetworkSliceConditionFound(String errorMessage) {
		super(HttpStatus.BAD_REQUEST,errorMessage);
	}

}
