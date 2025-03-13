package com.junitpackage;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Junit_Class {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void Application_Open() {
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));	
	}
	
	@Test
	public  void FB_TextBox() {
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("QA Tester");
		driver.findElement(By.name("lastname")).sendKeys("QA Automtion");
		driver.findElement(By.name("reg_email__")).sendKeys("7890224241");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test@1234");

	}
	
	@AfterClass
	public static void FB_ScreenShot() {
		try {
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("Screens3\\FB_Login"+".png"));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
