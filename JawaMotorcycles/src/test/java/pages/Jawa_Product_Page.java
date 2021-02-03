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
public class Jawa_Product_Page {
	public static String OTP = "9999";

	protected static AppiumHelper helper = new AppiumHelper();

	public void clickonjawa(AndroidDriver<MobileElement> driver) throws Exception {
		Thread.sleep(2000);
		driver.findElementByXPath("//android.view.View[@text='sticky-fig']").click();
		Thread.sleep(3000);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		MobileElement el6 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]");
		el6.click();

	}

	public void exshowroompricecheck(AndroidDriver<MobileElement> driver, String CIty, String exshowroomprice)
			throws Exception {

		String str = new String(CIty);
		String cityinexchange = "    " + str;
		driver.findElementByXPath("//android.view.View[@text='Change']").click();

		// System.out.println(CIty);
		// System.out.println(driver.findElementByXPath("//android.widget.CheckedTextView[@text='"+cityinexchange+"']").getText());
		helper.ScrollToViewElement(driver, cityinexchange);
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='" + cityinexchange + "']").click();
		// helper.clickOnElementByXpath(driver,
		// "//android.widget.CheckedTextView[@text='"+cityinexchange+"')]");
		// driver.findElementByXPath("//android.widget.CheckedTextView[@text='"+CIty+"']").click();
		// clickonchange
		// driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[5]/android.view.View").click();
		MobileElement singlechannelprice = driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.RadioButton[1]");
		MobileElement doublechannelprice = driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.RadioButton[2]");
		// MobileElement price= (MobileElement)
		// driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[2]");

		String Perakrice = singlechannelprice.getText();
		// System.out.println(Perakrice);
		if (Perakrice.equals(exshowroomprice)) {
			System.out.println("Ex showroom price is dispalyed as expected for the ciy : " + CIty);
		} else {
			System.err.println("Ex showroom price is not dispalyed as expected for the ciy : " + CIty);
		}

	}

	public void video(AndroidDriver<MobileElement> driver) throws Exception {
		helper.scrollUp(driver);

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]")
				.click();

		try {
			driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[8]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Image[2]");
			System.out.println("when click on video , page is navigated to vedio section and video has Play button.");
		} catch (NoSuchElementException e) {
			System.err.println("when click on video , page is not navigated to vedio section .");
		}
		helper.clickOnElementByXpath(driver, HomePage.back);

		// helper.clickOnElementByXpath(driver, HomePage.back);
		driver.get("https://stage.jawamotorcycles.com/motorcycles/jawa");
		// helper.scrollUp(driver);
		// helper.scrollUp(driver);
		// helper.scrollUp(driver);
		Thread.sleep(2000);
		// Thread.sleep(3000);
		// MobileElement el6 = (MobileElement)
		// driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]");
		// el6.click();
		// helper.clickOnElementByXpath(driver, "//android.view.View[4]");
		// MobileElement el6 = (MobileElement)
		// driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]");
		// el6.click();
		Thread.sleep(2000);
	}

	public void gallary(AndroidDriver<MobileElement> driver) throws Exception {
		helper.scrollUp(driver);
		helper.clickOnElementByXpath(driver, "//android.widget.Button[@text='GALLERY']");
		helper.clickOnElementByXpath(driver, "//android.widget.Button[@text='GALLERY']");

		Thread.sleep(2000);

		Thread.sleep(2000);
		try {
			driver.findElementByXPath("//android.widget.Image[@text='Jawa Headlight']");
			System.out.println("when click on gallary , page is navigated to images section ");
		} catch (NoSuchElementException e) {
			System.err.println(
					"when click on gallary , page is not navigated to image section or expected image is not dispalyed in screen.");
		}
		driver.findElementByXPath("//android.widget.Image[@text='Jawa Headlight']").click();

		// click arrow to scroll image
		// helper.clickOnElementByXpath(driver,
		// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[3]/android.widget.Button[2]");
		helper.clickOnElementByXpath(driver, "//android.widget.Button[@text='Next']");
		Thread.sleep(2000);
		try {
			driver.findElementByXPath("//android.widget.Image[@text='Jawa Headlight']");
			System.err.println("when click on right arrow , image  is not  scrolled");
		} catch (NoSuchElementException e) {
			System.out.println("when click on right arrow , image  is   scrolled which is expected");
		}
		driver.findElementByXPath("//android.widget.Image[@text='Jawa Engine']").click();
		// click on close
		// helper.clickOnElementByXpath(driver,
		// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.widget.Button[3]");

		driver.get("https://stage.jawamotorcycles.com/motorcycles/jawa");
		Thread.sleep(2000);
	}

	public void view360(AndroidDriver<MobileElement> driver) throws Exception {
		helper.scrollUp(driver);
		helper.clickOnElementByXpath(driver, "//android.widget.Button[@text='360']");
		// driver.findElementByXPath("
		// /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.Button[1]").click();
		Thread.sleep(2000);
		try {
			driver.findElementByXPath("//android.view.View[@text='360 View']");
			System.out.println("when click on 360view , page is navigated to 360view section");
		} catch (NoSuchElementException e) {
			System.err.println("when click on 360view , page is not navigated to 360view section .");
		}
		// click on back
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]")
				.click();
	}

	public void perak_BookATestdrive(AndroidDriver<MobileElement> driver, String Model, String state, String city,
			String Dealer, String testride, String datefortestride, String fullname, String address, String email,
			String mobilenumber) throws Exception {

		/// hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[23]/android.widget.Button[1]
		MobileElement el5 = (MobileElement) driver
				.findElementByXPath("//android.widget.Button[@text='BOOK TEST RIDE']");
		el5.click();

		helper.clickOnElementByXpath(driver, "//android.widget.Spinner[@text='Select State']");

		helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='" + state + "']");
		Thread.sleep(2000);

		try {
			BaseClass.driver.findElementByXPath("//android.widget.Spinner[@text='" + state + "']");
			System.out.println("Selected State is dispalying in field");
		} catch (NoSuchElementException e) {
			System.out.println("Selected state is not dispalying in field");
		}

		helper.clickOnElementByXpath(driver, "//android.widget.Spinner[@text='Select City']");
		helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='" + city + "']");

		try {
			BaseClass.driver.findElementByXPath("//android.widget.Spinner[@text='" + city + "']");
			System.out.println("Selected city is dispalying in field");
		} catch (NoSuchElementException e) {

		}

		helper.clickOnElementByXpath(driver, "//android.widget.Spinner[@text='Select Dealer']");
		helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='" + Dealer + "']");

		try {
			BaseClass.driver.findElementByXPath("//android.widget.Spinner[@text='" + Dealer + "']");
			System.out.println("Selected dealer is dispalying in field");
		} catch (NoSuchElementException e) {

		}

		helper.scrollUp(driver);
		/*
		 * helper.clickOnElementByXpath(driver,
		 * "//android.view.View[@text='Enter Full Name']");
		 * 
		 * helper.SendkeysByXpath(driver,
		 * "//android.view.View[@text='Enter Full Name']//preceding-sibling::android.widget.EditText"
		 * , fullname);
		 */

		helper.clickOnElementByXpath(driver, "//android.widget.RadioButton[@text='" + testride + "']");

		helper.clickOnElementByXpath(driver, "//android.view.View[2]");
		helper.scrollUp(driver);
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Full Name']");

		helper.SendkeysByXpath(driver,
				"//android.view.View[@text='Enter Full Name']//preceding-sibling::android.widget.EditText", fullname);

		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Address Line 1']");
		helper.SendkeysByXpath(driver,
				"//android.view.View[@text='Address Line 1']//preceding-sibling::android.widget.EditText", address);

		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Email']");
		helper.SendkeysByXpath(driver,
				"//android.view.View[@text='Enter Email']//preceding-sibling::android.widget.EditText", email);
		// helper.scrollUp(driver);
		helper.scrollUp(driver);
		System.out.println(mobilenumber);
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Mobile Number']");

		helper.SendkeysByXpath(driver,
				"//android.view.View[@text='Enter Mobile Number']//preceding-sibling::android.widget.EditText",
				mobilenumber);
		/*
		 * MobileElement el6 = (MobileElement) driver.findElementByXPath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[11]/android.view.View[1]/android.widget.EditText"
		 * ); el6.sendKeys(mobilenumber);
		 */

		/*
		 * if (el6.getText().equals(mobilenumber)) {
		 * System.out.println("Sucessfully able to enter the mobile number "); } else {
		 * System.out.println("Entered mobile number is not dispalying in field"); }
		 */

		helper.clickOnElementByXpath(driver, "//android.widget.Button[@text='BOOK TEST RIDE']");

		try {
			AppiumHelper.FindElementByXpath(driver, "//android.view.View[@text='Enter OTP']");
			System.out.println("when click on submit it went to OTP step");

		} catch (NoSuchElementException e) {

			System.err.println("when click on submit unable to go next step");

		}

		helper.clickOnElementByXpath(driver,
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText[1]");

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText[1]")
				.sendKeys(Character.toString(OTP.charAt(0)));
		// helper.SendkeysByXpath(driver, "//android.widget.EditText[@text='digit-1']",
		// OTP.charAt(0));
		helper.clickOnElementByXpath(driver,
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText[2]");
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText[2]")
				.sendKeys(Character.toString(OTP.charAt(1)));
		helper.clickOnElementByXpath(driver,
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText[3]");
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText[3]")
				.sendKeys(Character.toString(OTP.charAt(2)));
		helper.clickOnElementByXpath(driver,
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText[4]");
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText[4]")
				.sendKeys(Character.toString(OTP.charAt(3)));
		driver.findElementByXPath("//android.widget.Button[@text='SUBMIT']").click();

		try {
			driver.findElementByXPath("//android.view.View[@text='SUCCESS']");
			System.out.println("Testdrive is successfully booked");
		} catch (NoSuchElementException e) {
			System.err.println("There is an error at book a test drive");
		}

		// helper.clickOnElementByXpath(driver, financeoffer);

	}

	public void finaceoffer(AndroidDriver<MobileElement> driver, String Model, String state, String city,
			String Dealer,String Pannumber, String fullname,String financeoffer, String salary, String address, String email,
			String mobilenumber) throws Exception {

		helper.clickOnElementByXpath(driver, "//android.widget.Spinner[@text='Select State']");

		helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='" + state + "']");
		Thread.sleep(2000);

		try {
			BaseClass.driver.findElementByXPath("//android.widget.Spinner[@text='" + state + "']");
			System.out.println("Selected State is dispalying in field");
		} catch (NoSuchElementException e) {
			System.out.println("Selected state is not dispalying in field");
		}

		helper.clickOnElementByXpath(driver, "//android.widget.Spinner[@text='Select City']");
		helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='" + city + "']");

		try {
			BaseClass.driver.findElementByXPath("//android.widget.Spinner[@text='" + city + "']");
			System.out.println("Selected city is dispalying in field");
		} catch (NoSuchElementException e) {

		}

		helper.clickOnElementByXpath(driver, "//android.widget.Spinner[@text='Select Dealer']");
		helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='" + Dealer + "']");

		try {
			BaseClass.driver.findElementByXPath("//android.widget.Spinner[@text='" + Dealer + "']");
			System.out.println("Selected dealer is dispalying in field");
		} catch (NoSuchElementException e) {

		}

		helper.scrollUp(driver);
	
		
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Your PAN Number']");

		helper.SendkeysByXpath(driver,
				"//android.view.View[@text='Enter Your PAN Number']//preceding-sibling::android.widget.EditText", Pannumber);
		
		
		
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Full Name']");

		helper.SendkeysByXpath(driver,
				"//android.view.View[@text='Enter Full Name']//preceding-sibling::android.widget.EditText", fullname);
		
			
		
		
		helper.clickOnElementByXpath(driver, "//android.widget.RadioButton[@text='" + financeoffer + "']");

	
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Salary(Per Month)']");

		helper.SendkeysByXpath(driver,
				"//android.view.View[@text='Salary(Per Month)']//preceding-sibling::android.widget.EditText", salary);
		
		helper.scrollUp(driver);
		

		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Address Line 1']");
		helper.SendkeysByXpath(driver,
				"//android.view.View[@text='Address Line 1']//preceding-sibling::android.widget.EditText", address);

		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Email']");
		helper.SendkeysByXpath(driver,
				"//android.view.View[@text='Enter Email']//preceding-sibling::android.widget.EditText", email);
		// helper.scrollUp(driver);
		helper.scrollUp(driver);
		System.out.println(mobilenumber);
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Mobile Number']");

		helper.SendkeysByXpath(driver,
				"//android.view.View[@text='Enter Mobile Number']//preceding-sibling::android.widget.EditText",
				mobilenumber);
	
		helper.clickOnElementByXpath(driver, "//android.widget.Button[@text='SUBMIT APPLICATION']");

		try {
			AppiumHelper.FindElementByXpath(driver, "//android.view.View[@text='Enter OTP']");
			System.out.println("when click on submit it went to OTP step");

		} catch (NoSuchElementException e) {

			System.err.println("when click on submit unable to go next step");

		}

		helper.clickOnElementByXpath(driver,
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText[1]");

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText[1]")
				.sendKeys(Character.toString(OTP.charAt(0)));
		// helper.SendkeysByXpath(driver, "//android.widget.EditText[@text='digit-1']",
		// OTP.charAt(0));
		helper.clickOnElementByXpath(driver,
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText[2]");
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText[2]")
				.sendKeys(Character.toString(OTP.charAt(1)));
		helper.clickOnElementByXpath(driver,
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText[3]");
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText[3]")
				.sendKeys(Character.toString(OTP.charAt(2)));
		helper.clickOnElementByXpath(driver,
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText[4]");
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText[4]")
				.sendKeys(Character.toString(OTP.charAt(3)));
		driver.findElementByXPath("//android.widget.Button[@text='SUBMIT']").click();

		try {
			driver.findElementByXPath("//android.view.View[@text='SUCCESS']");
			System.out.println("Testdrive is successfully booked");
		} catch (NoSuchElementException e) {
			System.err.println("There is an error at book a test drive");
		}

		// helper.clickOnElementByXpath(driver, financeoffer);

	}

	public void jawa_bookNow(AndroidDriver<MobileElement> driver,  String state, String city,
			String Dealer,  String fullname, String address, String email,
			String mobilenumber,String finance) throws Exception {
		driver.get("https://stage.jawamotorcycles.com/motorcycles/jawa");
		Thread.sleep(2000);
		/// book now:
		/// hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[10]/android.widget.Button[2]

		helper.clickOnElementByXpath(driver, "//android.widget.Button[@text='BOOK NOW ₹ 5,000(Refundable)']");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Black']");
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Black']");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		helper.clickOnElementByXpath(driver,
				"//android.view.View[@text='(JAWA Jawa Dual Channel ABS )']//following-sibling::android.widget.Button");
		// helper.clickOnElementByXpath(driver, "//android.widget.Button[1]//(JAWA Jawa
		// Dual Channel ABS )");
		// helper.clickOnElementByXpath(driver, "//android.widget.Button[1]");
		booknow(driver, state, city, Dealer, fullname, address, email, mobilenumber, finance);

	
	}

	public void booknow(AndroidDriver<MobileElement> driver,  String state, String city, String Dealer,String fullname, String address, String email, String mobilenumber,String finance)throws Exception {
		helper.clickOnElementByXpath(driver, "//android.widget.Spinner[@text='State']");

		helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='" + state + "']");
		Thread.sleep(2000);

		try {
			BaseClass.driver.findElementByXPath("//android.widget.Spinner[@text='" + state + "']");
			System.out.println("Selected State is dispalying in field");
		} catch (NoSuchElementException e) {
			System.out.println("Selected state is not dispalying in field");
		}

		helper.clickOnElementByXpath(driver, "//android.widget.Spinner[@text='Select City']");
		helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='" + city + "']");

		try {
			BaseClass.driver.findElementByXPath("//android.widget.Spinner[@text='" + city + "']");
			System.out.println("Selected city is dispalying in field");
		} catch (NoSuchElementException e) {

		}

		helper.clickOnElementByXpath(driver, "//android.widget.Spinner[@text='Select Dealer']");
		helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='" + Dealer + "']");

		try {
			BaseClass.driver.findElementByXPath("//android.widget.Spinner[@text='" + Dealer + "']");
			System.out.println("Selected dealer is dispalying in field");
		} catch (NoSuchElementException e) {

		}

		helper.scrollUp(driver);
		/*
		 * helper.clickOnElementByXpath(driver,
		 * "//android.view.View[@text='Enter Full Name']");
		 * 
		 * helper.SendkeysByXpath(driver,
		 * "//android.view.View[@text='Enter Full Name']//preceding-sibling::android.widget.EditText"
		 * , fullname);
		 */
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Full Name']");

		helper.SendkeysByXpath(driver,
				"//android.view.View[@text='Enter Full Name']//preceding-sibling::android.widget.EditText", fullname);
		
		helper.scrollUp(driver);
		
       Thread.sleep(2000);
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Address']");
		helper.SendkeysByXpath(driver,
				"//android.view.View[@text='Address']//preceding-sibling::android.widget.EditText", address);

		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Email']");
		helper.SendkeysByXpath(driver,
				"//android.view.View[@text='Enter Email']//preceding-sibling::android.widget.EditText", email);
		// helper.scrollUp(driver);
		helper.scrollUp(driver);
		System.out.println(mobilenumber);
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Mobile Number']");

		helper.SendkeysByXpath(driver,
				"//android.view.View[@text='Enter Mobile Number']//preceding-sibling::android.widget.EditText",
				mobilenumber);
		helper.clickOnElementByXpath(driver, "//android.widget.RadioButton[@text='" + finance + "']");

		helper.clickOnElementByXpath(driver, "//android.view.View[2]");
		/*
		 * MobileElement el6 = (MobileElement) driver.findElementByXPath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[11]/android.view.View[1]/android.widget.EditText"
		 * ); el6.sendKeys(mobilenumber);
		 */

		/*
		 * if (el6.getText().equals(mobilenumber)) {
		 * System.out.println("Sucessfully able to enter the mobile number "); } else {
		 * System.out.println("Entered mobile number is not dispalying in field"); }
		 */

		helper.clickOnElementByXpath(driver, "//android.widget.Button[@text='BOOK NOW']");

		try {
			AppiumHelper.FindElementByXpath(driver, "//android.view.View[@text='Enter OTP']");
			System.out.println("when click on submit it went to OTP step");

		} catch (NoSuchElementException e) {

			System.err.println("when click on submit unable to go next step");

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByXpath(driver,
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText[1]");

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText[1]")
				.sendKeys(Character.toString(OTP.charAt(0)));
		// helper.SendkeysByXpath(driver, "//android.widget.EditText[@text='digit-1']",
		// OTP.charAt(0));
		helper.clickOnElementByXpath(driver,
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText[2]");
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText[2]")
				.sendKeys(Character.toString(OTP.charAt(1)));
		helper.clickOnElementByXpath(driver,
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText[3]");
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText[3]")
				.sendKeys(Character.toString(OTP.charAt(2)));
		helper.clickOnElementByXpath(driver,
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText[4]");
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText[4]")
				.sendKeys(Character.toString(OTP.charAt(3)));
		driver.findElementByXPath("//android.widget.Button[@text='SUBMIT']").click();
		Thread.sleep(2000);

		helper.clickOnElementByXpath(driver, "//android.widget.Button[@text='MAKE PAYMENT - ₹ 5,000 (Refundable)']");
		Thread.sleep(3000);
		//helper.clickOnElementByID(driver, "cardNumber");
		helper.clickOnElementByXpath(driver, "//android.widget.EditText[@resource-id='cardNumber']");
		helper.SendkeysByXpath(driver, "//android.widget.EditText[@resource-id='cardNumber']", "5123 4567 8901 2346");
		//helper.SendkeysById(driver, "cardNumber", "5123 4567 8901 2346");
		
		
		
		helper.clickOnElementByXpath(driver, "//android.widget.EditText[@resource-id='cardExp']");
		helper.SendkeysByXpath(driver, "//android.widget.EditText[@resource-id='cardExp']", "0721");
		
		helper.clickOnElementByXpath(driver, "//android.widget.EditText[@resource-id='cvvNumber']");
		helper.SendkeysByXpath(driver, "//android.widget.EditText[@resource-id='cvvNumber']", "123");
		helper.clickOnElementByXpath(driver, "//android.widget.EditText[@resource-id='cardHolderName']");
		helper.SendkeysByXpath(driver, "//android.widget.EditText[@resource-id='cardHolderName']", "Hema");
		
		helper.clickOnElementByXpath(driver, "//android.widget.Button[@text='Pay Now']");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.widget.EditText");
		el21.click();
		Thread.sleep(2000);
		MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.widget.EditText");
		el22.sendKeys("123456");
		
		helper.clickOnElementByXpath(driver, "//android.widget.Button[@text='PAY']");
		// helper.clickOnElementByXpath(driver, financeoffer);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		try {
		driver.findElementByXPath("//android.view.View[@text='successful']");
			System.out.println("Booking is successfull");
		}
		catch(NoSuchElementException e) {
			System.err.println("Booking is failed");
		}

	}
	
	
	
	
	

}
