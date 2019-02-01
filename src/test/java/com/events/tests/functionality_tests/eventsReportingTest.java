package com.events.tests.functionality_tests;

import com.events.pages.LoginPage;
import org.testng.annotations.Test;
import com.events.utilities.TestBase;

public class eventsReportingTest extends TestBase {
	LoginPage page;

	@Test
	public void TestCase1() {
		page = new LoginPage();
		page.loginAsUser();

	}

}
