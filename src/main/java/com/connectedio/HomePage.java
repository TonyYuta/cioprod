/**
 *   File Name: HomePage.java<br>
 *
 *   Yutaka<br>
 *   Created: Jul 11, 2017
 *   
 */

package com.connectedio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * HomePage //ADDD (description of class)
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
public class HomePage extends Common {
	
	/**
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public String navigateToDevicePortalV2Tab() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(supportTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(devicePortalV2Tab)).click();
		return driver.getCurrentUrl();
	}
	
	public String navigateToDevicePortalV1Tab() {
		action = new Actions(driver);
		we = driver.findElement(By.cssSelector(supportTab));
		action.moveToElement(we).build().perform();
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		driver.findElement(By.cssSelector(devicePortalV1Tab)).click();
		return driver.getCurrentUrl();
	}
	
}
