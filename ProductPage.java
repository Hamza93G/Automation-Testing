package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase {

	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
	WebElement productBtn;
	@FindBy(css="body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > h2")
	public WebElement AllproductsMsg;
	@FindBy(id="search_product")
	WebElement searchProductTxt;
	@FindBy(id="submit_search")
	WebElement submitSearchBtn;
	@FindBy(css="body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > h2")
	public WebElement SearchedproductsMsg;
	@FindBy(css="body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div.col-sm-4 > div > div.single-products > div.productinfo.text-center > p")
	public WebElement SelectedproductsTxt;
	@FindBy(css="body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div.col-sm-4 > div > div.single-products > div.productinfo.text-center > a")
	public WebElement AddToCardBTn;
	@FindBy(xpath="//*[@id=\"cartModal\"]/div/div/div[2]/p[1]")
	WebElement AlertMsg;
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
	WebElement CartBtn;
	
	@FindBy(css="#product-3 > td.cart_description > h4 > a")
	public WebElement productNameInCartpagetxt;
	
	public void OpenProductPage() {
		productBtn.click();
	}
	public void searchProduct(String ProductName) {
		searchProductTxt.sendKeys(ProductName);
		submitSearchBtn.click();
	}
	public void AddtoCart() {
		AddToCardBTn.click();
		
	}
	public void OPeningCartPage() {
		CartBtn.click();
	}
	

}
