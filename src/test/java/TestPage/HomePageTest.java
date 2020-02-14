package TestPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import HomePage.BasePage;
import HomePage.HomePageObjects;

public class HomePageTest {
 
		HomePageObjects hp;
		BasePage bp;
		
		public HomePageTest() {
			hp=new HomePageObjects();
			bp=new BasePage();
		}
		@Test 
		public void verifyTabs() {
			Assert.assertTrue(bp.elementFound(hp.getWomen()), "Element not found");
			Assert.assertTrue(bp.elementFound(hp.getDresses()), "Element not found");
			Assert.assertTrue(bp.elementFound(hp.getTshirt()),"Element not found");
		}
		@Test
		public void verifyUrl() {
			hp.getDresses().click();
			Assert.assertTrue(bp.getTitlte().contains("Dresses"), "Not Navigate");
		}
		@Test
		public void verifyEmail() {
			Assert.assertTrue(hp.getTitlte().contains("email"), "failed to verify");
		}
	}


