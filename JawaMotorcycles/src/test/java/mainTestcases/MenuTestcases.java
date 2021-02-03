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
public class MenuTestcases extends BaseClass {
	@Test(priority = 1, dataProvider = "login", dataProviderClass = DataProviders.class)
	public void Menu_Options_Navigations(String username, String pwd) throws Exception {
		loginp.loginpage_success(username, pwd);
	menu.Menu_Homepage_Navigations();

		menu.Menu_perak_Navigations();

		menu.Menu_jawa_Navigations();

		menu.Menu_fortytwo_Navigations();

		menu.Menu_kommuniti_kogotrails_Navigations();

		menu.Menu_kommuniti_Ijyd2019_Navigations();

		menu.Menu_kommuniti_jawanomads_Navigations();

		menu.Menu_gear_thejawarig_Navigations();

		menu.Menu_gear_riderensemble_Navigations();

		menu.Menu_dealers_Navigations();

	   menu.Menu_Deliveryestimaator_Navigations();

		menu.Menu_EMIcalculator_Navigations();

		menu.Menu_contactus_Navigations();

		menu.Menu_termsofuse_Navigations();

		menu.Menu_privacyplicy_Navigations();

		menu.Menu_disclaimer_Navigations();

	}
}
