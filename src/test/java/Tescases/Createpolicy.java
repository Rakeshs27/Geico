package Tescases;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import Geico.genericutility.BaseClass;
import Geico.genericutility.JavaUtility;
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
	/*DateofBirth Dob = new DateofBirth(driver);
	Dob.getDate().sendKeys(DOB);
	Dob.getDateNext().click();
	
	//customer info page
	Tellusaboutyourself FnLn= new Tellusaboutyourself(driver);
	JavaUtility names=new JavaUtility();
	FnLn.getFirstName().sendKeys(FN);
	FnLn.getLastName().sendKeys(LN);
	FnLn.getYourselfNext().click();
	driver.wait(10);
	
	//adress page
	Address adresspage=new Address(driver);
	adresspage.getAdressfield().sendKeys(Address);
	adresspage.getzipfield().sendKeys(Zipp);
	adresspage.getAddressNext().click();
	
	//vehiclinfo
	Vehicle vehicle=new Vehicle(driver);
	WebDriverUtility String =new WebDriverUtility();
	String.select(vehicle.getyear(), 1);
	String.select(vehicle.getyear(), 1);
	String.select(vehicle.getMake(), 1);
	String.select(vehicle.getmodel(), 1);
	vehicle.getvehicleNext();
	String expmsg = "Is your 2023 Acura ILX owned, financed, or leased?";
	Assert.assertEquals(expmsg, vehicle.getmsg());
	System.out.println(vehicle.getmsg()); */
	
}
}
