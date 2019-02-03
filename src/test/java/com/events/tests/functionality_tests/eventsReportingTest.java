package com.events.tests.functionality_tests;

import com.events.pages.LoginPage;
import com.events.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.events.utilities.TestBase;

import java.util.List;

public class eventsReportingTest extends TestBase {
	LoginPage page;


	@Test
	public void TestCase1() throws Exception {
		page = new LoginPage();
		page.loginAsManager();

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[10]/ul[1]/li/a/span")).click();
		Thread.sleep(6000);

		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm dropdown-toggle']")).click();

		Thread.sleep(5000);

		List<WebElement> allNames =
				driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul"));

		for (WebElement table : allNames){

			System.out.println("Shows all the Measures " + table.getText());
		}
		System.out.println("=================================");

		//incheck Reserved Seats
		String ExpMess = "Reserved Seats";
		WebElement incheck = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul/li[1]/a"));
		incheck.click();

		String ActMess = incheck.getText();
		System.out.println(ExpMess);
        System.out.println(ActMess);
		Assert.assertEquals(ExpMess,ActMess);

		System.out.println("=================================");

        //check Maximum Attendees Number
		String ExpectedMeasure = "Maximum Attendees Number";
		WebElement Measure =  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul/li[3]/a"));
		Measure.click();


		String Actual = Measure.getText();
		System.out.println(ExpectedMeasure);
		System.out.println(Actual);
		Assert.assertEquals(ExpectedMeasure,Actual);

		System.out.println("=================================");


		List<WebElement> table = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/table"));
		for(WebElement total : table){
			System.out.println(total.getText());
		}
	}
	@Test
	public void testcase2() throws Exception {
		page = new LoginPage();
		page.loginAsManager();

		driver.manage().window().fullscreen();


		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[10]/ul[1]/li/a/span")).click();
		Thread.sleep(6000);

		//check the Flip axis button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(6000);

		//check the Expend all button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[2]")).click();
		Thread.sleep(6000);

		//download xls
		WebElement download = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[3]"));
		download.click();
		Thread.sleep(6000);
		boolean ActTitle = download.isDisplayed();
		System.out.println(ActTitle);
        Assert.assertTrue(ActTitle,"Download xls");
	}



}
