/**
 *   File Name: AllProductsPage.java<br>
 *
 *   Yutaka<br>
 *   Created: Jul 11, 2017
 *   
 */

package com.connectedio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * AllProductsPage //ADDD (description of class)
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
public class AllProductsPage extends Common {
	
	String closePopUpAddingItemToCartBtn = ".notifier.success.message_wrap > img";
	String homeTab = ".active > a";
	String yCableAddToCart = ".col-xs-12:nth-child(10) .dual_button_wrap.full-width > a:nth-child(2)";
	
	public AllProductsPage(WebDriver driver) {
		super(driver);
	}

	public void closePopUpAddingProductToCart() {
		driver.findElement(By.cssSelector(closePopUpAddingItemToCartBtn)).click();
	}
	
	public String navigateToHomePage() {
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(homeTab)).click();
		return driver.getCurrentUrl();
	}
	
	public void addYKableToCart() {
		driver.findElement(By.cssSelector(yCableAddToCart)).click();
	}
	
}
