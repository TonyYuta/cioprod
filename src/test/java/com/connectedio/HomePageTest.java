package com.connectedio;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestData {
	
	@Test(enabled = false, groups = {"driver", "regression", "all"}, priority = 0)
	public void testDriver() {
		Assert.assertEquals(driver, driver);
	}
	
	@Test(enabled = false, groups = {"products", "regression", "all"}, priority = 0)
	public void testOpenLogInPopUp()  {
		String expected = "login";
		String actual = "";
		actual = common.opeLogInPopUp();
		Assert.assertEquals(actual, expected, "Button LOGIN lable doesn't match expected");	
	}
  
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToAllProductsPage() {
		String expected = "https://www.connectedio.com/products";
		String actual = "";
		actual = common.navigateToAllProductsPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to All Products page");
	}
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToUseCasesPage() {
		String expected = "https://www.connectedio.com/pages/product_cases";
		String actual = "";
		actual = common.navigateToUseCasesPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to Use Case page");
	}
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToCustomerTestimonialsPage() {
		String expected = "https://www.connectedio.com/pages/testimonials";
		String actual = "";
		actual = common.navigateToCustomerTestimonialsPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to Testmonials page");
	}

	

	
	

	
	
	
}
