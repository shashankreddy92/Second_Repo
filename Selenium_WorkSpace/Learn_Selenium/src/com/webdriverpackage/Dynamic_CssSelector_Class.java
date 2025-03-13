package com.webdriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamic_CssSelector_Class {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		//Parent to child
		//driver.findElement(By.cssSelector("div._6ltg>a")).click();
		
		//Some times starting chars will change in runtime("^")
		//driver.findElement(By.cssSelector("input[aria-label^='First name']")).sendKeys("QATester");
		//driver.findElement(By.cssSelector("*[name^='lastname']")).sendKeys("QAAutomation");
		
		//Some times Ending Chars will Change in Runtime("$")
		//driver.findElement(By.cssSelector("input[name$='reg_email__']")).sendKeys("7890224241");
		//driver.findElement(By.cssSelector("input[id$='password_step_input']")).sendKeys("test@34567");
		
		//Some times mid value will change in Runtime("*")
	//	new Select(driver.findElement(By.cssSelector("select[title*='Da']"))).selectByIndex(7);
	//	new Select(driver.findElement(By.cssSelector("select[name*='_month']"))).selectByValue("7");
	//	new Select(driver.findElement(By.cssSelector("select[id*='year']"))).selectByVisibleText("2001");
		
		//Parent to child
		driver.findElement(By.cssSelector("label._58mt>input")).click();
		
		//Nth-child()
		//driver.findElement(By.cssSelector("div#pageFooterChildren>ul>li:nth-child(10)>a")).click(); //opens Meta Store in a new tab
		
		//nth-of-type()
		//driver.findElement(By.cssSelector("div#pageFooterChildren>ul>li:nth-of-type(7)>a")).click();
		
		
		
		

	}

}
