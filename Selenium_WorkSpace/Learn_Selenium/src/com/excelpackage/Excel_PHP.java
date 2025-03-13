package com.excelpackage;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_PHP {

	public static void main(String[] args) {

		try {

			FileInputStream file = new FileInputStream("TestData\\Excel_Data.xlsx");

			XSSFWorkbook workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheetAt(0);

			String app_url = sheet.getRow(1).getCell(0).getStringCellValue();
			System.out.println(app_url);

			String app_url1 = sheet.getRow(1).getCell(1).getStringCellValue();
			System.out.println(app_url1);

			String app_url2 = sheet.getRow(1).getCell(2).getStringCellValue();
			System.out.println(app_url2);

			// Application_Open
			ChromeDriver driver = new ChromeDriver();
			driver.get(app_url);
			driver.manage().window().maximize();
			// Implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			WebElement obj = driver.findElement(By.id("email"));
			obj.sendKeys(app_url1);

			WebElement obj1 = driver.findElement(By.id("password"));
			obj1.sendKeys(app_url2);
			
			Thread.sleep(3000);

			WebElement obj2 = driver.findElement(By.xpath("//button[@id='submit']"));
			obj2.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

}
