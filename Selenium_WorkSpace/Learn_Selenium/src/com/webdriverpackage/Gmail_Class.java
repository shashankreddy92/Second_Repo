package com.webdriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Class {

    public static void main(String[] args) throws InterruptedException {

        // Set up ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin");
        driver.manage().window().maximize();

        // Enter email/username
        driver.findElement(By.name("identifier")).sendKeys("mallusaishashankreddy@gmail.com");
        driver.findElement(By.id("identifierNext")).click();

        // Wait for password field to appear
        Thread.sleep(5000);

        // Enter password
        WebElement passwordField = driver.findElement(By.name("Passwd"));
        passwordField.sendKeys("Shashank@92");

        // Click on 'Next' button after entering password
        driver.findElement(By.id("passwordNext")).click();

        // Wait for login process
        Thread.sleep(5000);

        // Close browser
        //driver.quit();
    }
}
