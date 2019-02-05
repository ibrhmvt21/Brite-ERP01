package com.events.utilities;

import com.events.pages.*;
//1
public class pages {
	private SearchFunctionalityLocators searchF;
	private LoginPage loginPage;
	private importFunctionalityLocators importF;
	private listbuttonlocators listButton;
	
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

<<<<<<< HEAD

	public SearchFunctionalityLocators searchFunctionality() {
		if (searchF == null) {
			searchF = new SearchFunctionalityLocators();
		}
		return searchF;
	}


=======
	public listbuttonlocators listButtonLocators() {
		if (listButton == null) {
			listButton = new listbuttonlocators();
		}
		return listButton;
	}

>>>>>>> 2ada7bb1720267051996fa47f81804637f5638dd
}
