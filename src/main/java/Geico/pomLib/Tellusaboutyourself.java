package Geico.pomLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tellusaboutyourself {
	
	public Tellusaboutyourself(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@aria-label='First Name']")
	private WebElement FirstName;
	

	@FindBy(xpath="//input[@aria-label='Last Name']")
	private WebElement LastName;
	
	@FindBy(xpath="//button[@type='submit' or @id='Id_Next_12554Button']")
	private WebElement YourselfNext;
	

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getYourselfNext(){
		return YourselfNext;
	}
}
