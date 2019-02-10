package com.events.tests.functionality_tests;

import com.events.utilities.BrowserUtils;
import com.events.utilities.Driver;
import com.events.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateEventFunctionalityTest extends TestBase {


    @Test(description = "BRIT-1573")
    public void createEventNegTest() {
        extentLogger=report.createTest("Create event Negative Test");
        extentLogger.info("Login as User");
        page.login().loginAsManager();

        extentLogger.info("Click on create button");
        page.Import_Create().createBtn.click();

        BrowserUtils.wait(5);
        extentLogger.info("Confirm an event without name, date and time");
        page.Import_Create().confirmEvent.click();

        BrowserUtils.waitForVisibility(page.Import_Create().errorMessg, 5);
        Assert.assertTrue(page.Import_Create().errorMessg.isDisplayed());

    }


    @Test(description = "BRIT-1577")
    public void editExistEvent() {
        extentLogger=report.createTest("Edit Existing Event");
        extentLogger.info("Login as a manager");
        page.login().loginAsManager();

        extentLogger.info("Click on a random event");
        page.Import_Create().randomEvent.click();

        BrowserUtils.waitForPageToLoad(5);
        String actualText = page.Import_Create().editButton.getText();

        extentLogger.info("Verify Edit button is visible");
        Assert.assertEquals(actualText, "Edit");

    }

    @Test(description = "BRIT-1582")
    public void maximumAttendees() {
        extentLogger=report.createTest("Verify Maximum Attendees option is available");
        extentLogger.info("Login as a manager");
        page.login().loginAsManager();


        BrowserUtils.waitForPageToLoad(5);
        extentLogger.info("Click on create button");
        page.Import_Create().createBtn.click();

        String actualText = page.Import_Create().maxAttend.getText();

        extentLogger.info("Verify Maximum Attendees text is visible");
        Assert.assertEquals(actualText, "Maximum Attendees");

    }
}
