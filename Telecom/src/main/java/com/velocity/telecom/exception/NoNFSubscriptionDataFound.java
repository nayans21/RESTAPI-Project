package com.velocity.telecom.exception;

public class NoNFSubscriptionDataFound extends RuntimeException{

	public NoNFSubscriptionDataFound(String errorMessage) {
		super(errorMessage);
	}
}
