package com.webdriverpackage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class BookMyShowBooking {
    public static void main(String[] args) throws InterruptedException {
       
        WebDriver driver = new ChromeDriver();
       
            // Open BookMyShow
            driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
            driver.manage().window().maximize();
            
            Thread.sleep(5000);

            // Select City
           // driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
            
            //Thread.sleep(5000);
           
           // driver.findElement(By.xpath("//a[contains(text(),'Movies')]")).click();
            
            driver.findElement(By.xpath("div[contains(text(),'Thandel')]")).click();
            		
            Thread.sleep(7000);
            
            driver.findElement(By.xpath("//span([contains(text(),'Book tickets')])[1]")).click();
            
            Thread.sleep(4000);
            
            driver.findElement(By.xpath("//*[contains(text(),'2D']")).click();
            
            
            
           
    }
}
    
