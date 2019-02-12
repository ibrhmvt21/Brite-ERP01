package com.events.tests.smoke_tests;

import com.aventstack.extentreports.ExtentTest;
import com.events.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchFuctionality2Test extends TestBase {

    @Test
    public void searchFuctionality(){
        extentLogger = report.createTest("search fuctionlity");
        page.login().loginAsManager();
        extentLogger.pass("User login as a manager");

        page.searchFunctionality().EvenCategories.click();
        extentLogger.pass("user clicked on the eventCategories");

        page.searchFunctionality().food.click();
        extentLogger.pass("user clicked on the food link");
        String expected = "Food";

        Assert.assertEquals(expected,page.searchFunctionality().expectedresult.getText());
        extentLogger.pass("user comperad the link text");
    }

    @Test
    public void searchFuctionlity2() throws InterruptedException {
        extentLogger = report.createTest("creating an event");
        page.login().loginAsManager();
        extentLogger.pass("user loged in as manager");
        page.searchFunctionality().EvenCategories.click();
        extentLogger.pass("user is on the event page");
        Thread.sleep(2000);
        page.searchFunctionality().create.click();
        extentLogger.pass("user creating a event");
        page.searchFunctionality().eventCategories.sendKeys("new Year Event");
        extentLogger.pass("user entered new year event on edite box");
        page.searchFunctionality().save.click();
        extentLogger.pass("user saved its event ");
    }
}
