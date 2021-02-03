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
public class FortyTwo_Product_Page extends BaseClass{
	
	@Test(priority = 1, dataProvider = "login", dataProviderClass = DataProviders.class)
	public void Homepage_validations(String username, String pwd) throws Exception {
		loginp.loginpage_success(username, pwd);
		helper.clickOnElementByXpath(driver, "//android.widget.Button[@text='Close']");
	
		/*helper.scrollUp(driver);
	    home.validate_jawasonroad(driver);
	  	home.validate_thejawarig(driver);
		home.validate_riderensemble(driver);
		//helper.scrollUp(driver);
	//	driver.navigate().to(URL+"/motorcycles/forty-two");
		//fortytwo.clickonfortytwo(driver);
		
		//helper.scrollUp(driver);
		//helper.scrollUp(driver);
*/	}
	@Test(priority = 2, threadPoolSize =2,dataProvider = "PerakPage", dataProviderClass = DataProviders.class)
	public void EXshoroom(String city,String exshowroomprice) throws Exception {
		
		System.out.println("------Exshowroom price---------");
		driver.navigate().to(URL+"/motorcycles/forty-two");
		perak.exshowroompricecheck(driver, city, exshowroomprice);
	
		
	}
	
	@Test(priority = 3)
	public void perak_product() throws Exception {
		
		System.out.println("------gallary & view 360---------");
		perak.video(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		perak.gallary(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		perak.view360(driver);
		
	}
	@Test(priority = 4,dataProvider = "bookatestdrive", dataProviderClass = DataProviders.class)
	public void bookTestride(String Model, String state,String city,String Dealer,String testride,String datefortestride,String fullname,String address,String email,String mobilenumber) throws Exception {
	
		System.out.println("------Book A Testdrive---------");
		fortytwo.perak_BookATestdrive(driver, Model, state, city, Dealer, testride, datefortestride, fullname, address, email, mobilenumber);

		
	}
	
	@Test(priority = 5,dataProvider = "BookNow", dataProviderClass = DataProviders.class)
	public void BookNow(String state, String city,String Dealer,String fullname,String address,String email,String mobilenumber,String finance) throws Exception {

		System.out.println("------Book Now---------");
   fortytwo.fortytwo_bookNow(driver, state, city, Dealer, fullname, address, email, mobilenumber, finance);
		
	}

	@Test(priority = 6)
	public void EMIcalculator() throws Exception {
		System.out.println("------EMI calculator---------");
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		//helper.scrollUp(driver);
		driver.findElementByXPath(
				"//android.view.View[@text='EMI Calculator']")
				.click();
		Emi.EmiCalculation(driver);	
	
	}
	
	@Test(priority = 7,dataProvider = "Specifications_fortytwo", dataProviderClass = DataProviders.class)
	public void Specifications(String enginecc, String enginetype,String maxpower,String maxtorque,String fuelsystem,String compression,String borestroke,String exhaust,String kerbweight,String fueltankcapacity,String wheelbase,String seatheight,String gearbox,String frame,String frontsuspension,String Rearsuspension,String frontbreaktype,String rearbreaktype,String frontdiscsize,String reardrumsize,String fronttyre,String reartyre) throws Exception {
		System.out.println("------Specifications---------");
		driver.navigate().to(URL+"/motorcycles/forty-two");
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		helper.scrollUp(driver);
		Thread.sleep(3000);
		driver.findElementByXPath(pages.Specifications.Techiclespec_fortytwo).click();
		Thread.sleep(3000);
		
		tech_specifications.Perak_specifications(enginecc, enginetype, maxpower, maxtorque, fuelsystem, compression, borestroke, exhaust, kerbweight, fueltankcapacity, wheelbase, seatheight, gearbox, frame, frontsuspension, Rearsuspension, frontbreaktype, rearbreaktype, frontdiscsize, reardrumsize, fronttyre, reartyre);
			
	
	}
}
