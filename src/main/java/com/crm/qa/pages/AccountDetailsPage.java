package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.crm.qa.utilities.TestUtil;

public class AccountDetailsPage extends TestBase {

    @FindBy(xpath="//h2[text()='Account Detail']")
    WebElement AccountDetail_Label;

    @FindBy(xpath="//td[text()='Billing Address']/following-sibling::td[1]")
    WebElement BillingAddress_Textbox;

    @FindBy(xpath="//label[text()='Billing Street']/following::td/textarea")
    WebElement BillingStreet_TextArea;

    @FindBy(xpath="//label[text()='Billing City']/following::td/input[contains(@id,'state')]")
    WebElement BillingCity_Textbox;

    @FindBy(xpath="//label[text()='Billing State/Province']/following::td/input[contains(@id,'state')]")
    WebElement BillingState_Textbox;

    @FindBy(xpath="//label[text()='Billing Zip/Postal Code']/following::td/input[contains(@id,'zip')]")
    WebElement BillingZipCode_Textbox;

    @FindBy(xpath="//label[text()='Billing Country']/following::td/input[contains(@id,'country')]")
    WebElement BillingCountry_Textbox;

    @FindBy(xpath="//input[@value='OK']")
    WebElement OK_Button;

// Textboxes-------------------------------------------
    @FindBy(xpath="//td[text()='County']/following-sibling::td[1]")
    WebElement Country_Textbox;

    @FindBy(xpath="//td[text()='Phone']/following-sibling::td[1]")
    WebElement Phone_Textbox;

    @FindBy(xpath="//td[text()='TownshipName']/following-sibling::td[1]")
    WebElement TownshipName_Textbox;

    @FindBy(xpath="//td[text()='CountyName']/following-sibling::td[1]")
    WebElement CountyName_Textbox;

    @FindBy(xpath="//td[text()='Primary Title']/following-sibling::td[1]")
    WebElement PrimaryTitle_Textbox;

    @FindBy(xpath="//td[text()='Secondary Title']/following-sibling::td[1]")
    WebElement SecondaryTitle_Textbox;

    @FindBy(xpath="//td[text()='Home Type on Title']/following-sibling::td[1]")
    WebElement HomeTypeonTitle_Textbox;

    @FindBy(xpath="//td[text()='Legal Description']/following-sibling::td[1]")
    WebElement LegalDescription_Textbox;

    @FindBy(xpath="//td[text()='Ownership Type']/following-sibling::td[1]")
    WebElement OwnershipType_Textbox;

    @FindBy(xpath="//td[text()='APN']/following-sibling::td[1]")
    WebElement APN_Textbox;

    @FindBy(xpath="//td[text()='Municipality']/following-sibling::td[1]")
    WebElement Municipality_Textbox;

    @FindBy(xpath="//td[text()='Region']/following-sibling::td[1]")
    WebElement Region_Textbox;




    //Input--------------------------
    @FindBy(xpath="//td[text()='County']/following-sibling::td/div/input")
    WebElement Country_Input;

    @FindBy(xpath="//td[text()='Phone']/following-sibling::td/div/input")
    WebElement Phone_Input;

    @FindBy(xpath="//td[text()='TownshipName']/following-sibling::td/div/input")
    WebElement TownshipName_Input;

    @FindBy(xpath="//td[text()='CountyName']/following-sibling::td/div/input")
    WebElement CountyName_Input;

    @FindBy(xpath="//td[text()='Primary Title']/following-sibling::td/div/input")
    WebElement PrimaryTitle_Input;

    @FindBy(xpath="//td[text()='Secondary Title']/following-sibling::td/div/input")
    WebElement SecondaryTitle_Input;

    @FindBy(xpath="//td[text()='Home Type on Title']/following-sibling::td/div/span/select")
    WebElement HomeTypeonTitle_Lst;

    @FindBy(xpath="//td[text()='Legal Description']/following-sibling::td/div/input")
    WebElement LegalDescription_Input;

    @FindBy(xpath="//td[text()='Ownership Type']/following-sibling::td/div/input")
    WebElement OwnershipType_Input;

    @FindBy(xpath="//td[text()='APN']/following-sibling::td/div/input")
    WebElement APN_Input;

    @FindBy(xpath="//td[text()='Municipality']/following-sibling::td/div/input")
    WebElement Municipality_Input;

    @FindBy(xpath="//td[text()='Region']/following-sibling::td/div/span/select")
    WebElement Region_Lst;


    @FindBy(xpath="//input[@type='button' and @name='inlineEditSave']")
    WebElement SaveBtn;

    @FindBy(xpath="//input[@name='edit' and @type='button']")
    WebElement EditBtn;



    public AccountDetailsPage()
    {
        PageFactory.initElements(driver, this);
    }


