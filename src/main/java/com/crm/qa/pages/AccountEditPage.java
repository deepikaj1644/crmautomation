package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountEditPage extends TestBase {

    //Residential Account
    @FindBy(xpath="//label[text()='Account Name']/following::td/div/input[@name='acc2']")
    WebElement AccountName_Textbox;

    @FindBy(xpath="(//label[text()='Incorporated']/following::td/input)[1]")
    WebElement Incorporated_Textbox;

    @FindBy(xpath="(//label[text()='Address Standardization Status']/following::td/span/select)[1]")
    WebElement AddressStandardizationStatus_Lst;

    @FindBy(xpath="(//label[text()='Address Standardization Source']/following::td/span/select)[1]")
    WebElement AddressStandardizationSource_Lst;

    @FindBy(xpath="(//label[text()='Address Token']/following::td/input)[1]")
    WebElement AddressToken_Textbox;

    @FindBy(xpath="(//label[text()='Latitude']/following::td/input)[1]")
    WebElement Latitude_Textbox;

    @FindBy(xpath="(//label[text()='Longitude']/following::td/input)[1]")
    WebElement Longitude_Textbox;

    @FindBy(xpath="(//label[text()='Address Standardization Confidence Level']/following::td/input)[1]")
    WebElement AddStaConfiLevel_Textbox;

    @FindBy(xpath="(//label[text()='Time Zone']/following::td/input)[1]")
    WebElement TimeZone_Textbox;

    @FindBy(xpath="(//label[text()='Has Daylight Savings']/following::td/input)[1]")
    WebElement HasDaylightSavings_Textbox;

    @FindBy(xpath="(//label[text()='Area Code']/following::td/input)[1]")
    WebElement AreaCode_Textbox;

    @FindBy(xpath="(//label[text()='Congress District Number']/following::td/input)[1]")
    WebElement CongressDistrictNumber_Textbox;

    @FindBy(xpath="(//label[text()='State Legislative Upper']/following::td/input)[1]")
    WebElement StateLegislativeUpper_Textbox;

    @FindBy(xpath="(//label[text()='State Legislative Lower']/following::td/input)[1]")
    WebElement StateLegislativeLower_Textbox;

    //Account Type Branch Object Locators
    @FindBy(xpath="(//label[text()='Field Marketing Team']/following::*/input)[1]")
    WebElement FieldMarketingTeam_Textbox;

    @FindBy(xpath="(//label[text()='Account Type']/following::span/select)[1]")
    WebElement AccountType_Lst;

    @FindBy(xpath="(//label[text()='Local Branch Constant']/following::td/input)[1]")
    WebElement LocalBranchConstant_Textbox;

    @FindBy(xpath="(//label[text()='Local System Size Exponent']/following::td/input)[1]")
    WebElement LocalSysSizeExponent_Textbox;

    @FindBy(xpath="(//label[text()='Overhead Per Watt']/following::td/input)[1]")
    WebElement OverheadPerWatt_Textbox;

    @FindBy(xpath="(//label[text()='Overhead Per Project']/following::td/input)[1]")
    WebElement OverheadPerProject_Textbox;

    @FindBy(xpath="(//label[text()='Office Location']/following::td/span/select)[1]")
    WebElement OfficeLocation_Lst;

    //Account Type Company Objects
    @FindBy(xpath="(//label[text()='Account Number']/following::td/input)[1]")
    WebElement AccountNumber_Textbox;

    @FindBy(xpath="(//label[text()='CDYNE Address']/following::td/input)[1]")
    WebElement CDYNEAddress_Textbox;

    @FindBy(xpath="(//label[text()='Group Id']/following::td/input)[1]")
    WebElement GroupID_Textbox;

    @FindBy(xpath="(//label[text()='EDP Go Live Date']/following::td/span/input)[1]")
    WebElement EDPDate_Textbox;

    @FindBy(xpath="(//label[text()='DocuSign Host Email']/following::td/input)[1]")
    WebElement DocuSignEmail_Textbox;

    @FindBy(xpath="(//label[text()='Partner Logo']/following::td/input)[1]")
    WebElement PartnerLogo_Textbox;

    @FindBy(xpath="(//label[text()='Pricing Scheme']/following::td/textarea)[1]")
    WebElement PricingScheme_Textbox;

    @FindBy(xpath="(//label[text()='DocuSign Host Name']/following::td/input)[1]")
    WebElement DocuSignHostName_Textbox;

    @FindBy(xpath="(//label[text()='Quick Design Access']/following::td/span/select)[1]")
    WebElement QuickDesign_Lst;

    @FindBy(xpath="(//label[text()='Business Division']/following::td/input)[1]")
    WebElement BusinessDiv_Textbox;

    @FindBy(xpath="(//label[text()='Enabled To Sell BrightBox']/following::td/input)[1]")
    WebElement EnabledToSell_Checkbox;

    @FindBy(xpath="(//label[text()='System Size Exponent']/following::td/input)[1]")
    WebElement SysSizeExponent_Textbox;
    @FindBy(xpath="(//label[text()='National Branch Constant']/following::td/input)[1]")
    WebElement NationalBranchConst_Textbox;
    @FindBy(xpath="(//label[text()='Billing Street']/following::td/input)[1]")
    WebElement BillingStreet_Textbox;
    @FindBy(xpath="(//label[text()='Billing City']/following::td/input)[1]")
    WebElement BillingCity_Textbox;
    @FindBy(xpath="(//label[text()='Billing State/Province']/following::td/input)[1]")
    WebElement BState_Textbox;
    @FindBy(xpath="(//label[text()='Billing Zip/Postal Code']/following::td/input)[1]")
    WebElement BZip_Textbox;
    @FindBy(xpath="(//label[text()='Billing Country']/following::td/input)[1]")
    WebElement BillingCountry_Textbox;
    @FindBy(xpath="(//label[text()='County']/following::td/input)[1]")
    WebElement County_Textbox;
    @FindBy(xpath="(//label[text()='Phone']/following::td/input)[1]")
    WebElement Phone_Textbox;
    @FindBy(xpath="(//label[text()='CityName']/following::td/input)[1]")
    WebElement CityName_Textbox;
    @FindBy(xpath="(//label[text()='TownshipName']/following::td/input)[1]")
    WebElement TownshipName_Textbox;
    @FindBy(xpath="(//label[text()='CountyName']/following::td/input)[1]")
    WebElement CountyName_Textbox;
    @FindBy(xpath="(//label[text()='EPC Adjustment']/following::td/input)[1]")
    WebElement EPCAdjustment_Textbox;
    @FindBy(xpath="(//label[text()='Primary Title']/following::td/input)[1]")
    WebElement PrimaryTitle_Textbox;
    @FindBy(xpath="(//label[text()='Secondary Title']/following::td/input)[1]")
    WebElement SecondaryTitle_Textbox;
    @FindBy(xpath="(//label[text()='Legal Description']/following::td/input)[1]")
    WebElement LegalDescription_Textbox;
    @FindBy(xpath="(//label[text()='APN']/following::td/input)[1]")
    WebElement APN_Textbox;
    @FindBy(xpath="(//label[text()='Home Type on Title']/following::td/span/select)[1]")
    WebElement HomeType_Lst;

    //Account Type Partner Objects
    @FindBy(xpath="(//label[text()='Classification']/following::td/span/select)[1]")
    WebElement Classification_Lst;

    @FindBy(xpath="(//label[text()='Partner Status']/following::td/span/select)[1]")
    WebElement PartnerStatus_Lst;

    @FindBy(xpath="//select[@title='Partner Type - Available']")
    WebElement PartnerType_Lst;

    @FindBy(xpath="//label[text()='Partner Type']//following::img[contains(@id,'right_arrow')]")
    WebElement RightArrow_Img;

    @FindBy(xpath="(//label[text()='Partner Tier']/following::td/span/select)[1]")
    WebElement PartnerTier_Lst;

    @FindBy(xpath="(//label[text()='Corporate Email Address']/following::td/input)[1]")
    WebElement CorporateEmail_Textbox;

    @FindBy(xpath="(//label[text()='Quick Design Access']/following::td/span/select)[1]")
    WebElement QuickDesignAccess_Lst;

    @FindBy(xpath="(//label[text()='All Sales Users Group Id']/following::td/input)[1]")
    WebElement AllSalesUsersGroupId_Textbox;

    @FindBy(xpath="(//label[text()='All Users Group Id']/following::td/input)[1]")
    WebElement AllUsersGroupId_Textbox;

    @FindBy(xpath="(//label[text()='Partner DBA Name']/following::td/input)[1]")
    WebElement PartnerDBAName_Textbox;

    @FindBy(xpath="(//label[text()='Account Division']/following::select)[1]")
    WebElement AccountDivision_Lst;

    @FindBy(xpath="(//label[text()='Operations Admin']/following::td/input)[1]")
    WebElement OperationsAdmin_Textbox;

    @FindBy(xpath="(//label[text()='Grade']/following::td/span/select)[1]")
    WebElement Grade_Lst;

    @FindBy(xpath="(//label[text()='Schedule Type']/following::td/span/select)[1]")
    WebElement ScheduleType_Lst;

    @FindBy(xpath="(//label[text()='Shipping Street']/following::td/textarea)[1]")
    WebElement ShippingStreet_Textarea;

    @FindBy(xpath="(//label[text()='Shipping City']/following::td/input)[1]")
    WebElement ShippingCity_Textbox;

    @FindBy(xpath="(//label[text()='Shipping State/Province']/following::td/input)[1]")
    WebElement ShippingState_Textbox;

    @FindBy(xpath="(//label[text()='Shipping Zip/Postal Code']/following::td/input)[1]")
    WebElement ShippingZip_Textbox;

    @FindBy(xpath="(//label[text()='Website']/following::div/input)[1]")
    WebElement Website_Textbox;

    @FindBy(xpath="(//label[text()='Stage']/following::td/span/select)[1]")
    WebElement Stage_Lst;

    @FindBy(xpath="(//label[text()='Active?']/following::td/input)[1]")
    WebElement Active_Checkbox;


    @FindBy(xpath="//input[@type='submit' and @name='save']")
    WebElement SaveBtn;



    public AccountEditPage()
    {
        PageFactory.initElements(driver, this);
    }

    //******* Fill details on Account Edit page for Account of type 'Residential' *************
    public AccountDetailsPage CreateNewResidentialAccount(String AccName, String Incorporated, String  AddressStandardizationStatus, String AddressStandardizationSource, String AddressToken, String Latitude, String Longitude, String AddStaConfiLevel, String TimeZone, String HasDaylightSavings, String AreaCode, String CongressDistrictNumber, String StateLegislativeUpper, String StateLegislativeLower) throws InterruptedException {
        TestUtil.WaitForElementToBeVisible(driver,AccountName_Textbox,30);
        AccountName_Textbox.sendKeys(AccName);
        Incorporated_Textbox.sendKeys(Incorporated);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select AddStaStatus = new Select(AddressStandardizationStatus_Lst);
        AddStaStatus.selectByVisibleText(AddressStandardizationStatus);


        Select AddStaSource = new Select(AddressStandardizationSource_Lst);
        AddStaSource.selectByVisibleText(AddressStandardizationSource);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.WaitForElementToBeVisible(driver,AddressToken_Textbox,30);
        AddressToken_Textbox.click();
        AddressToken_Textbox.sendKeys(AddressToken);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.WaitForElementToBeVisible(driver,Latitude_Textbox,30);
        Latitude_Textbox.sendKeys(Latitude);
        Longitude_Textbox.sendKeys(Longitude);
        AddStaConfiLevel_Textbox.sendKeys(AddStaConfiLevel);
        TimeZone_Textbox.sendKeys(TimeZone);
        HasDaylightSavings_Textbox.sendKeys(HasDaylightSavings);
        AreaCode_Textbox.sendKeys(AreaCode);
        CongressDistrictNumber_Textbox.sendKeys(CongressDistrictNumber);
        StateLegislativeUpper_Textbox.sendKeys(StateLegislativeUpper);
        StateLegislativeLower_Textbox.sendKeys(StateLegislativeLower);

        TestUtil.ClickOn(driver,SaveBtn,20);


        return new AccountDetailsPage();


    }

    //******* Fill details on Account Edit page for Account of type 'Branch' *************
    public AccountDetailsPage CreateNewBranchAccount(String AccName, String FieldMarketingTeam, String AccountType, String LocalBranchConstant, String LocalSysSizeExponent, String OverheadPerWatt, String OverheadPerProject, String AddressStandardizationStatus, String AddressStandardizationSource, String AddressToken, String Latitude, String Longitude, String TimeZone, String HasDaylightSavings, String AreaCode) throws InterruptedException {

        TestUtil.WaitForElementToBeVisible(driver,AccountName_Textbox,30);
        AccountName_Textbox.sendKeys(AccName);

        Select AccountTypeLst = new Select(AccountType_Lst);
        AccountTypeLst.selectByVisibleText(AccountType);
        LocalBranchConstant_Textbox.sendKeys(LocalBranchConstant);
        LocalSysSizeExponent_Textbox.sendKeys(LocalSysSizeExponent);
        OverheadPerWatt_Textbox.sendKeys(OverheadPerWatt);
        OverheadPerProject_Textbox.sendKeys(OverheadPerProject);

        Select AddStaStatus = new Select(AddressStandardizationStatus_Lst);
        AddStaStatus.selectByVisibleText(AddressStandardizationStatus);
        Select AddStaSource = new Select(AddressStandardizationSource_Lst);
        AddStaSource.selectByVisibleText(AddressStandardizationSource);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.WaitForElementToBeVisible(driver,AddressToken_Textbox,30);
        AddressToken_Textbox.click();
        AddressToken_Textbox.sendKeys(AddressToken);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.WaitForElementToBeVisible(driver,Latitude_Textbox,30);
        Latitude_Textbox.sendKeys(Latitude);
        Longitude_Textbox.sendKeys(Longitude);
        TimeZone_Textbox.sendKeys(TimeZone);
        HasDaylightSavings_Textbox.sendKeys(HasDaylightSavings);
        AreaCode_Textbox.sendKeys(AreaCode);

        TestUtil.SelectRequiredObjectFromLookup("Parent Account","Sunrun");
        FieldMarketingTeam_Textbox.sendKeys(FieldMarketingTeam);

        TestUtil.ClickOn(driver,SaveBtn,20);



        return new AccountDetailsPage();
    }


    //******* Fill details on Account Edit page for Account of type 'Company' *************
    public AccountDetailsPage CreateNewCompanyAccount(String AccName,String AccountNumber,String CDYNEAddress,String GroupID,String FieldMarketingTeam,String EDPDate,String DocuSignEmail,String PartnerLogo,String PricingScheme,String DocuSignHostName,String QuickDesign,String BusinessDiv,String Incorporated,String SysSizeExponent,String NationalBranchConst,String BillingStreet,String BillingCity,String BState,String BZip,String BillingCountry,String County,String Phone,String CityName,String TownshipName,String CountyName,String EPCAdjustment,String PrimaryTitle,String SecondaryTitle,String LegalDescription,String APN,String HomeType,String AddressStandardizationStatus,String AddressStandardizationSource,String AddressToken,String Latitude,String Longitude,String TimeZone,String HasDaylightSavings,String AreaCode,String CongressDistrictNumber,String StateLegislativeUpper,String StateLegislativeLower) throws InterruptedException {
        TestUtil.WaitForElementToBeVisible(driver,AccountName_Textbox,30);
        AccountName_Textbox.sendKeys(AccName);
        AccountNumber_Textbox.sendKeys(AccountNumber);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        CDYNEAddress_Textbox.sendKeys(CDYNEAddress);
        GroupID_Textbox.sendKeys(GroupID);
        FieldMarketingTeam_Textbox.sendKeys(FieldMarketingTeam);
        EDPDate_Textbox.sendKeys(EDPDate);
        EDPDate_Textbox.sendKeys(Keys.TAB);
        DocuSignEmail_Textbox.sendKeys(DocuSignEmail);
        PartnerLogo_Textbox.sendKeys(PartnerLogo);
        PricingScheme_Textbox.sendKeys(PricingScheme);
        DocuSignHostName_Textbox.sendKeys(DocuSignHostName);

        Select QuickDesignLst = new Select(QuickDesign_Lst);
        QuickDesignLst.selectByVisibleText(QuickDesign);
        BusinessDiv_Textbox.sendKeys(BusinessDiv);
        EnabledToSell_Checkbox.click();
        Incorporated_Textbox.sendKeys(Incorporated);

        SysSizeExponent_Textbox.sendKeys(SysSizeExponent);
        NationalBranchConst_Textbox.sendKeys(NationalBranchConst);
        BillingStreet_Textbox.sendKeys(BillingStreet);
        BillingCity_Textbox.sendKeys(BillingCity);
        BState_Textbox.sendKeys(BState);
        BZip_Textbox.sendKeys(BZip);
        BillingCountry_Textbox.sendKeys(BillingCountry);
        County_Textbox.sendKeys(County);
        Phone_Textbox.sendKeys(Phone);
        CityName_Textbox.sendKeys(CityName);
        TownshipName_Textbox.sendKeys(TownshipName);
        CountyName_Textbox.sendKeys(CountyName);
        EPCAdjustment_Textbox.sendKeys(EPCAdjustment);
        PrimaryTitle_Textbox.sendKeys(PrimaryTitle);
        SecondaryTitle_Textbox.sendKeys(SecondaryTitle);
        LegalDescription_Textbox.sendKeys(LegalDescription);
        APN_Textbox.sendKeys(APN);
        Select HomeTypeLst = new Select(HomeType_Lst);
        HomeTypeLst.selectByVisibleText(HomeType);


        Select AddStaStatus = new Select(AddressStandardizationStatus_Lst);
        AddStaStatus.selectByVisibleText(AddressStandardizationStatus);


        Select AddStaSource = new Select(AddressStandardizationSource_Lst);
        AddStaSource.selectByVisibleText(AddressStandardizationSource);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.WaitForElementToBeVisible(driver,AddressToken_Textbox,30);
        AddressToken_Textbox.click();
        AddressToken_Textbox.sendKeys(AddressToken);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.WaitForElementToBeVisible(driver,Latitude_Textbox,30);
        Latitude_Textbox.sendKeys(Latitude);
        Longitude_Textbox.sendKeys(Longitude);
        TimeZone_Textbox.sendKeys(TimeZone);
        HasDaylightSavings_Textbox.sendKeys(HasDaylightSavings);
        AreaCode_Textbox.sendKeys(AreaCode);
        CongressDistrictNumber_Textbox.sendKeys(CongressDistrictNumber);
        StateLegislativeUpper_Textbox.sendKeys(StateLegislativeUpper);
        StateLegislativeLower_Textbox.sendKeys(StateLegislativeLower);

        TestUtil.ClickOn(driver,SaveBtn,20);

        return new AccountDetailsPage();

    }

    //******* Fill details on Account Edit page for Account of type 'Partner' *************
    public AccountDetailsPage CreateNewPartnerAccount(String AccName,String AccountNumber,String Classification,String EDPDate,String DocuSignHostName,String DocuSignEmail,String PartnerType,String GroupID,String PartnerStatus,String PartnerTier,String CorporateEmail,String QuickDesign,String AllSalesUsersGroupId,String AllUsersGroupId,String PartnerLogo,String PartnerDBAName,String AccountDivision,String BusinessDiv,String PricingScheme,String OperationsAdmin,String OfficeLocation,String FieldMarketingTeam,String Grade,String ScheduleType,String ShippingStreet,String ShippingCity,String ShippingState,String ShippingZip,String Phone,String Website,String Stage,String AddressStandardizationStatus) throws InterruptedException {
        TestUtil.WaitForElementToBeVisible(driver,AccountName_Textbox,30);
        AccountName_Textbox.sendKeys(AccName);
        AccountNumber_Textbox.sendKeys(AccountNumber);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select ClassificationLst = new Select(Classification_Lst);
        ClassificationLst.selectByVisibleText(Classification);

        EDPDate_Textbox.sendKeys(EDPDate);
        DocuSignHostName_Textbox.sendKeys(DocuSignHostName);
        DocuSignEmail_Textbox.sendKeys(DocuSignEmail);

        Select PartnerTypeLst = new Select(PartnerType_Lst);
        PartnerTypeLst.selectByVisibleText(PartnerType);
        RightArrow_Img.click();
        GroupID_Textbox.sendKeys(GroupID);

        Select PartnerStatusLst = new Select(PartnerStatus_Lst);
        PartnerStatusLst.selectByVisibleText(PartnerStatus);

        Select PartnerTierLst = new Select(PartnerTier_Lst);
        PartnerTierLst.selectByVisibleText(PartnerTier);

        CorporateEmail_Textbox.sendKeys(CorporateEmail);

        Select QuickDesignLst = new Select(QuickDesign_Lst);
        QuickDesignLst.selectByVisibleText(QuickDesign);

        AllSalesUsersGroupId_Textbox.sendKeys(AllSalesUsersGroupId);
        AllUsersGroupId_Textbox.sendKeys(AllUsersGroupId);
        EnabledToSell_Checkbox.click();
        PartnerLogo_Textbox.sendKeys(PartnerLogo);
        PartnerDBAName_Textbox.sendKeys(PartnerDBAName);

        Select AccountDivisionLst = new Select(AccountDivision_Lst);
        AccountDivisionLst.selectByVisibleText(AccountDivision);

        BusinessDiv_Textbox.sendKeys(BusinessDiv);
        PricingScheme_Textbox.sendKeys(PricingScheme);

        OperationsAdmin_Textbox.sendKeys(OperationsAdmin);

        Select OfficeLocationLst = new Select(OfficeLocation_Lst);
        OfficeLocationLst.selectByVisibleText(OfficeLocation);

        FieldMarketingTeam_Textbox.sendKeys(FieldMarketingTeam);

        Select GradeLst = new Select(Grade_Lst);
        GradeLst.selectByVisibleText(Grade);

        Select ScheduleTypeLst = new Select(ScheduleType_Lst);
        ScheduleTypeLst.selectByVisibleText(ScheduleType);

        ShippingStreet_Textarea.sendKeys(ShippingStreet);
        ShippingCity_Textbox.sendKeys(ShippingCity);
        ShippingState_Textbox.sendKeys(ShippingState);
        ShippingZip_Textbox.sendKeys(ShippingZip);
        Phone_Textbox.sendKeys(Phone);
        Website_Textbox.sendKeys(Website);

        Select StageLst = new Select(Stage_Lst);
        StageLst.selectByVisibleText(Stage);

        Select AddressStandardizationStatusLst = new Select(AddressStandardizationStatus_Lst);
        AddressStandardizationStatusLst.selectByVisibleText(AddressStandardizationStatus);

        TestUtil.ClickOn(driver,SaveBtn,20);

        return new AccountDetailsPage();

    }


}
