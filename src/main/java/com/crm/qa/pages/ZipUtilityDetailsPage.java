package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZipUtilityDetailsPage extends TestBase {

    @FindBy(xpath="//h2[text()='ZipUtility Detail']")
    WebElement ZipUtilityDetail_Label;

    public ZipUtilityDetailsPage()
    {
        PageFactory.initElements(driver, this);
    }

    public boolean ValidateAccountDetailLabel()
    {
        TestUtil.WaitForElementToBeVisible(driver,ZipUtilityDetail_Label,50);
        return ZipUtilityDetail_Label.isDisplayed();
    }

}
