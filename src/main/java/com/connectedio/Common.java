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
	
	private WebDriver driver;

	//cssSelector
	public String homePageTab = ".active>a";
	public String allProductsTab = ".mega-menu-dropdown.su_products .mega-menu.row .col-md-6.col-lg-offset-6.col-md-offset-6:nth-child(1)>li:first-child>a";
	public String logInBtn = ".header_login.clickon_to_drop>a";
	public String closeLogInPopUp = ".close.fa.fa-close";
	public String loginBtnInPopUp = "#submit_button";
	
	public Common(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openHomePage() {
		driver.findElement(By.cssSelector(homePageTab)).click();
	}
	
	public void openAllProductsPage() {
		System.out.println("======================= debug 3 =======================");
		driver.findElement(By.cssSelector(allProductsTab));
		System.out.println("======================= debug 4 =======================");
	}
	
	public String opeLogInPopUp() {
		System.out.println("======================= debug 6 =======================");
		driver.findElement(By.cssSelector(logInBtn)).click();
		return driver.findElement(By.cssSelector(loginBtnInPopUp)).getAttribute("name");
	}

	

}
