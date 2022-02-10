package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.crm.qa.utilities.TestUtil;

public class OpportunityDetailsPage extends TestBase {

    @FindBy(xpath = "//h2[text()='Opportunity Detail']")
    WebElement OpportunityDetail_Label;

    @FindBy(xpath = "//input[@name='edit' and @type='button']")
    WebElement EditBtn;

    @FindBy(xpath = "//input[@name='edit' and @type='button']")
    WebElement OpportunityName_Element;

    public OpportunityDetailsPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean ValidateOpportunityDetailLabel() {
        TestUtil.WaitForElementToBeVisible(driver, OpportunityDetail_Label, 50);
        return OpportunityDetail_Label.isDisplayed();
    }

    public boolean ValidateVisibilityofEditButton() {
        TestUtil.WaitForElementToBeVisible(driver, EditBtn, 50);
        return EditBtn.isDisplayed();
    }

    public OpportunityEditPage ClickOnEditButton() {
        EditBtn.click();
        return new OpportunityEditPage();
    }

    public String StoreOpportunityName() {

        TestUtil.WaitForElementToBeVisible(driver, OpportunityName_Element, 50);
        String OpptyName = OpportunityName_Element.getText();
        return OpptyName;

    }

}
