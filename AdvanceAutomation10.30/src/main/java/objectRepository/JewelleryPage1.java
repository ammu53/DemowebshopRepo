package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelleryPage1 {
	public WebDriver driver;
	public JewelleryPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
	
	@FindBy(xpath="//a[@href='/jewelry']")
	private WebElement jewelleryLink;
	
	@FindBy(xpath="//img[@alt='Picture of Black & White Diamond Heart']")
	private WebElement jewelleryPhoto;
	
	@FindBy(xpath="//input[@value='Add to wishlist']")
	private WebElement addToWishlistButton;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getJewelleryLink() {
		return jewelleryLink;
	}

	public WebElement getJewelleryPhoto() {
		return jewelleryPhoto;
	}

	public WebElement getAddToWishlistButton() {
		return addToWishlistButton;
	}
	
	
	
}
