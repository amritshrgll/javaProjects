package day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown {
ChromeDriver driver;
public void amazon()
{
	System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.amazon.com");
	
	}
public void Footer() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	WebElement footer = driver.findElement(By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterDescline']"));
	System.out.println(footer.findElements(By.tagName("a")).size());
	driver.findElement(By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterDescline']/table/tbody/tr[1]/td/a[text()='Amazon Music']")).click();
}

}
