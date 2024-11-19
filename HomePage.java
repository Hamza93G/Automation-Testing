package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase  {
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText ="Signup / Login")
	WebElement SignUpLoginBtn;
	
	public void OpenRegisterationPage()  {
		SignUpLoginBtn.click();

	}
	public void OpenLoginPage()  {
		SignUpLoginBtn.click();

	}
	

}
