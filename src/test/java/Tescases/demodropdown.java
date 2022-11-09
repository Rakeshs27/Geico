package Tescases;

import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Geico.genericutility.BaseClass;
import Geico.genericutility.WebDriverUtility;
import org.openqa.selenium.chrome.ChromeDriver;

public class demodropdown  extends BaseClass {
	public static WebDriver driver;
	
	public static void main(String[] args){
		
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/select-menu");
		    driver.manage().window().maximize();
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    WebDriverUtility String=new WebDriverUtility();
		  // This step will result in an alert on screen
		    WebElement dp1 = driver.findElement(By.id("oldSelectMenu"));
		    String.select(dp1, "Red");
		    WebElement dp2= driver.findElement(By.xpath("//div[text()='Select...']"));
		    //String.select(dp2, "Red" );
		    
		    Select s=new Select(dp2);
		      //get options of dropdown in list
		    List<WebElement> l = s.getOptions();
		      System.out.println("Options are: ");
		      for (WebElement i:l){
		         System.out.println(i.getText());}
		    
		    driver.quit();
	}

}
