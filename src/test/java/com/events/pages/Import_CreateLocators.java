package com.events.pages;

import com.events.utilities.BrowserUtils;
import com.events.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Import_CreateLocators extends BrowserUtils{


        public Import_CreateLocators() {
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

        @FindBy(xpath = "//div[@class='o_notification_manager']/div")
        public WebElement errorMessg;

        @FindBy(xpath = "//button[@accesskey='a']")
        public WebElement editButton;

        @FindBy (xpath = "(//div[@class='o_kanban_view o_event_kanban_view o_kanban_ungrouped']/div)[1]")
        public WebElement randomEvent;

        @FindBy(xpath = "(//td[@class='o_td_label'])[12]/label")
        public WebElement maxAttend;

        public List<String> createText(String xPath){
                List <WebElement> allBtnz=Driver.getDriver().findElements(By.xpath(xPath));

                List <String> text=new ArrayList<>();

                for(int i=0; i<allBtnz.size(); i++) {
                        text.add(allBtnz.get(i).getText());
                }
                return text;
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
}
