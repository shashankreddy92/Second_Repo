package com.switchcommandspackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Loop_Class {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//java wait command
		Thread.sleep(3000);
		//Click on Check PNR Status link
		driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/pnr']")).click();
		
		//java wait command
		Thread.sleep(3000);
		//Click on Cancel Train link
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		
		//Create object for windows
		Set<String> allwindows = driver.getWindowHandles();
		
		//How many windows are present in current Browser
		int widowscount = allwindows.size();
		System.out.println("WindowsCount:==="+widowscount);
		
		//By using for each loop
		for (String eachwindow : allwindows) {
			
			driver.switchTo().window(eachwindow);
			System.out.println("Each Window URL:===" +driver.getCurrentUrl());	
		}
		
		
		//driver.close(); // it will close the single window
		
		driver.quit();// it will close the all tabs
		
		
		
		

	}

}
