/**
 * 
 */
package mainTestcases;

import org.testng.annotations.Test;

import common.BaseClass;
import common.DataProviders;

/**
 * @author Hema Sumanjali
 *
 */
public class HomePageTestcases extends BaseClass{
	@Test(priority = 1, dataProvider = "login", dataProviderClass = DataProviders.class)
	public void Homepage_validations(String username, String pwd) throws Exception {
		loginp.loginpage_success(username, pwd);
	home.validate_jawasonroad(driver);
		home.validate_thejawarig(driver);
		home.validate_riderensemble(driver);
		
	}
	
	@Test(priority = 2, dataProvider = "Finaceoffer", dataProviderClass = DataProviders.class)
	public void financeoffer_validations(String Model,String state,String city,String Dealer,String Pannumber,String fullname,String profession,String salry,String address,String email,String mobilenumber) throws Exception {
		//home.Finaceoffer(driver, Model, state, city, Dealer, Pannumber, fullname, profession, salry, address, email, mobilenumber);	
	}
	@Test(priority = 3, dataProvider = "Finaceoffer", dataProviderClass = DataProviders.class)
	public void EMIcalculator(String Model,String state,String city,String Dealer,String Pannumber,String fullname,String profession,String salry,String address,String email,String mobilenumber) throws Exception {
		//Emi.loanamountcal(driver, Model);	
	
	}
	
	@Test(priority = 4)
	public void Kommunity() throws Exception {
	
Emi.Menu_kommuniti_kogotrails_Navigations(driver);
Emi.Menu_kommuniti_Ijyd2019_Navigations(driver);
Emi.Menu_kommuniti_jawanomads_Navigations(driver);
	
	}
	@Test(priority = 5,dataProvider = "bookatestdrive", dataProviderClass = DataProviders.class)
	public void bookTestride(String Model, String state,String city,String Dealer,String testride,String datefortestride,String fullname,String address,String email,String mobilenumber) throws Exception {
	
	//	testdrive.bookatestdrive(driver, Model, state, city, Dealer, testride, datefortestride, fullname, address, email, mobilenumber);

		
	}
	@Test(priority = 6)
	public void mediaspotlight_validation() throws Exception {
		//mediaspotlight.media(driver);
	}
	
	@Test(priority = 7 ,dataProvider = "subscribe", dataProviderClass = DataProviders.class)
	public void whatsapp_subscription(String mobilenumber,String subsribemessage) throws Exception {
	//	mediaspotlight.subscribe(driver, mobilenumber, subsribemessage);
	
	}
	@Test(priority = 8)
	public void motorcycles() throws Exception {
		mediaspotlight.motorcycles_bottombar(driver);
	
	}
	
	@Test(priority = 9)
	public void Kommunity_bottombar() throws Exception {
		//mediaspotlight.kommunity_bottombar(driver);
	
	}
	
	@Test(priority = 10,dataProvider = "Search", dataProviderClass = DataProviders.class)
	public void Search_header(String searchtext,String validation) throws Exception {
		mediaspotlight.search(driver, searchtext, validation);
	
	}
	
	
}
