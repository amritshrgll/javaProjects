package in.guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commomPages.BasePage;

public class AddCustomer extends  BasePage{

	@CacheLookup
	@FindBy(name="name")
	private WebElement cname ;
	
	@CacheLookup
	@FindBy(xpath="//input[@value='f']")
	private WebElement female; 
	@CacheLookup
	@FindBy(name="dob")
	private WebElement dateOfBirth; 
	
	@CacheLookup
	@FindBy(name="addr")
	private WebElement address; 
	
	@CacheLookup
	@FindBy(name="city")
	private WebElement cityName; 
	
	@CacheLookup
	@FindBy(name="state")
	private WebElement stateName; 
	
	@CacheLookup
	@FindBy(name="pinno")
	private WebElement pinValue; 
	
	@CacheLookup
	@FindBy(name="telephoneno")
	private WebElement number;
	
	@CacheLookup
	@FindBy(name="emailid")
	private WebElement email; 
	
	@CacheLookup
	@FindBy(name="password")
	private WebElement passwordValue;
	
	@CacheLookup
	@FindBy(name="sub")
	private WebElement submitButton; 

	public AddCustomer(WebDriver driver) {
		super(driver);
		
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	public void userAdd(String S_CustName ,String gender, String S_Dob,String S_add, String S_City,String S_State,String S_Pin,String S_Numb,String S_email,String S_Pass) throws Exception {
		elementControl.clickElement(cname);
		if(gender.equalsIgnoreCase("female"))
		{
		elementControl.clickElement(female);
		}
		elementControl.setText(cname, S_CustName);

		elementControl.setText(dateOfBirth, S_Dob);
		elementControl.setText(address,S_add);
		elementControl.setText(cityName, S_City);
		elementControl.setText(stateName, S_State);
		elementControl.setText(pinValue, S_Pin);
		elementControl.setText(number, S_Numb);
		elementControl.setText(email, S_email);
		elementControl.setText(passwordValue, S_Pass);
		elementControl.clickElement(submitButton);
	}
}
