package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.utility.screenShot;

public class HomePage {
	WebDriver driver=null;
	public Select dropdown;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
public void SelectDepartureCity() {
	//driver.findElement(By.xpath("//select[@name='fromPort']")).click();
	dropdown=new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
	dropdown.selectByVisibleText("Boston");
	
}
public void SelectDestinationCity() throws IOException
{
	dropdown=new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
	dropdown.selectByVisibleText("Rome");
	screenShot.ScreenShot("destCity", driver);
}
public ReservePage ClickOnFindflight()
{
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	return new ReservePage(driver);
}
}
