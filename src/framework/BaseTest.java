package framework;

/*** Takes care of driver setup and shutdown and every Test class extends it ***/

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import framework.PageFactory;
import framework.Driver;


public class BaseTest extends PageFactory{
	
	WebDriver driver=null;
	private String AppUrl = "http://google.com"; //TODO: Move it outside the Base test
	
	@BeforeSuite(alwaysRun = true)
	public void LaunchApp()
    {
        initialize();            
        clearCookies();
        goToHomePage();
    } 
	
	
	public void initialize(){
		driver= Driver.getInstance();
		initializePageObjects();
		
	}
	
	@AfterSuite(alwaysRun=true)
	public void close(){
		driver.close();
	}
	
	
	public void clearCookies()
    {
        driver.manage().deleteAllCookies();
    }

    public void goToHomePage()
    {
        driver.get(AppUrl);
    }

}
