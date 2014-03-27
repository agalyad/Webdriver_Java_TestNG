package framework;

import pages.GoogleHomePage;
import pages.GoogleSearchResultPage;

public class PageFactory {
	
	private static GoogleHomePage  google_home_page;
	private static GoogleSearchResultPage google_search_result_page;
	
	
	public static void initializePageObjects(){
		
		google_home_page=new GoogleHomePage();
		google_search_result_page=new GoogleSearchResultPage();		
	}
	
	/*** Getter Methods***/
	public static GoogleHomePage googleHomePage(){
		return google_home_page;
	}
	
	public static GoogleSearchResultPage googleSearchResultPage(){
		return google_search_result_page;
	}

}
