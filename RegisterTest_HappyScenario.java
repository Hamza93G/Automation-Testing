package tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;



public class RegisterTest_HappyScenario extends TestBase{
	HomePage homeObject;
	RegisterPage  registerObject;
	
	public void initializeObjects() {
		
		registerObject=new RegisterPage (driver);
		homeObject=new HomePage(driver);
		
	}
	
	
  @Test
  public void testRegister_withNewEmail() throws InterruptedException {
	  initializeObjects();
	  
	  homeObject.OpenRegisterationPage();
	  
	  Thread.sleep(3000);
	 
	  registerObject.NewUserSignup("Hamza Gamal", "hamzagamal93@gmail.com");
	  Assert.assertTrue(registerObject.EnterAccountInformationMassage.getText().equalsIgnoreCase( "Enter Account Information"));
	  
	  Thread.sleep(3000);
	  
	  
	  registerObject.NewUserCanRegister("91205329999","9","12","1993","Hamza","Gamal","vodafone","DarElsalam","Maadi","United States","New York","Ohaio","145236","01099300495");
	  
	  Thread.sleep(3000);
	  
	  Assert.assertTrue(registerObject.SuccessMsg.getText().equalsIgnoreCase("Account Created!"));
	  
	  registerObject.continueAccount();
	  
	  Thread.sleep(3000);
	  
	  Assert.assertEquals("Logged in as Hamza Gamal", registerObject.LoggedinMsg.getText());
	  
	  Thread.sleep(3000);
	  
	  
	  registerObject.DleteAccount();
	  
	  Thread.sleep(3000);
	  
	  Assert.assertTrue(registerObject.DeleteSuccessMsg.getText().equalsIgnoreCase("Account Deleted!"));
	  
	  Thread.sleep(3000);
	  
	  registerObject.continueAccount(); 
	  
  }
  
  

}
