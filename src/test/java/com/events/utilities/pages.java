package com.events.utilities;

import com.events.pages.*;
import com.events.tests.functionality_tests.eventsReportingTest;

public class pages {
	private SearchFunctionalityLocators searchF;
	private LoginPage loginPage;
	private importFunctionalityLocators importF;
	private listbuttonlocators listButton;
	private eventCats_Locators evencats;
	private listbuttonlocators list;
	private eventsReportingTest EventsReports;

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


	public SearchFunctionalityLocators searchFunctionality() {
		if (searchF == null) {
			searchF = new SearchFunctionalityLocators();
		}
		return searchF;
	}


	public listbuttonlocators listButtonLocators() {
		if (listButton == null) {
			listButton = new listbuttonlocators();
		}
		return listButton;
	}


	public eventCats_Locators evencat() {
		if (evencats == null) {
			evencats = new eventCats_Locators();
		}
		return evencats;
	}

	public eventsReportingTest EventsRepo(){
	  	if (EventsReports == null){
	  		EventsReports = new eventsReportingTest();
		}
	  	return EventsReports;
	}
	
	
	

	}
