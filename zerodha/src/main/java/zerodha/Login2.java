package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2 {
	
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement continuebutton ;
	
	public Login2(WebDriver driver) {
    	PageFactory.initElements(driver, this);

      }
       public void enterpin() {
	        pin.sendKeys("604760");
          }

       public void clickcontinuebutton() {
	       continuebutton.click();
         }
}
