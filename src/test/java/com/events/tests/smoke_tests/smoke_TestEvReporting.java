package com.events.tests.smoke_tests;

import com.events.pages.LoginPage;
import com.events.pages.eventsReportingLocators;
import com.events.tests.functionality_tests.eventsReportingTest;
import com.events.utilities.BrowserUtils;
import com.events.utilities.TestBase;
import com.events.utilities.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class smoke_TestEvReporting extends TestBase {

//    public static void main(String[] args) {
//        System.out.println("sth");
//    }

   private LoginPage page;
    BrowserUtils utils;
    eventsReportingLocators eventRepo = new eventsReportingLocators();
    @Test(description = "EventReporting button ")
    public void testcaseOne () throws Exception {

        page = new LoginPage();
        page.loginAsManager();

        eventRepo.confirmReporting.click();
        eventRepo.measures.click();

        List<String> allNames = BrowserUtils.getElementsText(eventRepo.allMeasursName);
        System.out.println(allNames);

    }
    @Test(description = "Reserved Seats button")
    public void testCaseTwo() throws Exception {
        page = new LoginPage();
        page.loginAsManager();

        eventRepo.confirmReporting.click();
        eventRepo.measures.click();
        eventRepo.uncheckRsSeats.click();
        Thread.sleep(6000);

        String ExpMess = "Reserved Seats";
        String actual = eventRepo.uncheckRsSeats.getText();

        Assert.assertEquals(ExpMess,actual);

    }
    @Test(description = "Max attendees number")
    public void testCaseThree() throws Exception {

        page = new LoginPage();
        page.loginAsManager();
        eventRepo.confirmReporting.click();
        eventRepo.measures.click();
        eventRepo.uncheckRsSeats.click();
        Thread.sleep(6000);

        eventRepo.MaxAttNumber.click();
        String expMess = "Maximum Attendees Number";
        String actual = eventRepo.MaxAttNumber.getText();

        Assert.assertEquals(expMess,actual);
    }
    @Test(description = "Table Message total")
    public void testCaseFour() throws Exception {

        page = new LoginPage();
        page.loginAsManager();
        eventRepo.confirmReporting.click();
        eventRepo.measures.click();
        eventRepo.uncheckRsSeats.click();
        eventRepo.MaxAttNumber.click();
        Thread.sleep(6000);

        List<String> tableMessage = BrowserUtils.getElementsText(eventRepo.tableMess);
        for (String total : tableMessage){
            System.out.println(total);

        }



    }




}
