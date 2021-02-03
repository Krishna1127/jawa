package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AppiumHelper {

	
	private static WebElement Element = null;
	public static WebElement FindElementById(AndroidDriver<MobileElement> driver,String ID) {
		Element=driver.findElementById(ID);
		return Element;
	}
	public static WebElement FindElementByXpath(AndroidDriver<MobileElement> driver,String Xpath) {
		Element=driver.findElementByXPath(Xpath);
		return Element;
	}

	public static WebElement FindElementByAccesabilityID(AndroidDriver<MobileElement> driver,String ID) {
		Element=driver.findElementByAccessibilityId(ID);
		return Element;
	}
	public void clickOnElementByXpath(AndroidDriver<MobileElement> driver,String Xpath) {
		AppiumHelper.FindElementByXpath(driver, Xpath).click();

	}
	public void clickOnElementByID(AndroidDriver<MobileElement> driver,String ID) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AppiumHelper.FindElementById(driver, ID).click();
	}
	public void clickOnElementByAccessabilityID(AndroidDriver<MobileElement> driver,String ID) {
		AppiumHelper.FindElementByAccesabilityID(driver,ID).click();
	}

	public void SendkeysById(AndroidDriver<MobileElement> driver,String ID,String Input) {
		AppiumHelper.FindElementById(driver, ID).sendKeys(Input);

	}
	public void SendkeysByXpath(AndroidDriver<MobileElement> driver,String Xpath,String Input) {
		AppiumHelper.FindElementByXpath(driver, Xpath).sendKeys(Input);
	}
	public void ScrollToViewElement(AndroidDriver<MobileElement> driver,String element) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+element+"\"));");
	}
	
	

	public void scrollUp(AndroidDriver<MobileElement> driver) throws Exception {

	    //The viewing size of the device
	    Dimension size = driver.manage().window().getSize();

	    //Starting y location set to 70% of the height (near bottom)
	    int starty = (int) (size.height * 0.70);
	    //Ending y location set to 20% of the height (near top)
	    int endy = (int) (size.height * 0.20);
	    //x position set to mid-screen horizontally
	    int startx = size.width / 2;
	    /*Reporter.log(size);
	    Reporter.log(startx);
	    Reporter.log(starty);
	    Reporter.log(endy);*/
		(new TouchAction(driver))
		.press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		.moveTo(PointOption.point(startx, endy)).release().perform();
		/*(new TouchAction(driver))
		.press(PointOption.point(535, 1702)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		.moveTo(PointOption.point(474, 642)).release().perform();
		(1080, 2030)
		540,1624
		540,406*/
	}
	

public static String randomnum() {
		
		UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString().substring(0, 9);
        StringBuffer sbf = new StringBuffer(randomUUIDString); 
              // Reporter.log("Reg No: " +sbf.toString());
      return sbf.toString();
      
	}

public static String randomvalue() {
	String randomNumbers = RandomStringUtils.randomNumeric(9);
	String phNo = 8+randomNumbers;
	return phNo;
}

public void SetInput(String SheetName,int row,int column,String Value) throws FileNotFoundException ,IOException
{
	File src = new File("./src/JAWA-mWeb-Input.xlsx");
//	FileInputStream fis = new FileInputStream(src);
	 FileInputStream ExcelFileToRead = new FileInputStream("./src/JAWA-mWeb-Input.xlsx");
        XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
        XSSFFormulaEvaluator.evaluateAllFormulaCells(wb);
        XSSFSheet sheet = wb.getSheet("signup");

        sheet.createRow(row).createCell(column).setCellValue(Value);

        FileOutputStream out =  new FileOutputStream(new File("./src/JAWA-mWeb-Input.xlsx"));                
        wb.write(out);
        out.close();
		
   

    }


	
	
	}

