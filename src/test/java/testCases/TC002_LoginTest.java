package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testbase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	
	@Test(groups={"Sanity","Master"})
	public void verify_login() {
		
		logger.info("starting TC_002_Logintest");
		
		try {
		//Homepage
		HomePage hp=new HomePage(driver);
		hp.clickmyaccount();
		hp.clicklogin();
		
		//loginpage
		LoginPage lp=new LoginPage(driver);
		lp.setemail(p.getProperty("email"));
		lp.setpassword(p.getProperty("password"));
		lp.clicklgn();
		
		//myaccount
		MyAccountPage Myac=new MyAccountPage(driver);
		boolean targetPage=Myac.ismyaccountingpageexist();
		
		Assert.assertTrue(targetPage);
		//Assert.assertEquals(targetPage, true, "login failed");
		}
		catch (Exception e) {
			Assert.fail();
		}
		logger.info("******Finished TC_002***");
		
	}

}
