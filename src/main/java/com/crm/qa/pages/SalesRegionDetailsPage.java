package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesRegionDetailsPage extends TestBase {

    @FindBy(xpath="//h2[text()='Sales Region Detail']")
    WebElement SalesRegionDetail_Label;

    public SalesRegionDetailsPage()
    {
        PageFactory.initElements(driver, this);
    }

    public boolean ValidateSalesRegionLabel()
    {
        TestUtil.WaitForElementToBeVisible(driver,SalesRegionDetail_Label,50);
        return SalesRegionDetail_Label.isDisplayed();
    }


}
