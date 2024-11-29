package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.Account;

public class AccountMain {
public static void main(String[] args) {
	int accountNumber;
	String name;
	double balance;
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter your AccountNumber");
	accountNumber = scanner.nextInt();
	System.out.println("Enter your Name");
	name = scanner.next();
	System.out.println("Enter your Balance");
	balance = scanner.nextDouble();
	
	Account addaccount = new Account();
	addaccount.display(accountNumber, name, balance);
	
	
	
	
	
}
}
