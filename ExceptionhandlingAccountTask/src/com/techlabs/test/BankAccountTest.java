package com.techlabs.test;

import com.techlabs.exceptions.InsufficientFundsException;
import com.techlabs.exceptions.NegativeAmountException;
import com.techlabs.model.BankAccount;

public class BankAccountTest {
	public static void main(String[] args) throws NegativeAmountException {
		BankAccount bank=new BankAccount("poojitha",25000);


		try {
			
			//BanlAccount bank=new BanlAccount("poojitha",25000);
			bank.deposit(2000);;
			
		}
		
		catch(NegativeAmountException e)
		
		{
			System.out.println(e.getMessage());
		}
		
		try {
			bank.withdraw(2000);
		}
		catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
			
		}
	}


}
