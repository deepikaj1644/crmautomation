package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketDetailsPage extends TestBase {

    @FindBy(xpath="//h2[text()='Market Detail']")
    WebElement MarketDetail_Label;

    @FindBy(xpath="//input[@value='New Market Assignment']")
    WebElement NewMarketAssignment_Btn;


    public MarketDetailsPage()
    {
        PageFactory.initElements(driver, this);
    }

    public boolean ValidateMarketDetailsLabel()
    {
        TestUtil.WaitForElementToBeVisible(driver,MarketDetail_Label,50);
        return MarketDetail_Label.isDisplayed();
    }

    public MarketAssignmentEditPage ClickonNewMarketAssignmentButton()
    {
        TestUtil.WaitForElementToBeVisible(driver,NewMarketAssignment_Btn,50);
        TestUtil.ClickOn(driver,NewMarketAssignment_Btn,90000);
        return new MarketAssignmentEditPage();
    }
}
