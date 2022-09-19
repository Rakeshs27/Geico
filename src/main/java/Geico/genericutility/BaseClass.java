package Geico.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import Geico.pomLib.Homepage;
import Geico.pomLib.ZipPage;
import Geico.pomLib.capturedata;

public class BaseClass {
	
		public WebDriver driver;
		public static WebDriver sDriver;
		
		  /*Object Creation for Lib*/
			
			public JavaUtility jLib = new JavaUtility();
			public WebDriverUtility wLib = new WebDriverUtility();
			public FileUtility fLib = new FileUtility();
			public ExcelUtility eLib = new ExcelUtility();
		
		@BeforeSuite
		public void configBS() {
			System.out.println("========================connect to DB========================");
		}
		
//		@Parameters("BROWSER")
//		@BeforeClass
//		public void configBC(String BROWSER) {
//		
//			
//			System.out.println("=============Launch the Browser=======");
//			if(BROWSER.equals("chrome")) {
//			driver = new ChromeDriver();
//			}else if(BROWSER.equals("firefox")){
//				driver = new FirefoxDriver();
//			}else if(BROWSER.equals("opera")){
//			driver = new OperaDriver();
//			}else {
//				System.out.println("browser not found");
//			}
//     		wLib.waitUntilPageLoad(driver);
//			driver.manage().window().maximize();
//			
//		}
		
	
		@BeforeClass
		public void configBC() {
			driver= new ChromeDriver();
     		wLib.waitUntilPageLoad(driver);
			driver.manage().window().maximize();
			
		}
		
		@BeforeMethod
		public void configBM() throws Throwable {
			/*common Data*/
			sDriver = driver;
			String Zipp = fLib.getPropertyKeyValue("zip");
			String Address = fLib.getPropertyKeyValue("address");
			String URL = fLib.getPropertyKeyValue("url");
			String BROWSER = fLib.getPropertyKeyValue("browser");
			String Email = fLib.getPropertyKeyValue("email");
			String Phnu = fLib.getPropertyKeyValue("phnu");
			String Dob = fLib.getPropertyKeyValue("dob");
			String FN = fLib.getPropertyKeyValue("Fn");
			String LN = fLib.getPropertyKeyValue("Ln");
			
			/* Navigate to app*/
			   driver.get(URL);
			  
			   /* step 2 : Enter homepage */
			 Homepage NavigateTohome = new Homepage(driver);
			 NavigateTohome.HomePage();
			   
		       // step 2 : Zippage 
			   ZipPage NavigateTozippage = new ZipPage(driver);
		        NavigateTozippage.zipcode(Zipp);
		}
		
		
		@AfterMethod
		public void configAM() {
		      /*step 6 : capture*/
	//	capturedata data = new capturedata(driver);
	//       data.logOut();
		}
		
		@AfterClass
		public void configAC() {
			System.out.println("=============Close the Browser=======");
		driver.quit();
		}
		
		@AfterSuite
		public void configAS() {
			System.out.println("========================close DB========================");
		}
	}



