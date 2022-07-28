package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	@FindBy(xpath = "//span[text()='OKP335']")
	private WebElement profilename;
	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement dashboard;
	@FindBy(xpath = "//span[text()='Orders']")
	private WebElement orders;
	@FindBy(xpath = "//span[text()='Holdings']")
	private WebElement holdings;
	@FindBy(xpath = "//span[text()='Positions']")
	private WebElement positions;
	@FindBy(xpath = "//span[text()='Funds']")
	private WebElement funds;

	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterprofilename() {
		profilename.click();
	}

	public void click_dashboard() {
		dashboard.click();
	}

	public void click_orders() {
		orders.click();
	}

	public void click_holdings() {
		holdings.click();
	}

	public void click_positions() {
		positions.click();
	}

	public void click_funds() {
		funds.click();
	}
}
