package tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;



public class RegisterTest_NegativeScenario extends TestBase{
	HomePage homeObject;
	RegisterPage  registerObject;
	
	public void initializeObjects() {
		
		registerObject=new RegisterPage (driver);
		homeObject=new HomePage(driver);
		
	}
	
	
 
  @Test
  
  public void testRegister_withExsistEmail() throws InterruptedException { 
	  
	  initializeObjects();
	  
	  homeObject.OpenRegisterationPage();
	  Thread.sleep(3000);
	  registerObject.NewUserSignup("Hamza Gamal", "hamzagamal72@gmail.com");
	  Thread.sleep(3000);
	  Assert.assertTrue(registerObject.FailedEmailMsg.getText().equalsIgnoreCase("Email Address already exist!"));
	  Thread.sleep(3000);
  }
 

}
