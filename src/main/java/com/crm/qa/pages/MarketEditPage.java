package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MarketEditPage extends TestBase {

    @FindBy(xpath = "(//label[text()='Market Name']/following::div/input)[1]")
    WebElement MarketName_Textbox;

    @FindBy(xpath = "//label[text()='State']/following::select[1]")
    WebElement State_Lst;

    @FindBy(xpath = "//label[text()='Utility Company']/following::select[1]")
    WebElement UtilityCompany_Lst;

    @FindBy(xpath = "(//label[text()='Number of Leads']/following::td/input)[1]")
    WebElement NumberofLeads_Textbox;

    @FindBy(xpath = "//input[@type='submit' and @name='save']")
    WebElement SaveBtn;

    public MarketEditPage() {
        PageFactory.initElements(driver, this);
    }

    public MarketDetailsPage CreateNewMarket(String MarketName, String State, String UtilityCompany, String NumberofLeads) throws InterruptedException {


        TestUtil.WaitForElementToBeVisible(driver, MarketName_Textbox, 30);
        MarketName_Textbox.sendKeys(MarketName);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.WaitForElementToBeVisible(driver, NumberofLeads_Textbox, 30);
        NumberofLeads_Textbox.sendKeys(NumberofLeads);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select StateLst = new Select(State_Lst);
        StateLst.selectByVisibleText(State);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select UtilityCompanyLst = new Select(UtilityCompany_Lst);
        UtilityCompanyLst.selectByVisibleText(UtilityCompany);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.ClickOn(driver, SaveBtn, 20);

        return new MarketDetailsPage();

    }

}
