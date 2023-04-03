package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateExcel {
	static File file;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet1;
	public static XSSFSheet sheet2;
	static FileOutputStream fos;
	static Row row;
	public static int i;
	static Cell cell;
	static int j;
	static int k;

	public static void createWorkBook(WebDriver driver) throws Exception {

		file = new File("D:\\ExcelOperation\\BlazeDemoPassengerInfo\\passenger.xlsx");
		System.out.println("---Create file object---:" + file);
		wb = new XSSFWorkbook();
		System.out.println("created workbook object:" + wb);

	}

	public static void createFirstSheet() {
	//j=0;
		System.out.println("------Start create first sheet method-----");
		sheet1 = wb.createSheet("Flight_Details");
	}

	public static void createSecondSheet() {
		j = 0;
		sheet2 = wb.createSheet("Passenger_Details");

		System.out.println("---Created second sheet-------- ");
	}

	public static void createRowInFirstsheet() {
		j = 0;
		row = sheet1.createRow(i++);

		System.out.println("row:" + row.getRowNum());
	}

	public static void createRowInsecondSheet() {
		j = 0;
		row = sheet2.createRow(k++);
		System.out.println("row:" + row.getRowNum());
	}

	public static void createCell(String id) {
j=0;
		cell = row.createCell(j++);
		System.out.println("cell:" + cell.getColumnIndex());
		cell.setCellValue(id);

		System.out.println("set id:");
		// cell = row.createCell(j++);
		// cell.setCellValue(value);

	}

	
	public static void OutPutDataExcel(WebDriver driver) throws Exception {
		fos = new FileOutputStream(file);
		System.out.println("Created fileinputstreame object----:" + fos);
		wb.write(fos);
		fos.close();
	}

}
