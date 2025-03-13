package com.collectionpackage;

import java.util.Iterator;
import java.util.Stack;

public class Stack_Class {

	public static void main(String[] args) {
		
		//Create Object for Stack
		Stack<Integer> list = new Stack<Integer>();
		
		//How to add the values into the stack
		list.add(67);
		list.add(43);
		list.add(65);
		list.add(67);
		
		//How many values are Present in stack
		int valuescount = list.size();
		System.out.println("ValuesCount:==="+valuescount);

		//Create Object for Iterator
		Iterator<Integer> itr = list.iterator();
		
		//By Using Loop
		while (itr.hasNext()) {
			Integer abc =  itr.next();
			System.out.println(abc);
			
		}
		
		

	}

}
