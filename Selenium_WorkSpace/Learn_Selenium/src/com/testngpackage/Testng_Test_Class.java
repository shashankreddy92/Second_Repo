package com.testngpackage;

import org.testng.annotations.Test;

public class Testng_Test_Class {
	
	@Test(priority = 0)
	public void ax() {
		System.out.println("1st Testcase is Pass :===@ax");
		
	}
	
	@Test(priority = 1,enabled = false)
	public void ag() {
		System.out.println("2nd Testcase is Pass:===@ag");
	}
	
	@Test(priority = 2)
	public void az() {
		System.out.println("3rd Testcase is Pass:===@az");
	}
	
	@Test(priority = 3,enabled = false)
	public void af() {
		System.out.println("4th Testcase is Pass:==@af");
	}
	
	@Test(priority = 4)
	public void aa() {
		System.out.println("5th Testcase is pass:==@aa");
	}

}
