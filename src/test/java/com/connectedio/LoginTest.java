/**
 *   File Name: LoginTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Jul 27, 2017
 *   
 */

package com.connectedio;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * LoginTest //ADDD (description of class)
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
public class LoginTest extends TestData {

	@Test(enabled = false, groups = {"products", "login", "regression", "all"}, priority = 2)
	public void testInvalidCredentialsErrorFromPopUpLogin() {
		String expected = "Invalid Email or Password";
		String actual = "";
		common.openHomePage();
		common.opeLogInPopUp();
		actual = common.loginInvalidUserInPopUp(invalidUserName01, invalidPwd01);
		Assert.assertEquals(actual, expected, "login not successfull");
	}
	
	@Test(enabled = false, groups = {"login", "regression", "all"}, priority = 1)
	public void testInvalidCredentialsErrorFromLoginPage() {
		String expected = "Invalid Email or Password";
		String actual = "";
		common.openHomePage();
		common.opeLogInPopUp();
		actual = loginPage.loginUserOnLoginPage(invalidUserEmail01, invalidPwd01);
		Assert.assertEquals(actual, expected, "login not successfull");
	}
	
	@Test(enabled = false, groups = {"login", "regression", "all"}, priority = 0)
	public void testValidCredentialsLoginPopUp() {
		String expected = "Hi, Tony Yutaka";
		String actual = "";
		common.openHomePage();
		common.opeLogInPopUp();
		actual = common.loginValidUserInPopUp(validUserName01, validPwd01);
		Assert.assertEquals(actual, expected, "Username title doesn't match to User");
	}
	
	@Test(enabled = false, groups = {"login", "regression", "all"}, priority = 0)
	public void testValidCredentialsLoginPopUp02() {
		String expected = "Hi, Tony Yutaka";
		String actual = "";
		common.openHomePage();
		common.opeLogInPopUp();
		actual = common.loginValidUserInPopUp(validUserName01, validPwd01);
		Assert.assertEquals(actual, expected, "Username title doesn't match to User");
	}
	
	@Test(enabled = false, groups = {"login", "regression", "all"}, priority = 0)
	public void testValidCredentialsLoginPopUp03() {
		String expected = "Hi, Tony Yutaka";
		String actual = "";
		//common.openHomePage();
		actual = common.loginValidUserInPopUp(validUserName01, validPwd01);
		Assert.assertEquals(actual, expected, "title doesn't match to expected");
	}
	
	@Test(enabled = false, groups = {"login", "regression", "all"}) 
	public void testLoginLogoutInPopUp01() {
		common.opeLogInPopUp();
		common.loginValidUserInPopUp(validUserName01, validPwd01);
//SLEEP2();
		common.logOut();
//SLEEP2();
	}
	

	
	
}
