package jewellery;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_JewelleryWishlist_10_Test extends BaseClass{
	
		@Test
		public void Remove_Product_From_wishlist() {

			jewellerypage.getJewelleryLink().click();
			jewellerypage.getJewelleryPhoto().click();
			jewellerypage.getAddToWishlistButton().click();
			jewellerypage.getWishlistButton().click();
			jewellerypage.getCheckBoxWishlistButton().click();
			jewellerypage.getRemoveFromWishlistButton().click();
		}

}
