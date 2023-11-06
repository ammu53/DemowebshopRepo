package electronicsemailfriend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)

public class DWS_Electronics_08_Test extends BaseClass {
@Test
public void Verify_whether_user_is_getting_error_message_while_sending_email() {
	electronics.getElectronicsLink().click();
	electronics.getCameraAndPhotoLink().click();
	electronics.getCameraProduct().click();
	electronics.getEmailFriendButton().click();
	electronics.getEmailFriendTF().sendKeys("amruthahn75@gmail.com");
	electronics.getYourEmailTF().sendKeys("amruthahn75@gmail.com");
	electronics.getPersonalMessageTF().sendKeys("This is dummy message");
	electronics.getSendEmailButton().click();
	String expectedError="Only registered customers can use email a friend feature";
	WebElement errorMessage = driver.findElement(By.xpath("//li[text()='Only registered customers can use email a friend feature']"));
	if(errorMessage.getText().equalsIgnoreCase(expectedError)) {
		System.out.println("TestCase is passed");
	}else {
		System.out.println("TestCase is failed");
	}
}

	
}
