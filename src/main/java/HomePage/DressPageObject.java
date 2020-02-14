package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPageObject extends BasePage{
	

	@FindBy(xpath=("//a[text()='S']"))
	//@FindBy(xpath=("//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a"))
	private WebElement Soption;
	@FindBy(xpath=("//a[text()='M']"))
	//@FindBy(xpath=("//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a"))
	private WebElement Moption;
	@FindBy(xpath=("//a[text()='L']"))
	//@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement Loption;
	@FindBy(xpath=("//img[@src='http://automationpractice.com/img/p/8/8-home_default.jpg']"))
	private WebElement image;
	@FindBy(xpath=("(//a[@title='View']/span)[1]"))
	private WebElement ic;
	@FindBy(xpath=("//button[@class='btn btn-default btn-twitter']"))
	private WebElement twitteric;
	@FindBy(xpath=("//button[@class='btn btn-default btn-facebook']"))
	private WebElement facebookic;
	@FindBy(xpath=("//button[@name='Submit']"))
	private WebElement addc;
	@FindBy(xpath=("//a[@class='product_img_link']"))
	private java.util.List<WebElement> prdutcunt;
	@FindBy(xpath=("//span[@class='heading-counter']"))
	private WebElement headcount;
	public DressPageObject() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getSsize() {
		return Soption;
	}
	public WebElement getMsize() {
		return Moption;
	}
	public WebElement getLsize() {
		return Loption;
	}
	public WebElement getimage() {
		return image;
	}
	public WebElement getic() {
		return ic;
	}
	public WebElement gettwitteric() {
		return twitteric;
	}
	public WebElement getfacebookic() {
		return facebookic;
	}
    public WebElement getaddcrt() {
    	return addc;
    }
    public java.util.List<WebElement> getproductcount(){ 
    	return prdutcunt;
    }
    public WebElement getheadcount() {
    	return headcount;
    }
    }
