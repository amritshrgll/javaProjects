package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonProject {
	ChromeDriver driver;
	public void open12()
	{
		System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in");
		
	}
	public void mouseHover()
	{
		WebElement shopByCategory = driver.findElement(By.xpath("//a/span[text()='Category']"));
		Actions action = new Actions(driver);
		 action.moveToElement(shopByCategory).build().perform();
		 WebElement AmazonPrimeLink = driver.findElement(By.xpath("//span[text()='Amazon Prime Music']"));
		 action.moveToElement(AmazonPrimeLink).build().perform();
		 WebElement amazonPrimeMusicAddsLink = driver.findElement(By.xpath("//span[text()='Amazon Prime Music Apps']"));
		 action.moveToElement(amazonPrimeMusicAddsLink).click().build().perform();
		 
		
			
				
	}
	

}
	
