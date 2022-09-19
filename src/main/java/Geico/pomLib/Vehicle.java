package Geico.pomLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Geico.genericutility.WebDriverUtility;

public class Vehicle {
	public Vehicle(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@id=\"Id_GiveYear_10728\"]")
	private WebElement year;
	

	@FindBy(xpath="//select[@id=\"Id_GiveMake_40671\"]")
	private WebElement Make;
	
	@FindBy(xpath="//select[@id=\"Id_GiveModel_53438\"]")
	private WebElement model;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement vehicleNext;
	
	@FindBy(xpath="//span[text()='Is your 2023 Acura ILX owned, financed, or leased?']")
	private WebElement msg;

	public WebElement getyear() {
		return year;
	}

	public WebElement getMake() {
		return Make;
	}

	public WebElement getmodel(){
		return model;
	}
	public WebElement getvehicleNext(){
		return vehicleNext;
	}
	
	public WebElement getmsg(){
	return msg;
}
	/**
	    * this methods enables user to handle dropdown using visible text
	    * @param element
	    * @param option
	    */
	   public void select(WebElement element, String option)
	   {
		   Select select=new Select(element);
		   select.selectByVisibleText(option);
		   
	   }
	   
	   /**
	    * this methods enables user to handle dropdown using index
	    * @param element
	    * @param index
	    */
	   
	   public void select(WebElement element, int index)
	   {
		   Select select=new Select(element);
		   select.selectByIndex(index);   
	   }
}
