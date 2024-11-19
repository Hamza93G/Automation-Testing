package tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;


public class ProductsTest_HappyScenario extends TestBase {
	
	ProductPage praductObject;
	HomePage HomeObject;
	LoginPage LoginObject;
	
public void initializeObjects() {
		
	praductObject=new ProductPage (driver);
	LoginObject=new LoginPage(driver);
	HomeObject=new HomePage(driver); 
	}
	
  @Test (priority=1)
  public void UserCanLoginProductspage() throws InterruptedException {
	  initializeObjects();
	  praductObject.OpenProductPage();
	  Thread.sleep(3000);
	  Assert.assertTrue(praductObject.AllproductsMsg.getText().equalsIgnoreCase("All Products"));
	  Thread.sleep(3000);
  
  }
  @Test(priority=2)
  public void userCanSearchAnyProduct()throws InterruptedException {
	  initializeObjects();
	  praductObject.searchProduct("Sleeveless Dress");
	  Thread.sleep(3000);
	  Assert.assertTrue(praductObject.SearchedproductsMsg.getText().equalsIgnoreCase("Searched Products"));
	  Thread.sleep(3000);
	  Assert.assertTrue(praductObject.SelectedproductsTxt.getText().equalsIgnoreCase("Sleeveless Dress"));
	  Thread.sleep(3000);
	  
	 
  }
  //@Test(priority=3)
 // public void TestaddtoCartAllert() throws InterruptedException {
	  //initializeObjects();
	// praductObject.AddtoCart();
	 //Thread.sleep(3000);
	// Alert AddToCardBTnAllert =driver.switchTo().alert();
	// Thread.sleep(3000);
	// Assert.assertTrue(AddToCardBTnAllert.getText().equalsIgnoreCase("Your product has been added to cart."));
  //}
  @Test(priority=4)
  public void TestLoginandCartPage() throws InterruptedException {
	  initializeObjects();
	  HomeObject.OpenLoginPage();
	  Thread.sleep(3000);
	  LoginObject.userLogin("hamzagamal72@gmail.com", "91205329999");
	  Thread.sleep(3000);
	  praductObject.OPeningCartPage();
	  Thread.sleep(3000);
	  Assert.assertTrue(praductObject.productNameInCartpagetxt.getText().equalsIgnoreCase("Sleeveless Dress"));
	  Thread.sleep(3000);
	  
	  
  }
  
  
}
