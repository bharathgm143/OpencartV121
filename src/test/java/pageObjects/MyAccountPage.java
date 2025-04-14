package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(how=How.XPATH, using="//h2[normalize-space()='My Account']")
	WebElement msgheading; 
	
	@FindBy(how=How.XPATH, using="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement lgotbtn;
	
	
	public boolean ismyaccountingpageexist() {
		try {
			return(msgheading.isDisplayed());
		}
		catch(Exception e){
			return false;
		}		
	}
	public void logout() {
		lgotbtn.click();
	}

}
