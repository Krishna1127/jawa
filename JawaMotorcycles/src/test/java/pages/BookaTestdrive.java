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
public class BookaTestdrive {
	protected static AppiumHelper helper = new AppiumHelper();
	/// hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[15]

	public void bookatestdrive(AndroidDriver<MobileElement> driver, String Model, String state, String city,
			String Dealer, String testride, String datefortestride, String fullname, String address, String email,
			String mobilenumber) throws Exception {
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);

		MobileElement el5 = (MobileElement) driver.findElementByXPath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[15]");
		el5.click();
		helper.clickOnElementByXpath(driver, "//android.widget.Spinner[@text='Select Model']");
		Thread.sleep(2000);
		helper.clickOnElementByXpath(driver, "//android.widget.CheckedTextView[@text='" + Model + "']");

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

		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Full Name']");

		helper.SendkeysByXpath(driver,
				"//android.view.View[@text='Enter Full Name']//preceding-sibling::android.widget.EditText", fullname);

		helper.scrollUp(driver);

		helper.clickOnElementByXpath(driver, "//android.widget.RadioButton[@text='" + testride + "']");

		helper.clickOnElementByXpath(driver, "//android.view.View[@text='" + datefortestride + "']");
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
		MobileElement el6 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[11]/android.view.View[1]/android.widget.EditText");
		el6.sendKeys(mobilenumber);

		if (el6.getText().equals(mobilenumber)) {
			System.out.println("Sucessfully able to enter the mobile number ");
		} else {
			System.out.println("Entered mobile number is not dispalying in field");
		}

		helper.clickOnElementByXpath(driver, "//android.widget.Button[@text='BOOK TEST RIDE']");

		try {
			AppiumHelper.FindElementByXpath(driver, "//android.view.View[@text='Enter OTP']");
			System.out.println("when click on submit it went to OTP step");

		} catch (NoSuchElementException e) {

			System.err.println("when click on submit unable to go next step");

		}

		// helper.clickOnElementByXpath(driver, financeoffer);

	}

}
