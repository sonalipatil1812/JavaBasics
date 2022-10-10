package com.techno.javabasic.Exception;

public class BankAccount {
	double balance;

	BankAccount(double balance) {
		this.balance = balance;
	}

	public void withdraw(double withdraw) {
		if ( balance>=withdraw) {
			System.out.println(withdraw+" successfully withdraw");
		} else {
//			System.out.println("Insufficient balance");
			throw new InsufficientBalanceException("Insufficient balance");
		}
	}

	public static void main(String[] args) {
		BankAccount bankaccount = new BankAccount(20000);
		try {
			bankaccount.withdraw(3000);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
