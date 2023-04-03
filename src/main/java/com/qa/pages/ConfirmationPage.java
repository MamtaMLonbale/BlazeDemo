package com.qa.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utility.CreateExcel;

public class ConfirmationPage {

	static WebDriver driver;

	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void Create_Secoond_sheet() throws Exception {

		CreateExcel.createSecondSheet();
		System.out.println("created Second sheet------");

		// CreateExcel.createRowInsecondSheet();
		System.out.println("-----created new row-----");
		ConfirmationPage.tableOprationForSecondSheet(driver);
	}

	public static void tableOprationForFirstSheet(WebDriver driver) throws Exception {

		WebElement amount = driver.findElement(By.xpath("//td[1]"));
		System.out.println("Getting element amount:" + amount.getText());
		WebElement table = driver.findElement(By.tagName("table"));
		System.out.println("list of webelement:" + table);
		List<WebElement> rows = table.findElements(By.tagName("tr"));//

		Iterator<WebElement> itr = rows.iterator();

		System.out.println("I am checking what is in itr:" + itr);
		while (itr.hasNext()) {
			System.out.println("list of element:" + itr.next());
			WebElement row = itr.next();
			List<WebElement> cols = row.findElements(By.tagName("td"));
			Iterator<WebElement> itr1 = cols.iterator();
			CreateExcel.createRowInFirstsheet();
			while (itr1.hasNext()) {
				WebElement td = itr1.next();
				String value = td.getText();
				CreateExcel.createCell(value);
				CreateExcel.OutPutDataExcel(driver);
			}

		}

	}

	public static void tableOprationForSecondSheet(WebDriver driver) throws Exception {

		WebElement amount = driver.findElement(By.xpath("//td[1]"));
		System.out.println("Getting element amount:" + amount.getText());
		WebElement table = driver.findElement(By.tagName("table"));
		System.out.println("list of webelement:" + table);
		List<WebElement> rows = table.findElements(By.tagName("tr"));//
		Iterator<WebElement> itr = rows.iterator();
		System.out.println("I am checking what is in itr:" + itr);
		while (itr.hasNext()) {
			System.out.println("list of element:" + itr.next());
			WebElement row = itr.next();
			List<WebElement> cols = row.findElements(By.tagName("td"));
			Iterator<WebElement> itr1 = cols.iterator();
			CreateExcel.createRowInsecondSheet();
			while (itr1.hasNext()) {
				WebElement td = itr1.next();
				String value = td.getText();
				CreateExcel.createCell(value);
				CreateExcel.OutPutDataExcel(driver);
			}

		}

	}

}
