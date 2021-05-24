package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketAssignmentDetailsPage extends TestBase {

    @FindBy(xpath="//h2[text()='Market Assignment Detail']")
    WebElement MarketAssignmentDetail_Label;


    public MarketAssignmentDetailsPage()
    {
        PageFactory.initElements(driver, this);
    }

    public boolean ValidateMarketAssignmentDetailsLabel()
    {
        TestUtil.WaitForElementToBeVisible(driver,MarketAssignmentDetail_Label,50);
        return MarketAssignmentDetail_Label.isDisplayed();
    }
}
