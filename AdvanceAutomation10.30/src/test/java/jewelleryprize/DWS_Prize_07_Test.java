package jewelleryprize;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_Prize_07_Test extends BaseClass {
@Test

	public void Verify_whether_the_product_is_displaying_according_to_filter_by_prize() {
		compare.getJewelleryLink().click();
		compare.getFilterByPrize().click();
		List<WebElement> allPrizes = driver.findElements(By.xpath("//div[@class='prices']"));
		for(WebElement prize:allPrizes) {
			String p=prize.getText().substring(0,3);
			int val=Integer.parseInt(p);
			if(val<=500) {
				System.out.println("TestCase is passed");
			}else {
				System.out.println("TestCase is failed");
			}
		}
	}
}
