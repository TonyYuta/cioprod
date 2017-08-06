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
import org.testng.annotations.BeforeClass;
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
	
	public String invalidUserName01 	= "userName01";	 
	public String invalidUserEmail01 	= "userCIOEmail01@mail.com";	 
	public String invalidPwd01 			= "invalidPassword";  

	public String validUserName01 		= "yutakatony@mail.com"; 
	public String validEmail01 			= "yutakatony@mail.com"; 
	public String validPwd01 			= "vitoto";  

	public String homePageUrl 			= "https://www.connectedio.com/";

	public static int TIME1 = 10;
	public static int TIME2 = 200;
	public static int TIME3 = 3000;
	
	Common common;
	LoginPage loginPage;
	HomePage homePage;
	ContactUsPage contactUsPage;
	AllProductsPage allProductsPage;	
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
    
    @BeforeClass(alwaysRun = true)
    public void setUpBeforeClass() {
    	driverFactory = new DriverFactory();
    }
    
    @BeforeMethod(alwaysRun = true)
	public void setUpBeforeMethod() {	
    	try {
			driver = driverFactory.getDriver(BROWSER); // browser type received from CLO
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	common = new Common(driver);
    	loginPage = new LoginPage(driver);
    	homePage = new HomePage(driver);
    	contactUsPage = new ContactUsPage(driver);
    	allProductsPage = new AllProductsPage(driver);
		driver.get(homePageUrl);
		common.opeLogInPopUp();
		common.loginValidUserInPopUp(validUserName01, validPwd01);
	}
    
	@AfterMethod(alwaysRun = true) 
	public void afterTC() {
		common.logOut();
		driverFactory.closeBrowser(driver);
	}	
	
	@AfterClass(alwaysRun = true)
	public void tearDownAfterClass() {
		driverFactory.quitBrowser(driver);
	}

	public static void SLEEP1() {
		try {
			Thread.sleep(TestData.TIME1);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
	}
	
	public static void SLEEP2() {
		try {
			Thread.sleep(TestData.TIME2);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
	}
	
	public static void SLEEP3() {
		try {
			Thread.sleep(TestData.TIME3);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
	}

	
	
}
