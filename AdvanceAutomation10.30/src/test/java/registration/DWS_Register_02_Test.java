package registration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Register_02_Test extends BaseClass {
@Test
	public void Register_to_the_application_with_valid_credentials() {
		registration.getRegisterLink().click();
		logger.log(Status.INFO, "User click on register link");
		registration.getGenderRadioButton().click();
		logger.log(Status.INFO, "User selects gender radio button");
		registration.getFirstNameTF().sendKeys("Amrutha");
		logger.log(Status.INFO, "User entered first name");
		registration.getLastNameTF().sendKeys("HN");
		logger.log(Status.INFO, "User entered last name");
		registration.getEmailTF().sendKeys("amuthahn75@gmail.com");
		logger.log(Status.INFO, "User entered email address");
		registration.getPasswordTF().sendKeys("12345");
		logger.log(Status.INFO, "User entered password");
		registration.getConfirmPasswordTF().sendKeys("12345");
		logger.log(Status.INFO, "User entered confirm password");
		registration.getRegisterButton().click();
	}

}
