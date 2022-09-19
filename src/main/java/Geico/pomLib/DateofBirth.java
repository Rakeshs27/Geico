package Geico.pomLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DateofBirth {

	@FindBy(xpath = "//input[@class='date']")
	private WebElement Date;

	@FindBy(xpath="//button[@type='submit' or @id='Id_GiveDateOfBirth_38359Button']")
	private WebElement DateNext;
	
	public DateofBirth(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public WebElement getDate() {
		return Date;
	}

	public WebElement getDateNext() {
		return DateNext;
	}
}
