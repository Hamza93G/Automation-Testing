package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
	public LoginPage(WebDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name="email")
	List<WebElement> emailTxt;
	
	@FindBy(name="password")
	WebElement passwordtxt;
	
	@FindBy(css="#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > button")
	WebElement LoginBtn;
	
	public void userLogin(String email,String password) {
		
		emailTxt.get(0).sendKeys(email);
		passwordtxt.sendKeys(password);
		LoginBtn.click();
	
	}

}
