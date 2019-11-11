package classwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class kiaser {
	ChromeDriver driver;
	public void kiaserhome()
	{
		System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://healthy.kaiserpermanente.org");
		
	}
	public void kiaserHomePage()
	{
		driver.findElement(By.xpath("//span[@class='navigational-select-dropdown-value']")).click();
		
		driver.findElement(By.xpath("//li[@data-region-uri='/southern-california']")).click();
		
	}
	 public void verifyTitleOfThePage() {
		  String expectedurl = "https://healthy.kaiserpermanente.org/southern-california";
		  String actualurl = driver.getCurrentUrl();
		  Assert.assertEquals(actualurl,expectedurl);
		  driver.findElement(By.linkText("Health & Wellness")).click();
	  }
	 public void Footer() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			WebElement footer = driver.findElement(By.xpath("/html/body/footer"));
			System.out.println(footer.findElements(By.tagName("a")).size());
		//	driver.findElement(By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterDescline']/table/tbody/tr[1]/td/a[text()='Amazon Music']")).click();
			driver.findElement(By.linkText("About KP")).click();
		}
	

}
