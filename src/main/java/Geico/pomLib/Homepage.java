package Geico.pomLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	public Homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Menu']")
	private WebElement Menu;
	
	@FindBy(xpath="//a[text()='Insurance']")
	private WebElement Insurance;
	
	@FindBy(xpath = "//h3[text()='Vehicle Insurance']/..")
	private WebElement Vehicle;

	@FindBy(xpath="//span[text()='Auto']")
	private WebElement Auto;
	
	public WebElement getMenu() {
		return Menu;
	}

	public WebElement getInsurance() {
		return Insurance;
	}

	public WebElement getVehicle(){
		return Vehicle;
	}
	public WebElement getAuto(){
		return Auto;
	}

	public void HomePage() {
//		Actions action = new Actions(driver);
		//action.moveToElement(Account).perform();
		Menu.click();
		Insurance.click();
		Vehicle.click();
		 Auto.click();
	 }
}
