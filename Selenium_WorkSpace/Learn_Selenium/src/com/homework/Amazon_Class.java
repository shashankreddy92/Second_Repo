package com.homework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Class {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.linkText("Apple")).click();
		
		
		List<WebElement> all_links = driver.findElements(By.xpath("//*[contains(text(), 'Apple')]"));
		
		//Number of links in the page
		
		int linkscount = all_links.size();
		System.out.println("Linkscount:=="+linkscount);
		
		for (int i = 0; i < linkscount; i++) {
			
			String valuename = all_links.get(i).getText();
			System.out.println("Value name:=="+valuename);
			
		}  
	}

}
