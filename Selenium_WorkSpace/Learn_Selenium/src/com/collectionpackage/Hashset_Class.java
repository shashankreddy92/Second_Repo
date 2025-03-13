package com.collectionpackage;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_Class {

	public static void main(String[] args) {
		
		//Create Object for Hashset
		HashSet<String> set1 = new HashSet<String>();
		
		//How to add the values into the hashset
		set1.add("tester");
		set1.add("QA Auto");
		set1.add("QA Auto");
		set1.add("QA Auto");
		
		//How many values are present in hashset
		int valuescount = set1.size();
		System.out.println("ValuesCount:==="+valuescount);
		
		//Create Object for iterator
		Iterator<String> itr = set1.iterator();
		
		//With out using loop
//		String a1 = itr.next();
//		String a2 = itr.next();
//		System.out.println(a1+","+a2);
		
		//By using loop
		while (itr.hasNext()) {
			String abc = itr.next();
			System.out.println(abc);
			
		}

		
		

	}

}
