package com.javapackage;

public class Executable_Class {

	public static void main(String[] args) {
		
		//calling void methods
		Non_Executable_Class obj = new Non_Executable_Class();
		obj.method2();
		
		//Static void methods-->no need to create a variable
		
		Non_Exe_Class.method001();
		

	}

}
