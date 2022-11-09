package Tescases;

import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import javax.swing.JList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class druver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/YABER-V6-Bluetooth-Projector-1920%C3%971080P/dp/B08K2X9TG1/ref=psdc_1389375031_t1_B09Y8QL8KJ");
		Select s1 =new Select(driver.findElement(By.id("quantit")));
		 List<WebElement> list=s1.getOptions();
		 for(int i =0; i<list.size() ; i++){
	         String options1 = list.get(i).getText();
	         System.out.println(options1);
	      }
		 s1.selectByValue("4");
		 s1.selectByIndex(2);
		 s1.selectByVisibleText("5");
		
	}

}
