package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MarketAssignmentEditPage extends TestBase {

    @FindBy(xpath = "(//label[text()='Partner Performance Adder']/following::td/input)[1]")
    WebElement PartnerPerformanceAdder_Textbox;

    @FindBy(xpath = "//select[@title='Role - Available']")
    WebElement Role_Lst;

    @FindBy(xpath = "//img[@title='Add']")
    WebElement Add_Img;

    @FindBy(xpath = "(//label[text()='Sunrun Fee Adder']/following::td/input)[1]")
    WebElement SunrunFeeAdder_Textbox;

    @FindBy(xpath = "(//label[text()='Start Date']/following::span/input)[1]")
    WebElement StartDate_Textbox;

    @FindBy(xpath = "(//label[text()='End Date']/following::span/input)[1]")
    WebElement EndDate_Textbox;

    @FindBy(xpath = "//input[@type='submit' and @name='save']")
    WebElement SaveBtn;

    public MarketAssignmentEditPage() {
        PageFactory.initElements(driver, this);
    }


    public void CreateNewMarketAssignment(String PartnerPerformanceAdder, String SunrunFeeAdder, String Role, String StartDate, String EndDate) throws InterruptedException {

        TestUtil.SelectRequiredObjectFromLookup("Partner", "LGCY Power, LLC");

        TestUtil.WaitForElementToBeVisible(driver, PartnerPerformanceAdder_Textbox, 30);
        PartnerPerformanceAdder_Textbox.sendKeys(PartnerPerformanceAdder);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.WaitForElementToBeVisible(driver, SunrunFeeAdder_Textbox, 30);
        SunrunFeeAdder_Textbox.sendKeys(SunrunFeeAdder);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select RoleLst = new Select(Role_Lst);
        RoleLst.selectByVisibleText(Role);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Add_Img.click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.WaitForElementToBeVisible(driver, StartDate_Textbox, 30);
        StartDate_Textbox.sendKeys(StartDate);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.WaitForElementToBeVisible(driver, EndDate_Textbox, 30);
        EndDate_Textbox.sendKeys(EndDate);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.ClickOn(driver, SaveBtn, 20);


    }

}
