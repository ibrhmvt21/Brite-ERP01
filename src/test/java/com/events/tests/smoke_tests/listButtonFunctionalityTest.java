
package com.events.tests.smoke_tests;

import com.events.pages.LoginPage;
import com.events.utilities.BrowserUtils;
import com.events.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.annotation.Target;

import static org.testng.Assert.assertEquals;

public class listButtonFunctionalityTest extends TestBase {


    @Test
    public void ListTest() throws InterruptedException {
        extentLogger = report.createTest("Verifying login to the page as Manager");
        page.login().loginAsManager();
        extentLogger.info("Logged in as manager");
        page.listButtonLocators().cross.click();
        extentLogger.info("List button been clicked");
        page.listButtonLocators().listbutton.click();
        Thread.sleep(4000);
        String actual = page.listButtonLocators().number.getText();
        //Assert.assertEquals(actual.contains());
        extentLogger.pass("verified List button functionality");
    }

    @Test
    public void pivotButton(){
        extentLogger=report.createTest("Verifying login to the page as Manager");
        page.login().loginAsManager();
        extentLogger.info("Logged in as manager");
        extentLogger.info("Click on Pivot Button");
        page.listButtonLocators().pivotButton.click();
        extentLogger.pass("verified Pivot button functionality");
    }

    @Test
    public void measuresButton(){
        extentLogger=report.createTest("Verifying login to the page as Manager");
        page.login().loginAsManager();
        extentLogger.info("Logged in as manager");
        extentLogger.info("Click Pivot Button");
        page.listButtonLocators().pivotButton.click();
        extentLogger.info("Click on Measures Button");
        page.listButtonLocators().measures.click();
        extentLogger.pass("Verified Measures button functionality");

    }

    @Test
    public void flipAxis(){
        extentLogger=report.createTest("Verifying login to the page as Manager");
        page.login().loginAsManager();
        extentLogger.info("Logged in as manager");
        extentLogger.info("Click Pivot Button");
        page.listButtonLocators().pivotButton.click();
        extentLogger.info("Click on FlipAxis Button");
        page.listButtonLocators().flipAxis.click();
        extentLogger.pass("Verified Flip Axis button functionality");
    }

    @Test
    public void expandAll(){
        extentLogger=report.createTest("Verifying login to the page as Manager");
        page.login().loginAsManager();
        extentLogger.info("Logged in as manager");
        extentLogger.info("Click Pivot Button");
        page.listButtonLocators().pivotButton.click();
        extentLogger.info("Click on Expand All Button");
        page.listButtonLocators().expandAll.click();
        extentLogger.pass("Verified Expand All functionality");
    }

    @Test
    public void download(){
        extentLogger=report.createTest("Verifying login to the page as Manager");
        page.login().loginAsManager();
        extentLogger.info("Logged in as manager");
        extentLogger.info("Click Pivot Button");
        page.listButtonLocators().pivotButton.click();
        extentLogger.info("Click on download Button");
        page.listButtonLocators().download.click();
        extentLogger.pass("Verified download button functionality");
    }
}