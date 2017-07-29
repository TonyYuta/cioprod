/**
 *   File Name: LoginTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Jul 27, 2017
 *   
 */

package com.connectedio;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * LoginTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class LoginTest extends TestData {
	
	LoginPage loginPage;
	
//	@BeforeClass(alwaysRun = true)
	@BeforeMethod(alwaysRun = true)
		public void setUp() {			
		driverFactory = new DriverFactory();
		driver = driverFactory.getDriver(BROWSER); // browser type received from CLO
		driver.get(homePageUrl);
		common = new Common(driver);
		loginPage = new LoginPage(driver);
	}	
	
	@AfterMethod() 
	public void afterTC() {
		//driver.close();
		//driver.quit();
		driverFactory.closeBrowser(driver);
	}	
	
	@AfterClass(alwaysRun = false)
	public void tearDown() {
		driverFactory.quitBrowser(driver);
	}
	
	@Test(enabled = true, groups = {"login", "products", "regression", "all"}, priority = 0)
	public void testInvalidCredentialsErrorFromLoginPage() {
		String expected = "Invalid Email or Password";
		String actual = "";
		common.openHomePage();
		common.opeLogInPopUp();
		common.loginUser(userName01, invalidPassword);
		actual = loginPage.loginUserOnLoginPage(userEmail01, invalidPassword);
		Assert.assertEquals(actual, expected, "login not successfull");
	}
	

}
