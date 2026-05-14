package com.encapsulation;

class BankAccount2 {

	private String accountHolderName;
	private int accountNumber;
	private int balance;

	public BankAccount2(String accountHolderName, int accountNumber, int balance) {

		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// deposit
	public void deposit(int amount) {

		if (amount <= 0) {
			System.out.println("Amount should be greater than zero");
			return;
		}

		this.balance += amount;
		System.out.println(amount + " deposited successfully");
	}

	// withdraw
	public int withDraw(int amount) {

		if (amount <= 0 || amount > balance) {
			System.out.println("Invalid amount");
			return 0;
		} else {
			this.balance -= amount;
			return amount;
		}
	}

	// details
	public void printDetails() {

		System.out.println("Holder Name : " + this.accountHolderName);
		System.out.println("Account Number : " + this.accountNumber);
		System.out.println("Balance : " + this.balance);
	}

	@Override
	public String toString() {

		return "BankAccount2[accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", balance="+ balance + "]";
	}
}

// main 
public class GoodBankacount {

	public static void main(String[] args) {

		BankAccount2 b1 = new BankAccount2("Sharanu", 12345, 90);
		b1.deposit(2000);
		b1.withDraw(5000);
		System.out.println(b1);
		b1.printDetails();
	}
}