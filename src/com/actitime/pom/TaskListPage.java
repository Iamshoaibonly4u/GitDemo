package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustOption;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement enterCustName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustDesc;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustDD;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement selectBigBang;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustCreated;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewBtn() {
		return addnewBtn;
	}

	public WebElement getNewCustOption() {
		return newCustOption;
	}

	public WebElement getEnterCustName() {
		return enterCustName;
	}

	public WebElement getEnterCustDesc() {
		return enterCustDesc;
	}

	public WebElement getSelectCustDD() {
		return selectCustDD;
	}

	public WebElement getSelectBigBang() {
		return selectBigBang;
	}

	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}

	public WebElement getActualCustCreated() {
		return actualCustCreated;
	}
	
	
	
}
