package com.events.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.events.utilities.Driver;
//1
public class importFunctionalityLocators {
	public importFunctionalityLocators() {
		PageFactory.initElements(Driver.getDriver(), this);
	}


	@FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
	public WebElement importBtn;


	@FindBy(xpath = "//a[@class='pull-right']")
	public WebElement helpBtn;

	@FindBy(xpath = "//label[@for='my-file-selector']")
	public WebElement loadFileBtn;
	
	@FindBy(xpath="//h2[.='Map your columns to import']")
	public WebElement MapString;

	public static String helpLinkURL = "https://www.odoo.com/documentation/user/11.0/general/base_import/import_faq.html";

	public void loadFile() throws InterruptedException, AWTException {


		String system=System.getProperty("os.name");

	
		if(system.contains("Windows")) {
			
            loadFileBtn.click();
            StringSelection ss = new StringSelection(System.getProperty("user.dir")+"\\Book2.xlsx");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        	Robot robot = new Robot();
    		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		


		}else if(system.contains("Mac")) {

		importBtn.sendKeys("/Users/barankar/Documents/BriteERP/Book1.xlsx");

		}

	}
}
