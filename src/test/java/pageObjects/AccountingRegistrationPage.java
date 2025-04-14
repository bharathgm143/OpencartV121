package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountingRegistrationPage extends BasePage {

	public AccountingRegistrationPage(WebDriver driver) {
		super(driver);	
	}
	@FindBy(how=How.XPATH, using="//input[@id='input-firstname']")
	WebElement Frstname;
	
	@FindBy(how=How.XPATH, using="//input[@id='input-lastname']")
	WebElement Lstname;
	
	@FindBy(how=How.XPATH, using="//input[@id='input-email']")
	WebElement Email;
	
	@FindBy(how=How.XPATH, using="//input[@id='input-telephone']")
	WebElement TelPhon;

	@FindBy(how=How.XPATH, using="//input[@id='input-password']")
	WebElement Pwd;
	
	@FindBy(how=How.XPATH, using="//input[@id='input-confirm']")
	WebElement CnfPwd;
	
	@FindBy(how=How.XPATH, using="//input[@id='input-newsletter']")
	WebElement Newsl;
	
	@FindBy(how=How.XPATH, using="//input[@name='agree']")
	WebElement SetPrivacy;
	
	@FindBy(how=How.XPATH, using="//input[@value='Continue']")
	WebElement btnctn;
	
	@FindBy(how=How.XPATH, using="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement Messageconfirm;
	
	public void SetFirstname(String Fname) {
		Frstname.sendKeys(Fname);
	}
	public void SetLastname(String Lname) {
		Lstname.sendKeys(Lname);
	}
	public void SetEmail(String email) {
		Email.sendKeys(email);
	}
	public void SetTelePhone(String randomenumber) {
		TelPhon.sendKeys(randomenumber);
	}
	public void Password(String password) {
		Pwd.sendKeys(password);
	}
	public void ConfPasswrd(String password) {
		CnfPwd.sendKeys(password);
	}
	public void SubScribeRadBtn() {
		Newsl.click();
	}
	public void setprivacy() {
		SetPrivacy.click();
	}
	public void ContinueButton() {
		//sol1
		btnctn.click();
		//so12
		//btnContinue.submit();
		//sol3
		//Actions act=new Actions (driver);
		//act.moveToElement (btnContinue).click().perform();
		//so14
		//JavascriptExecutor js=(Javascript Executor) driver; 
		//js.executeScript ("arguments[0].click();", btnContinue);
		//Sol 5
		//btnContinue.sendKeys (Keys. RETURN);
		//So16
		//WebDriverWait mywait = new WebDriverWait (driver, Duration. of Seconds (10)); 
		//mywait.until (ExpectedConditions.elementToBeClickable (btnContinue)).click();
	}
	public String getconfirmationmessage() {
		
		try {
			return (Messageconfirm.getText());
		}catch(Exception e) {
			return (e.getMessage());
		}
	}
	}
