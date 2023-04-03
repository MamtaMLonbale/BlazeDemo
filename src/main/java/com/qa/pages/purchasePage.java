package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utility.CreateExcel;
import com.utility.ExcelWrite;
import com.utility.screenShot;

public class purchasePage {
	WebDriver driver;
	// Select dropdown;
	Select dropdown;

	public purchasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void entername() {
		WebElement name = driver.findElement(By.name("inputName"));
		name.sendKeys("Tom");
		System.out.println("getting webelement name----: " + name);
		String FLName = name.getText();
		WebElement namelabel = driver.findElement(By.xpath("//label[@for='inputName']"));

	}

	public void enterAddress() {
		driver.findElement(By.id("address")).sendKeys("Mall road");
	}

	public void entercity() {
		driver.findElement(By.id("city")).sendKeys("Nagpur");
	}

	public void enterStatename() {
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
	}

	public void enterZipcode() {
		driver.findElement(By.name("zipCode")).sendKeys("35346");
	}

	public void selectcardType() {
		dropdown = new Select(driver.findElement(By.name("cardType")));
		dropdown.selectByVisibleText("American Express");

	}

	public void enterCraditCardNumber() {
		driver.findElement(By.name("creditCardNumber")).sendKeys("2537568798098");
	}

	public void enterMonth() {
		driver.findElement(By.id("creditCardMonth")).sendKeys("11");
	}

	public void enterYear() {
		driver.findElement(By.name("creditCardYear")).sendKeys("2016");

	}

	public void enterNameOfCard() {
		driver.findElement(By.name("nameOnCard")).sendKeys("John Smith");
	}

	public void checkRememberMe() throws Exception {
		driver.findElement(By.name("rememberMe")).click();

		System.out.println("----end checkRememberMe method----");
		// ExcelWrite.writeExcel(driver);

		
		

	}

	public ConfirmationPage clickPurchaseFlight() throws Exception {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		screenShot.ScreenShot("last_page", driver);
		// ExcelWrite.writeExcel(driver);
		return new ConfirmationPage(driver);

	}
}
