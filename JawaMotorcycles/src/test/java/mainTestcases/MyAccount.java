/**
 * 
 */
package mainTestcases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import common.BaseClass;
import common.DataProviders;
import pages.HomePage;
import pages.MenuOptions;

/**
 * @author Hema Sumanjali
 *
 */
public class MyAccount extends BaseClass{
	@Test(priority = 1, dataProvider = "login", dataProviderClass = DataProviders.class)
	public void Homepage_validations(String username, String pwd) throws Exception {
		loginp.loginpage_success(username, pwd);
	/*home.validate_jawasonroad(driver);
		home.validate_thejawarig(driver);
		home.validate_riderensemble(driver);*/
		
		
		// helper.clickOnElementByXpath(driver, MenuOptions.menu);
	}
	/*@Test(priority = 2)
	public void setvaluestoexcel() throws FileNotFoundException, IOException {
		 account.RandomValuesIntoExcel();
	}*/
	
	@Test(priority = 3, dataProvider = "signup", dataProviderClass = DataProviders.class)
	public void Signup(String Mobilenumber,String Name) throws FileNotFoundException, IOException, InterruptedException{
      // account.RandomValuesIntoExcel();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        helper.clickOnElementByXpath(driver, MenuOptions.menu);
		account.account_signup(driver, Mobilenumber, Name);
		account.validation_Myaccount(driver, Mobilenumber, Name);
		account.myorders(driver);
		helper.clickOnElementByXpath(driver, HomePage.back);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		helper.clickOnElementByXpath(driver, HomePage.back);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		helper.clickOnElementByXpath(driver, MenuOptions.menu);
		account.singout(driver);
		
		
	}
	
	
	
}
