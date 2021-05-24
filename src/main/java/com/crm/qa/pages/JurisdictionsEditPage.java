package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JurisdictionsEditPage extends TestBase {
    @FindBy(xpath="//input[@id='Name']")
    WebElement JurisdictionName_Textbox;

    @FindBy(xpath = "//label[text()='State']/following::td[1]/span/select")
    WebElement State_Lst;

    @FindBy(xpath = "(//label[text()='Build Partners']/following::span/select)[1]")
    WebElement BuildPartners_Lst;

    @FindBy(xpath = "(//label[text()='Rebate/Interconnection Required for Perm']/following::span/select)[1]")
    WebElement Rebate_Lst;

    @FindBy(xpath="//input[@type='submit' and @name='save']")
    WebElement SaveBtn;


    public  JurisdictionsEditPage()
    {
        PageFactory.initElements(driver, this);
    }

    public JurisdictionDetailsPage CreateNewJurisdiction(String JurisdictionName,String State,String BuildPartners, String Rebate) throws InterruptedException {

        TestUtil.WaitForElementToBeVisible(driver,JurisdictionName_Textbox,30);
        JurisdictionName_Textbox.sendKeys(JurisdictionName);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.SelectRequiredObjectFromLookup("Branch", "Las Vegas");

        Select StateLst = new Select(State_Lst);
        StateLst.selectByVisibleText(State);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select BuildPartnersLst = new Select(BuildPartners_Lst);
        BuildPartnersLst.selectByVisibleText(BuildPartners);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select RebateLst = new Select(Rebate_Lst);
        RebateLst.selectByVisibleText(Rebate);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);


        TestUtil.ClickOn(driver,SaveBtn,20);

        return new JurisdictionDetailsPage();


    }

}
