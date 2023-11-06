package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	public WebDriver driver;
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//a[@href='/computing-and-internet' and @class='product-name']")
    private WebElement bookName;
    
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getBookName() {
		return bookName;
	}
    
	
}
