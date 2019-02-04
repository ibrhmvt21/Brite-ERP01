package com.events.pages;

import com.events.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.events.utilities.BrowserUtils;
import com.events.utilities.ConfigurationReader;
import com.events.utilities.Driver;

public class LoginPage extends BrowserUtils {

	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//a[@href='/web?db=BriteErpDemo']")
	private WebElement homepage;

	@FindBy(id = "login")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement pwd;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement loginBtn;

	@FindBy(xpath = "//a[@data-menu='124']")
	private WebElement EventsModule;


	public void loginAsUser() throws Exception {


			homepage.click();
			email.sendKeys(ConfigurationReader.getProperty("eventsUserName"));
			pwd.sendKeys(ConfigurationReader.getProperty("eventsUserPwd"));
			loginBtn.click();
			Thread.sleep(5000);

			wait(5);

			//BrowserUtils.waitForClickablility(EventsModule, 5);

			EventsModule.click();
		}

		public void loginAsManager () throws Exception {
			homepage.click();
			email.sendKeys(ConfigurationReader.getProperty("eventsManagerName"));
			pwd.sendKeys(ConfigurationReader.getProperty("eventsManagerPwd"));
			loginBtn.click();
			Thread.sleep(6000);

			wait(5);

			//BrowserUtils.waitForClickablility(EventsModule, 5);
			EventsModule.click();
		}

	}

