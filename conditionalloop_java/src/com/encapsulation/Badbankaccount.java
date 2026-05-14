package com.encapsulation;

class BankAccount{
	public String accountHolderName;
	public int accountNumber;
	public int balance;
	@Override
	public String toString() {
		return "BankAccount[accountHolderName=" + accountHolderName + ",accountNumber" + accountNumber + ",balance=" + balance + "]";
	}
	

}

public class Badbankaccount {
	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		b1.accountHolderName="sharanu";
		b1.accountNumber =1234;
		b1.balance=99999;
		
		System.out.println(b1);
		
	}

}
