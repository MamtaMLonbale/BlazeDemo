package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenShot {

	//public static WebDriver driver;

	

	public static void ScreenShot(String fileName,WebDriver driver) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println("----taking screenshot------");
		FileUtils.copyFile(file,
				new File("C:\\Users\\Mamta\\eclipse-workspace\\blaze\\src\\main\\java\\com\\utility\\screenshot\\"
						+ fileName + ".jpeg"));
		System.out.println("-----Screenshot------");
		
	}

}
