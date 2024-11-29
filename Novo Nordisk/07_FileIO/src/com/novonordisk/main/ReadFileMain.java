package com.novonordisk.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileMain {
	public static void main(String[] args) {
		String path = "c:/FileIO/User.txt";
		File file = new File(path);
		//char [] data= new char[50];
		char [] data;
		
		
		try {
			int length = (int) file.length();
			data = new char[length];
			FileReader reader = new FileReader(file);
			reader.read(data);
			reader.close();
			System.out.println("Read operation completed successfully");
			for (char d : data) {
				System.out.print(d);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Invalid File Path");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File IO Operation is in Process");
		}
	}
}
