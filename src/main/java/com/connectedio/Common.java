/**
 *   File Name: Common.java<br>
 *
 *   Yutaka<br>
 *   Created: Jul 11, 2017
 *   
 */

package com.connectedio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Common //ADDD (description of class)
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
public class Common {
	
	WebDriver driver;
	Actions action;
	WebElement we;

	//cssSelector
	public String homePageTab = ".active>a";
	public String logInBtn = ".header_login.clickon_to_drop>a";
	public String closeLogInPopUp = ".close.fa.fa-close";
	public String userNameField = "#loginForm > input[type='text']:nth-child(1)";
	public String passwordField = "#loginForm > input[type='password']:nth-child(2)";
	public String closeLoginPopupBtn = ".close.fa.fa-close";
	public String headerUser = ".header_user_message>span";
	public String labelMyAccount = ".header_my_account.click_to_drop>a";
	public String logOutBtn = ".header_logout>a";
	public String productsTab = ".mega-menu-dropdown.su_products>a";
	public String allProductsTab = ".mega-menu-dropdown.su_products .col-md-6.col-lg-offset-6.col-md-offset-6>li:nth-child(1)>a";
	public String useCasesTab = ".mega-menu-dropdown.su_products .col-md-6.col-lg-offset-6.col-md-offset-6 > li:nth-child(2)>a";
	public String customerTestimonialsTab = ".mega-menu-dropdown.su_products .col-md-6.col-lg-offset-6.col-md-offset-6 > li:nth-child(3)>a";
	public String servicesTab = ".mega-menu-dropdown.su_services>a";
	public String ourServicesTab = ".mega-menu-dropdown.su_services .col-md-6.col-lg-offset-6.col-md-offset-6>li:nth-child(1)>a";
	public String productDesignTab = ".mega-menu-dropdown.su_services .col-md-6.col-lg-offset-6.col-md-offset-6>li:nth-child(2)>a";
	public String testingAndSertificationTab = ".mega-menu-dropdown.su_services .col-md-6.col-lg-offset-6.col-md-offset-6>li:nth-child(3)>a";
	public String logisticsConsultingTab = ".mega-menu-dropdown.su_services .col-md-6.col-lg-offset-6.col-md-offset-6>li:nth-child(4)>a";
	public String supportTab = ".mega-menu-dropdown.su_support>a";
	public String faqTab = ".mega-menu-dropdown.su_support .col-md-6.col-lg-offset-6.col-md-offset-6>li:first-child>a";
	public String devicePortalV2Tab = ".mega-menu-dropdown.su_support .col-md-6.col-lg-offset-6.col-md-offset-6>li:nth-child(2)>a";
	public String devicePortalV1Tab = ".mega-menu-dropdown.su_support .col-md-6.col-lg-offset-6.col-md-offset-6>li:nth-child(3)>a";
	public String softwareTab = ".mega-menu-dropdown.su_support .col-md-6.col-lg-offset-6.col-md-offset-6>li:nth-child(4)>a";
	public String corporateTab = ".mega-menu-dropdown.su_corporate>a";
	public String aboutUsTab = ".mega-menu-dropdown.su_corporate .col-md-6.col-lg-offset-6.col-md-offset-6>li:nth-child(1)>a";
	public String managementTeamTab = ".mega-menu-dropdown.su_corporate .col-md-6.col-lg-offset-6.col-md-offset-6>li:nth-child(2)>a";
	public String websiteDisclaimerTab = ".mega-menu-dropdown.su_corporate .col-md-6.col-lg-offset-6.col-md-offset-6>li:nth-child(6)>a";
	public String partnersTab = ".col-lg-6>li:first-child>a";
	public String partnersLoginTab = ".col-lg-6>li:nth-child(2)>a";
	public String partnersSignUpTab = ".col-lg-6>li:nth-child(3)>a";
	public String registerDealTab = ".col-lg-6>li:nth-child(4)>a";
	public String companyNewsTab = ".col-lg-6>li:nth-child(5)>a";
	public String contactUsTab = ".col-lg-6>li:nth-child(6)>a";	
	public String cartBtn = ".header_left.full-width > ul > li:nth-child(3)";	
	public String goToCartPageBtn = ".header_cart.click_to_drop > ul > li > a";	
	
    // id
	public String pickMeSignedInCheckbox = "checkbox_id";
	public String loginBtnInPopUp = "submit_button";

