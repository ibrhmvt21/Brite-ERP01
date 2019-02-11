package com.events.tests.smoke_tests;

import com.events.utilities.BrowserUtils;
import com.events.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.testng.Assert.assertTrue;

public class CreateEventTests extends TestBase {

    @Test(description = "BRIT-1568")
    public void createEventAsManager() {

        extentLogger = report.createTest("Create event as a manager");
        extentLogger.info("Login as Manager");
        page.login().loginAsManager();
        extentLogger.info("Click on create event button");
        page.Import_Create().createBtn.click();

        extentLogger.info("Fill out required fields");

        extentLogger.info("Enter name of event");

        String expectedName = "New Event";
        page.Import_Create().eventName.click();
        page.Import_Create().eventName.sendKeys(expectedName);

        extentLogger.info("Set start date and time");
        page.Import_Create().startDate.click();
        page.Import_Create().startDate.sendKeys(page.Import_Create().setStartDate());

        extentLogger.info("Set end date and time");
        BrowserUtils.waitForClickablility(page.Import_Create().endDate, 5);
        //loc.endDate.click();
        page.Import_Create().endDate.sendKeys(page.Import_Create().setEndDate());

        extentLogger.info("Click on confirm event button");
        page.Import_Create().confirmEvent.click();

        extentLogger.info("Verify event is created");
        page.Import_Create().eventsButton.click();
        String s1 = page.Import_Create().existingName.getText();

        Assert.assertEquals(s1, expectedName);
    }

    @Test(description = "BRIT-1561")
    public void createEventAsUser() {

        extentLogger = report.createTest("Create Event as A User");
        extentLogger.info("Login as a user");
        page.login().loginAsUser();

        extentLogger.info("Verify user can not create an event");
        Assert.assertFalse(
                page.Import_Create().createText("//button").contains("Create"));

    }

    @Test(description = "BRIT-1570")
    public void importEventAsUser() {
        extentLogger = report.createTest("Import Event as A User");
        extentLogger.info("Login as a user");
        page.login().loginAsUser();

        extentLogger.info("Verify user can not upload a file");
        Assert.assertFalse(
                page.Import_Create().createText("//button").contains("Import"));


    }

}
