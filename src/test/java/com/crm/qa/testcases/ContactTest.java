package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ContactTest extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    ObjectHomePage objHomePage;
    SelectObjectRecordTypePage RecTypePage;
    ContactEditPage contacteditpage;
    ContactDetailsPage contactdetailspage;

    public ContactTest()
    {
        super();
    }

    @BeforeClass
    public void Setup() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        homepage = loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
    }

    @Test(priority = 1, description="Creates a new Contact of type 'Residential'",enabled= true)
    public void CreateNewContactTest() throws InterruptedException {
        objHomePage = homepage.ClickAnyTabOnHomePage("Contacts");
        Assert.assertTrue(homepage.ValidateTabLabelDisplayed("Contacts"),"Label Does not exist");

        RecTypePage = objHomePage.ClickOnNewButton();
        RecTypePage.SelectRecordType("Residential");

        contacteditpage = new ContactEditPage();

        contactdetailspage = contacteditpage.EditContactDetails("Demo2Kathy","Demo2Reaves","Demo27370 Silent Water Way-89149","(256) 283-3633","(256) 283-3633","Yes","Demo2Kathy.Reaves@yopmail.com","LGCY","Phone","8797360538262544207","484749319042","484749319042,0065C000005T3NXQA0,,Pay by Check","7370 Silent Water Way","Las Vegas","NV","89149","USA","NA","Standardization Required","8/5/2019 12:24 PM","8/5/2019 12:24 PM");
        Assert.assertTrue(contactdetailspage.ValidateVisibilityofEditButton());
        Assert.assertTrue(contactdetailspage.ValidateAccountDetailLabel());


    }

    @AfterClass
    public void TearDown()
    {
        driver.quit();
    }


}
