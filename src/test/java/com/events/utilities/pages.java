package com.events.utilities;

import com.events.pages.*;

public class pages {

	private LoginPage loginPage;
	private importFunctionalityLocators importF;
	
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
}
