package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.generic.WebdriverCommonLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	
	@Test
		public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("Create Customer",true);
		FileLib f=new FileLib();
		String custName=f.getExcelData("CreateCustomer", 1, 2);
		String custDesc=f.getExcelData("CreateCustomer", 1, 3);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.clickOnTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddnewBtn().click();
		t.getNewCustOption().click();
		t.getEnterCustName().sendKeys(custName);
		t.getEnterCustDesc().sendKeys(custDesc);
		t.getSelectCustDD().click();
		t.getSelectBigBang().click();
		t.getCreateCustBtn().click();
		Thread.sleep(2000);
		String actualCustText=t.getActualCustCreated().getText();
		Assert.assertEquals(actualCustText, custName);
		Reporter.log("customer created successsfully"+custName,true);
		f.setExcelData("CreateCustomer", 1, 4, "passed");
		
	}
}
