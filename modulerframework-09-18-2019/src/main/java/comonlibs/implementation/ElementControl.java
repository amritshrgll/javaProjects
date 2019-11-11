package comonlibs.implementation;

import org.openqa.selenium.WebElement;

import comonlibs.contracts.ICommonElements;

public class ElementControl implements ICommonElements {

	@Override
	public String getText(WebElement element) throws Exception {
		// TODO Auto-generated method stub
		return element.getText();
	}

	@Override
	public void clickElement(WebElement element) throws Exception {
		// TODO Auto-generated method stub
		element.click();
		
	}

	@Override
	public String getAttribute(WebElement element, String attribute) throws Exception {
		// TODO Auto-generated method stub
		return element.getAttribute("attribute");
	}

	@Override
	public String getCssValue(WebElement element, String csspropertyName) throws Exception {
		// TODO Auto-generated method stub
		return element.getCssValue("csspropertyname");
	}

	@Override
	public boolean isElementEnabled(WebElement element) throws Exception {
		// TODO Auto-generated method stub
		return element.isEnabled();
	}

	@Override
	public boolean isElementVisible(WebElement element) throws Exception {
		// TODO Auto-generated method stub
		return element.isDisplayed();	}

	@Override
	public boolean isElementSelected(WebElement element) throws Exception {
		// TODO Auto-generated method stub
		return element.isSelected();
	}

	@Override
	public void setText(WebElement element, String textToWrite) throws Exception {
		element.sendKeys(textToWrite);
		
	}

	@Override
	public void clearText(WebElement element) throws Exception {
		// TODO Auto-generated method stub
		element.clear();
	}

	@Override
	public void changeCheckboxStatus(WebElement element, boolean expectedStatus) throws Exception {
		// TODO Auto-generated method stub
	boolean currentStatus = element.isSelected();
	if((currentStatus && !expectedStatus) || (!expectedStatus && currentStatus))
	{
		element.click();}
	}
	

	@Override
	public int getXLocation(WebElement element) throws Exception {
		// TODO Auto-generated method stub
		return element.getLocation().x;
	}

	@Override
	public int getYLocation(WebElement element) throws Exception {
		// TODO Auto-generated method stub
		return element.getLocation().y;	}

}
