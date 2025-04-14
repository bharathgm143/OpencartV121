package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountingRegistrationPage;
import pageObjects.HomePage;
import testbase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{
	
	@Test(groups={"Regression", "Master"})
	public void verify_account_registration() {
		
	logger.info("******Starting TC001_AccountRegistrationTest***");
	
	try {
	HomePage hp=new HomePage(driver);
	hp.clickmyaccount();
	logger.info("******Clicked on Mhyaccount link***");
	
	hp.clickregister();
	logger.info("******Clicked on register link***");
	
	AccountingRegistrationPage regpage=new AccountingRegistrationPage(driver);
	logger.info("******Providigng cust detail***");
	regpage.SetFirstname(randomestring().toUpperCase());
	regpage.SetLastname(randomestring().toUpperCase());
	regpage.SetEmail(randomestring()+"@gmail.com"); 
	regpage.SetTelePhone(randomenumber());
	String password=randomeAlphanumaric();
	regpage.Password(password);
	regpage.ConfPasswrd(password);
	regpage.setprivacy();
	regpage.ContinueButton();
	
	
	logger.info("******Validating Expected message***");
	String confrmsg=regpage.getconfirmationmessage();
	if(confrmsg.equals("Your Account Has Been Created!")) {
		Assert.assertTrue(true);
	}
	else {
		logger.error("******Test Failed***");
		logger.debug("Debug fails,,");
		Assert.assertTrue(false);
	}
	}
	catch (Exception e) {
		
		Assert.fail();
	}
	logger.info("******Test Executed***");
	}
}
