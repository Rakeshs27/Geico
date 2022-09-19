package Geico.pomLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	public Address(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='name=\"autocomplete\"']")
	private WebElement Adressfield;
	

	@FindBy(xpath="//input[@id='Id_GiveZip_80302']")
	private WebElement zipfield;
	
	@FindBy(xpath="//button[@id='Id_Next_65063Button']/..")
	private WebElement AddressNext;
	

	public WebElement getAdressfield() {
		return Adressfield;
	}

	public WebElement getzipfield() {
		return zipfield;
	}

	public WebElement getAddressNext(){
		return AddressNext;
	}
}