    //******* To validate the Account Details Label on the Account Details Page *********
    public boolean ValidateAccountDetailLabel()
    {
        TestUtil.WaitForElementToBeVisible(driver,AccountDetail_Label,50);
        return AccountDetail_Label.isDisplayed();
    }

    //******* To validate the Account Details Label on the Account Details Page *********
    public boolean ValidateVisibilityofEditButton()
    {
        TestUtil.WaitForElementToBeVisible(driver,EditBtn,50);
        return EditBtn.isDisplayed();
    }

    //******* Fill out Address Information for Account of type 'Residential' *************
        public void FillAddressInformationResidentialAccount(String BStreet, String BCity, String BState, String BZip, String BCountry, String Country, String Phone, String TownshipName, String CountyName, String PrimaryTitle, String SecondaryTitle, String HomeTypeonTitle, String LegalDescription, String OwnershipType, String APN, String Municipality) throws InterruptedException {
        TestUtil.WaitForElementToBeVisible(driver,BillingAddress_Textbox,60);
        TestUtil.flash(BillingAddress_Textbox, driver);
        TestUtil.DoubleclickElementByJS(BillingAddress_Textbox,driver);

        TestUtil.WaitForElementToBeVisible(driver,BillingStreet_TextArea,50);
        BillingStreet_TextArea.sendKeys(BStreet);
        BillingCity_Textbox.sendKeys(BCity);
        BillingState_Textbox.sendKeys(BState);
        BillingZipCode_Textbox.sendKeys(BZip);
        BillingCountry_Textbox.sendKeys(BCountry);
        OK_Button.click();

        TestUtil.WaitForElementToBeVisible(driver,Country_Textbox,50);
        TestUtil.drawBorder(Country_Textbox,driver);
        TestUtil.DoubleclickElementByJS(Country_Textbox,driver);
        Country_Input.sendKeys(Country);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.drawBorder(Phone_Textbox, driver);
        TestUtil.DoubleclickElementByJS(Phone_Textbox,driver);
        Phone_Input.sendKeys(Phone);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.drawBorder(TownshipName_Textbox, driver);
        TestUtil.DoubleclickElementByJS(TownshipName_Textbox,driver);
        TownshipName_Input.sendKeys(TownshipName);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.drawBorder(CountyName_Textbox, driver);
        TestUtil.DoubleclickElementByJS(CountyName_Textbox,driver);
        CountyName_Input.sendKeys(CountyName);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        SaveBtn.click();
        TestUtil.WaitForElementToBeClickable(driver,EditBtn, TestUtil.MEDIUM_WAIT_TIME);
        TestUtil.Sleep(TestUtil.SMALL_WAIT_TIME);

        TestUtil.drawBorder(PrimaryTitle_Textbox, driver);
        TestUtil.DoubleclickElementByJS(PrimaryTitle_Textbox,driver);
        PrimaryTitle_Input.sendKeys(PrimaryTitle);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.drawBorder(SecondaryTitle_Textbox, driver);
        TestUtil.DoubleclickElementByJS(SecondaryTitle_Textbox,driver);
        SecondaryTitle_Input.sendKeys(SecondaryTitle);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.drawBorder(HomeTypeonTitle_Textbox, driver);
        TestUtil.DoubleclickElementByJS(HomeTypeonTitle_Textbox,driver);
        Select HomeType = new Select(HomeTypeonTitle_Lst);
        HomeType.selectByVisibleText(HomeTypeonTitle);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.drawBorder(LegalDescription_Textbox, driver);
        TestUtil.DoubleclickElementByJS(LegalDescription_Textbox,driver);
        LegalDescription_Input.sendKeys(LegalDescription);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.drawBorder(OwnershipType_Textbox, driver);
        TestUtil.DoubleclickElementByJS(OwnershipType_Textbox,driver);
        OwnershipType_Input.sendKeys(OwnershipType);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.drawBorder(APN_Textbox, driver);
        TestUtil.DoubleclickElementByJS(APN_Textbox,driver);
        APN_Input.sendKeys(APN);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.drawBorder(Municipality_Textbox, driver);
        TestUtil.DoubleclickElementByJS(Municipality_Textbox,driver);
        Municipality_Input.sendKeys(Municipality);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);


