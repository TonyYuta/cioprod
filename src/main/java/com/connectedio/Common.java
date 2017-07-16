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
	
	public Common(WebDriver driver) {
		this.driver = driver;

	}
	
	public void openHomePage() {
		driver.findElement(By.cssSelector(homePageTab)).click();
	}
	
	public void openAllProductsPage() {
		driver.findElement(By.cssSelector(allProductsTab));
	}

	

}
