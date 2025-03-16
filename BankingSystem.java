package com.exception;

class InvalidAmountException extends Exception{

	public InvalidAmountException(String s) {
		System.out.println(s);
		
	}
	
	
}
class InsufficientFundsException extends RuntimeException{

	public InsufficientFundsException(String s) {
		System.out.println(s);
	}
	
}


class BankAccount{
	 static int balance;

	public  BankAccount(int balance) {
		super();
		this.balance = balance;
	}
	public static  void withdraw(int amnt) throws InvalidAmountException
	 {
		if (amnt==0 || amnt<0) 
		{
			throw new InvalidAmountException("Invalid Amount");}
		
		if(amnt< balance) {
			throw new InsufficientFundsException("Insufficient Balanace");}
		
		
		else {balance=balance-amnt;
		System.out.println("Balance is debited");}
	}
	
	public static double getBalance() {
		return balance;
	}
}








public class BankingSystem {
	public static void main(String args[]) throws InvalidAmountException {
		BankAccount obj=new BankAccount(4000);
		System.out.println(obj.getBalance());
//		BankAccount.withdraw(200);
		System.out.println(obj.getBalance());
		

	
			
			
		
		
	
	}

}
