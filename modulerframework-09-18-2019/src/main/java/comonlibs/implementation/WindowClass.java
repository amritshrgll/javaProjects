package comonlibs.implementation;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import comonlibs.contracts.IWindow;

public class WindowClass implements IWindow {
	private WebDriver driver;
	public WindowClass(WebDriver driver)
	{
		this.driver= driver;
	}


	@Override
	public void switchToAnyWindow(String windowhandle) throws Exception {
		// TODO Auto-generated method stub
		driver.switchTo().window(windowhandle);
		
	}

	@Override
	public void switchToAnyWindow(int childWindowIndex) throws Exception {
		// TODO Auto-generated method stub
		String childWindow = driver.getWindowHandles().toArray()[childWindowIndex].toString();
		driver.switchTo().window(childWindow);
	  
	}

	@Override
	public String getWindowHandle() throws Exception {
		// TODO Auto-generated method stub
		return driver.getWindowHandle();
	}

	@Override
	public Set<String> getWindowHandles() throws Exception {
		// TODO Auto-generated method stub
		return driver.getWindowHandles();
	}

}
