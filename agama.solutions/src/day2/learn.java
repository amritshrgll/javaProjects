package day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class learn {
	ChromeDriver driver;
	public void invokeBrowser()
	{
		System.setProperties("webdriver.chrome.driver","c:/Users/workspace");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
	}
	public void login(String username,String password)
	{
		
	}
	

}
