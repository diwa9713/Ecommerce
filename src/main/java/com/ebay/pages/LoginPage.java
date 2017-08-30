package com.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public static WebDriver driver = null;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement username() {
		return driver.findElement(By.id("onlineId1"));
	}
	
	public WebElement password() {
		return driver.findElement(By.id("passcode1"));
	}
	
	public WebElement signin() {
		return driver.findElement(By.id("hp-sign-in-btn"));
	}
	
	
		

	public void dosignin(String username, String password) {
		
		username().sendKeys(username);
		password().sendKeys(password);
		signin().click();
		
	}}

	
//public WebElement gUserName() {
	//return driver.findElement(By.id("identifierId"));
	
//}
