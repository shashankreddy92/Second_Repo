package com.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yahoo_Mail_Class {

	public static void main(String[] args) {

		try {
			// Create Connection from Selenium to Excel Sheet
			FileInputStream fi = new FileInputStream("TestData\\YahooData.xlsx");

			// Create Connection for Xssf work book
			XSSFWorkbook wbook = new XSSFWorkbook(fi);

			// Create Connection for XssfSheet
			XSSFSheet wsht = wbook.getSheetAt(0);

			// How to Read the data from the excel sheet
			String app_url = wsht.getRow(1).getCell(0).getStringCellValue();
			System.out.println(app_url);

			// Application_Open
			ChromeDriver driver = new ChromeDriver();
			driver.get(app_url);
			driver.manage().window().maximize();
			// Implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			// Another Sheet
			XSSFSheet wsht1 = wbook.getSheet("Yahoo_Creation");

			// How many rows are present in current excel sheet
			int rowscount = wsht1.getLastRowNum();
			System.out.println("RowsCount:=== " + rowscount);

			// Click on Create new account button
			driver.findElement(By.linkText("Create an account")).click();

			// for loop
			for (int i = 1; i <= rowscount; i++) {

				String fn = wsht1.getRow(i).getCell(0).getStringCellValue();
				String ln = wsht1.getRow(i).getCell(1).getStringCellValue();
				String em = wsht1.getRow(i).getCell(2).getStringCellValue();
				String pwd = wsht1.getRow(i).getCell(3).getStringCellValue();
				String mon = wsht1.getRow(i).getCell(4).getStringCellValue();
				String da = wsht1.getRow(i).getCell(5).getStringCellValue();
				String yer = wsht1.getRow(i).getCell(6).getStringCellValue();

				// FirstName
				driver.findElement(By.name("firstName")).clear();
				driver.findElement(By.name("firstName")).sendKeys(fn);

				// LastName
				driver.findElement(By.name("lastName")).clear();
				driver.findElement(By.name("lastName")).sendKeys(ln);

				// email id
				driver.findElement(By.name("userId")).clear();
				driver.findElement(By.name("userId")).sendKeys(em);

				// password
				driver.findElement(By.xpath("//*[@name='password']")).clear();
				driver.findElement(By.xpath("//*[@name='password']")).sendKeys(pwd);

				// month
				new Select(driver.findElement(By.xpath("//*[@id='usernamereg-month']"))).selectByIndex(i);

				// day
				driver.findElement(By.xpath("//*[@id='usernamereg-day']")).clear();
				driver.findElement(By.xpath("//*[@id='usernamereg-day']")).sendKeys(da);

				// year
				driver.findElement(By.xpath("//*[@id='usernamereg-year']")).clear();
				driver.findElement(By.xpath("//*[@id='usernamereg-year']")).sendKeys(yer);

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
