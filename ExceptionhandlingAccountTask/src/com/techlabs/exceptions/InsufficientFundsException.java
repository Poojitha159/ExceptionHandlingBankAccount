package com.techlabs.exceptions;

public class InsufficientFundsException extends RuntimeException {

	public String getMessage() {
		return "Amount is InSufficientt";
	}
}
