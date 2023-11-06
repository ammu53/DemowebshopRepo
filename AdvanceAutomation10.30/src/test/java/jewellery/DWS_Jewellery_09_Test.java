package jewellery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_Jewellery_09_Test extends BaseClass {
	@Test
	public void Add_Product_to_wishlist_from_jewellery() {

		jewellery.getJewelleryLink().click();
		jewellery.getJewelleryPhoto().click();
		jewellery.getAddToWishlistButton().click();

	}


}
