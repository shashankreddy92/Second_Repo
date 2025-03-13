package com.excelpackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_Class {

	public static void main(String[] args) {

		try {

			// Create Connection from selenium to Excel Sheet
			FileInputStream fi = new FileInputStream("TestData\\Excel_Inputdata.xlsx");
			// Create Connection for Work book
			XSSFWorkbook wbook = new XSSFWorkbook(fi);

			// Create Connection for sheet
			XSSFSheet wsht = wbook.getSheetAt(1);

			// How to Write data into the Excel Sheet
			wsht.getRow(0).createCell(7).setCellValue("Result");
			wsht.getRow(1).createCell(7).setCellValue("Pass");
			wsht.getRow(2).createCell(7).setCellValue("Fail");

			wbook.write(new FileOutputStream("Logo\\ExcelOutput1.xlsx"));

			// How to Save the Excel sheet in Runtime
			wbook.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
