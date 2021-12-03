package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetailsPage extends TestBase {

    @FindBy(xpath="//h2[text()='Contact Detail']")
    WebElement ContactDetail_Label;

    @FindBy(xpath="//input[@name='edit' and @type='button']")
    WebElement EditBtn;


    public ContactDetailsPage()
    {
        PageFactory.initElements(driver, this);
    }


    //******* Verify 'Account Deatils' label on Account Details Page *************
    public boolean ValidateAccountDetailLabel()
    {
        TestUtil.WaitForElementToBeVisible(driver,ContactDetail_Label,50);
        return ContactDetail_Label.isDisplayed();
    }

    //******* Verify Edit button *************
    public boolean ValidateVisibilityofEditButton()
    {
        TestUtil.WaitForElementToBeVisible(driver,EditBtn,50);
        return EditBtn.isDisplayed();
    }

}
