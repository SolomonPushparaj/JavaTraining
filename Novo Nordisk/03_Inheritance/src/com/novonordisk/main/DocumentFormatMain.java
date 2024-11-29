package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.CSV;
import com.novonordisk.domain.DocumentFormat;
import com.novonordisk.domain.PDF;
import com.novonordisk.domain.XLSX;

public class DocumentFormatMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DocumentFormat documentFormat = null;

		int choice;
		System.out.println("Menu");
		System.out.println("1. DOwnload PDF");
		System.out.println("2.CSV");
		System.out.println("3.XLSX");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();

		switch (choice) {

		case 1:

			System.out.println("You have selected PDF");
			documentFormat = new PDF();

			break;

		case 2:

			System.out.println("You have selected CSV");
			documentFormat = new CSV();

			break;

		case 3:

			System.out.println("You have selected CSV");
			documentFormat = new XLSX();

			break;

		default:
			System.out.println("Invalid Choice");
		}

		documentFormat.downloadDocument();
	}

}
