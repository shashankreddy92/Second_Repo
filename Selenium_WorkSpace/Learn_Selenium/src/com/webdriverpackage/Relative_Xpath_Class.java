package com.webdriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Relative_Xpath_Class {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		//by using text() for link
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		//Basic Relative Xpath
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("QA Tester");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("QA Automation");
		
		//By Using Contains
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("7890224241");
		driver.findElement(By.xpath("//*[contains(@id,'password_step_input')]")).sendKeys("test@344");
		
		//with out using contains
		new Select(driver.findElement(By.xpath("//select[(@title='Day')]"))).selectByIndex(21);
		new Select(driver.findElement(By.xpath("//*[(@name='birthday_month')]"))).selectByValue("9");
		
		//Some times starting chars will change in Runtime
		new Select(driver.findElement(By.xpath("//select[starts-with(@id,'year')]"))).selectByVisibleText("2003");
		driver.findElement(By.xpath("(//*[starts-with(@id,'sex')])[1]")).click();
		
		//Some times Ending chars will change in Runtime
		//driver.findElement(By.xpath("(//*[ends-with(@id,'sex')])[1]")).click();
		
		//BY using DOT method for links
		driver.findElement(By.xpath("//a[contains(.,'Facebook Lite')]")).click();
		

	}

}
