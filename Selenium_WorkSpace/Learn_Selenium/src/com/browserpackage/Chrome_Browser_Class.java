package com.browserpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser_Class {

	public static void main(String[] args) throws Exception {
		
		//how to open Chrome browser in Run time
		
		ChromeDriver driver = new ChromeDriver();
		
		//how to open valid URL in Run time
		
		driver.get("http://www.facebook.com");
		
		//how to maximize the browser in run time
		
		driver.manage().window().maximize();
		
		//java wait command
		
		Thread.sleep(2000);
		
		//how to close browser in run time
		
		driver.close();
		
	}

}
