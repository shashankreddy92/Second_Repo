package com.switchcommandspackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Class {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Java wait command
		Thread.sleep(3000);
		//Click on Check PNR Status Links
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		
		//Java wait Command
		Thread.sleep(3000);
		//Click on Cancel trains tickets link
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		
		//Create object for windows
		Set<String> allwindows = driver.getWindowHandles();
		
		//How many windows are present current browser
		int windowscount = allwindows.size();
		System.out.println("WindowsCount:===="+windowscount);
		
		//Create Object for Iterator
		Iterator<String> itr = allwindows.iterator();
		
		//with out using loop
		String mainwindow = itr.next();
		String cancelwindow = itr.next();
		String pnrwindow = itr.next();
		
		//How  to Switch to windows
        //Main window
		driver.switchTo().window(mainwindow);
		System.out.println("Get Current Page URL :==="+driver.getCurrentUrl());
		
		driver.switchTo().window(cancelwindow);
		System.out.println("Cancel Window URL:==="+driver.getCurrentUrl());
		
		driver.switchTo().window(pnrwindow);
		System.out.println("Pnr Window URL is :=== "+driver.getCurrentUrl());
		
		driver.switchTo().window(mainwindow);
		
		driver.switchTo().window(cancelwindow);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
