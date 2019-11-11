package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngclass2 {
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
	
  @Test(priority=0)
  public void verifyLoginWithCorrectCredentials() {
	  
	  String userId = "mngr223633";
	  String password =  "evytumy";
	  
	  driver.findElement(By.name("uid")).sendKeys(userId);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("btnLogin")).click();
	  
	  String expectedTitle = "Manger Id : "+ userId;
	  String actualTitle = driver.findElement(By.xpath("//tr[@class='heading3']")).getText();// //td[contains(text()=Manager Id)]
	  Assert.assertEquals(actualTitle,expectedTitle);
	  
	  //or other method is
		/*
		 * String managerTdText =
		 * driver.findElement(By.xpath("//td[contains(text(),'Manger Id')]")).getText();
		 * String actualUserIdFromHomepage = managerIdText.split(":")[1].trim();
		 * Assert.assertEquals(actualUserIdFromHomepage), userId);
		 */
	  }
 
}
