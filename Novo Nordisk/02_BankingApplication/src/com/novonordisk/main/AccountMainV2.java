package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.Account;

public class AccountMainV2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		int choice;
		double amount;
		boolean result;
		String continueChoice;

		System.out.println("Enter the Account Number");
		accountNumber = scanner.nextInt();
		System.out.println("Enter Name");
		name = scanner.next();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		Account account = new Account(accountNumber, name, balance);

		do {
			System.out.println("Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("Enter your Choice");
			choice = scanner.nextInt();

			switch (choice) {

			case 1:

				System.out.println("You have selected Withdraw");
				System.out.println("Enter the Amount");
				amount = scanner.nextDouble();
				result = account.withdraw(amount);
				if (result == true)
					System.out.println("Withdraw Successful");
				else
					System.out.println("Withdraw Failed");

				break;

			case 2:

				System.out.println("You have selected Deposit");
				System.out.println("Enter the Amount to be Deposit");
				amount = scanner.nextDouble();
				result = account.deposit(amount);
				if (result == true)
					System.out.println("Your Deposit is Successful");
				else
					System.out.println("Your Deposit is Failed");
				break;

			case 3:

				System.out.println("You have selected to Check the Balance");
				System.out.println("Your Account Balance is" + account.getBalance());
				break;

			default:
				System.out.println("Invalid Choice");
				break;

			}

			System.out.println("Do you want to continue? Y || N");
			continueChoice = scanner.next();
		}

		while (continueChoice.equals("Y"));
		System.out.println("Thank you");
	}

}
