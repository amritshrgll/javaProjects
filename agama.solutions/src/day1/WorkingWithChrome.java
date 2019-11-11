package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
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
		WebElement usernameElement = driver.findElement(By.className("uid"));
		usernameElement.sendKeys(username);
		driver.findElement(By.className("password")).sendKeys(password);
		driver.findElement(By.className("btnLogin")).click();
		
	}
	public void printTitleofThePage(){
		String title = driver.getTitle();
		System.out.println("Title :"+title);
		
	}
	public void navigateMethod()
	{
		driver.navigate().to("https://facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public void closerBrowser()
	{
		//close will close the current active wimdow
		//driver.close();
		//Quit close all the open windows and tabs
		driver.quit();
	}

}
