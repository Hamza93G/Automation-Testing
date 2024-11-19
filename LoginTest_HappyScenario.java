package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;



public class LoginTest_HappyScenario extends TestBase {
	HomePage homeObject;
	LoginPage Loginobject;
	RegisterPage RegisterObject;
	
	public void initializeObjects() {
		
		Loginobject=new LoginPage (driver);
		homeObject=new HomePage(driver);
		RegisterObject=new RegisterPage(driver);
		
	}
	
  @Test
  public void Login_CorrectUsernameAndCorrectPassword() throws InterruptedException {
	  initializeObjects();
	  
	  homeObject.OpenLoginPage();
	  
	  Thread.sleep(3000);
	  Loginobject.userLogin("hamzagamal72@gmail.com", "91205329999");
	  Thread.sleep(3000);
	  Assert.assertTrue(RegisterObject.LoggedinMsg.getText().equalsIgnoreCase("Logged in as Hamza Gamal"));
	  Thread.sleep(3000);
  }
}
