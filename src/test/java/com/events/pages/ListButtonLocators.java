

package com.events.pages;

import com.events.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;








public class ListButtonLocators {
    public ListButtonLocators() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//div[@class='btn-group btn-group-sm o_cp_switch_buttons']//button[3]")
    public WebElement listbutton;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']//button[4]")
    public WebElement pivotButton;

    @FindBy(xpath = "//div[@class='fa fa-sm fa-remove o_facet_remove']")
    public WebElement cross;

    @FindBy(xpath = "//*[@class='o_pager_limit']")
    public WebElement number;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm dropdown-toggle']")
    public WebElement measures;

    @FindBy(xpath = "//button[@class='btn btn-default fa fa-expand o_pivot_flip_button']")
    public WebElement flipAxis;

    @FindBy(xpath = "//button[@class='btn btn-default fa fa-arrows-alt o_pivot_expand_button']")
    public WebElement expandAll;

    @FindBy(xpath = "//button[@class='btn btn-default fa fa-download o_pivot_download']")
    public WebElement download;

    @FindBy(xpath="//td[@class='o_list_record_selector']")
    public WebElement firstClick;

    @FindBy(xpath="//div[@class='btn-group o_dropdown']")
    public WebElement actionButton;



}
