package com.techelevator;

public class BankAccount {
	
	
	private String accountHoldername;
	private String accountNumber;
	protected int balance;
	private String accountHolderName;

			
	// Constructor 
	
		public BankAccount (String accountHolderName, String accountNumber) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
		
		public BankAccount (String accountHolderName, String accountNumber,
				int balance) {
			this.accountHolderName = accountHolderName;
			this.accountNumber = accountNumber;
			this.balance = balance;
		}
		
		///getters
	   
		public String getAccountHolderName() {
			return accountHolderName;
		}
		public String getAccountNumber() {
			return accountNumber;
		}
		public int getBalance() {
			return balance;
		}
		
		//setters
		
		//public void setAccountHolderName(String accountHolderName) {
		//	this.accountHolderName = accountHolderName;
		//}
		//public void setAccountNumber(String accountNumber) {
		//	this.accountNumber = accountNumber;
		//}
		
		
		///methods
		
		public int deposit(int amtToDeposit) {
			balance += amtToDeposit;
			return balance;
		}
		
		public int withdraw(int amtToWithdraw) {
			balance -= amtToWithdraw;
			return balance;
		}
		

}
