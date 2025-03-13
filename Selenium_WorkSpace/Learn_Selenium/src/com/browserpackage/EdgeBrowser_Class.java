package com.browserpackage;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser_Class {

	public static void main(String[] args) {
		
		//How to Open Edge Browser in Runtime
		EdgeDriver driver = new   EdgeDriver();
		
		//How to Enter Valid URL in Runtime
		driver.get("http://www.facebook.com");
		
		//How to Maximize the Browser in Runtime
		driver.manage().window().maximize();
		
		//How to Minimize the Browser in Runtime
		driver.manage().window().minimize();
		
		//How to Close the Browser in Runtime
		driver.close();
		
		
		
		
		
		
		

	}

}
