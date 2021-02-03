/**
 * 
 */
package mainTestcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import common.BaseClass;
import common.DataProviders;

/**
 * @author Hema Sumanjali
 *
 */
public class Product_Jawa extends BaseClass{
	
	@Test(priority = 1, dataProvider = "login", dataProviderClass = DataProviders.class)
	public void Homepage_validations(String username, String pwd) throws Exception {
		Thread.sleep(2000);
		loginp.loginpage_success(username, pwd);
	home.validate_jawasonroad(driver);
		home.validate_thejawarig(driver);
		home.validate_riderensemble(driver);
	jawa.clickonjawa(driver);
	helper.scrollUp(driver);
	helper.scrollUp(driver);
	}
	@Test(priority = 2, threadPoolSize =2,dataProvider = "PerakPage", dataProviderClass = DataProviders.class)
	public void EXshoroom(String city,String exshowroomprice) throws Exception {
		
		
		perak.exshowroompricecheck(driver, city, exshowroomprice);
	
		
	}
	
	@Test(priority = 3)
	public void perak_product() throws Exception {
		
	
		jawa.video(driver);
		//helper.scrollUp(driver);
		//helper.scrollUp(driver);
		jawa.gallary(driver);
		//helper.scrollUp(driver);
		//helper.scrollUp(driver);
		jawa.view360(driver);
		
	}
	@Test(priority = 4,dataProvider = "bookatestdrive", dataProviderClass = DataProviders.class)
	public void bookTestride(String Model, String state,String city,String Dealer,String testride,String datefortestride,String fullname,String address,String email,String mobilenumber) throws Exception {
	
	jawa.perak_BookATestdrive(driver, Model, state, city, Dealer, testride, datefortestride, fullname, address, email, mobilenumber);

		//jawa.finaceoffer(driver);
		
		
		
		
		
	}
	
	
	
	@Test(priority = 5,dataProvider = "BookNow", dataProviderClass = DataProviders.class)
	public void booknow(String state,String city,String Dealer,String fullname,String address,String email,String mobilenumber,String finance) throws Exception {
		
		jawa.jawa_bookNow(driver,state, city, Dealer, fullname, address, email, mobilenumber,finance);
	}


	@Test(priority = 6)
	public void EMIcalculator() throws Exception {
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		driver.findElementByXPath(
				"//android.view.View[@text='EMI Calculator']")
				.click();
		Emi.EmiCalculation(driver);	
	
	}
	
	@Test(priority = 7,dataProvider = "Finaceoffer", dataProviderClass = DataProviders.class)
	public void Financeoffer(String Model, String state, String city,String Dealer, String Pannumber,String fullname, String financeoffer, String salary, String address,String email, String mobilenumber) throws Exception {
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		driver.findElementByXPath("//android.webkit.WebView//android.view.View//android.view.View[4]//android.widget.Button")
				.click();
		Thread.sleep(5000);
		jawa.finaceoffer(driver, Model, state, city, Dealer, Pannumber, fullname, financeoffer, salary, address, email, mobilenumber);
		
	}
	
	@Test(priority = 8,dataProvider = "Specifications_jawa", dataProviderClass = DataProviders.class)
	public void Specifications(String enginecc, String enginetype,String maxpower,String maxtorque,String fuelsystem,String compression,String borestroke,String exhaust,String kerbweight,String fueltankcapacity,String wheelbase,String seatheight,String gearbox,String frame,String frontsuspension,String Rearsuspension,String frontbreaktype,String rearbreaktype,String frontdiscsize,String reardrumsize,String fronttyre,String reartyre) throws Exception {
		driver.navigate().to(URL+"/motorcycles/jawa");
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		Thread.sleep(3000);
		driver.findElementByXPath(pages.Specifications.Techiclespec_jawa).click();
		
		Thread.sleep(3000);
		
		tech_specifications.Perak_specifications(enginecc, enginetype, maxpower, maxtorque, fuelsystem, compression, borestroke, exhaust, kerbweight, fueltankcapacity, wheelbase, seatheight, gearbox, frame, frontsuspension, Rearsuspension, frontbreaktype, rearbreaktype, frontdiscsize, reardrumsize, fronttyre, reartyre);
			
	
	}
}
