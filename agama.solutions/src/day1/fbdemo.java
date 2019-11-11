package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbdemo {
	ChromeDriver driver;
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
	}
	public void login(String username,String password)
	{
		WebElement usernameElement = driver.findElement(By.name("email"));
		usernameElement.sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.id("u_0_2")).click();
		
	
	}

}

