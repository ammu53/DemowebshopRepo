package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage1 {
	public WebDriver driver;
	public ComputersPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//a[@href='/computers']")
	private WebElement copmutersLink;

	@FindBy(xpath="//a[@title='Show products in category Desktops']")
	private WebElement desktopButton;

	@FindBy(xpath="//img [@alt='Picture of Elite Desktop PC']")
	private WebElement firstProduct;
	
	@FindBy(xpath="//img [@title='Show details for Desktop PC with CDRW']")
	private WebElement secondProduct;
	
	@FindBy(xpath="//input[@value='Add to compare list']")
	private WebElement addProductToCompareList;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCopmutersLink() {
		return copmutersLink;
	}

	public WebElement getDesktopButton() {
		return desktopButton;
	}

	public WebElement getFirstProduct() {
		return firstProduct;
	}

	public WebElement getSecondProduct() {
		return secondProduct;
	}

	public WebElement getAddProductToCompareList() {
		return addProductToCompareList;
	}
	
}
