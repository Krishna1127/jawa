/**
 * 
 */
package mainTestcases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import common.BaseClass;
import common.DataProviders;
import pages.Login;

/**
 * @author Hema Sumanjali
 *
 */
public class LoginTestcase extends BaseClass {

	@Test(priority = 1, dataProvider = "login", dataProviderClass = DataProviders.class)
	public void loginpage_fail(String username, String pwd) throws InterruptedException, IOException {
	
		loginpage.Enterusername(driver, username);
		loginpage.Enterpassword(driver, pwd);
		loginpage.clickonCancel(driver);
		try {
		Assert.assertFalse(driver.findElementById(Login.username).isDisplayed());
		System.out.println("Login is successfull when click on Cancel");
		TakeScreenShot(driver, "Login successfull when click on cancel");	
		}
		catch(NoSuchElementException e) {
			System.out.println("Login is unsuccessfull when click on Cancel");
			TakeScreenShot(driver, "Login Unsuccessfull when click on cancel");	
		}
		

	}
	@Test(priority = 2, dataProvider = "login", dataProviderClass = DataProviders.class)
	public void loginpage_success(String username, String pwd) throws InterruptedException, IOException {
	
		
		driver.get("http://stage.jawamotorcycles.com");
		loginpage.Enterusername(driver, username);
		loginpage.Enterpassword(driver, pwd);
		loginpage.clickonSignin(driver);
		Assert.assertTrue(driver.findElementByXPath("//android.widget.Button[@text='menu']").isDisplayed());
		System.out.println("Login Successfull when click on submit");
		TakeScreenShot(driver, "Login successfull when click on Submit");

	}

}
