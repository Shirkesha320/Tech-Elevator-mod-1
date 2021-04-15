package com.techelevator;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	
	public SavingsAccount(String accountHolderName, String AccountNumber,
			int balance) {
		super(accountHolderName, AccountNumber, balance);
	}

	 @Override
	    public int withdraw(int amountToWithdraw) {
	       
	        if (getBalance() - amountToWithdraw >= 2) {
	            super.withdraw(amountToWithdraw);
	          
	            if (getBalance() < 150) {
	                super.withdraw(2);
	            }
	        }
	        return getBalance();
        }
    
}
		
		// if (this.getBalance() - balance > 0)
      //   {
       //      if (this.getBalance() - balance < 150)
       //      {
                // balance += 2;
     //        }

      //       withdraw(balance);
      //   }
         

      //   return balance;
     
	

	
	
		
		
		
	
	


