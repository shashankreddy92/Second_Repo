package com.capturescreenshotpackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShot_Class {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		try {
			
			//How to Capture the Screen in Runtime
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//	FileUtils.copyFile(src,new File("Screens\\FB_Login"+".png"));
			
			//Another method
			FileHandler.copy(src,new File("Screens1\\FB_Login1"+".png"));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
