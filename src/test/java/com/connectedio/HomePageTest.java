package com.connectedio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest {
	
	private WebDriver driver;
	
	Common common;
	ContactUsPage contactUsPage;
	ProductsPage productsPage;
	
	public String homePageUrl = "https://www.connectedio.com/";
	//public String homePageUrl = "http://www.cvent.com/";
	
	//@BeforeClass(alwaysRun = false)
	@BeforeClass(alwaysRun = true)
		public void setUp() {			
		
		System.setProperty("webdriver.gecko.driver","/Library/geckodriver");
	    DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	    capabilities.setCapability("marionette", true);
	    WebDriver driver = new FirefoxDriver();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 //   driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  //  driver.navigate().to("https://www.yahoo.com/");
		driver.get(homePageUrl);
		
		//System.setProperty("webdriver.firefox.marionette", "geckodriver");
		//FirefoxDriver driver = new FirefoxDriver();
		
		
		/*
		System.setProperty("webdriver.gecko.driver","/Library/geckodriver");
	    DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	    capabilities.setCapability("marionette", true);
	    WebDriver driver = new FirefoxDriver(capabilities);
		
		*/

		//System.setProperty("webdriver.gecko.driver", "/Library/geckodriver");

		
		//driver = new ChromeDriver();
		
        //System.setProperty("webdriver.gecko.driver","/Library/geckodriver");
        //System.setProperty("webdriver.firefox.marionette","/Library/geckodriver");     
        
        //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        //capabilities.setCapability("marionette", true);
        
	//	driver = new FirefoxDriver();
       // driver = new FirefoxDriver(capabilities);
		
		//driver.get(homePageUrl);
		/*
		driver.manage().window().maximize();
		driver.get("http://www.cvent.com/");
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		*/
		/*
		System.out.println("Welcome to Maven World");
	    System.setProperty("webdriver.gecko.driver", "/Library/geckodriver");
	    WebDriver driver = new FirefoxDriver();       
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.navigate().to("http://www.google.com");
		*/
		common = new Common(driver);
		contactUsPage = new ContactUsPage(driver);
		productsPage = new ProductsPage(driver);	
	
	}	
	
	//@AfterClass(alwaysRun = true)
	@AfterClass
	public void tearDown() {
		try {
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(enabled = false, groups = {"driver", "regression", "all"}, priority = 0)
	public void testDriver() {
		Assert.assertEquals(driver, driver);
	}
		
	//@Test(enabled = true, groups = {"products", "regression", "all"}, dependsOnGroups = {"driver"}, priority = 0)
	@SuppressWarnings("javadoc")
	@Test(enabled = false, groups = {"products", "regression", "all"}, priority = 0)
	public void testOpenAllProductsPage()  {
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String expected = "qqq";
		System.out.println("======================= debug 1 =======================");
		common.openAllProductsPage();
		System.out.println("======================= debug 2 =======================");
		System.out.println("======== debug 5 ======= driver.getTitle(): " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), expected, "title All Products Page doesn't match expected");
		
	}
	
	//@Test(enabled = true, groups = {"products", "regression", "all"}, dependsOnGroups = {"driver"}, priority = 0)
	@SuppressWarnings("javadoc")
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testOpenLogInPopUp()  {
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String expected = "login";
		String actual = "";

		System.out.println("======================= debug 7 =======================");
		actual = common.opeLogInPopUp();
		System.out.println("======================= debug 8 =======================");
		Assert.assertEquals(actual, expected, "Button LOGIN lable doesn't match expected");
		try {
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
  
	@Test(enabled = false)
	public void setUpFirefoxDriver01() {
		System.setProperty("webdriver.gecko.driver","/Library/geckodriver");
	    DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	    capabilities.setCapability("marionette", true);
	    WebDriver driver = new FirefoxDriver(capabilities);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.navigate().to("http://www.google.com");
	}
	
	@Test(enabled = false)
	public void setUpFirefoxDriver02() {
		System.setProperty("webdriver.gecko.driver","/Users/Yutaka/Downloads/geckodriver");
	    DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	    capabilities.setCapability("marionette", true);
	    WebDriver driver = new FirefoxDriver(capabilities);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.navigate().to("http://www.google.com");
	}
	
	@Test(enabled = false)
	public void setUpFirefoxDriver03() {
		System.setProperty("webdriver.gecko.driver","/Library/geckodriver");
	    DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	    capabilities.setCapability("marionette", true);
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.navigate().to("https://www.yahoo.com/");
	}
	
	
}
