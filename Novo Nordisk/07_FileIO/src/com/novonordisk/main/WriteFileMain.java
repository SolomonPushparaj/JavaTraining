package com.novonordisk.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileMain {
public static void main(String[] args) {
	String path="c:/FileIO/Write.txt";
	
	File file = new File(path);
	try {
		FileWriter fileWriter= new FileWriter(file,true);
		fileWriter.write("This is Sample Data and Updated, This is Java Training");
		fileWriter.close();
		System.out.println("Please check your File");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("Failed to Locate File OR you do not have permission to Write");
	}
	
}
}
