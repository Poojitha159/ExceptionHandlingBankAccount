package com.techlabs.exceptions;

public class NegativeAmountException extends RuntimeException{

	public String getMessage() {
		return "Amount is invalid";
	}
}
