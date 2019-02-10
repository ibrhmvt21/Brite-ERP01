package com.events.tests.functionality_tests;

import com.events.utilities.BrowserUtils;
import com.events.utilities.Driver;
import com.events.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;

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

    @Test(description = "BRIT-1587")
    public void verifyUpcomingEvents() throws ParseException {
        extentLogger=report.createTest("Verify Upcaoming Events Tes");
        extentLogger.info("Login as a manager");
        page.login().loginAsManager();


        BrowserUtils.waitForPageToLoad(5);
        extentLogger.info("Locate the date of upcoming events");
        String actualDate1=page.Import_Create().upcomingDate1.getText();
        String actualDate2=page.Import_Create().upcomingDate2.getText();

        String actDate=(actualDate1+" "+actualDate2);
        System.out.println(page.Import_Create().todaysDate());

        extentLogger.info("Compare today's date with the event's date");


        int mes=page.Import_Create().compareDates(page.Import_Create().todaysDate(),actDate);

        Assert.assertTrue(mes==0 || mes<0);


    }

    @Test(description = "BRIT-1592")
    public void verifyNumberOfAttendees()  {
        extentLogger=report.createTest("Verify Number of Attendees is visible Test");
        extentLogger.info("Login as a user");
        page.login().loginAsUser();

        BrowserUtils.waitForPageToLoad(5);
        extentLogger.info("Locate the number of attendees text");
        String expcText=page.Import_Create().numAttend.getText();

        extentLogger.info("Verify text contains expected attendees");
        System.out.println(expcText);
        Assert.assertTrue(expcText.contains("Expected attendees"));

    }

    @Test(description = "BRIT-1595")
    public void cancelEventAsManager()  {
        extentLogger=report.createTest("Verify Manager has Ability to Cancel an Event");
        extentLogger.info("Login as a Manager");
        page.login().loginAsManager();

        BrowserUtils.waitForPageToLoad(5);
        extentLogger.info("Clcik on a random event");
        page.Import_Create().randomEvent.click();

        extentLogger.info("Verify Cancel Event button is displayed");

        String text = page.Import_Create().cancelEvent.getText();

        Assert.assertTrue(text.contains("Cancel Event"));

    }

    @Test(description = "BRIT-1600")
    public void cancelEventAsUser()  {
        extentLogger=report.createTest("Verify User does not have Ability to Cancel an Event");
        extentLogger.info("Login as a User");
        page.login().loginAsUser();

        BrowserUtils.waitForPageToLoad(5);
        extentLogger.info("Clcik on a random event");
        page.Import_Create().randomEvent.click();

        extentLogger.info("Verify Error message is displayed when user tries to cancel an event");

       page.Import_Create().cancelEvent.click();

       String actText=page.Import_Create().errorMessg2.getText();

       Assert.assertTrue(actText.contains("you are not allowed to modify"));

    }

}

