package Geico.pomLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZipPage {

	
	public ZipPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='zip']")
	private WebElement Zipfield;

	@FindBy(xpath="//input[@id='submit']")
	private WebElement Reviewyourquote;
	
	public WebElement getZipfield() {
		return Zipfield;
	}

	public WebElement getReviewyourquote() {
		return Reviewyourquote;
	}
	
	public void zipcode(String zip) {
//		Actions action = new Actions(driver);
		//action.moveToElement(Account).perform();
		Zipfield.sendKeys(zip);
		Reviewyourquote.click();
		
	 }
}
