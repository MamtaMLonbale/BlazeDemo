package com.qa.testcases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;

import com.google.common.annotations.VisibleForTesting;
import com.qa.pages.ConfirmationPage;
import com.qa.pages.HomePage;
import com.qa.pages.Launchblaze;
import com.qa.pages.ReservePage;

import com.qa.pages.purchasePage;
import com.utility.CreateExcel;
import com.utility.ExcelWrite;
import com.utility.screenShot;

public class verifyBlazeDemo {
	Launchblaze l = new Launchblaze();
	HomePage h;
	ReservePage r;
	purchasePage p;
	ExcelWrite e;
	ConfirmationPage c;
	WebDriver driver;

	@Test(priority = 0)
	public void setup() throws InterruptedException {
		h = l.LaunchSite();
	}

	@Test(priority = 1,dependsOnMethods= {"setup"})
	public void verifyHomePage() throws IOException {
		h.SelectDepartureCity();
		h.SelectDestinationCity();
		r = h.ClickOnFindflight();
	}

	@Test(priority = 2)
	public void verifyReservePage() throws Exception {
		// Thread.sleep(2000);
		// wait(2000);
		System.out.println("-----start verifyReservePage method-----");
		p = r.clickOnChooseFigth();
		System.out.println("-----end verifyReservePage method-----");
	}

	@Test(priority = 3)
	public void verifypurchasePage() throws Exception {
		p.entername();
		p.enterAddress();
		p.entercity();
		p.enterStatename();
		p.enterZipcode();
		p.selectcardType();
		p.enterCraditCardNumber();
		p.enterMonth();
		p.enterYear();
		p.enterNameOfCard();
		p.checkRememberMe();
		c = p.clickPurchaseFlight();
	}

	@Test(priority = 4)
	public void verifyConfirmationPage() throws Exception {
		c.Create_Secoond_sheet();

	}

}
