package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngParameters {
	ChromeDriver driver;
	@BeforeClass
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/v4/");
		
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
