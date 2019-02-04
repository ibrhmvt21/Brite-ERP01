
package com.events.tests.smoke_tests;

import com.events.pages.LoginPage;
import com.events.utilities.BrowserUtils;
import com.events.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.annotation.Target;

import static org.testng.Assert.assertEquals;

public class listButton_Functionality extends TestBase {


    @Test
    public void ListTest() throws InterruptedException {
        extentLogger = report.createTest("Verifying login to the page as Manager");
        page.login().loginAsManager();
        extentLogger.info("Logged in as manager");
        page.listButtonLocators().cross.click();
        extentLogger.info("List button been clicked");
        page.listButtonLocators().listbutton.click();
        Thread.sleep(4000);
        String value = page.listButtonLocators().number.getText();
        //Assert.assertEquals(value,number);
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
}