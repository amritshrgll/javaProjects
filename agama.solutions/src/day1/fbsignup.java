package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbsignup {
	ChromeDriver driver;
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
			
	}
	public void signup()
	{
		WebElement fnameElement=driver.findElement(By.name("firstname"));
		fnameElement.sendKeys("monu");
		driver.findElement(By.name("lastname")).sendKeys("pandey");
		driver.findElement(By.name("lastname")).sendKeys("monu@1234pandey");
		driver.findElement(By.name("reg_email__")).sendKeys("5785878909");
		driver.findElement(By.name("reg_passwd__")).sendKeys("02121234");
		
		WebElement dropdown = driver.findElement(By.name("birthday_month"));
		Select selAccount = new Select(dropdown);
		selAccount.selectByVisibleText("Jan");

		
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
	}
	

}
