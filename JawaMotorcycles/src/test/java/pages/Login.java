/**
 * 
 */
package pages;

import common.AppiumHelper;
import common.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author Hema Sumanjali
 *
 */
public class Login {
	protected static AppiumHelper helper = new AppiumHelper();
	
	//public static String username="com.android.chrome:id/username";
	public static String username="username";
	public static String password="com.android.chrome:id/password";
	public static String cancel="android:id/button2";
	public static String signin="android:id/button1";
	
	
    
	public void Enterusername(AndroidDriver<MobileElement> driver,String Username) throws InterruptedException {
		
		helper.clickOnElementByID(driver, username);
			helper.SendkeysById(driver, username, Username);
	
	}
	
	public void Enterpassword(AndroidDriver<MobileElement> driver,String pwd) throws InterruptedException {
		helper.clickOnElementByID(driver, password);
		helper.SendkeysById(driver, password, pwd);
		
		
	}
	
	public void clickonSignin(AndroidDriver<MobileElement> driver) throws InterruptedException {
		helper.clickOnElementByID(driver, signin);
		
	}
	public void clickonCancel(AndroidDriver<MobileElement> driver) throws InterruptedException {
		helper.clickOnElementByID(driver, cancel);
		
	}
}
