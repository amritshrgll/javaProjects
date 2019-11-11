package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver;
			System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
			driver.switchTo().frame("iframeResult");
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(3000);
			alert.accept();
		
		
	}

}
