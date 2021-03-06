package week2_exercises;

import java.util.Scanner;

public class P39AccountTxn {

	private String accountNumber;
	private int balance;

	P39AccountTxn(int balance, int operation) {
		this.balance = balance;
	}

	public String getAccountNum() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int transactionAmount) {
		balance = balance + transactionAmount;
	}

	public void withdraw(int transactionAmount) {
		if (transactionAmount <= balance) {
			balance = balance - transactionAmount;
		} else if (transactionAmount > balance) {
			System.out.println("insufficient balance when the balance is about to go below zero");
		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Account Number");
		String acc = scan.next();

		System.out.println(" Enter the Account Balance");
		int bal = scan.nextInt();

		System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount");
		int txn = scan.nextInt();

		P39AccountTxn obj = new P39AccountTxn(bal, txn);
		if (txn == 1) {
			System.out.println("Enter amount to deposit");
			obj.deposit(scan.nextInt());
			System.out.println("Balance Amount: " + obj.getBalance());
		} else if (txn == 2) {
			System.out.println("Enter amount to withdraw ");
			obj.withdraw(scan.nextInt());
			System.out.println("Balance Amount: " + obj.getBalance());
		}
		else {
			System.out.println("Enter valid operation 1/2");
		}

	}

}
