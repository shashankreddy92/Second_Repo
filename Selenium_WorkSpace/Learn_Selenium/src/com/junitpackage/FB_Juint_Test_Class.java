package com.junitpackage;

import java.io.File;
import java.time.Duration;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class FB_Juint_Test_Class {
	
	public static WebDriver driver;
	
	@Test
	public void FB1() {
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	
	@Test
	public void FB2() {
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("QA Tester");
		driver.findElement(By.name("lastname")).sendKeys("QA Automtion");
		driver.findElement(By.name("reg_email__")).sendKeys("7890224241");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test@1234");
	} 
	
	
	@Test
	public void FB3() {
		new Select(driver.findElement(By.id("day"))).selectByIndex(8);
		new Select(driver.findElement(By.id("month"))).selectByValue("8");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2001");
		
	}
	
	
	@Test
	public void FB4() {
		try {
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src,new File("Screens3\\FB_Login1"+".png"));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
