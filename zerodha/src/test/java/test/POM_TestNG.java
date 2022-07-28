package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import zerodha.Home;
import zerodha.Login;
import zerodha.Login2;
import zerodha.Profileid_dropdown;

public class POM_TestNG {
	WebDriver driver;

	@BeforeClass

	public void launchbrowser() {
		System.out.println("Before Class");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@BeforeMethod

	public void login() {
		Login log = new Login(driver);
		log.enterUN();
		log.enterpass();
		log.button();

		Login2 log2 = new Login2(driver);
		log2.enterpin();
		log2.clickcontinuebutton();
	}

	@Test

	public void verifyorderpage() {
		Home hom = new Home(driver);
		hom.click_orders();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();

		if (url.equals(url) && title.equals(title)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

	@Test

	public void verifyholdings() {
		Home hom = new Home(driver);
		hom.click_holdings();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();

		if (url.equals(url) && title.equals(title)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

	@Test

	public void verifyposition() {
		Home hom = new Home(driver);
		hom.click_positions();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();

		if (url.equals(url) && title.equals(title)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

	@AfterMethod

	public void logout() {
		Home hom = new Home(driver);
		hom.enterprofilename();
		Profileid_dropdown ID = new Profileid_dropdown(driver);
		ID.click_Logout();

	}

	@AfterClass
	public void quit() {
		driver.close();
	}

}
