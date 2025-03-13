package com.propertiespackage;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFiles_Write_Class {

	public static void main(String[] args) {
		try {
			
			//Create Connection from Selenium to Properties files
			FileOutputStream fo = new FileOutputStream("Logo//Fileoutput1.properties");
			//Create object for Properties
			Properties obj = new Properties();
			//How to Write data into the Properties files
			obj.setProperty("App_URL","http://www.gmail.com");
			obj.setProperty("UserName","tester@gmail.com");
			obj.setProperty("Password","test@12344");
			
			obj.store(fo,"Gmail_Inputdata######");
				
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}

	}

}
