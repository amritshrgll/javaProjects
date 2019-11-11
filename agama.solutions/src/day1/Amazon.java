package day1;







import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	ChromeDriver driver;
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","c:/Users/workspace/lbs/chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");
		
	}
	public void look()
	{
		WebElement dropdown = driver.findElement(By.name("url"));
		Select selAccount = new Select(dropdown);
		selAccount.selectByVisibleText("Electronics");
		WebElement fsearchElement=driver.findElement(By.name("field-keywords"));
		fsearchElement.sendKeys("applewatch");
		driver.findElementByClassName("nav-input").click();
		String s= driver.findElement(By.xpath("//span[@data-component-type='s-result-info-bar']")).getText(); 
		System.out.println(s);

	}
	/*
	 * public void search(int number) { for(int i=1; i<=number;i++) { String sxpath
	 * = String.format(
	 * "//span[@data-component-type='s-search-results']//div[@data-index='%d']",
	 * number); String productResult=driver.findElement(By.xpath(sxpath)).getText();
	 * System.out.println(productResult); } }
	 */
	/*public void getAllProducts() {
		List<WebElement> allProduct =driver.findElements(By.xpath("//span[@data-component-type='s-search-results']/div/div"));
		Actions action = new Actions(driver);
		for(WebElement product : allProduct) {
			action.moveToElement(product).build().perform();
			System.out.println(product.getText());
			System.out.println("----------------------");
		}*/
		public void getAllProductViaJS() {
			List<WebElement> allProduct =driver.findElements(By.xpath("//span[@data-component-type='s-search-results']/div/div"));
			int x,y;
			for(WebElement product : allProduct) {
				x=product.getLocation().x;
				y=product.getLocation().y;
				scrollDown(0,29);
				System.out.println(product.getText());
				System.out.println("----------------------");
			}
		}
		
		private void scrollDown(int x , int y ) {
			JavascriptExecutor jsEngine;
			jsEngine = driver;
			String jsCommand = String.format("window.scrollBy(%d%d)",x,y);
			jsEngine.executeScript(jsCommand);
			
		}
		


}
}