        SaveBtn.click();
        TestUtil.WaitForElementToBeClickable(driver,EditBtn, TestUtil.MEDIUM_WAIT_TIME);



    }


    //******* Fill out Address Information for Account of type 'Branch' *************
    public void FillAddressInformationBranchAccount(String BStreet,String BCity, String BState, String BZip,String BCountry,String Country,String Region,String PrimaryTitle, String HomeTypeonTitle,String LegalDescription) throws InterruptedException {

        TestUtil.WaitForElementToBeVisible(driver,BillingAddress_Textbox,60);
        TestUtil.flash(BillingAddress_Textbox, driver);
        TestUtil.DoubleclickElementByJS(BillingAddress_Textbox,driver);

        TestUtil.WaitForElementToBeVisible(driver,BillingStreet_TextArea,50);
        BillingStreet_TextArea.sendKeys(BStreet);
        BillingCity_Textbox.sendKeys(BCity);
        BillingState_Textbox.sendKeys(BState);
        BillingZipCode_Textbox.sendKeys(BZip);
        BillingCountry_Textbox.sendKeys(BCountry);
        OK_Button.click();

        TestUtil.WaitForElementToBeVisible(driver,Country_Textbox,50);
        TestUtil.drawBorder(Country_Textbox,driver);
        TestUtil.DoubleclickElementByJS(Country_Textbox,driver);
        Country_Input.sendKeys(Country);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.WaitForElementToBeVisible(driver,Region_Textbox,50);
        TestUtil.drawBorder(Region_Textbox,driver);
        TestUtil.DoubleclickElementByJS(Region_Textbox,driver);
        Select RegionLst = new Select(Region_Lst);
        RegionLst.selectByVisibleText(Region);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        SaveBtn.click();
        TestUtil.WaitForElementToBeClickable(driver,EditBtn, TestUtil.MEDIUM_WAIT_TIME);
        TestUtil.Sleep(TestUtil.SMALL_WAIT_TIME);

        TestUtil.drawBorder(PrimaryTitle_Textbox, driver);
        TestUtil.DoubleclickElementByJS(PrimaryTitle_Textbox,driver);
        PrimaryTitle_Input.sendKeys(PrimaryTitle);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.drawBorder(HomeTypeonTitle_Textbox, driver);
        TestUtil.DoubleclickElementByJS(HomeTypeonTitle_Textbox,driver);
        Select HomeType = new Select(HomeTypeonTitle_Lst);
        HomeType.selectByVisibleText(HomeTypeonTitle);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.drawBorder(LegalDescription_Textbox, driver);
        TestUtil.DoubleclickElementByJS(LegalDescription_Textbox,driver);
        LegalDescription_Input.sendKeys(LegalDescription);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        SaveBtn.click();
        TestUtil.WaitForElementToBeClickable(driver,EditBtn, TestUtil.MEDIUM_WAIT_TIME);


    }

    //******* Fill out Address Information for Account of type 'Company' *************
    public void FillAddressInformationCompanyAccount(String BStreet,String BCity, String BState, String BZip,String BCountry,String PrimaryTitle,String SecondaryTitle, String HomeTypeonTitle,String LegalDescription,String APN) throws InterruptedException {

        TestUtil.WaitForElementToBeVisible(driver,BillingAddress_Textbox,60);
        TestUtil.flash(BillingAddress_Textbox, driver);
        TestUtil.DoubleclickElementByJS(BillingAddress_Textbox,driver);

        TestUtil.WaitForElementToBeVisible(driver,BillingStreet_TextArea,50);
        BillingStreet_TextArea.sendKeys(BStreet);
        BillingCity_Textbox.sendKeys(BCity);
        BillingState_Textbox.sendKeys(BState);
        BillingZipCode_Textbox.sendKeys(BZip);
        BillingCountry_Textbox.sendKeys(BCountry);
        OK_Button.click();

        SaveBtn.click();
        TestUtil.WaitForElementToBeClickable(driver,EditBtn, TestUtil.MEDIUM_WAIT_TIME);
        TestUtil.Sleep(TestUtil.SMALL_WAIT_TIME);

        TestUtil.drawBorder(PrimaryTitle_Textbox, driver);
        TestUtil.DoubleclickElementByJS(PrimaryTitle_Textbox,driver);
        PrimaryTitle_Input.sendKeys(PrimaryTitle);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.drawBorder(SecondaryTitle_Textbox, driver);
        TestUtil.DoubleclickElementByJS(SecondaryTitle_Textbox,driver);
        SecondaryTitle_Input.sendKeys(SecondaryTitle);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.drawBorder(HomeTypeonTitle_Textbox, driver);
        TestUtil.DoubleclickElementByJS(HomeTypeonTitle_Textbox,driver);
        Select HomeType = new Select(HomeTypeonTitle_Lst);
        HomeType.selectByVisibleText(HomeTypeonTitle);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.drawBorder(LegalDescription_Textbox, driver);
        TestUtil.DoubleclickElementByJS(LegalDescription_Textbox,driver);
        LegalDescription_Input.sendKeys(LegalDescription);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.drawBorder(APN_Textbox, driver);
        TestUtil.DoubleclickElementByJS(APN_Textbox,driver);
        APN_Input.sendKeys(APN);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        SaveBtn.click();
        TestUtil.WaitForElementToBeClickable(driver,EditBtn, TestUtil.MEDIUM_WAIT_TIME);


    }

}
