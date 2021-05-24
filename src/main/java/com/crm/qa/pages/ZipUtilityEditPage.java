package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ZipUtilityEditPage extends TestBase {

    @FindBy(xpath = "//label[text()='City']/following::input[1]")
    WebElement City_Textbox;

    @FindBy(xpath = "(//label[text()='County']/following::td/input)[1]")
    WebElement Country_Textbox;

    @FindBy(xpath = "//label[text()='State']/following::select[1]")
    WebElement State_Lst;

    @FindBy(xpath = "//label[text()='Utility Company']/following::select[1]")
    WebElement UtilityCompany_Lst;

    @FindBy(xpath = "//label[text()='Territory']/following::select[1]")
    WebElement Territory_Lst;

    @FindBy(xpath = "//label[text()='Sales Availability']/following::select[1]")
    WebElement SalesAvailability_Lst;

    @FindBy(xpath = "//label[text()='Metro Market']/following::input[1]")
    WebElement MetroMarket_Textbox;

    @FindBy(xpath = "//label[text()='Zip Code']/following::input[1]")
    WebElement ZipCode_Textbox;

    @FindBy(xpath = "//label[text()='Install Branch']/following::select[1]")
    WebElement InstallBranch_Lst;

    @FindBy(xpath = "//label[text()='Service Branch']/following::select[1]")
    WebElement ServiceBranch_Lst;

    @FindBy(xpath = "//label[text()='Sales Branch']/following::select[1]")
    WebElement SalesBranch_Lst;

    @FindBy(xpath = "//label[text()='Active Market']/following::input[1]")
    WebElement ActiveMarket_Textbox;

    @FindBy(xpath = "//label[text()='3rd Party Lead Purchasing']/following::input[1]")
    WebElement PartyLeadPurchasing_Textbox;

    @FindBy(xpath = "//input[@type='submit' and @name='save']")
    WebElement SaveBtn;

    public ZipUtilityEditPage() {
        PageFactory.initElements(driver, this);
    }

    public ZipUtilityDetailsPage CreateNewZipUtility(String City, String Country, String State, String UtilityCompany, String Territory, String SalesAvailability, String MetroMarket, String ZipCode, String InstallBranch, String ServiceBranch, String SalesBranch) throws InterruptedException {


        TestUtil.SelectRequiredObjectFromLookup("Sales Region", "Nevada");


        TestUtil.WaitForElementToBeVisible(driver, City_Textbox, 30);
        City_Textbox.sendKeys(City);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.WaitForElementToBeVisible(driver, Country_Textbox, 30);
        Country_Textbox.sendKeys(Country);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select StateLst = new Select(State_Lst);
        StateLst.selectByVisibleText(State);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select UtilityCompanyLst = new Select(UtilityCompany_Lst);
        UtilityCompanyLst.selectByVisibleText(UtilityCompany);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select TerritoryLst = new Select(Territory_Lst);
        TerritoryLst.selectByVisibleText(Territory);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select SalesAvailabilityLst = new Select(SalesAvailability_Lst);
        SalesAvailabilityLst.selectByVisibleText(SalesAvailability);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.WaitForElementToBeVisible(driver, MetroMarket_Textbox, 30);
        MetroMarket_Textbox.sendKeys(MetroMarket);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.WaitForElementToBeVisible(driver, ZipCode_Textbox, 30);
        ZipCode_Textbox.sendKeys(ZipCode);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select InstallBranchLst = new Select(InstallBranch_Lst);
        InstallBranchLst.selectByVisibleText(InstallBranch);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select ServiceBranchLst = new Select(ServiceBranch_Lst);
        InstallBranchLst.selectByVisibleText(ServiceBranch);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select SalesBranchLst = new Select(SalesBranch_Lst);
        InstallBranchLst.selectByVisibleText(SalesBranch);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);


        TestUtil.ClickOn(driver, SaveBtn, 20);

        return new ZipUtilityDetailsPage();


    }
}
