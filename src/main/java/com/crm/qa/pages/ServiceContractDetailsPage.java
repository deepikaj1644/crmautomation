package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceContractDetailsPage extends TestBase {

    @FindBy(xpath="//h2[text()='Service Contract Detail']")
    WebElement ServiceContractDetail_Label;

    @FindBy(xpath="//input[@name='edit' and @type='button']")
    WebElement EditBtn;

    @FindBy(xpath="//th[text()='Service Contract Event Name']/following::th/a[contains(text(),'SCA')]")
    WebElement ServiceContractEvent_Lnk;

    public ServiceContractDetailsPage()
    {
        PageFactory.initElements(driver, this);
    }


    public boolean ValidateServiceContractDetailLabel()
    {
        TestUtil.WaitForElementToBeVisible(driver,ServiceContractDetail_Label,50);
        return ServiceContractDetail_Label.isDisplayed();
    }
    public boolean ValidateVisibilityofEditButton()
    {
        TestUtil.WaitForElementToBeVisible(driver,EditBtn,50);
        return EditBtn.isDisplayed();
    }

    public ServiceContractEventDetailsPage ClickOnServiceContractEventRecord()
    {
        TestUtil.WaitForElementToBeVisible(driver,EditBtn,50000);
        TestUtil.ClickOn(driver,ServiceContractEvent_Lnk,50000);
        return new ServiceContractEventDetailsPage();
    }

}
