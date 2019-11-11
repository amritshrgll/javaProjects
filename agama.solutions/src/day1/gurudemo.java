package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class gurudemo {
	
	ChromeDriver driver;
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/v4/");
	}
	public void login(String username,String password)
	{
		WebElement usernameElement = driver.findElement(By.name("uid"));
		usernameElement.sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		
	
	}
	public void addcustomer()
	{
		driver.findElement(By.linkText("New Customer")).click();
		
	}
	public void AddDetails()
	{
		driver.findElement(By.name("name")).sendKeys("amrit");
		
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		
		driver.findElement(By.name("dob")).sendKeys("283838");
		driver.findElement(By.name("addr")).sendKeys("sadklnkldfn");
		driver.findElement(By.name("city")).sendKeys("bhopal");
		driver.findElement(By.name("state")).sendKeys("cAL");
		driver.findElement(By.name("pinno")).sendKeys("676878");
		driver.findElement(By.name("telephoneno")).sendKeys("34324");
		
		String emailId="ss" + System.currentTimeMillis() + "@57xyz.com";
		System.out.println(emailId);
		
		
		driver.findElement(By.name("emailid")).sendKeys(emailId);
		driver.findElement(By.name("password")).sendKeys("dsfdsds");
		driver.findElement(By.name("sub")).click();
	}
		
		String getCustomerId()
		{
			return driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
		}
		public void addAccount(String customerId)
		{
			driver.findElement(By.linkText("New Account")).click();
			driver.findElement(By.name("cusid")).sendKeys(customerId);
			WebElement dropdown = driver.findElement(By.name("selaccount"));
			Select selAccount = new Select(dropdown);
			selAccount.selectByVisibleText("Current");
			driver.findElement(By.name("inideposit")).sendKeys("5000");
			driver.findElement(By.name("button2")).click();
			
			
		}
	

}

