package com.events.tests.smoke_tests;

import com.events.pages.LoginPage;
import com.events.pages.eventCats_Locators;
import com.events.utilities.BrowserUtils;
import com.events.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class eventCatTests extends TestBase {

    BrowserUtils utils;

    @Test(description = "Testing Event Categories / BRIT-385")
    public void managerVerifyOnline() throws Exception {
        page.login().loginAsManager();

        String imp = page.evencat().importButton.getText();
        Assert.assertEquals(imp, "Import");

        utils.wait(5);
        page.evencat().eventCat.click();

        page.evencat().online.click();

        String location = page.evencat().location.getText();
        Assert.assertEquals(location, "Location");
        String communication = page.evencat().communication.getText();
        Assert.assertEquals(communication, "Communication");
    }


    @Test(description = "Testing Event Categories / BRIT-387")
    public void eventCategoriesTitleVerification()throws Exception  {
        page.login().loginAsManager();

        String createB = page.evencat().createButton.getText();
        Assert.assertEquals(createB, "Create");

        utils.wait(5);
        page.evencat().eventCat.click();

        utils.wait(5);
        String expectedTitle = "Event Categories - Odoo";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    @Test(description = "Testing Event Categories / BRIT-394")
    public void userVerifyEventCategories()throws Exception  {
        page.login().loginAsUser();

        utils.wait(5);
        page.evencat().eventCat.click();

        String ecText = page.evencat().eventCatText.getText();
        Assert.assertEquals(ecText, "Event Categories");
    }
}
