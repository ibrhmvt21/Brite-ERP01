package com.events.pages;

import com.events.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class eventCats_Locators {

    public eventCats_Locators() {
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

}
