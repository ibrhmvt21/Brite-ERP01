package com.events.utilities;

import com.events.pages.*;
//1
public class pages {

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

	public listbuttonlocators listButtonLocators() {
		if (listButton == null) {
			listButton = new listbuttonlocators();
		}
		return listButton;
	}

}
