package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import zerodha.Home;
import zerodha.Login;
import zerodha.Login2;

public class POM_Test_execution {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();

		Login log= new Login(driver);
		log.enterUN();
		log.enterpass();
		log.button();
		
		Login2 log2= new Login2(driver);
		log2.enterpin();
		log2.clickcontinuebutton();
		
		
		Home hom= new Home(driver);
		hom.enterprofilename();
		hom.click_dashboard();
		hom.click_orders();
		hom.click_holdings();
		hom.click_positions();
		hom.click_funds();
		
		
		
		
		
	}

}
