package com.events.utilities;

import com.events.pages.*;
public class Pages {
	private EventCats_Locators evencatObj;
	private EventsReportingLocators eventsReportObj;
	private Import_CreateLocators importCreateObj;
	private ImportFunctionalityLocators importFunctionObj;
	private ListButtonLocators listButtonObj;
	private LoginPage loginPageObj;
	private SearchFunctionalityLocators searchFunctionObj;



	public EventCats_Locators evencat() {
		if (evencatObj == null) {
			evencatObj = new EventCats_Locators();
		}
		return evencatObj;
	}

	public EventsReportingLocators eventsReporting(){
		if (eventsReportObj==null){
			eventsReportObj=new EventsReportingLocators();
		}
		return eventsReportObj;
	}

	public Import_CreateLocators Import_Create(){
		if (importCreateObj==null){
			importCreateObj=new Import_CreateLocators();
		}
		return importCreateObj;
	}

	public ImportFunctionalityLocators importFunctionality() {
		if (importFunctionObj == null) {
			importFunctionObj = new ImportFunctionalityLocators();
		}
		return importFunctionObj;
	}

	public ListButtonLocators listButtonLocators() {
		if (listButtonObj == null) {
			listButtonObj = new ListButtonLocators();
		}
		return listButtonObj;
	}

	public LoginPage login() {
		if (loginPageObj == null) {
			loginPageObj = new LoginPage();
		}
		return loginPageObj;
	}


	public SearchFunctionalityLocators searchFunctionality() {
		if (searchFunctionObj == null) {
			searchFunctionObj = new SearchFunctionalityLocators();
		}
		return searchFunctionObj;

	}



	  
		










	
	
	


}
