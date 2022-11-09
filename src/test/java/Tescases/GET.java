package Tescases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GET {
	public static WebDriver driver;
	@Test
	public void get()  throws Throwable {
    ChromeDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
    //WebElement ele=driver.findElement(By.xpath("//span[text()='Buttons']"));
    //JavascriptExecutor js=(JavascriptExecutor)driver;
    //js.executeScript("arguments[0].click()", ele);
   System.out.println(driver.getWindowHandle());
   driver.findElement(By.id("tabButton")).click();
   Thread.sleep(10000);
   String a=driver.getWindowHandle();
   Set<String> s=driver.getWindowHandles();
   System.out.println(s);
   for(String wid:s) {
	   driver.switchTo().window(wid);
	   System.out.println(driver.getCurrentUrl());
   }
   driver.close();
   driver.switchTo().window(a);
   System.out.println("Current wid"+driver.getCurrentUrl());
   driver.quit();	
}
}
