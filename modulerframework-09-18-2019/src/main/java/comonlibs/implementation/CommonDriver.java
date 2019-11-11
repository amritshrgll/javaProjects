package comonlibs.implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import comonlibs.contracts.IDriver;

public class CommonDriver implements IDriver {
	
private WebDriver driver;
private int pageloadTimeout;

private int elementDetectionTimeout;

public CommonDriver(String browserType) throws Exception{
	elementDetectionTimeout = 10;
	pageloadTimeout = 20;
	browserType = browserType.trim();
	if(browserType.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if (browserType.equalsIgnoreCase("chrome-headless")) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver_76/Chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");

		driver = new ChromeDriver(option);
	}

	else if (browserType.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/geckodriver-v0.20.1-win64/geckodriver.exe");

		driver = new FirefoxDriver();
	}
	else if (browserType.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/MicrosoftWebDriver.exe");

		driver = new EdgeDriver();
	} else {

		throw new Exception("Invalid Browser Type - " + browserType);
	}

	driver.manage().window().maximize();

	driver.manage().deleteAllCookies();
	
}

@Override
public void navigateToFirstUrl(String url) throws Exception {
	// TODO Auto-generated method stub
	url = url.trim();

	driver.manage().timeouts().pageLoadTimeout(pageloadTimeout, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(elementDetectionTimeout, TimeUnit.SECONDS);
	
	driver.get(url);
	
	
}
public WebDriver getDriver() {
	return driver;
}
public void setPageloadTimeout(int pageloadTimeout) {
	this.pageloadTimeout = pageloadTimeout;
}

public void setElementDetectionTimeout(int elementDetectionTimeout) {
	this.elementDetectionTimeout = elementDetectionTimeout;
}

@Override
public String getTitle() throws Exception {
	// TODO Auto-generated method stub
	return driver.getTitle();
}

@Override
public String getCurrentUrl() throws Exception {
	// TODO Auto-generated method stub
	return driver.getCurrentUrl();
}

@Override
public String getPageSource() throws Exception {
	// TODO Auto-generated method stub
	return driver.getPageSource();
}

@Override
public void navigateToUrl(String url) throws Exception {
	// TODO Auto-generated method stub
	url = url.trim();
	driver.navigate().to(url);

	
}

@Override
public void navigateForward() throws Exception {
	// TODO Auto-generated method stub
	driver.navigate().forward();
	
}

@Override
public void navigateBackward() throws Exception {
	// TODO Auto-generated method stub
	driver.navigate().back();
	
}

@Override
public void refresh() throws Exception {
	// TODO Auto-generated method stub
	driver.navigate().refresh();
}

@Override
public void closeBrowser() throws Exception {
	// TODO Auto-generated method stub
	if(driver !=null) {
		driver.close();
	}
	
}

@Override
public void closeAllBrowsers() throws Exception {
	// TODO Auto-generated method stub
	if(driver != null) {
		driver.quit();
	}
	
}


}
