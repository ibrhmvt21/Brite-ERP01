package com.events.tests.smoke_tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.events.pages.importFunctionalityLocators;
import com.events.utilities.BrowserUtils;
import com.events.utilities.TestBase;

public class importFunctionalityTest extends TestBase {

	@Test
	public void importHelpLinkTest() {
		extentLogger = report.createTest("Validating Help link Test");
		page.login().loginAsManager();
		extentLogger.info("Logged in as Manager");

		page.importFunctionality().importBtn.click();
		page.importFunctionality().helpBtn.click();
		extentLogger.info("Clicked Help link text");
		BrowserUtils.switchToWindow(2);
		extentLogger.info("Verifying URL");
		assertEquals(driver.getCurrentUrl(), importFunctionalityLocators.helpLinkURL);
		extentLogger.pass("Passed: Import Help Link Test");

	}
	
	@Test
	public void importFileUploadTest() throws InterruptedException, AWTException {
		extentLogger=report.createTest("File Upload Test in import functionality");
		page.login().loginAsManager();
		extentLogger.info("Logged in as Manager");

		page.importFunctionality().importBtn.click();
		page.importFunctionality().loadFile();
		extentLogger.info("Uploading file...");

		assertTrue(page.importFunctionality().MapString.isDisplayed());
		extentLogger.info("uploaded file successfully");
		extentLogger.pass("Passed: Import File Upload Test");

	}
}
