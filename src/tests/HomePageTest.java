package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import framework.BaseTest;

public class HomePageTest extends BaseTest{
	

	@Test(groups={"smoke"})
	@Parameters({"searchText"})
	public void doGoogleSearch(String searchText) throws Exception{
	
		googleHomePage().verifyHomePageTitle();
		googleHomePage().enterSearchText(searchText);
		googleHomePage().clickSearchButton();		
		
		
	}

}
