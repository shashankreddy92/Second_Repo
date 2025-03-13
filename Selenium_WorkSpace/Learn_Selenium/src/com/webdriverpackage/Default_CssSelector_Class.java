package com.webdriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Default_CssSelector_Class {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		//Some times object have only ID ==> when ID is present we can use # between tagname & ID
		driver.findElement(By.cssSelector("input#email")).sendKeys("QATetser@gmail.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("test@345");
		
		//Single Properties
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		driver.findElement(By.cssSelector("*[aria-label='First name']")).sendKeys("QA Tetesr");
		
		//Double Properties
		driver.findElement(By.cssSelector("input[name='lastname'][aria-label='Surname']")).sendKeys("QA Automation");
		driver.findElement(By.cssSelector("*[name='reg_email__'][data-type='text']")).sendKeys("7890224241");
		
		//Some times object have only ID
		driver.findElement(By.cssSelector("#password_step_input")).sendKeys("test@3455");
		new Select(driver.findElement(By.cssSelector("#day"))).selectByIndex(6);
		
		//Some times object have both ID and class name
		new Select(driver.findElement(By.cssSelector("#month._9407"))).selectByValue("9");
		new Select(driver.findElement(By.cssSelector("#year._8esg"))).selectByVisibleText("2001");
		
		//Some times object have only class
		driver.findElement(By.cssSelector("._8esa")).click();
		
		

	}

}
