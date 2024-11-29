package com.novonordisk.main;

import com.novonordisk.domain.Account;

public class AccountMain {
	public static void main(String[] args) {
		
		//Create Object and set values using contructor
		//Print Values using Getter
		
		Account account =new Account(101,"Solomon",500);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		
		System.out.println("----------------------------------");
		//Create Object and set values using Setter
		//Print Values using Getter
		
		Account account2=new Account();
		account2.setAccountNumber(201);
		account2.setName("Ajay");
		account2.setBalance(1000);
		
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());
		System.out.println(account2.getBalance());
				
				
		
		
		

	}
}
