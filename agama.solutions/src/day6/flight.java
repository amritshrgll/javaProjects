package day6;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flight {
	ChromeDriver driver;
	public void flightopen()
	{
		System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.goindigo.in/");
	}
	public void maketicket()
	{
		driver.findElement(By.xpath("//label[@for='roundTrip']")).click();
		driver.findElement(By.name("or-src")).sendKeys("Delhi");
		driver.findElement(By.xpath("(//div[@data-iata='DEL'])[1]")).click();
		driver.findElement(By.name("or-dest")).clear();
		driver.findElement(By.name("or-dest")).sendKeys("Mumbai");
		driver.findElement(By.xpath("(//div[@data-name='Mumbai'])[3]")).click();
		int twoDaysFromCurrentDate = getFutureDate(2);
		String xpathOffFromCalender = String.format("(//table[@class='ui-datepicker-calender']/tbody/tr/td[%d])[1]",twoDaysFromCurrentDate);
		driver.findElement(By.xpath(xpathOffFromCalender)).click();
		twoDaysFromCurrentDate = getFutureDate((2));
		xpathOffFromCalender=String.format("(//table[@class='ui-datepicker-calender']/tbody/tr/[2]/td[%d])[1]",twoDaysFromCurrentDate);
		driver.findElement(By.xpath(xpathOffFromCalender)).click();
		driver.findElement(By.xpath("+/span[@class='hp-src-btn']")).click();
		
		driver.findElement(By.className("btn btn-primary dateClose")).click();
		
		
		
	}
	private int getFutureDate(int numberOfDays) {
		LocalDate futureDate=LocalDate.now().plusDays(numberOfDays);
		int day=futureDate.getDayOfMonth();
		return day;
	}
	private void waitTillElementVisible(int timeOutInSeconds,By locator) {
		WebDriverWait wait= new WebDriverWait(driver,timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
	}

}
