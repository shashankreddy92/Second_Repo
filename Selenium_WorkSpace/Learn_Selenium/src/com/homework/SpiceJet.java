package com.homework;

import java.net.http.WebSocket;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJet {

	public static void main(String[] args) throws Exception {

		// Create ChromeOptions to disable notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		// Launch Chrome with options
		ChromeDriver driver1 = new ChromeDriver(options);
		driver1.get("https://www.spicejet.com/");
		driver1.manage().window().maximize();
		driver1.navigate().refresh();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver1.findElement(By.xpath("//*[@data-testid='search-source-btn']")).click();

		// Verify if it's selected (Optional)
		if (driver1.findElement(By.xpath("//*[contains(text(),'Round Trip')]")).isSelected()) {
			System.out.println("Round Trip option is selected.");
		} else {
			System.out.println("Failed to select Round Trip.");
		}

	}

}
