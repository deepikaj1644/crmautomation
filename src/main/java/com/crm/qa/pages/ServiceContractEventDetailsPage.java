package com.crm.qa.pages;
import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceContractEventDetailsPage extends TestBase {

    @FindBy(xpath = "//h2[text()='Service Contract Event Detail']")
    WebElement ServiceContractEventDetail_Label;

    @FindBy(xpath = "//input[@name='edit' and @type='button']")
    WebElement EditBtn;

    @FindBy(xpath = "//th[text()='Service Contract Event Name']/following::th/a[contains(text(),'SCA')]")
    WebElement ServiceContractEvent_Lnk;

    public ServiceContractEventDetailsPage() {
        PageFactory.initElements(driver, this);
    }


    public boolean ValidateServiceContractEventDetailLabel() {
        TestUtil.WaitForElementToBeVisible(driver, ServiceContractEventDetail_Label, 50);
        return ServiceContractEventDetail_Label.isDisplayed();
    }

    public boolean ValidateVisibilityofEditButton() {
        TestUtil.WaitForElementToBeVisible(driver, EditBtn, 50);
        return EditBtn.isDisplayed();
    }
}