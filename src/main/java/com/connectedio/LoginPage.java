/**
 *   File Name: LoginPage.java<br>
 *
 *   Yutaka<br>
 *   Created: Jul 27, 2017
 *   
 */

package com.connectedio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * LoginPage //ADDD (description of class)
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
public class LoginPage extends Common {

	//private WebDriver driver;
	
	//cssSelector
	public String emailFieldOnLoginPage = "input[name='username']:last-child";
	public String passwordFieldOnLoginPage = "input[name='loginpassword']:last-child";
	public String loginBtnOnLoginPage = "input[type='submit']:nth-child(2)";
	public String cancelBtnOnLoginPage = "input[type='reset']";
	
	// className
	public String loginErrorMsg = "log_error";
	
	// id
	public String pickMeSignedInCheckboxOnLoginPage = "keepSignedIn";
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public String loginUserOnLoginPage(String userName, String password) {
		String result = "";
		driver.findElement(By.cssSelector(emailFieldOnLoginPage)).sendKeys(userName);
		driver.findElement(By.cssSelector(passwordFieldOnLoginPage)).sendKeys(password);
		driver.findElement(By.cssSelector(loginBtnOnLoginPage)).click();
		result = driver.findElement(By.className(loginErrorMsg)).getText();
		return result;
	}
	
}
