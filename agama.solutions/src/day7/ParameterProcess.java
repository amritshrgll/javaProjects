package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterProcess {
	WebDriver driver;
	@Parameters("browserType")
	@BeforeClass
	public void open(String BrowserType)
	{
		if(BrowserType.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		driver = new ChromeDriver(option);
		
		
		}
		if(BrowserType.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","c:/Users/workspace/lbs/geckodriver-v0.25.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if(BrowserType.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","c:/Users/workspace/lbs\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/v4/");
		
	}
	@Parameters({"userId","userPassword"})
	
  @Test(priority=0)
  public void verifyLoginWithCorrectCredentials(String username,String password) {
	  
	  
	  driver.findElement(By.name("uid")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("btnLogin")).click();
	  
	  String managerIdText = driver.findElement(By.xpath("//td[contains(text(),'Manger Id')]")).getText();
	  
	 
	  
	  
		 String actualUserIdFromHomepage = managerIdText.split(":")[1].trim();
		  Assert.assertEquals(actualUserIdFromHomepage, username);
		 
	  }
 
}
