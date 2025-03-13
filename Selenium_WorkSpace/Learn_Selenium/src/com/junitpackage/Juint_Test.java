package com.junitpackage;

import org.junit.Ignore;
import org.junit.Test;

public class Juint_Test {
	
	@Test
	public void ab(){
		System.out.println("1st test case is pass:==@ab");
	}
	
	@Test
	public void az() {
		System.out.println("2nd Testcase is Pass:===@az");
	}
	
	
	@Test
	public void aj() {
		System.out.println("3rd Testcase is Pass:===@aj");
	}
	
	@Ignore
	@Test
	public void an() {
		System.out.println("4th testcase is Pass :===@an");
	}
	
	@Test
	public void aa() {
		System.out.println("5th testcase is Pass:===@aa");
	}
	
	

}
