package com.amazon.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.amazon.pages.AmazonHomePage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import comonlibs.implementation.CommonDriver;
import comonlibs.implementation.ScreenshotControl;
import comonlibs.utils.ConfigFileReadUtils;

public class BaseTest {

	CommonDriver cmnDriver;

	String url;

	AmazonHomePage amazonHomepage;

	WebDriver driver;

	ScreenshotControl screenshotControl;

	static String currentWorkingDirectory;
	static String projectName;
	static String executionStartTime;
	static String reportFileName;

	static String configFilepath;
	static Properties configProperties;

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest extentTest;

	static {

		Date date = new Date();
		executionStartTime = String.valueOf(date.getTime());

		currentWorkingDirectory = System.getProperty("user.dir");

		projectName = "AmazonProject";

		reportFileName = String.format("%s/reports/%s_%s.html", currentWorkingDirectory, projectName,
				executionStartTime);

		configFilepath = String.format("%s/config/config.properties", currentWorkingDirectory);

	}

	@BeforeSuite(alwaysRun = true)
	public void preSetup() throws Exception {

		configProperties = ConfigFileReadUtils.configFileReader(configFilepath);

		htmlReporter = new ExtentHtmlReporter(reportFileName);

		extent = new ExtentReports();

		extent.attachReporter(htmlReporter);

	}

	@BeforeClass(alwaysRun = true)
	public void setup() throws Exception {

		extentTest = extent.createTest("Setup - Invoking Browser and navigating to base URL");

		String browserType = configProperties.getProperty("browserType");

		extentTest.log(Status.INFO, "The browser type is - " + browserType);
		cmnDriver = new CommonDriver(browserType);

		int elementDetectionTimeout = Integer.parseInt(configProperties.getProperty("elementDetectionTimeout"));
		extentTest.log(Status.INFO, "Implicit wait was set to - " + elementDetectionTimeout);
		cmnDriver.setElementDetectionTimeout(elementDetectionTimeout);

		int pageLoadTimeout = Integer.parseInt(configProperties.getProperty("elementDetectionTimeout"));
		extentTest.log(Status.INFO, "Page load timeout was set to - " + pageLoadTimeout);
		cmnDriver.setPageloadTimeout(pageLoadTimeout);

		url = configProperties.getProperty("baseUrl");
		extentTest.log(Status.INFO, "Base URL - " + url);
		cmnDriver.navigateToFirstUrl(url);

		driver = cmnDriver.getDriver();

		amazonHomepage = new AmazonHomePage(driver);

		screenshotControl = new ScreenshotControl(driver);
	}

	@AfterClass(alwaysRun = true)
	public void cleanUp() throws Exception {

		extentTest = extent.createTest("Clean Up");

		extentTest.log(Status.INFO, "Close all the browsers");
		cmnDriver.closeAllBrowsers();

	}

	@AfterSuite(alwaysRun = true)
	public void postCleanUp() {

		extent.flush();

	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws Exception {
		String methodName = result.getName();

		if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.log(Status.PASS, "Test case pass - " + methodName);
		} else if (result.getStatus() == ITestResult.FAILURE) {
			extentTest.log(Status.FAIL, "Test case fail - " + methodName);

			String screenhotFilename = String.format("%s/screenshots/%s_%s.jpeg", currentWorkingDirectory, methodName,
					executionStartTime);

			screenshotControl.captureAndSaveScreenshot(screenhotFilename);

			extentTest.addScreenCaptureFromPath(screenhotFilename);
		} else {
			extentTest.log(Status.SKIP, "Test case skip - " + methodName);
		}
	}

}
