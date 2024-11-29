package com.novonordisk.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionsMain {
public static void main(String[] args) {
	System.out.println("1. ArrayList");
	
	ArrayList<String> names = new ArrayList<String>();
	System.out.println(names.size());
	
	names.add("Reema");
	names.add("Soma");
	names.add("Rohit");
	names.add("Soma");
	names.add("Rohit");
	System.out.println(names);
	System.out.println(names.size());
	names.remove("Soma");
	System.out.println(names);
	System.out.println(names.size());
	
	System.out.println("2.HashSet");
	HashSet<String> nameSet = new HashSet<String>();
System.out.println(names.size());
	
	nameSet.add("Reema");
	nameSet.add("Soma");
	nameSet.add("Rohit");
	nameSet.add("Soma");
	nameSet.add("Rohit");
	System.out.println(nameSet);
	System.out.println(nameSet.size());
	nameSet.remove("Soma");
	System.out.println(nameSet);
	System.out.println(nameSet.size());
	
	System.out.println("3.SortedSet");
	
	TreeSet<String> nameTreeSet = new TreeSet<String>();
	System.out.println(names.size());
		
	nameTreeSet.add("Reema");
	nameTreeSet.add("Soma");
	nameTreeSet.add("Rohit");
	nameTreeSet.add("Soma");
	nameTreeSet.add("Rohit");
		System.out.println(nameTreeSet);
		System.out.println(nameTreeSet.size());
		nameTreeSet.remove("Soma");
		System.out.println(nameTreeSet);
		System.out.println(nameTreeSet.size());
	
}
}
