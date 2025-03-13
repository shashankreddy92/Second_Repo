package com.junitpackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit_Test_Class {
    
	@Test
	public void test() {
		
		System.out.println("1st Testcase is Pass:==@Test");	
	}
	

	@Before
	public void Before_method() {
		System.out.println("Before method is Pass:===@Before");
	}
	
	@After
	public void After_method() {
		System.out.println("After method  is Pass:==@After");
	}
	
	@BeforeClass
	public static void Before_Class() {
		System.out.println("Before Class is Pass :===@Before Class");
	}
	
	@AfterClass
	public static void After_Class() {
		System.out.println("After Class is Pass:===@After Class");
	}
	
	@Ignore
	@Test
	public void Test1() {
		System.out.println("2nd Test Case is Pass:===@Test");	
	}
	
	
	@Test
	public void Test2() {
		System.out.println("3rd TestCase is Pass:===@Test");
	}

}
