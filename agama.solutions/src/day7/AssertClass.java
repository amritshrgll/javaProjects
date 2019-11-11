package day7;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertClass {
	ChromeDriver driver;
	@BeforeClass
	public void invokeBrowser()
	{
		
		
			System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://demo.guru99.com/v4/");
		
		
	}
	
  @Test(priority=0)
  public void verifyTitleOfThePage() {
	  String expectedTitle = "Guru99 Bank Home Page 1";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle,expectedTitle);
  }
  @AfterClass
  public void closeBrowser()
  {
	  driver.quit();
  }
}
