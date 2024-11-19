package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends PageBase {
	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name="name")
    WebElement nameTxt;
	
	
	@FindBy(name="email")
    List<WebElement> emailTxt;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/button")////*[@id="form"]/div/div/div[3]/div/form/button
	WebElement SignUpBtn;
	
	@FindBy(id="id_gender1")
	WebElement genderratioBtn;
	
	@FindBy(id="password")
	WebElement passwordTxt;
	
	@FindBy(id="days")
	WebElement dayslist;
	
	@FindBy(id="months")
	WebElement monthslist;
	
	@FindBy(id="years")
	WebElement yearslist;
	
	@FindBy(id="newsletter")
	WebElement newsletterCheckBox;
	
	@FindBy(id="optin")
	WebElement SpecialOffersCheckBox;
	
	@FindBy(id="first_name")
	WebElement firstNameTxt;
	
	@FindBy(id="last_name")
	WebElement lastNameTxt;
	
	
	@FindBy(id="company")
	WebElement companyTxt;
	
	@FindBy(id="address1")
	WebElement addressTxt1;
	
	@FindBy(id="address2")
	WebElement addressTxt2;
	
	@FindBy(id="country")
	WebElement countrylist;
	
	@FindBy(id="state")
	WebElement statetxt;
	
	
	@FindBy(id="city")
	WebElement citytxt;
	
	@FindBy(id="zipcode")
	WebElement zipcodetxt;
	
	@FindBy(id="mobile_number")
	WebElement mobilenumberTxt;
	
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div[1]/form/button")
	WebElement CreateAccountbtn;
	
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div[1]/h2/b")
	public WebElement EnterAccountInformationMassage;
	
	@FindBy(css="#form > div > div > div > h2 > b")
	public WebElement SuccessMsg;
	
	@FindBy(linkText ="Continue")
	public WebElement ContinueBtn;
	
	@FindBy(partialLinkText="Logged in")
	public WebElement LoggedinMsg;
	
	@FindBy(tagName="Li")
	 List<WebElement> navBarList;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/h2/b")
	public  WebElement DeleteSuccessMsg;
	
	@FindBy(css="#form > div > div > div:nth-child(3) > div > form > p")
	public WebElement FailedEmailMsg;
	

	public void NewUserSignup(String name,String email) {
		nameTxt.sendKeys(name);
		emailTxt.get(1).sendKeys(email);
		SignUpBtn.click();

	}
	
	public void NewUserCanRegister(String password , String day ,String month ,String year ,String firstName ,String LastName ,String company ,String address1 ,String address2 ,String country ,String State ,String city ,String zipCode ,String phoneNumber) {
		genderratioBtn.click();
		passwordTxt.sendKeys(password);
		
		Select MakeDayslist=new Select(dayslist) ;
		Select MakeMonthslist=new Select(monthslist);
		Select MakeYearslist=new Select(yearslist);
		
		MakeDayslist.selectByValue(day);
		MakeMonthslist.selectByValue(month);
		MakeYearslist.selectByValue(year);
		
		newsletterCheckBox.click();
		SpecialOffersCheckBox.click();
		
		firstNameTxt.sendKeys(firstName);
		lastNameTxt.sendKeys(LastName);
		companyTxt.sendKeys(company);
		addressTxt1.sendKeys(address1);
		addressTxt2.sendKeys(address2);
		
		
		Select MakecountryList=new Select (countrylist);
		MakecountryList.selectByValue(country);
		
		statetxt.sendKeys(State);
		citytxt.sendKeys(city);
		zipcodetxt.sendKeys(zipCode);
		mobilenumberTxt.sendKeys(phoneNumber); 
		
		
	CreateAccountbtn.click();

	}
	
	public void continueAccount() {
		
		ContinueBtn.click();
		
	}
	
    public void DleteAccount() {
		
    	navBarList.get(4).click();
		
	}
	

}
