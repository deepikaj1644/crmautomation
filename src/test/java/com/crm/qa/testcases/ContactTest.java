package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ContactTest extends TestBase{

    LoginPage loginpage;
    HomePage homepage;
    ObjectHomePage objHomePage;
    SelectObjectRecordTypePage RecTypePage;
    ContactEditPage contacteditpage;
    ContactDetailsPage contactdetailspage;
    String sheetName = "Contacts";

    public ContactTest()
    {
        super();
    }

    @DataProvider
    public Object[][] getLeadTestData() {
        Object data[][] = TestUtil.getTestData(sheetName);
        return data;
    }

   @BeforeClass
   public void Setup() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        homepage = loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
    }


    @Test(priority = 1, dataProvider="getLeadTestData", description="Creates a new Contact of type 'Residential'",enabled= true)
    public void CreateNewContactTest(String Fname,String LName,String AccName,String Phone,String Mobile,String CallCon,String Email,String LeadSource,String PrefConMethod,String MySunCustID,String MailingStreet,String MailingCity,String MailingState,String MailingZip,String MailingCountry,String Country,String AddressStaStatus,String CreditSubmitted,String CreditReceived) throws InterruptedException {
        //homepage = new HomePage();
        objHomePage = homepage.ClickAnyTabOnHomePage("Contacts Tab");
        Assert.assertTrue(homepage.ValidateTabLabelDisplayed("Contacts"),"Label Does not exist");

        RecTypePage = objHomePage.ClickOnNewButton();
        //RecTypePage.SelectRecordType("Residential");

        contacteditpage = new ContactEditPage();

        contactdetailspage = contacteditpage.EditContactDetails(Fname,LName,AccName,Phone,Mobile,CallCon,Email,LeadSource,PrefConMethod,MySunCustID,MailingStreet,MailingCity,MailingState,MailingZip,MailingCountry,Country,AddressStaStatus,CreditSubmitted,CreditReceived);
        Assert.assertTrue(contactdetailspage.ValidateVisibilityofEditButton());
        Assert.assertTrue(contactdetailspage.ValidateAccountDetailLabel());


    }

  @AfterClass
    public void TearDown()
    {
        driver.quit();
    }


}
