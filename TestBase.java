package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestBase {
  WebDriver driver;
  String BaseURL="https://automationexercise.com/";
  
  @BeforeTest
  public void OPenWebsite() {
	  driver=new ChromeDriver();
	  driver.navigate().to(BaseURL);
	  
	  
  }

  @AfterTest
  public void closeWebsite() {
	  driver.quit();
  }

}
