package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrizeCompare {

	public WebDriver driver;
	public PrizeCompare(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
	
	@FindBy(xpath="//a[@href='/jewelry']")
	private WebElement jewelleryLink;
	
	@FindBy(xpath="//span[text()='0.00']")
	private WebElement filterByPrize;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getJewelleryLink() {
		return jewelleryLink;
	}

	public WebElement getFilterByPrize() {
		return filterByPrize;
	}
	
	
}
