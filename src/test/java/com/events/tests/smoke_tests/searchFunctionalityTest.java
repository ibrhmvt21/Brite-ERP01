package com.events.tests.smoke_tests;

import com.events.pages.LoginPage;
import com.events.pages.SearchFunctionalityLocators;
import com.events.utilities.Driver;
import com.events.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class searchFunctionalityTest extends TestBase {



    @Test(groups = "group1")
    public void TestCase1() {
        extentLogger = report.createTest("Search fuctionlity testcase 1 executed");
        page.login().loginAsManager();
        extentLogger.pass("Clicked on Events lInk");

        page.searchFunctionality().advanceSearch.click();
        extentLogger.pass("clicked on advance search button");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
        wait.until(ExpectedConditions.visibilityOf(page.searchFunctionality().removeDefaultFilter));


        page.searchFunctionality().removeDefaultFilter.click();
        extentLogger.pass("Clicked on Default Filter button");
        extentLogger.info("Verify that all Events are Displeyed ");

        page.searchFunctionality().allUpcominEvents.getText();
        extentLogger.pass("all Events ");

        page.searchFunctionality().allUpcominEvents.isDisplayed();
        extentLogger.pass("Events are Displyed True");

        extentLogger.info("user shoul be able to search by events name");
        page.searchFunctionality().searchBox.sendKeys("Event 1" + Keys.ENTER);
        extentLogger.pass("User Entered Events name and clicked On keyboard Enter button");
        extentLogger.info("Verify Expected Event is Displeyed");

        page.searchFunctionality().Event_1.isDisplayed();
        extentLogger.pass("Event is Displeyd as Expected");

    }


    @Test(groups = "groutp2")
    public void TestCase2() {
        page.login().loginAsManager();
        extentLogger = report.createTest("Search fuctionlity testcase 2 executed");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
        wait.until(ExpectedConditions.visibilityOf(page.searchFunctionality().removeDefaultFilter));
        extentLogger.info("Waite till the Element is visible");

        page.searchFunctionality().removeDefaultFilter.click();
        extentLogger.pass(" removed the Default Filter ");

        page.searchFunctionality().advanceSearch.click();
        extentLogger.pass("clicked on advance search");


        page.searchFunctionality().filterButton.click();
        extentLogger.pass("clicked on Filter button");

        page.searchFunctionality().confirmedEvents.click();
        extentLogger.pass("clicked on the confirmed events link");

        page.searchFunctionality().allUpcominEvents.isDisplayed();
        extentLogger.pass("all confirmed Events are Displyed to User");

    }


    @Test(groups = "group3")
    public void TestCase3() {
        page.login().loginAsManager();
        extentLogger = report.createTest("Search fuctionlity testcase 3 executed");

        page.searchFunctionality().removeDefaultFilter.click();
        extentLogger.pass("clicked on remove Default button");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
        wait.until(ExpectedConditions.visibilityOf(page.searchFunctionality().advanceSearch));

        page.searchFunctionality().advanceSearch.click();
        extentLogger.pass("clicked on advance search button");


        WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(),20);
        wait.until(ExpectedConditions.visibilityOf(page.searchFunctionality().groupedby));

        page.searchFunctionality().groupedby.click();
        extentLogger.pass("clicked on groupedby filter");


        page.searchFunctionality().addCostomgroups.click();
        extentLogger.pass("clicked on add costom group button");



        Select select = new Select(page.searchFunctionality().selections);
        select.selectByVisibleText("Dedicated Menu");
        extentLogger.pass("select by Text from seletions menu");

        page.searchFunctionality().apply.click();
        extentLogger.pass("clicked on apply button");




    }
}
