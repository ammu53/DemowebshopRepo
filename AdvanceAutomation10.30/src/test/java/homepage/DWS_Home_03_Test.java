package homepage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Home_03_Test extends BaseClass{

	@Test
	public void Add_the_Product_to_Cart_from_Home_page() {
     home.getAddToCartButtonOfHomePage().click();
     logger.log(Status.INFO, "User added the product to cart");
     home.getAddToCartInProductPage().click();

	}

}
