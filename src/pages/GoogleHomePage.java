package pages;

import org.openqa.selenium.By;
import framework.WebUi;

public class GoogleHomePage extends WebUi {
	
	private static By searchBox = By.name("q");
	private static By searchButton = By.name("btnG");
	
	public void openGoogleHomePage(String URL) throws Exception{
				open(URL);
	}
	
	public void verifyHomePageTitle() throws Exception{
		verifyPageTitle("Google");		
	}
	
	public void enterSearchText (String searchText) throws Exception{
		getElement(searchBox).sendKeys(searchText);
	}
	
	public void clickSearchButton() throws Exception{
		click(searchButton);
	}

}
