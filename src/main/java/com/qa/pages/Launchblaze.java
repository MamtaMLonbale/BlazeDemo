package com.qa.pages;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


import javax.xml.datatype.DatatypeConstants.Field;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchblaze {
WebDriver driver=null;
public HomePage LaunchSite() throws InterruptedException
{
	WebDriverManager.chromedriver().driverVersion("109").setup();
	driver=new ChromeDriver();
	
	driver.get("https://blazedemo.com/");
	driver.manage().window().maximize();
	//Wait wait=new FluentWait(driver);
	//driver.close();
	
	return new HomePage(driver);
}
}