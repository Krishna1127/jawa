/**
 * 
 */
package pages;

import org.openqa.selenium.NoSuchElementException;

import common.AppiumHelper;
import common.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author Hema Sumanjali
 *
 */
public class HomePage {
	protected static AppiumHelper helper = new AppiumHelper();
	public static String overtheyears="//android.view.View[@text='#OVERTHEYEARS']";
	public static String jawarig="//android.view.View[@text='the jawa rig']";
	public static String riderensemble="//android.view.View[@text='rider ensemble']";
	public static String back="//android.view.View[@text='back']";
	public static String financeoffer="//android.view.View[@text='FINANCE OFFERS']";
	
	
	
public void validate_jawasonroad(AndroidDriver<MobileElement> driver) throws Exception {
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	try {
		helper.clickOnElementByXpath(driver, overtheyears);
	}
	catch(NoSuchElementException e) {
		helper.scrollUp(driver);
		helper.clickOnElementByXpath(driver, overtheyears);
				
	}
	try {
	BaseClass.driver.findElementByXPath("//android.view.View[@text='legacy']");
	System.out.println("when click on overtheyears  in home page, page is navigated to overtheyears page successfully");
	helper.clickOnElementByXpath(driver, back);
	
}
catch(NoSuchElementException e) {
	System.err.println("when click on overtheyears  in home page,  page is not navigated to  overtheyears  page ");
}
	
	helper.clickOnElementByXpath(driver, back);
	}
	
	
	
public void validate_thejawarig(AndroidDriver<MobileElement> driver) throws Exception {
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	try {
		helper.clickOnElementByXpath(driver, jawarig);
	}
	catch(NoSuchElementException e) {
		helper.scrollUp(driver);
		helper.clickOnElementByXpath(driver, jawarig);
				
	}
	try {
	BaseClass.driver.findElementByXPath("//android.view.View[@text='the jawa rig']");
	System.out.println("when click on the jawa rig  in home page, page is navigated to the jawa rig page successfully");
	
}
catch(NoSuchElementException e) {
	System.err.println("when click on the jawa rig  in home page,  page is not navigated to  the jawa rig  page ");
}
	helper.clickOnElementByXpath(driver, back);
	}
	
public void validate_riderensemble(AndroidDriver<MobileElement> driver) throws Exception {
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	helper.clickOnElementByXpath(driver, riderensemble);
	
	try {
	BaseClass.driver.findElementByXPath("//android.view.View[@text='rider ensemble']");
	System.out.println("when click on the rider ensemble  in home page, page is navigated to the rider ensemble page successfully");
	
}
catch(NoSuchElementException e) {
	System.err.println("when click on the rider ensemble  in home page,  page is not navigated to  the rider ensemble page ");
}
	helper.clickOnElementByXpath(driver, back);
	}
	
	
	
	
	public void Finaceoffer(AndroidDriver<MobileElement> driver,String Model,String state,String city,String Dealer,String Pannumber,String fullname,String profession,String salry,String address,String email,String mobilenumber) throws Exception {
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		
		MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[10]");
		el5.click();
		helper.clickOnElementByXpath(driver, "//android.widget.Spinner[@text='Select Model']");
		Thread.sleep(2000);
		helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='"+Model+"']");
		
		
		
		helper.clickOnElementByXpath(driver, "//android.widget.Spinner[@text='Select State']");
	
		helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='"+state+"']");
		Thread.sleep(2000);
		
		try {
			BaseClass.driver.findElementByXPath("//android.widget.Spinner[@text='"+state+"']");
			System.out.println("Selected State is dispalying in field");
		}
		catch(NoSuchElementException e) {
			System.out.println("Selected state is not dispalying in field");
		}
		
		helper.clickOnElementByXpath(driver, "//android.widget.Spinner[@text='Select City']");
		helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='"+city+"']");
		
		try {
			BaseClass.driver.findElementByXPath("//android.widget.Spinner[@text='"+city+"']");
			System.out.println("Selected city is dispalying in field");
		}
		catch(NoSuchElementException e) {
			
		}

		
		helper.clickOnElementByXpath(driver, "//android.widget.Spinner[@text='Select Dealer']");
		helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='"+Dealer+"']");
		
try {
	BaseClass.driver.findElementByXPath("//android.widget.Spinner[@text='"+Dealer+"']");
	System.out.println("Selected city is dispalying in field");
		}
		catch(NoSuchElementException e) {
			
		}
		
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Your PAN Number']");
		
		MobileElement ell = (MobileElement) driver.findElementByXPath("//android.view.View[@text='Enter Your PAN Number']//preceding-sibling::android.widget.EditText");
		ell.click();
		ell.sendKeys(Pannumber);
	

	if(ell.getText().equals(Pannumber)) {
		System.out.println("entered  pannumber is dispalying in field");
	}else {
		
	}
		
		
	
	
		
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Full Name']");
		
		
		helper.SendkeysByXpath(driver, "//android.view.View[@text='Enter Full Name']//preceding-sibling::android.widget.EditText", fullname);

		
helper.scrollUp(driver);

		helper.clickOnElementByXpath(driver, "//android.widget.RadioButton[@text='"+profession+"']");
		
		
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Salary(Per Month)']");
		helper.SendkeysByXpath(driver, "//android.view.View[@text='Salary(Per Month)']//preceding-sibling::android.widget.EditText", salry);

		
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Address Line 1']");
		helper.SendkeysByXpath(driver, "//android.view.View[@text='Address Line 1']//preceding-sibling::android.widget.EditText", address);
		
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Email']");
		helper.SendkeysByXpath(driver, "//android.view.View[@text='Enter Email']//preceding-sibling::android.widget.EditText", email);
		//helper.scrollUp(driver);
		helper.scrollUp(driver);
		System.out.println(mobilenumber);
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Mobile Number']");
		MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[11]/android.view.View[1]/android.widget.EditText");
		el6.sendKeys(mobilenumber);
	

	if(el6.getText().equals(mobilenumber)) {
			System.out.println("Sucessfully able to enter the mobile number ");
		}
	else {
		System.out.println("Entered mobile number is not dispalying in field");
	}
		
		helper.clickOnElementByXpath(driver, "//android.widget.Button[@text='SUBMIT APPLICATION']");
		
		try {
			AppiumHelper.FindElementByXpath(driver, "//android.view.View[@text='Enter OTP']");
			System.out.println("when click on submit it went to OTP step");
			
		}
		catch(NoSuchElementException e) {
		
			System.err.println("when click on submit unable to go next step");
			
		}

		//helper.clickOnElementByXpath(driver, financeoffer);
		
		
	}
	
	
	
	
}
