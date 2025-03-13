package com.homework;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Yahoo_PropertiesFiles_Class {

	public static void main(String[] args) {

		try {

			// Create Connection from Properties Files to Selenium
			FileInputStream fi = new FileInputStream("TestData\\Yahoo_Properties.properties");
			// Create Object for Properties
			Properties obj = new Properties();
			obj.load(fi);
			// How to Read the data from the Properties files
			String url = obj.getProperty("App_url");
			System.out.println(url);

			// Application_Open
			ChromeDriver driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();

			// Implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			// how Read the Locators************
			String CreateButton_id = obj.getProperty("Yahoo_CreateButton_id");
			String Fname_id= obj.getProperty("Yahoo_Fname_id");
			String Lname_name = obj.getProperty("Yahoo_Lname_id");
			String Email_id = obj.getProperty("Yahoo_Email_id");
			System.out.println(Email_id);
			String pwd_id = obj.getProperty("Yahoo_Password_id");
			String day_id = obj.getProperty("Yahoo_Day_id");
			String month_id = obj.getProperty("Yahoo_Month_id");
			String year_id = obj.getProperty("Yahoo_Year_id");

			// How to Read the InputData
			String Fn = obj.getProperty("Yahoo_Fname");
			String Ln = obj.getProperty("Yahoo_Lname");
			String email = obj.getProperty("Yahoo_Email");
			String pwd = obj.getProperty("Yahoo_Password");
			String da = obj.getProperty("Yahoo_day");
			String mon = obj.getProperty("Yahoo_month");
			String yer = obj.getProperty("Yahoo_year");

			// FB_Creation
			driver.findElement(By.id(CreateButton_id)).click();
			driver.findElement(By.id(Fname_id)).sendKeys(Fn);
			driver.findElement(By.id(Lname_name)).sendKeys(Ln);
			driver.findElement(By.name(Email_id)).sendKeys(email);
			driver.findElement(By.id(pwd_id)).sendKeys(pwd);
			driver.findElement(By.id(day_id)).sendKeys(da);
			driver.findElement(By.id(year_id)).sendKeys(yer);
			//new Select(driver.findElement(By.id(day_id))).selectByVisibleText(da);
			//new Select(driver.findElement(By.id(month_id))).selectByVisibleText(mon);
			new Select(driver.findElement(By.id(month_id))).selectByVisibleText(mon);
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
