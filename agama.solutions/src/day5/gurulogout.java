package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gurulogout {
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
		
		//WebElement shopByCategory = driver.findElement(By.xpath("//iframe[@src]"));
		//driver.switchTo().frame(shopByCategory);
		driver.findElement(By.linkText("Log out")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();
	}

}
