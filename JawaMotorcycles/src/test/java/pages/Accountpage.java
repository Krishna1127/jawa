/**
 * 
 */
package pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;

import common.AppiumHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author Hema Sumanjali
 *
 */
public class Accountpage {
	protected static AppiumHelper helper = new AppiumHelper();
	
	public static String login="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[23]/android.view.View[1]/android.widget.ListView/android.view.View[7]/android.view.View";
	public static String sign="Don't have an account? Sign up";
	public static String signup="//android.view.View[@text=\"Don't have an account? Sign up\"]";
	public static String signupbutton="//android.widget.Button[@text='SIGN UP']";
	public static String Entermobilenumber="//android.view.View[@text='Enter Mobile Number']//preceding-sibling::android.widget.EditText[@resource-id='signup-mobile-number']";
	public static String mobilenumber="//android.view.View[@text='Enter Mobile Number']";
	public static String Entername="//android.view.View[@text='Enter Name']//preceding-sibling::android.widget.EditText";
	public static String name="//android.view.View[@text='Enter Name']";
	public static String numberinotpscreen="sent_number";
	public static String verify="//android.widget.Button[@text='VERIFY']";
	
	public static String myaccount="//android.view.View[@text='My Account']";
	public static String viewmyorders="//android.widget.Button[@text='VIEW YOUR ORDER']";
	public static String noorders="//android.view.View[@text='there are no orders to show!']";
	public static String editprofile="//android.widget.Button[@text='Edit Profile']";
	
	public static String edit="//android.widget.Button[@text='Edit']";
	//public static String randomnum=AppiumHelper.randomnum();
	//public static String randnummobile=AppiumHelper.randomvalue();
	public static String OTP="9999";
	public static String logout="//android.view.View[@text='LOGOUT']";
	
	
	
	
	//	verification-timer
	
	
	
	//android.view.View[@resource-id='verify-otp-form']//android.widget.EditText[@text='digit-1']
	//android.widget.EditText[@text='digit-1']
	
	
	/*public void RandomValuesIntoExcel() throws FileNotFoundException, IOException {
		System.out.println(1);
		helper.SetInput("signup", 1, 1, randomnum);
		helper.SetInput("signup", 1, 2, randomnum);
	}*/
	
	
	public void account_signup(AndroidDriver<MobileElement> driver,String Mobilenumber,String StringName) {
		helper.clickOnElementByXpath(driver, login);
		helper.clickOnElementByXpath(driver, signup);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		helper.clickOnElementByXpath(driver, mobilenumber);
		helper.SendkeysByXpath(driver, Entermobilenumber, Mobilenumber);
		helper.clickOnElementByXpath(driver, name);
		helper.SendkeysByXpath(driver, Entername, StringName);
		//helper.clickOnElementByXpath(driver, mobilenumber);
		helper.SendkeysByXpath(driver, Entermobilenumber, Mobilenumber);
		
		helper.clickOnElementByXpath(driver, signupbutton);
		try {
		if(driver.findElementByXPath(verify).isDisplayed()) {
			System.out.println("when click on sign up after enter all details, screen is navigated to OTP screen sucessfully ");
		}}
		catch(NoSuchElementException e) {
			System.err.println("when click on sign up after enter all details, screen is navigated to OTP screen sucessfully ");
		}
		
		helper.clickOnElementByXpath(driver, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText[1]");
		driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText[1]").sendKeys(Character.toString(OTP.charAt(0)));
		//helper.SendkeysByXpath(driver, "//android.widget.EditText[@text='digit-1']", OTP.charAt(0));
		helper.clickOnElementByXpath(driver, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText[2]");
		driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText[2]").sendKeys(Character.toString(OTP.charAt(1)));
		helper.clickOnElementByXpath(driver, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText[3]");
		driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText[3]").sendKeys(Character.toString(OTP.charAt(2)));
		helper.clickOnElementByXpath(driver, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText[4]");
		driver.findElementByXPath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText[4]").sendKeys(Character.toString(OTP.charAt(3)));
		driver.findElementByXPath(verify).click();
		
	}
	
	public void validation_Myaccount(AndroidDriver<MobileElement> driver,String Mobilenumber,String Name) {
		
		try {
			driver.findElementByXPath("//android.view.View[@text='"+Mobilenumber+"']");
			System.out.println("After Signup is done, the given input Mobilenumber is updated in in my account page ");
		}
		catch(NoSuchElementException e) {
			System.err.println("After Signup is done, the given input Mobilenumber is not updated in in my account page ");
		}
		
		try {
			driver.findElementByXPath("//android.view.View[@text='"+Name+"']");
		
			System.out.println("After Signup is done, the given input Name is updated in in my account page ");
		}
		catch(NoSuchElementException e) {
			System.err.println("After Signup is done, the given input Name is not updated in in my account page ");
			System.out.println(Name);
		}
		
	}
	
	public void myorders(AndroidDriver<MobileElement> driver) throws InterruptedException {
		helper.clickOnElementByXpath(driver, viewmyorders);
		Thread.sleep(2000);
		
		try {
			driver.findElementByXPath(noorders);
			System.out.println("No orders available for this account login");
		}
		catch(NoSuchElementException e) {
			System.err.println("orders available for the first time login user which is wrong / or else page is not navigated to orders page");
		}
	}
	
	public void singout(AndroidDriver<MobileElement> driver) {
		
helper.clickOnElementByXpath(driver, logout);
helper.clickOnElementByXpath(driver, MenuOptions.menu);

		
		try {
			driver.findElementByXPath("//android.view.View[@text='LOGIN']");
			System.out.println("when click on logout , logout happened sucessfully");
		}
		catch(NoSuchElementException e) {
			System.err.println("when click on logout , logout not happened sucessfully");
		}
	}
}
