package com.events.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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
		loadFileBtn.click();

		String system=System.getProperty("os.name");
		StringSelection ss = new StringSelection(System.getProperty("user.dir")+"\\Book2.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		
		if(system.contains("Windows")) {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);


		}else if(system.contains("Mac")) {
			robot.keyPress(KeyEvent.VK_META);
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_G);

			robot.keyRelease(KeyEvent.VK_META);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_G);
//			robot.delay(2000);
//			robot.keyPress(KeyEvent.VK_META);
//			robot.keyPress(KeyEvent.VK_SHIFT);
//			robot.keyPress(KeyEvent.VK_G);
//			robot.keyRelease(KeyEvent.VK_META);
//			robot.keyRelease(KeyEvent.VK_TAB);
		}

	}
}
