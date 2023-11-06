package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ExcelUtility;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)

public class DWS_Login_01_Test extends BaseClass {
	@Test(dataProvider="data",dataProviderClass=ExcelUtility.class)
	public void Login_to_application_with_valid_credentials(String email,String password) {
		loginPage.getLoginLink().click();
		logger.log(Status.INFO, "User click on login link");
		loginPage.getEmailTF().sendKeys(email);
		logger.log(Status.INFO, "User enetered Email address");
		loginPage.getPasswordTF().sendKeys(password);
		logger.log(Status.INFO, "User enetered password");
		loginPage.getLoginButton().click();
	}

}
