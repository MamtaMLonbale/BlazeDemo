package com.qa.pages;

import org.openqa.selenium.WebDriver;

import com.utility.CreateExcel;

public class CheckingExcelOperation {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		CreateExcel c=new CreateExcel();
		
		c.createWorkBook(driver);
		//c.createSheet(driver);
		//c.createRow();
		//c.createCell("ID", 34);
		c.OutPutDataExcel(driver);
		
	}

}
