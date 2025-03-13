package com.actionspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Class {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//Click on drop
		driver.findElement(By.xpath("//a[contains(.,'Droppable')]")).click();
		
		//How to Switch to Frame 
		driver.switchTo().frame(0);
		
		//Target Drag
		WebElement src = driver.findElement(By.id("draggable"));
		
	   //target Drop
		WebElement dsc = driver.findElement(By.id("droppable"));
		
		//Create Object for Actions
		Actions obj = new Actions(driver);
		obj.clickAndHold(src).moveToElement(dsc).release(src).build().perform();
		
		//Another method for drag and drop
		obj.dragAndDrop(src, dsc).build().perform();
		
		
		
		
		
		
		
		

	}

}
