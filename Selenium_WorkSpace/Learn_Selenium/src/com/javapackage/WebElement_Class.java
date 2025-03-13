package com.javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement_Class {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		        
		String app_url = "http://www.facebook.com";
		driver.get(app_url);
		driver.manage().window().maximize();
		
		//Create Button
		String create_button_css = "a[data-testid='open-registration-form-button']";
		WebElement createbutton = driver.findElement(By.cssSelector(create_button_css));
		createbutton.click();
		
		//FirstName*************
		String Fname_xpath = "//input[@name='firstname']";
		String Fname = "QATester";
		WebElement Fn = driver.findElement(By.xpath(Fname_xpath));
		Fn.clear();
		Fn.sendKeys(Fname);
		
		//LastName**************************
		String Lname_name = "lastname";
		String Lname = "QA AUtomation";
		WebElement Ln = driver.findElement(By.name(Lname_name));
		Ln.clear();
		Ln.sendKeys(Lname);
		
		//Mobile********************
		String Mobile_xpath = "//*[contains(@aria-label,'Mobile number or email address')]";
		String Mobile = "7890224241";
		WebElement mob = driver.findElement(By.xpath(Mobile_xpath));
		mob.clear();
		mob.sendKeys(Mobile);
		
		//Password*************************
		String password_id = "password_step_input";
		String password = "test@34566";
		WebElement pwd = driver.findElement(By.id(password_id));
		pwd.clear();
		pwd.sendKeys(password);
		
		//Day******************
		String day_id = "day";
		int da = 23;
		Select  drop = new Select(driver.findElement(By.id(day_id)));
		drop.selectByIndex(da);
		
		//Month*********************************
		String month_name = "birthday_month";
		String mon = "Aug";
		Select drop1 = new Select(driver.findElement(By.name(month_name)));
		drop1.selectByVisibleText(mon);
		
		//Year*************************
		String year_css = "select[title='Year']";
		String yer = "2001";
		Select drop2 = new Select(driver.findElement(By.cssSelector(year_css)));
		drop2.selectByVisibleText(yer);
		
		//Radio Button*****************************
		String RButton_xpath= "(//input[@class='_8esa'])[3]";
		WebElement Rbutton = driver.findElement(By.xpath(RButton_xpath));
		Rbutton.click();
		
		
		
		
		
		
		
		
		
		
	}

}
