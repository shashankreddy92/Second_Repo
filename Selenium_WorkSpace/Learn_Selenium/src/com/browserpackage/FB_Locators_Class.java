package com.browserpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Locators_Class {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		//How to Enter the Values in to the textbox/webedit
		driver.findElement(By.id("email")).sendKeys("QATest@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test@1234");
		//driver.findElement(By.id("u_0_5_Hu")).click();
		
		//By Using name locator for Button
		driver.findElement(By.name("login")).click();
		
		//By Using ID Locator for Normal Button
		driver.findElement(By.id("u_0_0_bH")).click();
		
		//By using Class name locator for Normal Button
		driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
		
		//By Using linktext locator for links
		driver.findElement(By.linkText("Create new account")).click();
		
		
		

	}

}
