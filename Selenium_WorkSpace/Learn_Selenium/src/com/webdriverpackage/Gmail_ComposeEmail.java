package com.webdriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Gmail_ComposeEmail {

    public static void main(String[] args) throws InterruptedException {

        // Set up ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Open Gmail login page
        driver.get("https://mail.google.com/");

        // Enter email and click Next
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mallusaishashankreddy@gmail.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(5000);

        // Enter password and click Next
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shashank@92");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(8000);

        // Click on Compose button
        driver.findElement(By.xpath("//div[text()='Compose']")).click();
        Thread.sleep(9000);

        // Enter recipient's email
       driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("charantester8996@gmail.com");;
        Thread.sleep(5000);
       

        // Enter email subject
        WebElement subjectField = driver.findElement(By.xpath("//input[@name='subjectbox']"));
        subjectField.sendKeys("Test Email");

        // Enter email body
        WebElement bodyField = driver.findElement(By.xpath("//div[@aria-label='Message Body']"));
        bodyField.sendKeys("Hello, this is a test email.");

        // Click on Send button
       // driver.findElement(By.xpath("//div[text()='Send']")).click();
        Thread.sleep(5000);

        // Close browser
        driver.quit();
    }
}
