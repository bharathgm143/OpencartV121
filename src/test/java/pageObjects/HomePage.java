package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH, using="//span[normalize-space()='My Account']")
	//@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkmyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkregister;
	
	@FindBy(xpath="(//a[text()='Login'])[1]")
	WebElement lnklogin;
	

	public void clickmyaccount() {
		lnkmyaccount.click();	
	}
	public void clickregister() {
		lnkregister.click();	
	}
	public void clicklogin() {
		lnklogin.click();	
	}
	
}
