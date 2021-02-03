/**
 * 
 */
package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;

import common.AppiumHelper;
import common.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author Hema Sumanjali
 *
 */
public class Emicalculator {
	protected static AppiumHelper helper = new AppiumHelper();
	
	
	
	public static String model="//android.widget.Spinner[@text='Select Model']";
	public static String kogotrails="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[12]/android.view.View[3]/android.view.View[1]";
	public static String IJYD2019="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[12]/android.view.View[3]/android.view.View[2]";
	public static String jawanomads="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[12]/android.view.View[3]/android.view.View[3]";
	
	public void loanamountcal(AndroidDriver<MobileElement> driver,String Model) throws Exception {
		
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		
		MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[11]");
		el5.click();
		BaseClass.driver.findElementByXPath(model).click();
		helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='JAWA Jawa']");
	//	BaseClass.driver.findElementByXPath(model).sendKeys("JAWA Jawa");
		String loanamount=BaseClass.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]").getText();
		System.out.println(loanamount);
		//BaseClass.driver.findElementByXPath(model).click();
		helper.clickOnElementByXpath(driver, "//android.widget.Spinner[@text='JAWA Jawa']");
		helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='JAWA Perak']");
		String loanamount1=BaseClass.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]").getText();
		System.out.println(loanamount1);
		if(loanamount.equals(loanamount1)) {
			System.err.println("when chnaged the models also loan amount is not changing");
		}else {
			System.out.println("when changed the models , loan amount is verying ");
		}
		
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='4']");
		String loanamount3=BaseClass.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]").getText();
		System.out.println(loanamount3);
		if(loanamount3.equals(loanamount1)) {
			System.err.println("when chnaged the Tenue also loan amount is not changing");
		}else {
			System.out.println("when changed the tenure , loan amount is verying ");
		}
		
	}

	
	
	

public void Menu_kommuniti_kogotrails_Navigations(AndroidDriver<MobileElement> driver) throws Exception {
	
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	

	
	BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	BaseClass.driver.findElementByXPath(kogotrails).click();
			

	//BaseClass.driver.findElementByXPath(MenuOptions.Motorcycles).click();
	BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	try {
		BaseClass.driver.findElementByXPath("//android.widget.Button[@text='GET KOGO']");
	
		System.out.println("when click on kogotrails  from Menu, page is navigated to kogotrails page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on kogotrails from Menu, page is not navigated to kogotrails page ");
	}
	BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	BaseClass.driver.findElementByXPath("//android.view.View[@text='HOME']").click();
	BaseClass.driver.findElementByXPath("//android.view.View[@text='HOME']").click();
}

public void Menu_kommuniti_Ijyd2019_Navigations(AndroidDriver<MobileElement> driver) throws Exception {
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	BaseClass.driver.findElementByXPath(IJYD2019).click();
			
	Thread.sleep(1000);
	
	
	try {
		BaseClass.driver.findElementByXPath("//android.view.View[@text='17th international jawa yezdi day. july 14th, 2019.']");
	
		System.out.println("when click on Ijyd2019  from Menu, page is navigated to Ijyd2019 page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on Ijyd2019 from Menu, page is not navigated to Ijyd2019 page ");
	}
	BaseClass.driver.findElementByXPath("//android.view.View[@text='back']").click();
	BaseClass.driver.findElementByXPath("//android.view.View[@text='back']").click();
}

public void Menu_kommuniti_jawanomads_Navigations(AndroidDriver<MobileElement> driver) throws Exception {
	
	
	
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	
	BaseClass.driver.findElementByXPath(jawanomads).click();
	//BaseClass.driver.findElementByXPath(MenuOptions.jawanomads).click();	
	Thread.sleep(1000);
	
	try {
		BaseClass.driver.findElementByXPath("//android.view.View[@text='jawa nomads']");
	
		System.out.println("when click on jawanomads  from Menu, page is navigated to jawanomads page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on jawanomads from Menu, page is not navigated to jawanomads page ");
	}
	
}

public void EmiCalculation(AndroidDriver<MobileElement> driver) throws Exception {
	
	
	BaseClass.driver.findElementByXPath(model).click();
	helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='JAWA Jawa']");
//	BaseClass.driver.findElementByXPath(model).sendKeys("JAWA Jawa");
	String loanamount=BaseClass.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]").getText();
	System.out.println(loanamount);
	//BaseClass.driver.findElementByXPath(model).click();
	helper.clickOnElementByXpath(driver, "//android.widget.Spinner[@text='JAWA Jawa']");
	helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='JAWA Perak']");
	String loanamount1=BaseClass.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]").getText();
	System.out.println(loanamount1);
	if(loanamount.equals(loanamount1)) {
		System.err.println("when chnaged the models also loan amount is not changing");
	}else {
		System.out.println("when changed the models , loan amount is verying ");
	}
	
	helper.clickOnElementByXpath(driver, "//android.view.View[@text='4']");
	String loanamount3=BaseClass.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]").getText();
	System.out.println(loanamount3);
	if(loanamount3.equals(loanamount1)) {
		System.err.println("when chnaged the Tenue also loan amount is not changing");
	}else {
		System.out.println("when changed the tenure , loan amount is verying ");
	}
	
}

}
