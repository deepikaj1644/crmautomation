package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactEditPage extends TestBase {

    @FindBy(xpath="(//label[text()='First Name']/following::td/input)[1]")
    WebElement FirstName_Textbox;

    @FindBy(xpath="(//label[text()='Last Name']//following::td/div/input)[1]")
    WebElement LastName_Textbox;

    @FindBy(xpath="(//label[text()='Account Name']//following::span/input)[1]")
    WebElement AccountName_Textbox;

    @FindBy(xpath="//label[text()='Account Name']//following::div/strong")
    WebElement AccountName_Lnk;

    @FindBy(xpath="(//label[text()='Phone']/following::td/input)[1]")
    WebElement Phone_Textbox;

    @FindBy(xpath="(//label[text()='Mobile']/following::td/input)[1]")
    WebElement Mobile_Textbox;

    @FindBy(xpath="(//label[text()='Call Consent']/following::td/span/select)[1]")
    WebElement CallConsent_Lst;

    @FindBy(xpath="(//label[text()='Email']/following::td/input)[1]")
    WebElement Email_Textbox;

    @FindBy(xpath="(//label[text()='Lead Source']/following::td/input)[1]")
    WebElement LeadSource_Textbox;

    @FindBy(xpath="(//label[text()='Preferred Contact Method']/following::td/span/select)[1]")
    WebElement PrefContMeth_Lst;

    @FindBy(xpath="(//label[text()='Email Opt-Out (Feedback)']/following::td/input)[1]")
    WebElement EmailFeedback_Checkbox;

    @FindBy(xpath="(//label[text()='Email Opt-Out (News/Announcements)']/following::td/input)[1]")
    WebElement EmailNews_Checkbox;

    @FindBy(xpath="(//label[text()='Email Opt-Out (Product Updates)']/following::td/input)[1]")
    WebElement EmailProduct_Checkbox;

    @FindBy(xpath="(//label[text()='Email Opt-Out (Promotional)']/following::td/input)[1]")
    WebElement EmailPromo_Checkbox;

    @FindBy(xpath="(//label[text()='MySunrunCustomerId']/following::td/input)[1]")
    WebElement MySunCustID_Textbox;

    @FindBy(xpath="(//label[text()='Master ID-M']/following::td/input)[1]")
    WebElement MasterIDM_Textbox;

    @FindBy(xpath="(//label[text()='Master Key']/following::td/textarea)[1]")
    WebElement MasterKey_TextArea;

    @FindBy(xpath="(//label[text()='Mailing Street']/following::td/textarea)[1]")
    WebElement MailingStreet_TextArea;

    @FindBy(xpath="(//label[text()='Mailing City']/following::td/input)[1]")
    WebElement MailingCity_Textbox;

    @FindBy(xpath="(//label[text()='Mailing State/Province']/following::td/input)[1]")
    WebElement MailingState_Textbox;

    @FindBy(xpath="(//label[text()='Mailing Zip/Postal Code']/following::td/input)[1]")
    WebElement MailingZip_Textbox;

    @FindBy(xpath="(//label[text()='Mailing Country']/following::td/input)[1]")
    WebElement MailingCountry_Textbox;

    @FindBy(xpath="(//label[text()='County']/following::td/input)[1]")
    WebElement Country_Textbox;

    @FindBy(xpath="(//label[text()='Address Standardization Status']/following::td/span/select)[1]")
    WebElement AddStaStatus_Lst;

    @FindBy(xpath="(//label[text()='Credit Submitted']/following::td/span/input)[1]")
    WebElement CreditSubmitted_Textbox;

    @FindBy(xpath="(//label[text()='Credit Received']/following::td/span/input)[1]")
    WebElement CreditReceived_Textbox;

    @FindBy(xpath="//input[@type='submit' and @name='save']")
    WebElement SaveBtn;



    public ContactEditPage()
    {
        PageFactory.initElements(driver, this);
    }

    public ContactDetailsPage EditContactDetails(String Fname, String LName, String AccName, String Phone, String Mobile, String CallCon, String Email, String LeadSource, String PrefConMethod, String MySunCustID, String MailingStreet, String MailingCity, String MailingState, String MailingZip, String MailingCountry, String Country, String AddressStaStatus, String CreditSubmitted, String CreditReceived) throws InterruptedException {
        FirstName_Textbox.sendKeys(Fname);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        LastName_Textbox.sendKeys(LName);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        AccountName_Textbox.sendKeys(AccName);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        AccountName_Lnk.click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Phone_Textbox.sendKeys(Phone);
        Mobile_Textbox.sendKeys(Mobile);

        Select CallConsent = new Select(CallConsent_Lst);
        CallConsent.selectByVisibleText(CallCon);

        Email_Textbox.sendKeys(Email);
        LeadSource_Textbox.sendKeys(LeadSource);

        Select PrefContMeth = new Select(PrefContMeth_Lst);
        PrefContMeth.selectByVisibleText(PrefConMethod);

        EmailFeedback_Checkbox.click();
        EmailNews_Checkbox.click();
        EmailProduct_Checkbox.click();
        EmailPromo_Checkbox.click();
        MySunCustID_Textbox.sendKeys(MySunCustID);
       // MasterIDM_Textbox.sendKeys(MasterIDM);
        //MasterKey_TextArea.sendKeys(MasterKey);
        MailingStreet_TextArea.sendKeys(MailingStreet);
        MailingCity_Textbox.sendKeys(MailingCity);
        MailingState_Textbox.sendKeys(MailingState);
        MailingZip_Textbox.sendKeys(MailingZip);
        MailingCountry_Textbox.sendKeys(MailingCountry);
        Country_Textbox.sendKeys(Country);

        Select AddStaStatus = new Select(AddStaStatus_Lst);
        AddStaStatus.selectByVisibleText(AddressStaStatus);

        CreditSubmitted_Textbox.sendKeys(CreditSubmitted);
        CreditReceived_Textbox.sendKeys(CreditReceived);
        SaveBtn.click();

        return new ContactDetailsPage();

    }
}
