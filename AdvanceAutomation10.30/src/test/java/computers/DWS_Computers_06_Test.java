package computers;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
import objectRepository.ComputersPage1;
@Listeners(ITestListenerUtility.class)


public class DWS_Computers_06_Test extends BaseClass {
		@Test

		public void Remove_the_product_from_compare_list() {
			computers.getCopmutersLink().click();
			computers.getDesktopButton().click();
			computers.getFirstProduct().click();
			computers.getAddProductToCompareList().click();
			logger.log(Status.INFO, "User added first product to compare list");
			driver.navigate().back();
			driver.navigate().back();
			computers.getSecondProduct().click();
			computers.getAddProductToCompareList().click();
			logger.log(Status.INFO, "User added second product to compare list");
			List<WebElement> removeButtonFromCompareList = driver.findElements(By.xpath("//input[@value='Remove']"));
			int count=0;
			for(WebElement ele:removeButtonFromCompareList) {
				count++;
			}
			if(count==2) {
				logger.log(Status.INFO, "User can able to see 2 products in compare list");
			}
			computerspage.getRemoveButton().click();
			computerspage.getRemoveButton().click();
			logger.log(Status.INFO, "User can able to remove products from compare list");
		}
	}

