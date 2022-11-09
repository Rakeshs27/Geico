/**
 * 
 */
package Tescases;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import org.testng.annotations.DataProvider;


public class flipkart {
	public static WebDriver driver;
	
	 @DataProvider(name = "testData", parallel=true)
    public Object[][] dataProvFunc() {
          return new Object[][] {           
              {"","","Username cannot be empty"},        
              {"","Test","Username cannot be empty"},
              {"$%1234","2345%$","Invalid credentials"}          
            };
       }
   }