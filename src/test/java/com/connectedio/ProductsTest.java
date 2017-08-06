/**
 *   File Name: ProductsTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Aug 5, 2017
 *   
 */

package com.connectedio;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * ProductsTest //ADDD (description of class)
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
public class ProductsTest extends TestData {
	
	@Test(enabled = true, groups = {"cart", "products", "regression", "all"}, priority = 0)
	public void testNavigateToContactUsPage() {
		String expected = "https://www.connectedio.com/cart";
		String actual = "";
		common.navigateToAllProductsPage();
		allProductsPage.addYKableToCart();
		allProductsPage.closePopUpAddingProductToCart();
		allProductsPage.navigateToHomePage();
		actual = common.openCart();
		Assert.assertEquals(actual, expected, "URI doesn't match to MY CART page");
	}
	
	
}
