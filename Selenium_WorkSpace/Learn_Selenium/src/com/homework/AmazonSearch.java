package com.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
	public static void main(String[] args) {
		// Set up WebDriver

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.navigate().refresh();

		// Locate the search box using ID
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		// Enter product name into the search box
		searchBox.sendKeys("iPhone 15");

		// Press ENTER to search
		// searchBox.sendKeys(Keys.ENTER);

		// OR Click the Search Button
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		
		WebElement addtoCart = driver.findElement(By.xpath("//*[@id='a-autoid-1']"));
		addtoCart.click();

		// (Optional) Wait and close browser
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.quit();
	}
}
