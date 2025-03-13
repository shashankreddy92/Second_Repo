package com.collectionpackage;

import java.util.Iterator;
import java.util.Vector;

public class Vector_Class {

	public static void main(String[] args) {
		
		//Create Object for Vector
		Vector<String> list = new Vector<String>();
		
		//how to add the values into the vector
		list.add("tester");
		list.add("automation");
		list.add("auto");	
		list.add("tester");
		
		//How many values are present in vector
		int valuescount = list.size();
		System.out.println("ValuesCount:==="+valuescount);
		
		//Create Object for Iterator
		Iterator<String> itr = list.iterator();
		
		//By Using loop
		while (itr.hasNext()) {
			String abc = itr.next();
			System.out.println(abc);
			
		}
		
		
		
		
		
		
		
		

	}

}
