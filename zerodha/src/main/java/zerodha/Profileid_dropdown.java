package zerodha;

    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Profileid_dropdown {
		
		@FindBy (xpath ="//span[text()=''/ Settings']") private WebElement MyProfile;
		@FindBy (xpath ="//span[@class='icon icon-console']") private WebElement Concole;
		@FindBy (xpath ="//span[@class='icon icon-coin']") private WebElement Coin;
		@FindBy (xpath ="//span[@class='icon icon-life-buoy']") private WebElement Support;
		@FindBy (xpath ="//span[@class='icon icon-user-plus']") private WebElement InviteFriends;
		@FindBy (xpath ="//span[@class='icon icon-compass']") private WebElement Tour_Kite;
		@FindBy (xpath ="//span[@class='icon icon-command']") private WebElement Keyboard_shortcuts;
		@FindBy (xpath ="//span[@class='icon icon-help-circle']") private WebElement User_manual;
		@FindBy (xpath ="//span[@class='icon icon-exit']") private WebElement Logout;
		
		public Profileid_dropdown(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void click_MyProfile() {
			MyProfile.click();
		}
		public void click_Concole() {
			Concole.click();
		}
		public void click_Coin() {
			Coin.click();
		}
		public void click_Support() {
			Support.click();
		}
		public void click_InviteFriends() {
			InviteFriends.click();
		}
		public void click_Tour_Kite() {
			Tour_Kite.click();
		}
		public void click_Keyboard_shortcuts() {
			Keyboard_shortcuts.click();
		}
		public void click_User_manual() {
			User_manual.click();
		}
		public void click_Logout() {
			Logout.click();
		}
		
		

	}



