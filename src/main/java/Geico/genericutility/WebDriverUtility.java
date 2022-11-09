package Geico.genericutility;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * this class contains webdriver generic specific methods 
 * @author RAKI
 *
 */

public class WebDriverUtility {
	public Select select;
	/**
	 * this method wait for 20 second for page loading
	 * @param driver
	 */
	
	   public void waitUntilPageLoad(WebDriver driver)
	   {
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
	   }
	   
	   /**
	    * This method wait for the element to be visible
	    * @param driver
	    * @param element
	    */
	   
	   public void waitForElementVisibility(WebDriver driver,WebElement element)
	   {
		  WebDriverWait wait = new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.visibilityOf(element));
	   }
	   
	   /**
	    * This method wait for the element to be clicked , its custom wait created to avoid elemenInterAceptable Exception
	    * @param element
	    * @throws InterruptedException
	    */
	   
	   public void waitAndClick(WebElement element) throws InterruptedException
	   {
		   int count = 0;
	       while(count<20) {
		    	   try {
		    	       element.click();
		    	       break;
		    	   }catch(Throwable e){
		    		   Thread.sleep(1000);
		    		   count++;
		    	   }
	       }
	       
	   }
	   /**
	    * This method is used to intialize the select class
	    * @param element
	    */
	   public void intializeSelect(WebElement element) {
	   	
	   	select = new Select(element);
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

	   
	   /**
	    * This method will perform mouse over action
	    * @param driver
	    * @param element
	    */
	   public void mouseOver(WebDriver driver,WebElement element)
	   {
		   Actions act = new Actions(driver);
		   act.moveToElement(element).perform();
		   
	   }
	   
	   /**
	    * This method performs right click operation 
	    * @param driver
	    * @param element
	    */
	   
	   public void rightClick(WebDriver driver,WebElement element)
	   {
		   Actions act = new Actions(driver);
		   act.contextClick(element).perform();
	   }
	   
	   /**
	    * This method helps to switch from one window to another
	    * @param driver
	    * @param partialWinTitle
	    */
	   public void switchToWindow(WebDriver driver, String Text)
	   {
		   Set<String> sessionsIDs = driver.getWindowHandles();
			for(String id:sessionsIDs)
			{
				driver.switchTo().window(id);
				if(driver.getTitle().contains(Text))
				{
					break;
				}
			}
	   }

		   
		   /**
		    * Accept alert
		    * @param driver
		    */
		   public void acceptAlert(WebDriver driver)
		   {
			   driver.switchTo().alert().accept();
		   }
		   
		   /**
		    * cancel alert
		    * @param driver
		    */
		   public void cancelAlert(WebDriver driver)
		   {
			   driver.switchTo().alert().dismiss();
		   }
		   
		   
		   /**
		    * This method used for scrolling action in a webpage
		    * @param driver
		    * @param element
		    */
		   public void scrollToWebElement(WebDriver driver, WebElement element) {
			   JavascriptExecutor js=(JavascriptExecutor)driver;
			  int y= element.getLocation().getY();
			   js.executeScript("window.scrollBy(0,"+y+")", element);
		   }
		   
		   public void switchFrame(WebDriver driver,int index) {
		    	driver.switchTo().frame(index);
		    }   
		    
		    public void switchFrame(WebDriver driver,WebElement element) {
		    	driver.switchTo().frame(element);
		    } 
			
		    public void switchFrame(WebDriver driver,String idOrName) {
		    	driver.switchTo().frame(idOrName);
		    }
		    
		    
		    public void takeScreenshot(WebDriver driver, String screenshotName) throws Throwable {
		    	TakesScreenshot ts=(TakesScreenshot)driver;
		    	File src=ts.getScreenshotAs(OutputType.FILE);
		    	File dest=new File("./screenshot/"+screenshotName+".PNG");
		    	Files.copy(src, dest);
		    }
		    
		    /**
		     * pass enter Key appertain in to Browser
		     * @param driver
		     */
		    public void passEnterKey(WebDriver driver) {
		 	   Actions act = new Actions(driver);
		 	   act.sendKeys(Keys.ENTER).perform();
		    }
		    	

}
