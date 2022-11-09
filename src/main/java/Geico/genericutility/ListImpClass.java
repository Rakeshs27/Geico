package Geico.genericutility;

import java.io.File;
import java.io.IOException;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListImpClass implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
	
		String testName = result.getMethod().getMethodName();
		System.out.println(testName + "====Execute & i am listening====");
		
		EventFiringWebDriver eDriver = new EventFiringWebDriver(BaseClass.sDriver);
		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./screenshots/"+testName+".png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}