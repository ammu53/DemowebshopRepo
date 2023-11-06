package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.BookPage;
import objectRepository.ComputersPage1;
import objectRepository.ComputersPage2;
import objectRepository.ElectronicsPage;
import objectRepository.HomePage;
import objectRepository.JewelleryPage1;
import objectRepository.JewelleryPage2;
import objectRepository.LoginPage;
import objectRepository.PrizeCompare;
import objectRepository.RegistrationPage;
import objectRepository.ShoppingCartPage;

////***This is for ITestListenerCheck***///
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.BeforeMethod;
//
//import genericUtilities.TakesScreenShotUtility;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements IAutoConstants{
	public static WebDriver driver;
	public static ExtentTest logger;
	public static TakesScreenShotUtility screenshot;
	public static WebDriverUtility webdriver;
	public static LoginPage loginPage;
	public static ComputersPage1 computers;
	public static ComputersPage2 computerspage;
	public static ElectronicsPage electronics;
	public static RegistrationPage registration;
	public static HomePage home;
	public static BookPage book;
	public static ShoppingCartPage shopping;
	public static JewelleryPage1 jewellery;
	public static JewelleryPage2 jewellerypage;
	public static PrizeCompare compare;
	
	DataBaseUtility database;
	JavaUtility javaUtil;
	ExcelUtility excelUtil;
	PropertyUtility property;
	
	@BeforeClass(alwaysRun=true)
	public void launchingBrowserAndNavigateToApplication() {
		
		property=new PropertyUtility();

		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}else if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
	
		driver.manage().window().maximize();
		driver.get(property.getDataFromPropertyFile("url"));
		
		webdriver=new WebDriverUtility(driver);
		screenshot=new TakesScreenShotUtility(driver);
		database=new DataBaseUtility();
		javaUtil=new JavaUtility();
		excelUtil=new ExcelUtility();
		
	}
	@BeforeMethod(alwaysRun=true)
	public  void loginToApplication() {
		loginPage=new LoginPage(driver);
		computers=new ComputersPage1(driver);
		computerspage=new ComputersPage2(driver);
		electronics=new ElectronicsPage(driver);
		registration=new RegistrationPage(driver);
		home=new HomePage(driver);
		book=new BookPage(driver);
		shopping=new ShoppingCartPage(driver);
		jewellery=new JewelleryPage1(driver);
		jewellerypage=new JewelleryPage2(driver);
		compare=new PrizeCompare(driver);
		
		System.out.println("logged in to application");
		
	}
	@AfterMethod(alwaysRun=true)
	public void logoutFromApplication() {
		
		System.out.println("logged out from application");
		
	}
	@AfterClass(alwaysRun=true)
	public void teardownTheBrowser() {
		
		driver.quit();
		
	}

}