	// className
	public String loginErrorMsg = "log_error";	
	
	public Common(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openHomePage() {
		driver.findElement(By.cssSelector(homePageTab)).click();
	}
	
	public String opeLogInPopUp() {
		driver.findElement(By.cssSelector(logInBtn)).click();
		return driver.findElement(By.id(loginBtnInPopUp)).getAttribute("name");
	}

	public String loginInvalidUserInPopUp(String userName, String password) {
		String result = "";
		driver.findElement(By.cssSelector(userNameField)).sendKeys(userName);
		driver.findElement(By.cssSelector(passwordField)).sendKeys(password);
		driver.findElement(By.id(loginBtnInPopUp)).click();
		result = driver.findElement(By.className(loginErrorMsg)).getText();
		return result;
	}
	
	public String loginValidUserInPopUp(String userName, String password) {
		String result = "Hi, Tony Yutaka_";
		driver.findElement(By.cssSelector(userNameField)).sendKeys(userName);
		driver.findElement(By.cssSelector(passwordField)).sendKeys(password);
		driver.findElement(By.id(loginBtnInPopUp)).click();
		result = driver.findElement(By.cssSelector(headerUser)).getText();
		return result;
	}

	public String logOut() {
		String result = "Log Out";
		action = new Actions(driver);		
		we = driver.findElement(By.cssSelector(labelMyAccount));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(logOutBtn)).click();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		return result;
	}
	
	// Products Tab
	
	public String navigateToAllProductsPage() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(productsTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(allProductsTab)).click();
		return driver.getCurrentUrl();
	}
	
	public String navigateToUseCasesPage() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(productsTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(useCasesTab)).click();
		return driver.getCurrentUrl();
	}
	
	public String navigateToCustomerTestimonialsPage() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(productsTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(customerTestimonialsTab)).click();
		return driver.getCurrentUrl();
	}
	
	// Services Tab
	
	public String navigateToOurServicesPage() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(servicesTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(ourServicesTab)).click();
		return driver.getCurrentUrl();
	}
	
	public String navigateToProductDesignPage() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(servicesTab));
		action.moveToElement(we).build().perform();
		try{Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(productDesignTab)).click();
		return driver.getCurrentUrl();
	}
	
	public String navigateToTestingAndSertificationPage() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(servicesTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(testingAndSertificationTab)).click();
		return driver.getCurrentUrl();
	}	
	
	public String navigateToLogisticsConsultingTabPage() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(servicesTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(logisticsConsultingTab)).click();
		return driver.getCurrentUrl();
	}
	
	// Support Tab
	
	public String navigateToFaqTabPage() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(supportTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(faqTab)).click();
		return driver.getCurrentUrl();
	}

	public String navigateToSoftwareTab() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(supportTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(softwareTab)).click();
		return driver.getCurrentUrl();
	}

	// Corporate Tab
	
	public String navigateToAboutUsTab() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(corporateTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(aboutUsTab)).click();
		return driver.getCurrentUrl();
	}
	
	public String navigateToManagementTeamTab() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(corporateTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(managementTeamTab)).click();
		return driver.getCurrentUrl();
	}

	public String navigateToWebsiteDisclaimerTab() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(corporateTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(websiteDisclaimerTab)).click();
		return driver.getCurrentUrl();
	}
	
	public String navigateToPartnersTab() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(corporateTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(partnersTab)).click();
		return driver.getCurrentUrl();
	}
	
	public String navigateToPartnersLoginTab() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(corporateTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(partnersLoginTab)).click();
		return driver.getCurrentUrl();
	}
	
	public String navigateToPartnersSignUpTab() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(corporateTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(partnersSignUpTab)).click();
		return driver.getCurrentUrl();
	}
	
	public String navigateToRegisterDealTab() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(corporateTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(registerDealTab)).click();
		return driver.getCurrentUrl();
	}
	
	public String navigateToCompanyNewsTab() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(corporateTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(companyNewsTab)).click();
		return driver.getCurrentUrl();
	}
	
	public String navigateToContactUsTab() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(corporateTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(contactUsTab)).click();
		return driver.getCurrentUrl();
	}
	
	public String openCart() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(cartBtn));
		action.moveToElement(we).build().perform();
		driver.findElement(By.cssSelector(goToCartPageBtn)).click();
		return driver.getCurrentUrl();
	}
	
}
