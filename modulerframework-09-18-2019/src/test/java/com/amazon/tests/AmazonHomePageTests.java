package com.amazon.tests;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import comonlibs.implementation.CommonDriver;
import designPatterns.AmazonHomePage;

public class AmazonHomePageTests  extends BaseTest{
	@Test(priority = 0)
	public void verifySearchProduct() throws Exception {
		extentTest = extent.createTest("TC - 001 - Verify Search product functionality");

		String product = "Apple Watch";
		String category = "Electronics";

		extentTest.log(Status.INFO, "Search Product - " + product + " and cateory was - " + category);
		amazonHomepage.searchProduct(product, category);


}
	@Test(priority=-1000)
	public void verifyTittleOfTheWebpage() throws Exception{
		extentTest = extent.createTest("TC - 002 - Verify Title of the page");

		String expectedTitle = "Amazon Home Page";

		String actualTitle = cmnDriver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
}