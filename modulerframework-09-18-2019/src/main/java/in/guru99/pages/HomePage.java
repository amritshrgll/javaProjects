package in.guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commomPages.BasePage;

public class HomePage extends BasePage {
	private WebDriver driver;
	private WebElement pageLink;

	/*
	 * @CacheLookup
	 * 
	 * @FindBy(linkText = "Manager") private WebElement manager;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(linkText = "New Customer") private WebElement newcustomer;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(linkText = "Edit Customer") private WebElement editcustomer;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(linkText = "Delete Customer") private WebElement deletecustomer;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(linkText = "New Account") private WebElement newaccount;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(name = "Edit Account") private WebElement editaccount;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(linkText = "Delete Account") private WebElement deleteaccount;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(linkText = "Deposit") private WebElement deposit;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(linkText = "Withdrawal") private WebElement withdrawal;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(linkText = "Fund Transfer") private WebElement fundtransfer;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(linkText = "Change Password") private WebElement changepassword;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(linkText = "Balance Enquiry") private WebElement balanceenquiry;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(linkText = "Mini Statement") private WebElement ministatement;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(linkText = "Customised Statement") private WebElement
	 * customisedstatement;
	 * 
	 * @CacheLookup
	 * 
	 * @FindBy(linkText = "Log out") private WebElement logout;
	 */

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * public void navigateToNewCustomer() throws Exception {
	 * elementControl.clickElement(newcustomer); }
	 */
	public void navigateToPage(String pagename) throws Exception{
		pageLink = driver.findElement(By.linkText(pagename));
		elementControl.clickElement(pageLink);
	}
}
