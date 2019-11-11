package in.guru99.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends baseTests {

	@Test(priority = 0)
	public void verifylogin() throws Exception {
		extentTest = extent.createTest("TC - 001 - Verify login functionality");
		String sUserid = "mngr223633";
		String sPassword = "evytumy";
		loginpage.userlogin(sUserid, sPassword);
		String managerIdText = driver.findElement(By.xpath("//td[contains(text(),'Manger Id')]")).getText();
		String actualUserIdFromHomepage = managerIdText.split(":")[1].trim();
		Assert.assertEquals(actualUserIdFromHomepage, sUserid);

	}

	@Test(priority = 1)
	public void verifyTheTitleAfterLogin() throws Exception {
		extentTest = extent.createTest("TC - 001 - Verify title of the login");

		String expectedTitle = "Guru99 Bank Manager HomePage";

		String actualTitle = cmnDriver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test(priority = 1000)
	public void navigateValue() throws Exception {
		extentTest = extent.createTest("TC - 001 - Verify navigation");
		String pagename = "New Customer";
		homepage.navigateToPage(pagename);
	}

	@Test(priority = 1500)
	public void addNewCustomer() throws Exception {
		extentTest = extent.createTest("TC - 001 - Verify add customer");
		String S_CustName = "Mrsingh";
		String gender = "Female";

		String S_Dob = "07/08/1997";
		String S_add = "ndsfkjnds";
		String S_City = "bhopal";
		String S_State = "MP";
		String S_Pin = "4471010";
		String S_Numb = "320984390";
		String S_email = "sdnkl@12.com";
		String S_Pass = "2132";
		addcustomer.userAdd(S_CustName, gender, S_Dob, S_add, S_City, S_State, S_Pin, S_Numb, S_email, S_Pass);

	}

	
	  public void cleanup() throws Exception {
	  
	  cmnDriver.closeAllBrowsers(); }
	 

}
