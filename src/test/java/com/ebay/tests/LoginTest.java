package com.ebay.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ebay.common.BaseTest;

public class LoginTest {
WebDriver driver = null;
//Change temp
@BeforeClass
public void beforeclass() {
	driver = BaseTest.getdriver("Chrome");
	driver.get("https://www.ebay.com/");
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
}

@Test
public void testLoginValid() throws InterruptedException
{
	Reporter.log("Executing the page with valid login", true);
	String title = "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
	System.out.println("PAge title is" +driver.getTitle());
	AssertJUnit.assertEquals(driver.getTitle(), title, "Ebay page is not opened");
	driver.findElement(By.xpath(".//*[@id='gh-ug']/a")).click();
	Thread.sleep(9000);
	
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span/input[@placeholder='Email or username']")));

	
	driver.findElement(By.xpath("//span/input[@placeholder='Email or username']")).clear();
    driver.findElement(By.xpath("//span/input[@placeholder='Email or username']")).sendKeys("diwa.reddy@gmail.com");
    driver.findElement(By.xpath("//span/input[@placeholder='Password']")).sendKeys("Creative_123");
    driver.findElement(By.id("sgnBt")).click();
    String title1 = "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
    System.out.println("The title page is "+title1);
    AssertJUnit.assertEquals(driver.getTitle(), title1, "Login not successful");
	Thread.sleep(3000);
//	boolean flag= driver.findElement(By.xpath("//span/input[@placeholder='Password']")).isDisplayed();
//	System.out.println("flag is "+flag);
//	driver.findElement(By.xpath("//div/input[@placeholder='Password']")).clear();
//	driver.findElement(By.xpath("//div/input[@placeholder='Password']")).click();
	//driver.findElement(By.xpath("//span/input[@placeholder='Password']")).sendKeys("Temp");
	//driver.findElement(By.xpath("//div/input[@type='Password']"));
   // driver.findElement(By.cssSelector("#rightbar > .menu > li:nth -of -ty pe(2) > h4"));
	

}





}