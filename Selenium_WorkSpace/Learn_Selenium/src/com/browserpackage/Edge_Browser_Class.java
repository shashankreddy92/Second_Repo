package com.browserpackage;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Browser_Class {

	public static void main(String[] args) throws Exception {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://www.facebook.com");
		
		//how to maximize the browser in run time
		
				driver.manage().window().maximize();
				
				//java wait command
				
				Thread.sleep(2000);
				
				//how to close browser in run time
				
				driver.close();
				

	}

}
