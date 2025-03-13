package com.excelpackage;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excel_Read_Class {

	public static void main(String[] args) {

		try {

			// Create Connection from Selenium to Excel Sheet
			FileInputStream fi = new FileInputStream("TestData\\Excel_Inputdata.xlsx");
			// FileInputStream fi = new
			// FileInputStream("C:\\Users\\shash\\Selenium_WorkSpace\\Learn_Selenium\\TestData\\Browser.xlsx");

			// Create Connection for Xssf work book
			XSSFWorkbook wbook = new XSSFWorkbook(fi);

			// Create Connection for XssfSheet
			XSSFSheet wsht = wbook.getSheet("url");

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
			XSSFSheet wsht1 = wbook.getSheetAt(1);

			// How many rows are present in current excel sheet
			int rowscount = wsht1.getLastRowNum();
			System.out.println("RowsCount:=== " + rowscount);

			// Click on Create new account button
			driver.findElement(By.linkText("Create new account")).click();

			// For Loop
			for (int i = 1; i <= rowscount; i++) {

				String fn = wsht1.getRow(i).getCell(0).getStringCellValue();
				String ln = wsht1.getRow(i).getCell(1).getStringCellValue();
				String mob = wsht1.getRow(i).getCell(2).getStringCellValue();
				String pwd = wsht1.getRow(i).getCell(3).getStringCellValue();
				String da = wsht1.getRow(i).getCell(4).getStringCellValue();
				String mon = wsht1.getRow(i).getCell(5).getStringCellValue();
				String yer = wsht1.getRow(i).getCell(6).getStringCellValue();

				// FirstName
				driver.findElement(By.name("firstname")).clear();
				driver.findElement(By.name("firstname")).sendKeys(fn);

				// Lastname
				driver.findElement(By.name("lastname")).clear();
				driver.findElement(By.name("lastname")).sendKeys(ln);

				// Mobile
				driver.findElement(By.name("reg_email__")).clear();
				driver.findElement(By.name("reg_email__")).sendKeys(mob);

				// Password
				driver.findElement(By.id("password_step_input")).clear();
				driver.findElement(By.id("password_step_input")).sendKeys(pwd);

				// Day
				new Select(driver.findElement(By.id("day"))).selectByVisibleText(da);
				// month
				new Select(driver.findElement(By.id("month"))).selectByVisibleText(mon);
				// year
				new Select(driver.findElement(By.id("year"))).selectByVisibleText(yer);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
