package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	public WebDriver driver;
	public ElectronicsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
	@FindBy(xpath="//a[@href='/electronics']")
	private WebElement electronicsLink;

	@FindBy(xpath="//img[@alt='Picture for category Camera, photo']")
	private WebElement cameraAndPhotoLink;
	
	@FindBy(xpath="//img[@alt='Picture of Camcorder']")
	private WebElement cameraProduct;
	
	@FindBy(xpath="//input[@value='Email a friend']")
	private WebElement emailFriendButton;
	
	@FindBy(xpath="//input[@class='friend-email']")
	private WebElement emailFriendTF;
	
	@FindBy(xpath="//input[@class='your-email']")
	private WebElement yourEmailTF;
	
	@FindBy(xpath="//textarea[@id='PersonalMessage']")
	private WebElement personalMessageTF;
	
	@FindBy(xpath="//input[@value='Send email']")
	private WebElement sendEmailButton;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getCameraAndPhotoLink() {
		return cameraAndPhotoLink;
	}

	public WebElement getCameraProduct() {
		return cameraProduct;
	}

	public WebElement getEmailFriendButton() {
		return emailFriendButton;
	}

	public WebElement getEmailFriendTF() {
		return emailFriendTF;
	}

	public WebElement getYourEmailTF() {
		return yourEmailTF;
	}

	public WebElement getPersonalMessageTF() {
		return personalMessageTF;
	}
	
	public WebElement getSendEmailButton() {
		return sendEmailButton;
	}
	

}
