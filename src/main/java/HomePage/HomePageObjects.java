package HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {

		@FindBy(xpath=("//*[@id=\"block_top_menu\"]/ul/li[1]/a"))
		private WebElement WomenTab;
		
		@FindBy(xpath=("//*[@id=\"block_top_menu\"]/ul/li[2]/a"))
		private WebElement DressesTab;
		
		@FindBy(xpath=("//*[@id=\"block_top_menu\"]/ul/li[3]/a"))
		private WebElement TshirtsTab;
		
		@FindBy(xpath=("//input[@name='email']"))
		private WebElement email;
		@FindBy(xpath=("//button[@name='submitNewsletter']"))
		private WebElement btnclick;
		public HomePageObjects() {
			PageFactory.initElements(driver, this);
		}
		
		public WebElement getWomen() {
			return WomenTab;
		}
		public WebElement getDresses() {
			return DressesTab;
		}
		public WebElement getTshirt() {
			return TshirtsTab;
		}
		public WebElement getEmail(String newsltr) {
			email.sendKeys("dinesha164@gmail.com");
			btnclick.click();
			return email;
		}
			}


