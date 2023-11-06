package books;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)

public class DWS_Books_04_Test  extends BaseClass{
	@Test
	public void Add_the_product_from_Book_link_and_check_whether_the_product_is_being_added_to_cart() {
		
		home.getBookLink().click();
		logger.log(Status.INFO, "User clicked on book link");
		
		book.getAddToCartFromBookPage().click();
		logger.log(Status.INFO, "User added book to cart");
		home.getShoppingCartButton().click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean status=shopping.getBookName().isDisplayed();
		assertTrue(status,"User able to add product to cart");
		logger.log(Status.INFO, "User able to see the product added to cart");  
		
		
	}
}
