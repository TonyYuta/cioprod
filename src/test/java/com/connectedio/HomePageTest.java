package com.connectedio;

import static java.lang.System.getProperties;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
	
	private WebDriver driver;
	
	Common common;
	ContactUsPage contactUsPage;
	ProductsPage productsPage;
	DriverFactory driverFactory;
	
	String param;

	
	   //reading the properties file to launch the driver in the correct env with CLA 
    private static final Properties ENV_PROPERTIES = getProperties();
    //specifying the projects environment  
    public static final String ENV_NAME = (String) ENV_PROPERTIES.get("env");
    //specifying a browser 
    public static final String BROWSER = (String) ENV_PROPERTIES.get("browser");
    //specifying the username 
    public static final String USERNAME = (String) ENV_PROPERTIES.get("username");
    //specifying the password 
    public static final String PASSWORD = (String) ENV_PROPERTIES.get("password");
    //specifying the secret answer 
    public static final String SECRET = (String) ENV_PROPERTIES.get("secret");
    
	
	public String homePageUrl = "https://www.connectedio.com/";
		
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
	
	@Test(enabled = true, groups = {"driver", "regression", "all"}, priority = 0)
	public void browserInputTest() {
		System.out.println("==================" + BROWSER + "==================");
	}
	
	@Test(enabled = true, groups = {"driver", "regression", "all"}, priority = 0)
	public void testDriver() {
		Assert.assertEquals(driver, driver);
	}
		
	@Test(enabled = true, groups = {"products", "regression", "all"}, dependsOnGroups = {"driver"}, priority = 0)
	public void testOpenAllProductsPage()  {
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    //driver.manage().window().maximize();
		String expected = "Connected IO provides superior and affordable cellular modems and routers for cloud-based machine-to-machine communications and the IoT :";
		common.openAllProductsPage();
		Assert.assertEquals(driver.getTitle(), expected, "title All Products Page doesn't match expected");		
	}	
	
	//@Test(enabled = true, groups = {"products", "regression", "all"}, dependsOnGroups = {"driver"}, priority = 0)
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testOpenLogInPopUp()  {
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String expected = "login";
		String actual = "";
		actual = common.opeLogInPopUp();
		Assert.assertEquals(actual, expected, "Button LOGIN lable doesn't match expected");	
	}
  
	

	
	
	
}
