package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {
 public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(how=How.XPATH, using="//input[@id='input-email']")
	WebElement txtemailaddress;
	
	@FindBy(how=How.XPATH, using="//input[@id='input-password']")
	WebElement txtpasswrd;
	
	@FindBy(how=How.XPATH, using="//input[@value='Login']")
	WebElement btnlgin;
	
	@FindBy(how=How.XPATH, using="//h5[normalize-space()='Op Code Maintenance List']")
	WebElement AddOptext;
	
	public void setemail(String email) {
		txtemailaddress.sendKeys(email);
	}
	public void setpassword(String pwrd) {
		txtpasswrd.sendKeys(pwrd);
	}
	public void clicklgn() {
		btnlgin.click();
	}
	public void AddOptext() {
		
	}
	
}
