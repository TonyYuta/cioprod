package com.connectedio;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestData {

	@Test(enabled = true, groups = {"driver", "regression", "all"}, priority = 0)
	public void browserInputTest() {
		System.out.println("================= " + BROWSER + "==================");
	}
	
	@Test(enabled = true, groups = {"driver", "regression", "all"}, priority = 0)
	public void testDriver() {
		Assert.assertEquals(driver, driver);
	}
		
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testOpenAllProductsPage()  {
		String expected = "Connected IO provides superior and affordable cellular modems and routers for cloud-based machine-to-machine communications and the IoT :";
		common.openAllProductsPage();
		Assert.assertEquals(driver.getTitle(), expected, "title All Products Page doesn't match expected");		
	}	
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testOpenLogInPopUp()  {
		String expected = "login";
		String actual = "";
		actual = common.opeLogInPopUp();
		Assert.assertEquals(actual, expected, "Button LOGIN lable doesn't match expected");	
	}
  

	

	
	

	
	
	
}
