package Tescases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Geico.genericutility.BaseClass;
import Geico.genericutility.WebDriverUtility;

import Geico.genericutility.BaseClass;

public class democheckboxradiotable  extends BaseClass {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable  {
		driver= new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/alerts");
		 driver.manage().window().maximize(); 
		
		 //checkbox
		 WebElement checkbox = driver.findElement(By.id("item-1"));
		 js.executeScript("arguments[0].click()", checkbox);
		// driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button/svg")).click();
		 //driver.findElement(By.xpath("//span[text()='Desktop']")).click();
		 driver.findElement(By.xpath("//span[text()='Home']")).click();
		 //driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button/svg/path")).click();
		 System.out.println(driver.findElement(By.id("result")).getText());
		System.out.println("1 "+driver.findElement(By.className("main-header")).getText());
		
		//radio button
		WebElement button = driver.findElement(By.id("item-2"));
		 js.executeScript("arguments[0].click()", button);
		 driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
		 System.out.println(driver.findElement(By.xpath("//p[@class='mt-3']")).getText());
		System.out.println("2 "+driver.findElement(By.className("main-header")).getText());
		
		//table
		WebElement table =driver.findElement(By.id("item-3"));
		 js.executeScript("arguments[0].click()", table);
		 System.out.println(driver.findElement(By.xpath("//div[text()='kierra@example.com']/parent::div[@class='rt-tr -odd']/parent::div[@class='rt-tr-group'] | //div[text()='kierra@example.com']/parent::div[@class='rt-tr -even']/parent::div[@class='rt-tr-group']")).getText());
		// driver.findElement(By.xpath("//*[@id=\"delete-record-2\"]/svg")).click();
		System.out.println("3 "+driver.findElement(By.className("main-header")).getText());
			
		driver.close();
}
}
