/**
 * 
 */
package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

import common.AppiumHelper;
import common.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

/**
 * @author Hema Sumanjali
 *
 */
public class Mediaspotlight {
	
	protected static AppiumHelper helper = new AppiumHelper();
	
	public static String morenews="//android.view.View[@text='MORE NEWS']";
	
	public static String mediaspotlight="//android.view.View[@text='Media Spotlight']";
	public static String share="//android.view.View[@text='share']";
	public static String element="MORE NEWS";
	public static String back="//android.view.View[@text='back']";
	
	public void media(AndroidDriver<MobileElement> driver) throws Exception {
	
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
	/*	MobileElement element = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"MORE NEWS\"));");
		element.click();*/
		helper.clickOnElementByXpath(driver, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[18]");
	try {
		driver.findElementByXPath(mediaspotlight);
		System.out.println("when click on News more,successfully navigated to media spotlight page");
		
				}
	
	catch(NoSuchElementException e) {
		System.err.println("when click on News more,page is not navigated to media spotlight page");
	}
	helper.clickOnElementByXpath(driver, share);
	try {
		driver.findElementByXPath("//android.view.View[@text='facebook']");
		System.out.println("After click on Share, page landed to facebook");
		
	}
	catch(NoSuchElementException e) {
		System.out.println("After click on Share, page is not landed to facebook");
	}
	System.out.println(driver.findElementByTagName("imag").getText());
	driver.findElementByXPath(back).click();
	driver.findElementByXPath(back).click();
		//driver.findElementByXPath(morenews).click();
		
	}
	
	public void subscribe(AndroidDriver<MobileElement> driver,String mobilenumber,String subsribemessage) throws Exception {
		
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Mobile Number']");
		helper.SendkeysByXpath(driver, "//android.view.View[@text='Enter Mobile Number']//preceding-sibling::android.widget.EditText", mobilenumber);
		helper.clickOnElementByXpath(driver, "//android.view.View[@text='Enter Mobile Number']//following-sibling::android.widget.Button");
		try {
			driver.findElementByXPath("//android.view.View[@text='"+subsribemessage+"']");
			System.err.println("After click on subscribe ,  success message  displayed as expected");
		}
		catch(NoSuchElementException e) {
			System.err.println("After click on subscribe , Success message didnt display");
			
		}
		 //String subscribemessage=BaseClass.driver.findElementByXPath("").getText();
		
	}

	
	public void motorcycles_bottombar(AndroidDriver<MobileElement> driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath("//android.view.View[@text='sticky-fig']").click();
		Thread.sleep(2000);
		
		MobileElement ele=BaseClass.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[2]");
		
		if(ele.getText().contains("Perak")) {
			System.out.println("after click on motorcycles button from bottom bar, page is navigated to motorcycles page successfully");
		}
		else {
			System.err.println("after click on motorcycles button from bottom bar, page is not navigated to motorcycles page successfully");
		}
		/*try {
			BaseClass.driver.findElementByXPath("//android.widget.Image[@text='perak']");
			System.out.println("after click on motorcycles button from bottom bar, page is navigated to motorcycles page successfully");
		}
		catch(NoSuchElementException e) {
			System.err.println("after click on motorcycles button from bottom bar, page is not navigated to motorcycles page successfully");	
		}*/
		
	}
	
	public void kommunity_bottombar(AndroidDriver<MobileElement> driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath("//android.view.View[@text='KOMMUNITI']").click();
		try {
			BaseClass.driver.findElementByXPath("//android.view.View[@text='the kommuniti']");
			System.out.println("after click on Kommuniti button from bottom bar, page is navigated to Kommuniti page successfully");
		}
		catch(NoSuchElementException e) {
			System.err.println("after click on Kommuniti button from bottom bar, page is not navigated to Kommuniti page successfully");	
		}
		
	}
	
	public void search(AndroidDriver<MobileElement> driver,String searchtext,String validation) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.Button[@text='Search']").click();
		helper.SendkeysByXpath(driver, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText", searchtext);
		helper.clickOnElementByXpath(driver, "//android.widget.Button[@text='cross']");
		Thread.sleep(2000);
		try {
			BaseClass.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");
			System.out.println("after click on close button in search button,  search open text field got closed which is expected");
		}
		catch(NoSuchElementException e) {
			System.err.println("after click on close button in search button, still i can able to see search open text field");	
		}
		driver.findElementByXPath("//android.widget.Button[@text='Search']").click();
		helper.clickOnElementByXpath(driver, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");
		helper.SendkeysByXpath(driver, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText", searchtext);
	
	
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		MobileElement searchresults=BaseClass.driver.findElementByXPath("//android.widget.Button[@text='cross']//following-sibling::android.widget.ListView");
		List<MobileElement> list=searchresults.findElementsByClassName("android.view.View");
		System.out.println(list.size());
		
		System.out.println("when entered "+searchtext+" following results dispalyed against search");
		for(int i=0;i<list.size();i++) {
			
			
			if(list.get(i).findElementByClassName("android.view.View").getText().contains(searchtext)) {
				System.out.println(list.get(i).findElementByClassName("android.view.View").getText());
			}else {
				System.out.println(list.get(i).findElementByClassName("android.view.View").getText()+" : which is not releavant to given searchsearch ");
			}
		}
		/*System.out.println(list.get(1).findElementByClassName("android.view.View").getText());
		System.out.println(list.get(2).findElementByClassName("android.view.View").getText());*/
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		
		try {
			driver.findElementByXPath("//android.view.View[@text='"+validation+"']");
			System.out.println("Successfully page is navigated to the proper page with respect to given search parameter : " +searchtext);
		}
		catch(NoSuchElementException e) {
			System.out.println("page is not navigated to the proper page with respect to given search parameter : " +searchtext);
		}
		//helper.SendkeysByXpath(driver, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText", Keys.ENTER);	
		/*MobileElement searchresults=BaseClass.driver.findElementByXPath("//android.widget.Button[@text='cross']//following-sibling::android.widget.ListView");
	List<MobileElement> list=searchresults.findElementsByClassName("android.view.View");
	System.out.println(list.size());
	System.out.println(list.get(1).findElementByClassName("android.view.View").getText());
	System.out.println(list.get(2).findElementByClassName("android.view.View").getText());
	list.get(2).click();
	Thread.sleep(2000);
	System.out.println(validation);*/
		
	}
	
	
	
}
