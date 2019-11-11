package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipMouse {
	ChromeDriver driver;
	public void flip12(){
	
		System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com");
		
	}
	
	
	public void flipMouseHover()
	{
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		 WebElement shopByCategory = driver.findElement(By.xpath("//li/span[text()='Electronics']"));
		 Actions action = new Actions(driver);
		 action.moveToElement(shopByCategory).build().perform();
		 driver.findElement(By.xpath("//li/a[text()='Apple']")).click();
		//action.moveToElement(AmazonPrimeLink).build().perform();
		 //WebElement amazonPrimeMusicAddsLink = driver.findElement(By.xpath("//span[text()='Amazon Prime Music Apps']"));
		 //action.moveToElement(amazonPrimeMusicAddsLink).click().build().perform();
		 
		
			
				
	}

}
