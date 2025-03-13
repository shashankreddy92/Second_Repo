package com.propertiespackage;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PropertiesFiles_Read_Class {

	public static void main(String[] args) {
		
		try {
			
			//Create Connection from Properties Files to Selenium
			FileInputStream fi =  new FileInputStream("TestData\\Inputdata12.properties");
			//Create Object for Properties
			Properties obj = new Properties();
			obj.load(fi);
			//How to Read the data from the Properties files
			String url = obj.getProperty("App_url");
			System.out.println(url);
			
			//Application_Open
			ChromeDriver driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			//Implicitly wait 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//how Read the Locators************
			String CreateButton_xpath = obj.getProperty("FB_CreateButton_Xpath");
			String Fname_css = obj.getProperty("FB_Fname_Css");
			String Lname_name = obj.getProperty("FB_Lname_name");
			String Mobile_name = obj.getProperty("FB_Mobile_name");
			String pwd_id = obj.getProperty("FB_Password_id");
			String day_id = obj.getProperty("FB_Day_id");
			String month_id = obj.getProperty("FB_month_id");
			String year_id = obj.getProperty("FB_year_id");
			String Rbutton_xpath = obj.getProperty("FB_RButton_Xpath");
			
			//How to Read the Inputdata
			String Fn = obj.getProperty("FB_Fname");
			String Ln = obj.getProperty("FB_Lname");
			String mob = obj.getProperty("FB_Mobile");
			String pwd = obj.getProperty("FB_Password");
			String da = obj.getProperty("FB_day");
			String mon = obj.getProperty("FB_month");
			String yer = obj.getProperty("FB_year");
			
			//FB_Creation
			driver.findElement(By.xpath(CreateButton_xpath)).click();
			driver.findElement(By.cssSelector(Fname_css)).sendKeys(Fn);
			driver.findElement(By.name(Lname_name)).sendKeys(Ln);
			driver.findElement(By.name(Mobile_name)).sendKeys(mob);
			driver.findElement(By.id(pwd_id)).sendKeys(pwd);
			new Select(driver.findElement(By.id(day_id))).selectByVisibleText(da);
			new Select(driver.findElement(By.id(month_id))).selectByVisibleText(mon);
			new Select(driver.findElement(By.id(year_id))).selectByVisibleText(yer);
			driver.findElement(By.xpath(Rbutton_xpath)).click();
			
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
