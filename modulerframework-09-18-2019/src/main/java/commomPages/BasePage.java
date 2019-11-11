package commomPages;

import org.openqa.selenium.WebDriver;

import comonlibs.implementation.DropdownControl;
import comonlibs.implementation.ElementControl;
import comonlibs.implementation.MouseControl;



public class BasePage {

	protected ElementControl elementControl;
	protected DropdownControl dropdownControl;
	protected MouseControl mouseControl;

	public BasePage(WebDriver driver) {
		elementControl = new ElementControl();
		dropdownControl = new DropdownControl();


		
		mouseControl = new MouseControl(driver);
	}

}
