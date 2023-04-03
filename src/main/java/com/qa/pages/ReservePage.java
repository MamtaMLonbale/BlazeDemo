package com.qa.pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.CreateExcel;

public class ReservePage {
	public WebDriver driver = null;

	public ReservePage(WebDriver driver) {
		this.driver = driver;
	}

	public purchasePage clickOnChooseFigth() throws Exception {
		CreateExcel.createWorkBook(driver);
		CreateExcel.createFirstSheet();
		//CreateExcel.createRowInFirstsheet();
		ConfirmationPage.tableOprationForFirstSheet(driver);

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50))
				.pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//input[@type='submit' and @value='Choose This Flight'][1]"))).get(0).click();

		// driver.findElement(By.xpath("//input[@type='submit' and @value='Choose This
		// Flight']//following::input[@value='43']")).click();
		return new purchasePage(driver);
	}

}
