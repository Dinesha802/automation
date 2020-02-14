package TestPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import HomePage.BasePage;
import HomePage.DressPageObject;
import HomePage.HomePageObjects;

public class DressPageTest {
	HomePageObjects hp;
	DressPageObject dp;
	BasePage bp;

	public DressPageTest() {
		hp=new HomePageObjects();
		bp=new BasePage();
		dp=new DressPageObject();
		
	}
	@Test 
	public void verifySizes() {
		hp.getDresses().click();
		Assert.assertTrue(bp.elementFound(dp.getSsize()), "failed to found");
		Assert.assertTrue(bp.elementFound(dp.getMsize()), "failed to found");
		Assert.assertTrue(bp.elementFound(dp.getLsize()), "failed to found");
	}
	@Test
	public void clickimage() {
	hp.getDresses().click();
	bp.mouseHover(dp.getimage());
	dp.getic().click();
	Assert.assertTrue(bp.elementFound(dp.gettwitteric()), "failed to found");
	Assert.assertTrue(bp.elementFound(dp.getfacebookic()), "failed to found");
	dp.getaddcrt().click();
	}
	@Test
	public void match() {
		hp.getDresses().click();
		int ls=dp.getproductcount().size();
		String a=Integer.toString(ls);
		String b=dp.getheadcount().getText();
		Assert.assertTrue(b.contains(a), "failed to match");
	}

}
