package com.techlabs.model;

import com.techlabs.exceptions.InsufficientFundsException;
import com.techlabs.exceptions.NegativeAmountException;

public class BankAccount {

	
		
		private String name;
		private double balance;
		
		
		
		public BankAccount(String name, double balance) {
			super();
			this.name = name;
			this.balance = balance;
		}

		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public void deposit(double amount) throws NegativeAmountException  {
			if(amount<0) {
				throw new NegativeAmountException();
				
			}
			balance+=amount;
			System.out.println("Deposited :"+amount+ " ,  Balance is: "+balance);
			
		}

		public void withdraw(double amount) throws NegativeAmountException,InsufficientFundsException {
			
			if(amount<0)
				throw new NegativeAmountException();
			
			if(amount>balance) {
				throw new InsufficientFundsException();
			}
			balance-=amount;
			System.out.println("Withdraw :"+amount+ " ,  Balance is: "+balance);
		}

}
