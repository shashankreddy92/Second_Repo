package com.testngpackage;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FB_Test_Tesng_Class {
	
	public static WebDriver driver;
	
	@Test(priority = 0)
	public void FB_Application_Open() {
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	
	@Test(priority = 1)
	public void FB_Creation_textbox() {
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("QA Tester");
		driver.findElement(By.name("lastname")).sendKeys("QA Automtion");
		driver.findElement(By.name("reg_email__")).sendKeys("7890224241");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test@1234");
	}
	
	@Test(priority = 2,enabled = false)
	public void FB_DropDowns() {
		new Select(driver.findElement(By.id("day"))).selectByIndex(2);
		new Select(driver.findElement(By.id("month"))).selectByValue("8");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2001");
		
	}

	
	@Test(priority = 3)
	public void FB_CaptureScreen() {
		try {
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("Screens3\\FB_Creation2"+".png"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
