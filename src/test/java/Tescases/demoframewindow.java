package Tescases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Geico.genericutility.BaseClass;
import Geico.genericutility.WebDriverUtility;

public class demoframewindow extends BaseClass {
	public static WebDriver driver;
	
	@Test
	public  void framewindow() throws Throwable  {
		 driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/alerts");
		 driver.manage().window().maximize();
		  // This step will result in an alert on screen
		    driver.findElement(By.id("alertButton")).click();
		    Alert simpleAlert = driver.switchTo().alert();
		    simpleAlert.accept();
		 // It will return the parent window name as a String
		    String parent=driver.getWindowHandle();
		    System.out.println("1 "+parent);
		    
		    WebElement window = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", window);
			Thread.sleep(5000);

		    driver.findElement(By.id("tabButton")).click();
		    WebDriverUtility String=new WebDriverUtility();
		    String.switchToWindow(driver, "This is a sample page");
		    System.out.println("2 "+driver.findElement(By.id("sampleHeading")).getText());
		    driver.close();
		    driver.switchTo().window(parent);
		    System.out.println("3 "+driver.findElement(By.className("main-header")).getText());
		    
		    driver.findElement(By.id("windowButton")).click();
		    WebDriverUtility String1=new WebDriverUtility();
		    String1.switchToWindow(driver, "This is a sample page");
		    System.out.println("2.1 "+driver.findElement(By.id("sampleHeading")).getText());
		    driver.close();
		    driver.switchTo().window(parent);
		    System.out.println("3.1 "+driver.findElement(By.className("main-header")).getText());
		    
		    WebElement frame =  driver.findElement(By.xpath("//span[text()='Frames']"));
		    js.executeScript("arguments[0].click()", frame);
		    String.switchFrame(driver,"frame1");
		    System.out.println("4 "+driver.findElement(By.id("sampleHeading")).getText());
		    driver.switchTo().window(parent);
		    System.out.println("5 "+driver.findElement(By.className("main-header")).getText());
		    driver.close();
		    driver.quit();
	}
}
