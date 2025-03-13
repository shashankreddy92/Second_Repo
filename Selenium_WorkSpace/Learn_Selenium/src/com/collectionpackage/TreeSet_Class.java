package com.collectionpackage;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Class {

	public static void main(String[] args) {
		//Create object for Tree set
		TreeSet<String> set1 = new TreeSet<String>();
		
		//How to Add the values into the tree set
		set1.add("bhygh");
		set1.add("nhgty");
		set1.add("abcd");
		set1.add("nhgty");
		
		//How many values are present in tree set
		int valuescount = set1.size();
		System.out.println("ValuesCount:==="+valuescount);
		
		//Create object for Iterator
		Iterator<String> itr = set1.iterator();
		
		//By using loop
		while (itr.hasNext()) {
			String abc = itr.next();
			System.out.println(abc);
			
		}
		
		
		
		
		
		
	}

}
