package com.techelevator;

public class CheckingAccount extends BankAccount {
	
	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	
	public CheckingAccount(String accountHolderName, String AccountNumber,
			int balance) {
		super(accountHolderName, AccountNumber, balance);
	}
		
	
	//method
	@Override
	
	public int withdraw(int amtToWithdraw) {
		int currentBalance = this.getBalance();
		int remainingBalance = currentBalance - amtToWithdraw;
		
		if (remainingBalance <= -100) {
			return currentBalance;
		} else if (remainingBalance < 0 && remainingBalance > - 100) {
			super.withdraw(amtToWithdraw + 10);
		} else {
			super.withdraw(amtToWithdraw);
		}
			return getBalance();
		}
		
	}
		
		//	int balance = super.getBalance();
		//	if (balance - amtToWithdraw < -100) {
		//	super.withdraw(10);
		//	super.withdraw(amtToWithdraw);
		//}	
		//else if (balance - amtToWithdraw < 0) {
		//			}
		//	else {
		//		super.withdraw(amtToWithdraw);
				
		//	}
			
		//	return getBalance();
		//	} 
		
		
		
		
	





	
	

//super.withdraw(amtToWithDraw);
		//if (super.getBalance()- amtToWithDraw >- 100) {
	//	}
		
		//if (getBalance() < && getBalance() > -100) {
		//	super.withdraw(10);
		//}