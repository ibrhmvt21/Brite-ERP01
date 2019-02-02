package com.events.pages;

import com.events.utilities.BrowserUtils;
import com.events.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class import_createLocators_IBK extends BrowserUtils{


        public import_createLocators_IBK () {
            PageFactory.initElements(Driver.getDriver(), this);
        }


        @FindBy(xpath = "//button[@accesskey='c']")
        public WebElement createBtn;

        @FindBy(xpath = "//input[@name='date_begin']")
        public WebElement startDate;

        @FindBy(xpath = "//input[@name='name']")
        public WebElement eventName;

        @FindBy(xpath = "//input[@name='date_end']")
        public WebElement endDate;

        @FindBy(xpath = "//button[@class='btn btn-sm btn-default oe_highlight']")
        public WebElement confirmEvent;

        @FindBy(xpath = "//a[@href='/web#menu_id=128&action=142']")
        public WebElement eventsButton;

        @FindBy(xpath = "(//h4[@class='o_kanban_record_title']/span)[1]")
        public WebElement existingName;


}
