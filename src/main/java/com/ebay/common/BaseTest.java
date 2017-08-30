package com.ebay.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	// method to launch the browser

	public static WebDriver getdriver(String Browsertype) {
		WebDriver driver = null;
		if (Browsertype.equalsIgnoreCase("Chrome")) {

			String USER_DIR = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", USER_DIR + "/src/main/resources/drivers/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}

		return driver;

	}

}
