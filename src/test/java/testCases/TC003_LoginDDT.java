package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testbase.BaseClass;
import utilites.DataProviders;


/*Data is Valid - login success - test pass	- logout
  				  login failed - test fail
  Data is invalid - login success - test fail - logout
  					login failed - testpass
 */


public class TC003_LoginDDT extends BaseClass{
	
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class,groups="DataDriven") //getting data provider from different class
	public void Verify_LoginDDT(String email, String pwd, String exp) {
		logger.info("******Starting TC_003_LoginDDT*****");
		
		try {
		
		//Homepage
		HomePage hp=new HomePage(driver);
		hp.clickmyaccount();
		hp.clicklogin();

		//loginpage
		LoginPage lp=new LoginPage(driver);
		lp.setemail(email);
		lp.setpassword(pwd);
		lp.clicklgn();

		//myaccount
		MyAccountPage Myac=new MyAccountPage(driver);
		boolean targetPage=Myac.ismyaccountingpageexist();

		if(exp.equalsIgnoreCase("Valid")) 
		{
			if(targetPage==true) 
			{
				Myac.logout();
				Assert.assertTrue(true);
				
			}
			else 
			{
			Assert.assertTrue(false);	
			}
		}
		if(exp.equalsIgnoreCase("Invalid")) 
		{
			if(targetPage==true) 
			{
				Myac.logout();
				Assert.assertTrue(false);
				
			}
			else 
			{
				Assert.assertTrue(true);
			}
		}
		}catch(Exception e){
			Assert.fail();
		}
		logger.info("******Finished TC_003_LoginDDT*****");
}

}
