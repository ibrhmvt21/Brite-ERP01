package com.events.tests.functionality_tests;

import com.events.utilities.BrowserUtils;
import com.events.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class eventCats_Kanban_Test extends TestBase {

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
    public void eventCategoriesTitleVerification() throws Exception {
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
    public void userVerifyEventCategories() throws Exception {
        page.login().loginAsUser();

        utils.wait(5);
        page.evencat().eventCat.click();

        String ecText = page.evencat().eventCatText.getText();
        Assert.assertEquals(ecText, "Event Categories");
    }


    @Test(description = "Testing Event Categories / BRIT-386")
    public void managerDefaultText() throws Exception {
        page.login().loginAsManager();

        String imp = page.evencat().importButton.getText();
        Assert.assertEquals(imp, "Import");

        utils.waitForClickablility(page.evencat().eventCat, 7).click();

        utils.wait(5);
        page.evencat().createButton.click();

        String timeZone = page.evencat().defaultTimezone.getText();
        Assert.assertEquals(timeZone, "Use Default Timezone");
    }


    @Test(description = "Testing Event Categories / BRIT-388")
    public void managerCreateBatchX() throws Exception {
        page.login().loginAsManager();

        utils.waitForClickablility(page.evencat().eventCat, 10).click();
        utils.wait(5);
        page.evencat().createButton.click();

        String location = page.evencat().location.getText();
        Assert.assertEquals(location, "Location");

        page.evencat().inputText.sendKeys("Batch X");
        page.evencat().saveButton.click();

        String btchX = page.evencat().batchXText.getText();
        Assert.assertEquals(btchX, "Batch X");
    }


    @Test(description = "Testing Event Categories / BRIT-389")
    public void managerDeleteEvent() throws Exception {
        page.login().loginAsManager();

        utils.waitForClickablility(page.evencat().eventCat, 7).click();

        String ECatText = page.evencat().eCategoryText.getText();
        Assert.assertEquals(ECatText, "Event Category");
        page.evencat().seminarText.click();
        page.evencat().actionDropD.click();
        page.evencat().deleteEvent.click();

        String actualConfirmation = page.evencat().confirmationText.getText();
        Assert.assertEquals(actualConfirmation, "Confirmation");
        page.evencat().okButton.click();
    }


    @Test(description = "Testing Event Categories / BRIT 331")
    public void verifyEventCategoryText() throws Exception {
        page.login().loginAsUser();
        utils.waitForClickablility(page.evencat().eventCat, 7).click();

        String ECatText = page.evencat().eCategoryText.getText();
        Assert.assertEquals(ECatText, "Event Category");
        page.evencat().seminarText.click();
        page.evencat().actionDropD.click();
        page.evencat().export.click();
        String expo = page.evencat().expDataText.getText();
        Assert.assertEquals(expo, "Export Data");
    }


    @Test(description = "Testing Event Categories / BRIT 393")
    public void displayAllEvents() throws Exception {
        page.login().loginAsUser();

        page.evencat().eventCat.click();
        List<WebElement> myElements = driver.findElements(By.xpath("//body[@class='o_web_client']/div[@class='o_main']/div[@class='o_main_content']/div[@class='o_content']//table"));
        for (WebElement e : myElements) {
            Assert.assertTrue(e.isDisplayed());
            System.out.println(e.getText());
        }
    }


    @Test(description = "Testing Kanban Categories / BRIT 247")
    public void displayEvents() throws Exception {
        page.login().loginAsManager();

        String imp = page.evencat().importButton.getText();
        Assert.assertEquals(imp, "Import");

        List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='o_kanban_view o_event_kanban_view o_kanban_ungrouped']"));
        for (WebElement a : myElements) {
            if (a.getSize().equals(0)) {
                System.out.println("List is empty");
            } else {
                System.out.println(a.getText());
            }
        }
    }

    @Test(description = "Testing Event Categories / BRIT-403")
    public void managerVerifyEventCategories() throws Exception {
        page.login().loginAsManager();

        utils.wait(5);
        page.evencat().eventCat.click();

        String ecText = page.evencat().eventCatText.getText();
        Assert.assertEquals(ecText, "Event Categories");
    }
}

