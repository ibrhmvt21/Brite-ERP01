package com.events.utilities;

import com.events.pages.*;
//1
public class pages {
	private SearchFunctionalityLocators searchF;
	private LoginPage loginPage;
	private importFunctionalityLocators importF;
	private listbuttonlocators listButton;
	private eventCats_Locators evencats;
	
	

	  public LoginPage login() {
	        if (loginPage == null) {
	            loginPage = new LoginPage();
	        }
	        return loginPage;
	    }
	  
		
	  public importFunctionalityLocators importFunctionality() {
	        if (importF == null) {
	            importF = new importFunctionalityLocators();
	        }
	        return importF;
	    }

	public listbuttonlocators listButtonLocators() {
		if (listButton == null) {
			listButton = new listbuttonlocators();
		}
		return listButton;
	}

	public SearchFunctionalityLocators searchFunctionality() {
		if (searchF == null) {
			searchF = new SearchFunctionalityLocators();
		}
		return searchF;
	}
	
	public eventCats_Locators evencat() {
		if (evencats == null) {
			evencats = new eventCats_Locators();
		}
		return evencats;
	}

}
