package com.events.pages;

import com.events.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventCats_Locators {

    public EventCats_Locators() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[contains(text(),'Import')]")
    public WebElement importButton;

    @FindBy(xpath = "//span[contains(text(),'Event Categories')]")
    public WebElement eventCat;

    @FindBy(xpath = "//td[.='Online']")
    public WebElement online;

    @FindBy(xpath = "//h2[.='Location']")
    public WebElement location;

    @FindBy(xpath = "//h2[.='Communication']")
    public WebElement communication;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createButton;

    @FindBy(xpath = "//li[.='Event Categories']")
    public WebElement eventCatText;

    @FindBy(xpath = "//title[contains(text(),'Event Categories - Odoo')]")
    public WebElement ecTitle;

    @FindBy(xpath = "//label[contains(text(),'Use Default Timezone')]")
    public WebElement defaultTimezone;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputText;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//span[@name='name']")
    public WebElement batchXText;

    @FindBy(xpath = "//th[.='Event Category']")
    public WebElement eCategoryText;

    @FindBy(xpath = "//div[@class='o_content']")
    public WebElement clickEventC;

    @FindBy(xpath = "//tbody[@class='ui-sortable']//tr[7]//td[1]//div[1]//input[1]")
    public WebElement seminarText;

    @FindBy(xpath = "//button[contains(text(),'Action')]")
    public WebElement actionDropD;

    @FindBy(xpath = "//a[@data-index='1']")
    public WebElement deleteEvent;

    @FindBy(xpath = "//button[.='Ok']")
    public WebElement okButton;

    @FindBy(linkText = "Export")
    public WebElement export;

    @FindBy(xpath = "//h4[.='Export Data']")
    public WebElement expDataText;

    @FindBy(xpath = "//div[@class='o_kanban_view o_event_kanban_view o_kanban_ungrouped']")
    public WebElement content;

    @FindBy(css = ".modal-title")
    public WebElement confirmationText;
}

