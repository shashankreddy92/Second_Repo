package com.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PHPTravels_Class {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// Open PHP Travels
		driver.get("https://phptravels.net/admin/login");
		driver.manage().window().maximize();

		Thread.sleep(10000);

		WebElement obj = driver.findElement(By.id("email"));
		obj.sendKeys("admin@phptravels.com");

		WebElement obj1 = driver.findElement(By.id("password"));
		obj1.sendKeys("demoadmin");

		WebElement obj2 = driver.findElement(By.xpath("//button[@id='submit']"));
		obj2.click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("(//*[@class='mb-0'])[5]")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(text(),'Customer')]")).click();

		Thread.sleep(10000);

		driver.findElement(By.cssSelector("div.xcrud-rightside>a")).click();

		Thread.sleep(5000);

		WebElement obj3 = driver.findElement(By.xpath("(//input[starts-with(@class,'xcrud-input form-control')])[1]"));
		obj3.sendKeys("sai");

		Thread.sleep(5000);

		WebElement obj4 = driver.findElement(By.xpath("(//input[starts-with(@class,'xcrud-input form-control')])[2]"));
		obj4.sendKeys("reddy");

		driver.findElement(By.xpath("(//input[starts-with(@class,'xcrud-input form-control')])[3]"))
				.sendKeys("user@phptravels.com");

		driver.findElement(By.xpath("(//input[starts-with(@class,'xcrud-input form-control')])[4]"))
				.sendKeys("demoadmin");

		driver.findElement(By.xpath("(//input[starts-with(@class,'xcrud-input form-control')])[5]"))
				.sendKeys("9791074848");

		Thread.sleep(5000);

		//driver.findElement(By.xpath("(//*[@tabindex='0'])[2]")).click();

		driver.findElement(By.xpath("(*[@role='textbox'])[2]")).click();		
		Thread.sleep(2000);
		// Target web element
		WebElement ele = driver.findElement(By.xpath("//li[contains(text(),'Employee')]"));
		// Create object for Actions
		Actions obj7 = new Actions(driver);
		obj7.click(ele).build().perform();

		// Java wait command
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@tabindex='0'])[3]")).click();

		// Java wait command
		Thread.sleep(2000);
		// target the web element
		WebElement ele1 = driver.findElement(By.xpath("//li[contains(text(),'GBP')]"));
		obj7.click(ele1).build().perform();

		// Java wait command
		Thread.sleep(5000);
		// Click on Save
		driver.findElement(By.xpath("//a[contains(text(),'Save')]")).click();

	}
}
