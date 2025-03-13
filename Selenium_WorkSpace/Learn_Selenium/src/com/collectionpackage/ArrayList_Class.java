package com.collectionpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Class {

	public static void main(String[] args) {
		
		//Create Object for Array list
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//How to Add the values into the Array list
		list.add(34);
		list.add(30);
		list.add(32);
		list.add(30);
		
		//How many values are present in array list
		int valuescount = list.size();
		System.out.println(valuescount);
		
		//Create Object for Iterator
		Iterator<Integer> itr = list.iterator();
		
		//with out using loop
//		int a1 = itr.next();
//		int a2 = itr.next();
//		int a3 = itr.next();
//		int a4 = itr.next();
//	    System.out.println(a1+","+a2+","+a3+","+a4);
		
		//By using loop
		while (itr.hasNext()) {
			Integer abc =  itr.next();
			System.out.println(abc);
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
