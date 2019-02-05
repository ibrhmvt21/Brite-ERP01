package com.events.tests.smoke_tests;

import com.events.pages.LoginPage;
import com.events.tests.functionality_tests.eventsReportingTest;
import com.events.utilities.BrowserUtils;
import com.events.utilities.TestBase;
import org.testng.annotations.Test;

public class smoke_TestEvReporting extends TestBase {

//    public static void main(String[] args) {
//        System.out.println("sth");
//    }

    LoginPage page;
    BrowserUtils utils;
    eventsReportingTest eventRepo = new eventsReportingTest();

    @Test(description = "Testing Event Reporting")
    public void verifyReport() throws Exception {

        page = new LoginPage();
        page.loginAsManager();






    }



}
