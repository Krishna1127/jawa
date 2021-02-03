/**
 * 
 */
package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import common.AppiumHelper;
import common.BaseClass;

/**
 * @author Hema Sumanjali
 *
 */
public class MenuOptions {
	
	protected static AppiumHelper helper = new AppiumHelper();
	public static String menu="//android.widget.Button[@text='menu']";
	public static String Homepage="//android.view.View[@text='HOME PAGE']";
	
public static String Motorcycles="//android.widget.ListView//android.view.View[2]//android.view.View";
	
public static String perak="//android.widget.ListView//android.view.View[2]//android.widget.ListView//android.view.View[1]//android.view.View";
public static String jawa="//android.widget.ListView//android.view.View[2]//android.widget.ListView//android.view.View[2]//android.view.View";
public static String Fortytwo="//android.widget.ListView//android.view.View[2]//android.widget.ListView//android.view.View[3]//android.view.View";	

public static String Kmmunity="//android.widget.ListView//android.view.View[3]//android.view.View";

public static String kogotrails="//android.widget.ListView//android.view.View[3]//android.widget.ListView//android.view.View[1]//android.view.View";
public static String Ijyd2019="//android.widget.ListView//android.view.View[3]//android.widget.ListView//android.view.View[2]//android.view.View";
public static String jawanomads="//android.widget.ListView//android.view.View[3]//android.widget.ListView//android.view.View[3]//android.view.View";	

public static String gear="//android.widget.ListView//android.view.View[4]//android.view.View";

public static String thejawarig="//android.widget.ListView//android.view.View[4]//android.widget.ListView//android.view.View[1]//android.view.View";
public static String riderensemble="//android.widget.ListView//android.view.View[4]//android.widget.ListView//android.view.View[2]//android.view.View";

public static String dealers="//android.widget.ListView//android.view.View[5]//android.view.View";
public static String Deliveryestimaator="//android.widget.ListView//android.view.View[6]//android.view.View";
public static String EMIcalculator="//android.widget.ListView//android.view.View[7]//android.view.View";
public static String contactus="//android.widget.ListView//android.view.View[8]//android.view.View";
public static String termsofuse="//android.widget.ListView//android.view.View[9]//android.view.View";
public static String privacyplicy="//android.widget.ListView//android.view.View[10]//android.view.View";
public static String disclaimer="//android.widget.ListView//android.view.View[5]//android.view.View";


public void Menu_Homepage_Navigations() throws InterruptedException {
	BaseClass.driver.findElementByXPath(MenuOptions.menu).click();
	BaseClass.driver.findElementByXPath(MenuOptions.Homepage).click();
	try {
		BaseClass.driver.findElementByXPath("//android.view.View[@text='steeds of steel']");
		System.out.println("when click on Home Page from Menu, page is navigated to home page successfully");

	} catch (NoSuchElementException e) {
		System.err.println("when click on Home Page from Menu, page is not navigated to home page ");
	}
}

public void Menu_perak_Navigations() throws InterruptedException {
	System.out.println("perak");
	BaseClass.driver.findElementByXPath(MenuOptions.menu).click();
	Thread.sleep(1000);
	BaseClass.driver.findElementByXPath(MenuOptions.Motorcycles).click();
	Thread.sleep(1000);
	BaseClass.driver.findElementByXPath(MenuOptions.perak).click();
			try {
				BaseClass.driver.findElementByXPath("//android.widget.Image[@text='perak']");
		System.out.println("when click on Perak  from Menu, page is navigated to Perak page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on Perak from Menu, page is not navigated to Perak page ");
	}
	
}

public void Menu_jawa_Navigations() throws InterruptedException {
	System.out.println("jawa");
	BaseClass.driver.findElementByXPath("//android.view.View[@text='back']").click();
	
	BaseClass.driver.findElementByXPath(MenuOptions.menu).click();
	Thread.sleep(1000);
	
	BaseClass.driver.findElementByXPath(MenuOptions.Motorcycles).click();
			
	Thread.sleep(1000);
	BaseClass.driver.findElementByXPath(MenuOptions.jawa).click();
	try {
		BaseClass.driver.findElementByXPath("//android.widget.Image[@text='jawa']");
	
		System.out.println("when click on jawa  from Menu, page is navigated to jawa page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on jawa from Menu, page is not navigated to jawa page ");
	}
	
}


public void Menu_fortytwo_Navigations() throws InterruptedException {
	
	BaseClass.driver.findElementByXPath("//android.view.View[@text='back']").click();
	
	BaseClass.driver.findElementByXPath(MenuOptions.menu).click();
	Thread.sleep(1000);
	
	BaseClass.driver.findElementByXPath(MenuOptions.Motorcycles).click();
			
	Thread.sleep(1000);
	BaseClass.driver.findElementByXPath(MenuOptions.Fortytwo).click();
	try {
		BaseClass.driver.findElementByXPath("//android.widget.Image[@text='forty-two']");
	
		System.out.println("when click on forty two  from Menu, page is navigated to forty two page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on forty two from Menu, page is not navigated to forty two  page ");
	}
	
}


public void Menu_kommuniti_kogotrails_Navigations() throws InterruptedException {
	
	BaseClass.driver.findElementByXPath("//android.view.View[@text='back']").click();
	
	BaseClass.driver.findElementByXPath(MenuOptions.menu).click();
	Thread.sleep(1000);
	BaseClass.driver.findElementByXPath(MenuOptions.Kmmunity).click();
	
	BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	BaseClass.driver.findElementByXPath(MenuOptions.kogotrails).click();
			

	//BaseClass.driver.findElementByXPath(MenuOptions.Motorcycles).click();
	BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	try {
		BaseClass.driver.findElementByXPath("//android.widget.Button[@text='GET KOGO']");
	
		System.out.println("when click on kogotrails  from Menu, page is navigated to kogotrails page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on kogotrails from Menu, page is not navigated to kogotrails page ");
	}
	
}

public void Menu_kommuniti_Ijyd2019_Navigations() throws InterruptedException {
	BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(1000);
	BaseClass.driver.findElementByXPath("//android.view.View[@text='HOME']").click();
	
	//BaseClass.driver.findElementByXPath("//android.view.View[@text='back']").click();
	Thread.sleep(1000);
	BaseClass.driver.findElementByXPath(MenuOptions.menu).click();
	Thread.sleep(1000);
	BaseClass.driver.findElementByXPath(MenuOptions.Kmmunity).click();
	Thread.sleep(1000);
	BaseClass.driver.findElementByXPath(MenuOptions.Ijyd2019).click();
			
	Thread.sleep(1000);
	
	
	try {
		BaseClass.driver.findElementByXPath("//android.view.View[@text='17th international jawa yezdi day. july 14th, 2019.']");
	
		System.out.println("when click on Ijyd2019  from Menu, page is navigated to Ijyd2019 page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on Ijyd2019 from Menu, page is not navigated to Ijyd2019 page ");
	}
	
}

public void Menu_kommuniti_jawanomads_Navigations() throws InterruptedException {
	
	BaseClass.driver.findElementByXPath("//android.view.View[@text='back']").click();
	BaseClass.driver.findElementByXPath("//android.view.View[@text='back']").click();
	
	BaseClass.driver.findElementByXPath(MenuOptions.menu).click();
	Thread.sleep(1000);
	BaseClass.driver.findElementByXPath(MenuOptions.Kmmunity).click();
	Thread.sleep(1000);
	BaseClass.driver.findElementByXPath(MenuOptions.jawanomads).click();
	BaseClass.driver.findElementByXPath(MenuOptions.jawanomads).click();	
	Thread.sleep(1000);
	
	try {
		BaseClass.driver.findElementByXPath("//android.view.View[@text='jawa nomads']");
	
		System.out.println("when click on jawanomads  from Menu, page is navigated to jawanomads page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on jawanomads from Menu, page is not navigated to jawanomads page ");
	}
	
}

public void Menu_gear_thejawarig_Navigations() throws Exception {
	Thread.sleep(1000);
	BaseClass.driver.findElementByXPath("//android.view.View[@text='back']").click();
	BaseClass.driver.findElementByXPath("//android.view.View[@text='back']").click();
	BaseClass.driver.findElementByXPath(MenuOptions.menu).click();
	Thread.sleep(1000);
	helper.ScrollToViewElement(BaseClass.driver, "Gear");
	Thread.sleep(1000);
	try {
	BaseClass.driver.findElementByXPath(MenuOptions.gear).click();
	}
	catch(NoSuchElementException e) {
		helper.scrollUp(BaseClass.driver);
		BaseClass.driver.findElementByXPath(MenuOptions.gear).click();
	}
	Thread.sleep(1000);
	try {
			BaseClass.driver.findElementByXPath(MenuOptions.thejawarig).click();
	Thread.sleep(1000);
	}
	catch(NoSuchElementException e) {
		helper.scrollUp(BaseClass.driver);
		BaseClass.driver.findElementByXPath(MenuOptions.thejawarig).click();
		Thread.sleep(1000);
	}
	try {
		BaseClass.driver.findElementByXPath("//android.view.View[@text='the jawa rig']");
	
		System.out.println("when click on thejawarig  from Menu, page is navigated to thejawarig page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on thejawarig from Menu, page is not navigated to thejawarig page ");
	}
	
}

public void Menu_gear_riderensemble_Navigations() throws Exception {
	
	BaseClass.driver.findElementByXPath("//android.view.View[@text='back']").click();
	BaseClass.driver.findElementByXPath(MenuOptions.menu).click();
	Thread.sleep(1000);
	BaseClass.driver.findElementByXPath(MenuOptions.gear).click();
	Thread.sleep(1000);
	try {
	BaseClass.driver.findElementByXPath(MenuOptions.riderensemble).click();
	BaseClass.driver.findElementByXPath(MenuOptions.riderensemble).click();
	}
	catch(NoSuchElementException e) {
		helper.scrollUp(BaseClass.driver);
		BaseClass.driver.findElementByXPath(MenuOptions.riderensemble).click();
		BaseClass.driver.findElementByXPath(MenuOptions.riderensemble).click();
	}
	Thread.sleep(1000);
	try {
		BaseClass.driver.findElementByXPath("//android.view.View[@text='rider ensemble']");
	
		System.out.println("when click on riderensemble  from Menu, page is navigated to riderensemble page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on riderensemble from Menu, page is not navigated to riderensemble page ");
	}
	
}


public void Menu_dealers_Navigations() throws Exception {
	
	BaseClass.driver.findElementByXPath("//android.view.View[@text='back']").click();
	Thread.sleep(1000);
	BaseClass.driver.findElementByXPath(MenuOptions.menu).click();
	Thread.sleep(1000);
	helper.ScrollToViewElement(BaseClass.driver, "DEALERS");
	//helper.scrollUp(BaseClass.driver);
	try {
	BaseClass.driver.findElementByXPath(MenuOptions.dealers).click();
}
catch(NoSuchElementException e) {
	helper.scrollUp(BaseClass.driver);
	BaseClass.driver.findElementByXPath(MenuOptions.dealers).click();
}
	Thread.sleep(1000);
	BaseClass.driver.findElementByXPath("//android.widget.Button[@text='ALLOW']").click();
	
	try {
		BaseClass.driver.findElementByXPath("//android.view.View[@text='DEALER VIEW']");
	
		System.out.println("when click on dealers  from Menu, page is navigated to dealers page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on dealers from Menu, page is not navigated to dealers page ");
	}
	
}

public void Menu_Deliveryestimaator_Navigations() throws Exception {
	Thread.sleep(1000);
	BaseClass.driver.findElementByXPath(MenuOptions.menu).click();
	
	Thread.sleep(1000);
	helper.scrollUp(BaseClass.driver);
	try {
	BaseClass.driver.findElementByXPath(MenuOptions.Deliveryestimaator).click();
}
catch(NoSuchElementException e) {
	helper.scrollUp(BaseClass.driver);
	BaseClass.driver.findElementByXPath(MenuOptions.Deliveryestimaator).click();
}
	Thread.sleep(1000);
	
	try {
		BaseClass.driver.findElementByXPath("//android.view.View[@text='Delivery Estimator']");
	
		System.out.println("when click on Deliveryestimaator  from Menu, page is navigated to Deliveryestimaator page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on Deliveryestimaator from Menu, page is not navigated to Deliveryestimaator page ");
	}
	BaseClass.driver.findElementByXPath("//android.view.View[@text='back']").click();
}


public void Menu_EMIcalculator_Navigations() throws Exception {
	BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	BaseClass.driver.findElementByXPath(MenuOptions.menu).click();
	helper.ScrollToViewElement(BaseClass.driver, "EMI CALCULATOR");
	//helper.scrollUp(BaseClass.driver);
	BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	helper.clickOnElementByXpath(BaseClass.driver, "//android.view.View[@text='EMI CALCULATOR']");
	//BaseClass.driver.findElementByXPath(MenuOptions.EMIcalculator).click();

	Thread.sleep(1000);
	
	try {
		BaseClass.driver.findElementByXPath("//android.view.View[@text='Loan Amount']");
	
		System.out.println("when click on EMIcalculator  from Menu, page is navigated to EMIcalculator page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on EMIcalculator from Menu, page is not navigated to EMIcalculator page ");
	}
	
}

public void Menu_contactus_Navigations() throws Exception {
	
	
	BaseClass.driver.findElementByXPath(MenuOptions.menu).click();
	Thread.sleep(1000);
	try {
	BaseClass.driver.findElementByXPath(MenuOptions.contactus).click();
}
catch(NoSuchElementException e) {
	helper.scrollUp(BaseClass.driver);
	BaseClass.driver.findElementByXPath(MenuOptions.contactus).click();
}
	Thread.sleep(1000);
	
	try {
		BaseClass.driver.findElementByXPath("//android.widget.Button[@text='GIVE FEEDBACK']");
	
		System.out.println("when click on contactus  from Menu, page is navigated to contactus page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on contactus from Menu, page is not navigated to contactus page ");
	}
	
}


public void Menu_termsofuse_Navigations() throws Exception {
	BaseClass.driver.findElementByXPath(MenuOptions.menu).click();

	try {
	BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	BaseClass.driver.findElementByXPath(MenuOptions.termsofuse).click();
}
catch(NoSuchElementException e) {
	helper.scrollUp(BaseClass.driver);
	BaseClass.driver.findElementByXPath(MenuOptions.termsofuse).click();
}
	BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	try {
		BaseClass.driver.findElementByXPath("//android.view.View[@text='terms of use']");
		
	
		System.out.println("when click on termsofuse  from Menu, page is navigated to termsofuse page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on termsofuse from Menu, page is not navigated to termsofuse page ");
	}
	
}


public void Menu_privacyplicy_Navigations() throws Exception {
	
	
	BaseClass.driver.findElementByXPath(MenuOptions.menu).click();
	BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
	BaseClass.driver.findElementByXPath(MenuOptions.privacyplicy).click();
	BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	catch(NoSuchElementException e) {
		helper.scrollUp(BaseClass.driver);
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BaseClass.driver.findElementByXPath(MenuOptions.privacyplicy).click();
		
	}
	try {
		BaseClass.driver.findElementByXPath("//android.view.View[@text='privacy policy']");
	
		System.out.println("when click on privacyplicy  from Menu, page is navigated to privacyplicy page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on privacyplicy from Menu, page is not navigated to privacyplicy page ");
	}
	
}

public void Menu_disclaimer_Navigations() throws Exception {
	
	
	BaseClass.driver.findElementByXPath(MenuOptions.menu).click();
	BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
	BaseClass.driver.findElementByXPath(MenuOptions.disclaimer).click();
}
catch(NoSuchElementException e) {
	helper.scrollUp(BaseClass.driver);
	BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	BaseClass.driver.findElementByXPath(MenuOptions.disclaimer).click();
}
	Thread.sleep(1000);
	
	try {
		BaseClass.driver.findElementByXPath("//android.view.View[@text='disclaimer']");
	
		System.out.println("when click on disclaimer  from Menu, page is navigated to disclaimer page successfully");
		
	}
	catch(NoSuchElementException e) {
		System.err.println("when click on disclaimer from Menu, page is not navigated to disclaimer page ");
	}
	
}

}
