package com.homework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSwitch {

	public static void main(String[] args) throws Exception {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.linkText("Apple")).click();
		
		WebElement obj2 = driver.findElement(By.xpath("//*[contains(text(),'Apple iPhone 15 (128 GB) - Blue')]"));
        obj2.click();
		
      //Windows
        Set<String> allwindows = driver.getWindowHandles();
		
		//How many windows are present current browser
		int windowscount = allwindows.size();
		System.out.println("WindowsCount:===="+windowscount);
		
		Iterator<String> itr = allwindows.iterator();
		
		String applewindow = itr.next();
		String subwindow = itr.next();
		
		driver.switchTo().window(applewindow);
		System.out.println("Get Title:==="+driver.getTitle());
		
		driver.switchTo().window(subwindow);
		System.out.println("Get sub window Title:==="+driver.getTitle());
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//*[@title='Add to Shopping Cart'])[2]")).click();
		
		
		
	}

}
