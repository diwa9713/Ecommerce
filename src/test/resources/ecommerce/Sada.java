

package ecommerce;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Sada {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://live.guru99.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
//change 2
  //Changes day 2
  //modify 5
  //changes day 3
  @Test
  public void testSada() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Mobile")).click();
    driver.findElement(By.linkText("Add to Compare")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Add to Compare')])[2]")).click();
    driver.findElement(By.cssSelector("div.block-content > div.actions > button.button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | compare | 30000]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=compare | ]]
    driver.findElement(By.cssSelector("div.buttons-set > button.button")).click();
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
