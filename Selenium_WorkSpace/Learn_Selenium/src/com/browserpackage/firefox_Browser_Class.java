package com.browserpackage;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_Browser_Class {

	public static void main(String[] args) {
		
		//how to open firefox browser in Run time
		
		FirefoxDriver driver = new FirefoxDriver();
		
		//How to enter valid URL in run time
		
		driver.get("http://www.facebook.com");
		
		//How to minimize the browser in Run time
		//driver.manage().window().minimize();
		//how to maximize Browser in Runtime
		driver.manage().window().maximize();
		
		//how to close the Browser in Runtime
		driver.close();
	
	}

}
