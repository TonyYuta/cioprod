package com.connectedio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest {
	
	private WebDriver driver;
	
	Common common;
	ContactUsPage contactUsPage;
	ProductsPage productsPage;
	
	
	@BeforeClass(alwaysRun = true)
		public void setUp() {	
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				
		common = new Common(driver);
		contactUsPage = new ContactUsPage(driver);
		productsPage = new ProductsPage(driver);
		
		}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
	
	@Test(enabled = false, groups = {"driver", "regression", "all"}, priority = 0)
	public void testDriver() {
		Assert.assertEquals(driver, driver);
	}
		
	//@Test(enabled = true, groups = {"products", "regression", "all"}, dependsOnGroups = {"driver"}, priority = 0)
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testOpenAllProductsPage()  {
		String expected = "qqq";
		common.openAllProductsPage();
		Assert.assertEquals(driver.getTitle(), expected, "title All Products Page doesn't match expected");
	}
  
}
