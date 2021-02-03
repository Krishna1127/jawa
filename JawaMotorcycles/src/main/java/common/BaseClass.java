package common;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import mainTestcases.LoginTestcase;
import pages.Accountpage;
import pages.BookaTestdrive;
import pages.Emicalculator;
import pages.HomePage;
import pages.Jawa_Product_Page;
import pages.Login;
import pages.Mediaspotlight;
import pages.MenuOptions;
import pages.Perak_Product_Page;
import pages.Product_FortyTwo;
import pages.Specifications;


public class BaseClass {
	public static AndroidDriver<MobileElement> driver ;
	public static String apkname;
	
	 protected static AppiumHelper helper=new AppiumHelper();
	 protected static   Login loginpage=new Login();
	 protected static LoginTestcase loginp=new LoginTestcase();
	 protected static MenuOptions menu=new MenuOptions();
	 protected static HomePage home=new HomePage();
	 protected static Emicalculator Emi=new Emicalculator();
	 protected static BookaTestdrive testdrive=new BookaTestdrive();
	 protected static Mediaspotlight mediaspotlight=new Mediaspotlight();
	 protected static Accountpage account=new Accountpage();
	 protected static Perak_Product_Page perak=new Perak_Product_Page();
	 protected static Product_FortyTwo fortytwo=new Product_FortyTwo();
	 protected static Jawa_Product_Page jawa=new Jawa_Product_Page();
	 protected static Specifications tech_specifications=new Specifications();
	 
	 public static String URL="http://stage.jawamotorcycles.com";
		
	
	   static AppiumDriverLocalService service;
	   static String service_url;
	  
		   	   
	   @BeforeSuite
	  
	public void setUp() throws IOException{
	
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability(CapabilityType.BROWSER_NAME,"");
		
		
	//	Hema
		//caps.setCapability(MobileCapabilityType.UDID, "3c5c437");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel XL API 28 2");
		//caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
	
//caps.setCapability(MobileCapabilityType.APP, getLatestFilefromDir(folder).getAbsolutePath());
		

	//	caps.setCapability("noReset", "false");
		caps.setCapability("fullReset","false"); 
		caps.setCapability("unicodeKeyboard", "true");
		caps.setCapability("automationName", "UiAutomator2");
		//caps.setCapability("browserName", "Chrome");
		caps.setCapability("autoGrantPermissions",true);
		caps.setCapability("appPackage","com.android.chrome");
		caps.setCapability("appActivity","com.google.android.apps.chrome.Main");
	//	driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		
		//Set ChromeDriver location
	//	System.setProperty("webdriver.chrome.driver","C:\\selenium_drivers\\chromedriver.exe");
		
		//Instantiate Appium Driver
			
				try {
					driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
					
				} catch (MalformedURLException e) {
					System.out.println(e.getMessage());
				}
				driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);	
				//Open URL in Chrome Browser
				driver.get(URL);
				
	}

	  
@AfterClass
public void TestcaseEnd() {
	Reporter.log("==================================================================================================");
	
}


	@AfterSuite
	public void tearDown() throws InterruptedException, IOException {
	Thread.sleep(2000);
		//RemoveFile();
		
		driver.quit();
		Reporter.log("========Testcase ========"+driver.getClass().getSimpleName()+"====== Ended ========");
		Reporter.log("===================   ==================    =======================   =====================");
		//service.stop();
		 // service.stop();
	}
	public static void TakeScreenShot(AndroidDriver<MobileElement> driver,String FileName) throws IOException{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,new File("./ScreenShots/"+FileName+".png"));
	}
	
	

	




}
