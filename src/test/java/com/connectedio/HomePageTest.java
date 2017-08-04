package com.connectedio;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestData {
	
	@Test(enabled = false, groups = {"driver", "regression", "all"}, priority = 0)
	public void testDriver() {
		Assert.assertEquals(driver, driver);
	}
	
	@Test(enabled = false, groups = {"products", "regression", "all"}, priority = 0)
	public void testOpenLogInPopUp()  {
		String expected = "login";
		String actual = "";
		actual = common.opeLogInPopUp();
		Assert.assertEquals(actual, expected, "Button LOGIN lable doesn't match expected");	
	}
 
	// ALL PRODUCTS pages
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToAllProductsPage() {
		String expected = "https://www.connectedio.com/products";
		String actual = "";
		actual = common.navigateToAllProductsPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to All Products page");
	}
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToUseCasesPage() {
		String expected = "https://www.connectedio.com/pages/product_cases";
		String actual = "";
		actual = common.navigateToUseCasesPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to Use Case page");
	}
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToCustomerTestimonialsPage() {
		String expected = "https://www.connectedio.com/pages/testimonials";
		String actual = "";
		actual = common.navigateToCustomerTestimonialsPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to Testmonials page");
	}

// SERVICES pages
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToOurServicesPage() {
		String expected = "https://www.connectedio.com/pages/services";
		String actual = "";
		actual = common.navigateToOurServicesPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to OUR SERVICES page");
	}
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToProductDesignPage() {
		String expected = "https://www.connectedio.com/pages/services/product-design";
		String actual = "";
		actual = common.navigateToProductDesignPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to PRODUCT DESIGN page");
	}
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToTestingAndCertificationPage() {
		String expected = "https://www.connectedio.com/pages/services/product-testing";
		String actual = "";
		actual = common.navigateToTestingAndSertificationPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to TESTING AND CERTIFICATION page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToLogisticsConsultingPage() {
		String expected = "https://www.connectedio.com/pages/services/logistics-consulting_";
		String actual = "";
		actual = common.navigateToLogisticsConsultingTabPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to LOGISTICS CONSULTING page");
	}
// SUPPORT pages
	
	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToFaqPage() {
		String expected = "https://www.connectedio.com/pages/faq";
		String actual = "";
		actual = common.navigateToFaqTabPage();
		Assert.assertEquals(actual, expected, "URI doesn't match to FAQ page");
	}

	@Test(enabled = false, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToDevicePortal2Page() {
		String expected = "http://cloudc.connectedio.com/index.html?id=Tjh5dTNwUE9kMHkvcTlMUDZoS0t3ZmJKYzV3TXN5WHBEdm5QdEc3R25MUT06MTUwMTgzNzM5NgCIOG8#/devices";
		String actual = "";
		actual = homePage.navigateToDevicePortalV2Tab();
		Assert.assertEquals(actual, expected, "URI doesn't match to DEVICE PORTAL 2.0 page");
	}
	
	@Test(enabled = false, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToDevicePortal1Page() {
		String expected = "http://clouda.connectedio.com/index.html?id=dDgrU2lIL20rS0NQK01rVnJVcmdsWDY1TXlrdkhoWXdUUTJNVzlEQVFpMD06MTUwMTgzNzQ2OACIOG8#/devices";
		String actual = "";
		actual = homePage.navigateToDevicePortalV1Tab();
		Assert.assertEquals(actual, expected, "URI doesn't match to DEVICE PORTAL 1.0 page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToSoftwarePage() {
		String expected = "https://www.connectedio.com/pages/software";
		String actual = "";
		actual = common.navigateToSoftwareTab();
		Assert.assertEquals(actual, expected, "URI doesn't match to SOFTWARE page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToAboutUsPage() {
		String expected = "https://www.connectedio.com/pages/aboutus";
		String actual = "";
		actual = common.navigateToAboutUsTab();
		Assert.assertEquals(actual, expected, "URI doesn't match to ABOUT US page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToManagementTeamPage() {
		String expected = "https://www.connectedio.com/ourteam";
		String actual = "";
		actual = common.navigateToManagementTeamTab();
		Assert.assertEquals(actual, expected, "URI doesn't match to MANAGEMENT TEAM page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToWebsiteDisclamerPage() {
		String expected = "https://www.connectedio.com/pages/websitedisclaimer";
		String actual = "";
		actual = common.navigateToWebsiteDisclaimerTab();
		Assert.assertEquals(actual, expected, "URI doesn't match to WEBSITE DISCLAMER page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToPartnersPage() {
		String expected = "https://www.connectedio.com/partners";
		String actual = "";
		actual = common.navigateToPartnersTab();
		Assert.assertEquals(actual, expected, "URI doesn't match to PARTNERS page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToPartnersLoginPage() {
		String expected = "https://www.connectedio.com/users/order_history";
		String actual = "";
		actual = common.navigateToPartnersLoginTab();
		Assert.assertEquals(actual, expected, "URI doesn't match to PARTNERS LOGIN page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToPartnersSignUpPage() {
		String expected = "https://www.connectedio.com/partners/new_partner_details";
		String actual = "";
		actual = common.navigateToPartnersSignUpTab();
		Assert.assertEquals(actual, expected, "URI doesn't match to PARTNERS SIGN UP page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToRegisterDealPage() {
		String expected = "https://www.connectedio.com/partners/register_deal";
		String actual = "";
		actual = common.navigateToRegisterDealTab();
		Assert.assertEquals(actual, expected, "URI doesn't match to REGISTER DEAL page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToCompanyNewsPage() {
		String expected = "https://www.connectedio.com/pages/news";
		String actual = "";
		actual = common.navigateToCompanyNewsTab();
		Assert.assertEquals(actual, expected, "URI doesn't match to COMPANY NEWS page");
	}

	@Test(enabled = true, groups = {"products", "regression", "all"}, priority = 0)
	public void testNavigateToContactUsPage() {
		String expected = "https://www.connectedio.com/pages/contact_us";
		String actual = "";
		actual = common.navigateToContactUsTab();
		Assert.assertEquals(actual, expected, "URI doesn't match to CONTACT US page");
	}


	

	
	

	
	
	
}
