package com.homework;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_website_class {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.navigate().refresh();

		driver.findElement(By.linkText("Mobiles")).click();

		driver.findElement(By.linkText("Samsung")).click();
		driver.findElement(
				By.xpath("//*[contains(text(),'Samsung Original 25W Type-C Travel Adaptor Without Cable, White')]"))
				.click();

		// Windows
		Set<String> allwindows = driver.getWindowHandles();

		// How many windows are Present in Current Page
		int windowscount = allwindows.size();
		System.out.println("WindowsCount:===" + windowscount);

		// Create object for iterator
		Iterator<String> itr = allwindows.iterator();

		// with out using loop
		String mainwindow = itr.next();
		String subwindow = itr.next();

		// how to switch to main window
		driver.switchTo().window(mainwindow);
		System.out.println("Main Window Get Title:==" + driver.getTitle());

		driver.switchTo().window(subwindow);
		System.out.println("Sub Window Title:===" + driver.getTitle());

		driver.switchTo().window(subwindow);
		// java wait command
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title='Add to Shopping Cart']")).click();

	}

}
