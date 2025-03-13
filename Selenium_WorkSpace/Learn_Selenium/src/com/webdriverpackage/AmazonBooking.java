package com.webdriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBooking {

	public static void main(String[] args) throws InterruptedException {
		
		
		 WebDriver driver = new ChromeDriver();
	       
         // Open Amazon
         driver.get("https://www.amazon.in/");
         driver.manage().window().maximize();
         
         Thread.sleep(5000);
         
         driver.navigate().refresh();
         
        WebElement obj = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
        obj.click();
 
        Thread.sleep(5000);
       
        WebElement obj1 = driver.findElement(By.xpath("(//span[contains(., 'Apple')])[1] "));
        obj1.click();       
        
        WebElement obj2 = driver.findElement(By.xpath("//img[contains(@src,'https://m.media-amazon.com/images/I/615O-NFQKdL._AC_UL320_.jpg')]"));
        obj2.click();

	}
	
}
