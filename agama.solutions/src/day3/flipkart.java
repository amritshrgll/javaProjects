package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	ChromeDriver driver;
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com");
	}
	public void look()
	{
	
		WebElement fname=driver.findElement(By.xpath("//div[@class='_3Njdz7']//form//input[@type='text']"));
		fname.sendKeys("asnkj@nnkj.com");
		driver.findElement(By.xpath("//div[@class='_3Njdz7']//form//input[@type='password']")).sendKeys("142527");
		driver.findElement(By.xpath("//div[@class='_3Njdz7']//form//button[@type='submit']")).click();

	}

}
