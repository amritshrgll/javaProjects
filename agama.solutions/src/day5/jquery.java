package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jquery {
		ChromeDriver driver;
		public void open12()
		{
			System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://jqueryui.com/droppable/");
			
		}
		public void mouseHover()
		{
			
		WebElement shopByCategory = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(shopByCategory);
			WebElement From=driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement to=driver.findElement(By.xpath("//div[@id='droppable']"));
			String colorBeforeDragAndDrop = From.getCssValue("color");
			System.out.println("color before drag and drop"+colorBeforeDragAndDrop);
			Actions action = new Actions(driver);
			 action.dragAndDrop(From,to).build().perform();
			 String colorAfterDragAndDrop = to.getCssValue("color");
			 System.out.println("color after	 drag and drop"+colorAfterDragAndDrop);
			 //0r action.moveToElement(from).clickAndHold(from).moveToElement(to).release().build().perform();
			 //build collects all the method or accumulates we are calling
			// WebElement AmazonPrimeLink = driver.findElement(By.xpath("//span[text()='Amazon Prime Music']"));
			 //action.moveToElement(AmazonPrimeLink).build().perform();
			 //WebElement amazonPrimeMusicAddsLink = driver.findElement(By.xpath("//span[text()='Amazon Prime Music Apps']"));
			 //action.moveToElement(amazonPrimeMusicAddsLink).click().build().perform();
			 
			

		}
	}
	
