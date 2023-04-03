package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelWrite {
	WebDriver driver;
	XSSFWorkbook wb;
	File file;
	FileInputStream fis;
	XSSFSheet sheet;
	/*
	 * public ExcelWrite(WebDriver driver) { this.driver=driver;
	 * 
	 * }
	 */
	public static void writeExcel(WebDriver driver) throws Exception {
		System.out.println("----start excel writing-------");
		
	}
		
	/*	file = new File("D:\\ExcelOperation\\BlazeDemoPassengerInfo\\Book1.xlsx");
		System.out.println("--------create object of file------");
		 fis = new FileInputStream(file);
		System.out.println("Object:"+fis);
		System.out.println("--------create object of fileInputStream------");
		 wb= new XSSFWorkbook();
		System.out.println("--------create object of XSSFWorkbook------");
		
		
		
		sheet=wb.createSheet("Info");
		System.out.println("--------create new XSSFWorSheet------");
		
		//sheet.getRow(2).createCell(2).setCellValue("Ram");
		Row row;
		System.out.println("--------Create a row------");
		
		//sheet.getRow(1).createCell(1).setCellValue("Sham");
	 Map<String,Object[]> passengerData=new TreeMap<String,Object[]>();
		System.out.println("--------Create Map object------"+passengerData);
		Set<String> keyid=passengerData.keySet();
		System.out.println("value of Key id is:"+keyid);
		int rowid=0;
		for(String key:keyid)
		{
			row=sheet.createRow(rowid++);
			Object[] objectArr=passengerData.get(key);
			System.out.println("Object class:"+objectArr);
			int cellid=0; 
			for(Object obj:objectArr)
			{
				Cell cell=row.createCell(cellid++);
				System.out.println("------Creating cell:"+cell);
				cell.setCellValue((String)obj);
			}
				
		}
		
		FileOutputStream fout = new FileOutputStream(file);
		System.out.println("--------create object of fileOutputStream------");
		
		//passengerData.put("1", new Object[]{ "Roll No", "NAME", "Year" });
		System.out.println("-------------data put into map---------------");
		wb.write(fout);
		wb.close();
	}*/

}
