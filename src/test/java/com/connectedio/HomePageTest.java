package com.connectedio;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestData {
	
	
/*	ContactUsPage contactUsPage;
	ProductsPage productsPage;*/
	
/*		
//	@BeforeClass(alwaysRun = true)
	@BeforeMethod(alwaysRun = true)
		public void setUp() {			
		driverFactory = new DriverFactory();
		driver = driverFactory.getDriver(BROWSER); // browser type received from CLO
		driver.get(homePageUrl);
		common = new Common(driver);
		contactUsPage = new ContactUsPage(driver);
		productsPage = new ProductsPage(driver);		
	}	
	
	@AfterMethod() 
	public void afterTC() {
		driver.close();
	}	
	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		try {
			driver.quit();
		} catch (Exception e) {
		}
	}
	*/
	@Test(enabled = true, groups = {"driver", "regression", "all"}, priority = 0)
	public void browserInputTest() {
		System.out.println("================= " + BROWSER + "==================");
	}
	
	@Test(enabled = true, groups = {"driver", "regression", "all"}, priority = 0)
	public void testDriver() {
		Assert.assertEquals(driver, driver);
	}
		
	//@Test(enabled = true, groups = {"products", "regression", "all"}, dependsOnGroups = {"driver"}, priority = 0)
	//@Parameters({ "browser", "groups" })
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testOpenAllProductsPage()  {
		String expected = "Connected IO provides superior and affordable cellular modems and routers for cloud-based machine-to-machine communications and the IoT :";
		common.openAllProductsPage();
		Assert.assertEquals(driver.getTitle(), expected, "title All Products Page doesn't match expected");		
	}	
	
	//@Test(enabled = true, groups = {"products", "regression", "all"}, dependsOnGroups = {"driver"}, priority = 0)
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testOpenLogInPopUp()  {
		String expected = "login";
		String actual = "";
		actual = common.opeLogInPopUp();
		Assert.assertEquals(actual, expected, "Button LOGIN lable doesn't match expected");	
	}
  
	@Test(enabled = true, groups = {"products", "login", "regression", "all"}, priority = 0)
	public void testInvalidCredentialsErrorFromPopUpLogin() {
		String expected = "Invalid Email or Password";
		String actual = "";
		common.openHomePage();
		common.opeLogInPopUp();
		actual = common.loginUser(userName01, invalidPassword);
		Assert.assertEquals(actual, expected, "login not successfull");
	}
	
	

	
	
	
}
