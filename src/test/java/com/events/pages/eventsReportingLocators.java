package com.events.pages;


import com.events.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class eventsReportingLocators {

  public eventsReportingLocators(){
      PageFactory.initElements(Driver.getDriver(), this);
}
  @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[10]/ul[1]/li/a/span" )
    public WebElement confirmReporting;

  @FindBy(xpath = "//button[@class='btn btn-primary btn-sm dropdown-toggle']")
    public WebElement measures;

  @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul")
    public List<WebElement> allMeasursName;

  @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul/li[1]/a")
    public WebElement uncheckRsSeats;

  @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul/li[3]/a")
    public WebElement MaxAttNumber;

  @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/table")
    public List<WebElement> tableMess;




}
