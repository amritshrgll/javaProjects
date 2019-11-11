package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailLogin {
	ChromeDriver driver;
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
	}
	public void login()
	{
		WebElement fname=driver.findElement(By.xpath("//div[@class='Xb9hP']//input[@type='email']"));
		fname.sendKeys("solutionagama@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//div[@class='Xb9hP']//input[@type='password']")).sendKeys("agamasolution");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		driver.findElement(By.xpath("//textarea[@id=':8q']")).sendKeys("saurabh.d2106@gmail.com");
		driver.findElement(By.xpath("//div[@id=':9d']")).sendKeys("i am done thankyou");
		driver.findElement(By.xpath("//div[@id=':7y']")).click();
		
		

	}

}
