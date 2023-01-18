/**
 * 
 */
package Tescases;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Geico.genericutility.WebDriverUtility;
/**
 * @author Admin
 *
 */
public class Dropdownlist {
	public static WebDriver driver;
	@Test
	public void Dopdownlist() throws Throwable{
		 driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/select-menu");
		 driver.manage().window().maximize();
		 WebDriverUtility String=new WebDriverUtility();
		// this is my github
		/* Select s = new Select(driver.findElement(By.id("oldSelectMenu")));
		   // String.select(dp1, "Red");
		    List<WebElement> list=s.getOptions();
		      int size = list.size();
		      for(int i =0; i<size ; i++){
		         String options = list.get(i).getText();
		         System.out.println(options);
		      }
		      for(WebElement option : list){
		          if(option.getText().equals("Black")) {
		              option.click();
		              break;
		          }
		      } */
		 JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,300)");
			
			WebElement mySelectElement = driver.findElement(By.xpath("//div[text()='Select Title']"));
			Select dropdown= new Select(mySelectElement);
			dropdown.selectByVisibleText("Blue");
					
		      Select s1 = new Select(driver.findElement(By.xpath("//div[text()='Select...']")));
			   
			      List<WebElement> list1=s1.getOptions();
			      int size1 = list1.size();
			      for(int i =0; i<size1 ; i++){
			         String options1 = list1.get(i).getText();
			         System.out.println(options1);
			      }
			      for(WebElement option1 : list1){
			          if(option1.getText().equals("Blu")) {
			          option1.click();
			          break;
			          }
			      }
		   //   driver.quit();
		    
}
}
