package ecommerce;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sdsds {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  String USER_DIR = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", USER_DIR + "/src/main/resources/drivers/chromedriver");
    driver = new ChromeDriver();
    driver.get("https://www.ebay.com/");
    //baseUrl = "https://www.ebay.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    
    
  }

  @Test
  public void testSdsds() throws Exception {
   // driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.xpath("//span/input[@placeholder='Email or username']")).clear();
    driver.findElement(By.xpath("//span/input[@placeholder='Email or username']")).sendKeys("diwa.reddy@gmail.com");
    driver.findElement(By.xpath("//span/input[@placeholder='Password']")).clear();
    driver.findElement(By.xpath("//span/input[@placeholder='Password']")).sendKeys("Creative_123");
    driver.findElement(By.id("sgnBt")).click();
    driver.findElement(By.id("gh-ac")).click();
    driver.findElement(By.id("gh-ac")).clear();
    driver.findElement(By.id("gh-ac")).sendKeys("fitbit charge 2");
    driver.findElement(By.id("gh-btn")).click();
    driver.findElement(By.cssSelector("span.caret-dn")).click();
    driver.findElement(By.linkText("Price + Shipping: lowest first")).click();
    driver.findElement(By.linkText("Luxury Band Replacement Sport Wristband Watch Strap Bracelet For Fitbit Charge 2")).click();
    driver.findElement(By.linkText("Sign out")).click();
   // driver.quit();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
