package com.webdriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_ID_Class {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.facebook.com");
		 driver.manage().window().maximize();
		 
		 //By Using ID Locator for textbox/webedit
		 //driver.findElement(By.id("email")).sendKeys("QAtest@gmail.com");
		 //driver.findElement(By.id("pass")).sendKeys("test@134");
		 
		 //By Using ID Locator for Button
		// driver.findElement(By.id("u_0_5_ht")).click();
		
		 //By using name locator for Button
		 //driver.findElement(By.name("login")).click();
		 
		 //By Using class name locator for Button
		 //driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
		 
		 //By Using linktext locator for Button
		 driver.findElement(By.linkText("Create new account")).click();
		 
		 //By Using name Locator for textbox/web edit
		 driver.findElement(By.name("firstname")).sendKeys("QA Tester");
		 driver.findElement(By.name("lastname")).sendKeys("QA Automation");
		 driver.findElement(By.name("reg_email__")).sendKeys("7890224241");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("tester@1234");
		
		 //By Using ID Locator for DropDown/listbox
		 new Select(driver.findElement(By.id("day"))).selectByIndex(10);
		 new Select(driver.findElement(By.id("day"))).selectByValue("18");
		 new Select(driver.findElement(By.id("day"))).selectByVisibleText("17");
		 
		 //Month
		 new Select(driver.findElement(By.id("month"))).selectByIndex(5);
		 new Select(driver.findElement(By.id("month"))).selectByValue("11");
		 new Select(driver.findElement(By.id("month"))).selectByVisibleText("Sep");
		 
		 //Year
		 new Select(driver.findElement(By.id("year"))).selectByIndex(30);
		 new Select(driver.findElement(By.id("year"))).selectByValue("1985");
		 new Select(driver.findElement(By.id("year"))).selectByVisibleText("2001");
		 
		//By Using ID Locator for RadioButton
		// driver.findElement(By.id("sex")).click();
		 
		 //By Using Class name locator for RadioButton
		 driver.findElement(By.className("_8esa")).click();
		 
		 
		 
		 

	}//close method

}//Close Class
