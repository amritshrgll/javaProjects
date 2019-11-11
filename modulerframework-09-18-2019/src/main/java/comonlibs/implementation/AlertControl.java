package comonlibs.implementation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import comonlibs.contracts.Ialerts;

public class AlertControl implements Ialerts{
	private WebDriver driver;

	public AlertControl(WebDriver driver) {
		this.driver = driver;
	}
	private Alert getAlert() {
		Alert alert = driver.switchTo().alert();

		return alert;
	}


	@Override
	public void acceptAlert() throws Exception {
		
		
		getAlert().accept();
		
	}

	@Override
	public void rejectAlert() throws Exception {
		// TODO Auto-generated method stub
		getAlert().dismiss();
	}

	@Override
	public String getMessageFromAlert() throws Exception {
		// TODO Auto-generated method stub
		return getAlert().getText();
	}

	@Override
	public boolean checkAlertPresent(int timeoutInseconds) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
