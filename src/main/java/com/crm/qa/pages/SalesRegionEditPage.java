package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesRegionEditPage extends TestBase {


    @FindBy(xpath="//input[@id='Name']")
    WebElement SalesRegionName_Textbox;

    @FindBy(xpath="//input[@type='submit' and @name='save']")
    WebElement SaveBtn;

    public  SalesRegionEditPage()
    {
        PageFactory.initElements(driver, this);
    }

    public SalesRegionDetailsPage CreateNewSalesRegion(String SalesRegionName) throws InterruptedException {

        TestUtil.WaitForElementToBeVisible(driver,SalesRegionName_Textbox,30);
        SalesRegionName_Textbox.sendKeys(SalesRegionName);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.ClickOn(driver,SaveBtn,20);

        return new SalesRegionDetailsPage();


    }


}
