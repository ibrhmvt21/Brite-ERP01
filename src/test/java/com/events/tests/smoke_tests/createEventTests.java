package com.events.tests.smoke_tests;

import com.events.pages.LoginPage;
import com.events.pages.import_createLocators_IBK;
import com.events.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.events.pages.importFunctionalityLocators;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static org.testng.Assert.assertTrue;

public class createEventTests extends TestBase {

    /*
    User Story

As a manger, i should be able to create an event.



Acceptance Criteria

Verify manger is able to create an event via link labeled as "create"
     */

    import_createLocators_IBK loc = new import_createLocators_IBK();


    public String setStartDate() {
        DateFormat form = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        Date date = new Date();

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.HOUR, 1);

        Date currentDatePlusOne = c.getTime();
        String futureDate = form.format(currentDatePlusOne);
        return futureDate;
    }

    public String setEndDate() {
        DateFormat form = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        Date date = new Date();

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, 2);

        Date currentDatePlusTwo = c.getTime();
        String futureDate = form.format(currentDatePlusTwo);
        return futureDate;
    }

    public List <String> createText(String xPath){
        List <WebElement> allBtnz=driver.findElements(By.xpath(xPath));

        List <String> text=new ArrayList<>();

        for(int i=0; i<allBtnz.size(); i++) {
            text.add(allBtnz.get(i).getText());
        }
        return text;
    }

    @Test
    public void createEventAsManager() throws Exception {

        page.login().loginAsManager();
        //click on create button
        loc.createBtn.click();
        //fill out required fields on create event form
        //enter name of event
        String expectedName = "New Event";
        loc.eventName.click();
        loc.eventName.sendKeys(expectedName);

        //set start Date-Time
        loc.startDate.click();
        loc.startDate.sendKeys(setStartDate());

        //Set end Date Time
        loc.endDate.click();
        loc.endDate.sendKeys(setEndDate());

        //confirm event
        loc.confirmEvent.click();

        //navigate to events page and verify new event created
        loc.eventsButton.click();
        String s1=loc.existingName.getText();

        Assert.assertEquals(s1,expectedName);
    }

    @Test
    public void createEventAsUser() throws Exception {

        page.login().loginAsUser();

        Assert.assertFalse(createText("//button").contains("Create"));

    }

    @Test
    public void importEventAsUser() throws Exception {

        page.login().loginAsUser();

        Assert.assertFalse(createText("//button").contains("Import"));

    }

}
