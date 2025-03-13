package com.testngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
	
  @Test
  public void f() {
	  System.out.println("1st Testcase is pass:===@Test");
  }
  @BeforeMethod(enabled = false)
  public void beforeMethod() {
	  System.out.println("Before method is Pass:===@Before method");
  }

  @AfterMethod(enabled = false)
  public void afterMethod() {
	  
	  System.out.println("After method is Pass:===@After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class is Pass:===@Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class is Pass:===@After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test is Pass:===@Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test is Pass:===@After Test");
  }

  @BeforeSuite(enabled = false)
  public void beforeSuite() {
	  System.out.println("Before Suite is Pass:===@Before Suite");
  }

  @AfterSuite(enabled = false)
  public void afterSuite() {
	  System.out.println("After Suite is Pass:===@After Suite");
  }
  
  @Test
  public void test1() {
	  System.out.println("2nd Testcase is pass:==@test");
  }
  
  @Test
  public void test2() {
	  System.out.println("3rd Testcase is Pass:===@test");
  }

}
