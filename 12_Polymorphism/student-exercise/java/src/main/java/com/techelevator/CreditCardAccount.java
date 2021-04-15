package com.techelevator;

public class CreditCardAccount implements Accountable{
	private String accountHolder;
	private String accountNumber;
	private int debt = 0;
	
	
	@Override
	public int getBalance() {
		return debt *= -1;
	}
	
    public CreditCardAccount(String accountHolder, String accountNumber) {
    	this.accountHolder = accountHolder;
    	this.accountNumber = accountNumber;
    	
    }
    
    public String getAccountHolder() {
    	return accountHolder;
    }
    public String getAccountNumber() {
    	return accountNumber;
    }
        
    public int pay(int amountToPay) {
    	return debt = debt - amountToPay;
    }
    public int charge(int amountToCharge) {
    	return debt += amountToCharge;
    }
    public int getDebt() {
    	return debt;
    }
   
}
