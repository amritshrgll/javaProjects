package in.guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commomPages.BasePage;

public class LoginPage extends BasePage {
	@CacheLookup
	@FindBy(name = "uid")
	private WebElement userid;

	@CacheLookup
	@FindBy(name = "password")
	private WebElement password;
	
	@CacheLookup
	@FindBy(name = "btnLogin")
	private WebElement loginbutton;

	public LoginPage(WebDriver driver) {
		super(driver);
		
		PageFactory.initElements(driver, this);
	}
	
	public void userlogin(String sUserid , String sPassword) throws Exception {
		elementControl.clickElement(userid);
		elementControl.setText(userid, sUserid);
		
		elementControl.setText(password, sPassword);
		elementControl.clickElement(loginbutton);
	}

}
