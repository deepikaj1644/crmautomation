package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JurisdictionDetailsPage extends TestBase {

    @FindBy(xpath="//h2[text()='Jurisdictions Detail']")
    WebElement Jurisdictions_Label;



    public JurisdictionDetailsPage()
    {
        PageFactory.initElements(driver, this);
    }

    public boolean ValidateJurisdictionDetailsLabel()
    {
        TestUtil.WaitForElementToBeVisible(driver,Jurisdictions_Label,50);
        return Jurisdictions_Label.isDisplayed();
    }


}
