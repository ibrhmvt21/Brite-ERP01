package com.events.tests.smoke_tests;

import com.events.pages.LoginPage;
import com.events.pages.eventCategoriesPage;
import com.events.utilities.BrowserUtils;
import com.events.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PercySmokeTests extends TestBase {

    LoginPage page;
    BrowserUtils utils;
    eventCategoriesPage evencat = new eventCategoriesPage();



    @Test(description = "Testing Event Categories / BRIT-385" )
    public void verifyOnline(){
        page = new LoginPage();
        page.loginAsManager();

        String imp = evencat.importButton.getText();
        Assert.assertEquals(imp, "Import");

        utils.wait(5);
        evencat.eventCat.click();

        evencat.online.click();

        String locat = evencat.location.getText();
        Assert.assertEquals(locat, "Location");
        String commu = evencat.communication.getText();
        Assert.assertEquals(commu,"Communication");
    }


    @Test(description = "Testing Event Categories / BRIT-387 (negative)")
    public void verifyTitle(){
        page = new LoginPage();
        page.loginAsManager();

        String createB = evencat.createButton.getText();
        Assert.assertEquals(createB, "Create");

        utils.wait(5);
        evencat.eventCat.click();

        String expectedTitle = "Event Categories - Odoo";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }


    @Test(description = "Testing Event Categories / BRIT-394")
    public void verifyURL(){
        page = new LoginPage();
        page.loginAsUser();

        utils.wait(5);
        evencat.eventCat.click();

        String ecText = evencat.eventCatText.getText();
        Assert.assertEquals(ecText, "Event Categories");

        String expectedURL = "http://52.39.162.23/web?#view_type=list&model=event.type&menu_id=127&action=139";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    }
}
