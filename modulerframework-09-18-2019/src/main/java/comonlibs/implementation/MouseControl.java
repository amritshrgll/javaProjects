package comonlibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import comonlibs.contracts.IMouseaction;

public class MouseControl implements IMouseaction {
	private WebDriver driver;
	public MouseControl(WebDriver driver)
	{
		this.driver= driver;
	}
	private Actions getActions() {
		Actions action = new Actions(driver);
		return action;
	}

	@Override
	public void dragAndDrop(WebElement source, WebElement target) throws Exception {
		// TODO Auto-generated method stub
		getActions().dragAndDrop(source, target).build().perform();
		
	}

	@Override
	public void moveToElement(WebElement element) throws Exception {
		// TODO Auto-generated method stub
		getActions().moveToElement(element).build().perform();
		
	}

	@Override
	public void rightClick(WebElement element) throws Exception {
		// TODO Auto-generated method stub
		getActions().contextClick(element).build().perform();
		
	}

	@Override
	public void doubleClick(WebElement element) throws Exception {
		// TODO Auto-generated method stub
		getActions().doubleClick(element).build().perform();
		
	}

	@Override
	public void moveToElementAndClick(WebElement element) throws Exception {
		// TODO Auto-generated method stub
		getActions().moveToElement(element).click(element).build().perform();
		
	}

}
