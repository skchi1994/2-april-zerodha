package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy (xpath="//input[@id='userid']")private WebElement username;
	@FindBy (xpath="//input[@type='password']")private WebElement password;
    @FindBy (xpath="//button[@type='submit']")private WebElement loginbutton;
    
    public Login(WebDriver driver) {
    	PageFactory.initElements(driver, this);

      }

        public void enterUN() {
	        username.sendKeys("XXB535");
         }

        public void enterpass() {
	      password.sendKeys("Altroz@123456");
         }
        
        public void button() {
	        loginbutton.click();
         }








}
