package Tescases;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Geico.genericutility.BaseClass;
import Geico.genericutility.WebDriverUtility;
import Geico.pomLib.Address;
import Geico.pomLib.DateofBirth;
import Geico.pomLib.Tellusaboutyourself;
import Geico.pomLib.Vehicle;

public class Createpolicy extends BaseClass{



@Test
	public  void TC01() throws Throwable {
	
	String DOB = fLib.getPropertyKeyValue("dob");
	String FN = fLib.getPropertyKeyValue("Fn");
	String LN = fLib.getPropertyKeyValue("Ln");
	String Zipp = fLib.getPropertyKeyValue("zip");
	String Address = fLib.getPropertyKeyValue("address");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//DOB Page
	DateofBirth Dob = new DateofBirth(driver);
	Dob.getDate().sendKeys(DOB);
	Dob.getDateNext().click();
	
	//customer info page
	Tellusaboutyourself FnLn= new Tellusaboutyourself(driver);
	FnLn.getFirstName().sendKeys(FN);
	FnLn.getLastName().sendKeys(LN);
	FnLn.getYourselfNext().click();
	
	//adress page
	Address adresspage=new Address(driver);
	adresspage.getAdressfield().sendKeys(Address);
	adresspage.getzipfield().sendKeys(Zipp);
	adresspage.getAddressNext().click();
	
	//vehiclinfo
	Vehicle vehicle=new Vehicle(driver);
	vehicle.select(vehicle.getyear(), 1);
	vehicle.select(vehicle.getMake(), 1);
	vehicle.select(vehicle.getmodel(), 1);
	vehicle.getvehicleNext();
	String expmsg = "Is your 2023 Acura ILX owned, financed, or leased?";
	Assert.assertEquals(expmsg, vehicle.getmsg());
	System.out.println(vehicle.getmsg());
	
}
}
