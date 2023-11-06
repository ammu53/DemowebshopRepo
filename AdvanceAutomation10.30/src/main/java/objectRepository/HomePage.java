package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//input[@value='Add to cart']")
	private WebElement addToCartButtonOfHomePage;
	
	@FindBy(xpath="//input[@value='Add to cart']")
	private WebElement addToCartInProductPage;
	
	@FindBy(xpath="//a[@href='/books']")
	private WebElement bookLink;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCartButton;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddToCartButtonOfHomePage() {
		return addToCartButtonOfHomePage;
	}

	public WebElement getAddToCartInProductPage() {
		return addToCartInProductPage;
	}

	public WebElement getBookLink() {
		return bookLink;
	}

	public WebElement getShoppingCartButton() {
		return shoppingCartButton;
	}
	
	
}
