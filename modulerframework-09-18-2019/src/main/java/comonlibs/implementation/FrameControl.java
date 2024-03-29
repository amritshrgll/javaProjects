package comonlibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import comonlibs.contracts.IFrames;

public class FrameControl implements IFrames {
	private WebDriver driver;
	public FrameControl(WebDriver driver)
	{
		this.driver= driver;
	}

	@Override
	public void switchToFrame(WebElement element) throws Exception {
		// TODO Auto-generated method stub
		driver.switchTo().frame(element);
		
	}

	@Override
	public void switchToFrame(int index) throws Exception {
		// TODO Auto-generated method stub
		driver.switchTo().frame(index);
		
	}

	@Override
	public void switchToFrame(String id) throws Exception {
		// TODO Auto-generated method stub
		driver.switchTo().frame(id);
	}

	@Override
	public void switchToParentpage() throws Exception {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		
	}

}
