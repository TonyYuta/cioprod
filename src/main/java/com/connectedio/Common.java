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
//	public String allProductsTab = ".mega-menu-dropdown.su_products .mega-menu.row .col-md-6.col-lg-offset-6.col-md-offset-6:nth-child(1)>li:first-child>a";
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
		String result = "";
		action = new Actions(driver);		
		we = driver.findElement(By.cssSelector(labelMyAccount));
System.out.println("================= debug02 =================" );
		action.moveToElement(we).build().perform();
System.out.println("================= debug03 =================" );
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(logOutBtn)).click();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		return result = "nnnnnnnnnnnnnnnnnnnnnnnnnnn";
	}
	
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
	
}
