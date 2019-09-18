package PracticeScreens;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)
public class ScreenShotTest extends Base {
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

	@Test
	
	public void loginTest() {
		
		Assert.assertEquals(true, false);
		
	}
	@Test
public void searchTest() {
		
		Assert.assertEquals(true, false);
		
	}
	@Test
public void createTest() {
	
	Assert.assertEquals(true, false);
	
}
	@Test
	public void createContactTest() {
		
		Assert.assertEquals(true, false);
		
	}
	
	
	@Test
	public void homePageTest() {
		
		Assert.assertEquals(true, false);
		
	}   
	
	
}
