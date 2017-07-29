/**
 *   File Name: TestData.java<br>
 *
 *   Yutaka<br>
 *   Created: Jul 27, 2017
 *   
 */

package com.connectedio;

import static java.lang.System.getProperties;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * TestData //ADDD (description of class)
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
public class TestData {
	
	public String userName01 = "userName01";	 
	public String userEmail01 = "userCIOEmail01@mail.com";	 
	public String invalidPassword = "invalidPassword";  
	public String homePageUrl = "https://www.connectedio.com/";

	Common common;
	LoginPage loginPage;
	ContactUsPage contactUsPage;
	ProductsPage productsPage;
	
	DriverFactory driverFactory;

	WebDriver driver;
	
	//reading the properties file to launch the driver in the correct env with CLA 
    private static  Properties ENV_PROPERTIES = getProperties();
    //specifying the projects environment  
    public static  String ENV_NAME = (String) ENV_PROPERTIES.get("env");
    //specifying a browser 
    public static String BROWSER = (String) ENV_PROPERTIES.get("browser");
    //specifying the username 
    public static  String USERNAME = (String) ENV_PROPERTIES.get("username");
    //specifying the password 
    public static  String PASSWORD = (String) ENV_PROPERTIES.get("password");
    //specifying the secret answer 
    public static  String SECRET = (String) ENV_PROPERTIES.get("secret");
	
	
	
//	@BeforeClass(alwaysRun = true)
	@BeforeMethod(alwaysRun = true)
		public void setUp() {			
		driverFactory = new DriverFactory();
		driver = driverFactory.getDriver(BROWSER); // browser type received from CLO
		driver.get(homePageUrl);
		common = new Common(driver);
		loginPage = new LoginPage(driver);
		contactUsPage = new ContactUsPage(driver);
		productsPage = new ProductsPage(driver);
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
	
    
    
}
