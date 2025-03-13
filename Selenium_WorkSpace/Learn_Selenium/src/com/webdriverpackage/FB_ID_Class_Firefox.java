package com.webdriverpackage;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_ID_Class_Firefox {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver(); // creates a object to open firefox browser
		 
		driver.get("http://www.facebook.com");//opens fb.com
		 
		driver.manage().window().maximize();// maximizes the browser
		  
		driver.findElement(By.id("email")).sendKeys("shashu.reddy@gmail.com");//passes email into username
		 
		driver.findElement(By.id("pass")).sendKeys("123"); //passes password into password text box
		 
		driver.findElement(By.id("u_0_5_MK")).click(); // unsuccessful attempt by trying to click button using ID Locator
		
		driver.findElement(By.name("login")).click(); //successful attempt in clicking login button
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Shashank");
		driver.findElement(By.name("lastname")).sendKeys("Reddy");
		//driver.findElement(By.name("reg_email__")).sendKeys("7207148606");
		//driver.findElement(By.name("reg_passwd__")).sendKeys("1234567890!");
		
		//By Using ID Locator for DropDown/listbox for DAY
		//new Select(driver.findElement(By.id("day"))).selectByIndex(10);
		// new Select(driver.findElement(By.id("day"))).selectByValue("18");
		 new Select(driver.findElement(By.id("day"))).selectByVisibleText("17");
		
		 //Month
		new Select(driver.findElement(By.id("month"))).selectByIndex(6);
		 //new Select(driver.findElement(By.id("month"))).selectByValue("11");
		// new Select(driver.findElement(By.id("month"))).selectByVisibleText("Sep");
		 
		 //Year
		 new Select(driver.findElement(By.id("year"))).selectByIndex(30);
		// new Select(driver.findElement(By.id("year"))).selectByValue("1985");
		 //new Select(driver.findElement(By.id("year"))).selectByVisibleText("2001");
		 
		 driver.findElement(By.className("_8esa")).click();
		 
		 //driver.findElement(By.linkText("Forgotten password?")).click();
		 
		 //By using Link text locator for links
		 
		 //driver.findElement(By.linkText("Learn more")).click();
		 
		 //by using partial linktext for links
		 
		// driver.findElement(By.partialLinkText("Cookies Policy")).click();
		
	}

}
