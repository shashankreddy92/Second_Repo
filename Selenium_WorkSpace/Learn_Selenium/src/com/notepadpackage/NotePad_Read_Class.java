package com.notepadpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotePad_Read_Class {

	public static void main(String[] args) {
		
		try {
			
			//Create Connection from Selenium to Note Pad
			File fi = new File("TestData//Inputdata1.txt");
			
			//Create Connection for File Reader
			FileReader fr = new FileReader(fi);
			
			//Create Connection for Buffer Reader
			BufferedReader br = new BufferedReader(fr);
			
			//How to Read the data from the notepad
			String app_url = br.readLine();
			System.out.println(app_url);
			
			//Application_Open
			ChromeDriver driver = new ChromeDriver();
			driver.get(app_url);
			driver.manage().window().maximize();
			//Implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			
			//How to Read the data from the note pad
			String uid = br.readLine();
			System.out.println(uid);
			String pwd = br.readLine();
			System.out.println(pwd);
			
			//For FB Login
			driver.findElement(By.id("email")).sendKeys(uid);
			driver.findElement(By.id("pass")).sendKeys(pwd);
				
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
