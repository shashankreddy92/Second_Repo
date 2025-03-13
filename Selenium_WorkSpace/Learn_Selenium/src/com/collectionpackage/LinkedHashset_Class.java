package com.collectionpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset_Class {

	public static void main(String[] args) {
		
		//Create Object for linkedhashset
		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		
		//How to add the values into the linked hahset
		set1.add(23);
		set1.add(26);
		set1.add(76);
		set1.add(26);
		
		//How many values are present in linkedhahset
		int valuescount = set1.size();
		System.out.println(valuescount);
		
		//Create Object for Iterator
		Iterator<Integer> itr = set1.iterator();
		
		//By Using loop
		while (itr.hasNext()) {
			Integer abc = itr.next();
			System.out.println(abc);
			
		}
		
		
		

	}

}
