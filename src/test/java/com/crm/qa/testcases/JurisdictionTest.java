package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JurisdictionTest extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    ObjectHomePage objHomePage;
    SelectObjectRecordTypePage RecTypePage;
    JurisdictionsEditPage jurisdictionEditPage;
    JurisdictionDetailsPage jurisdictionsDetailsPage;
    AllTabsPage allTabsPage;

    @BeforeTest
    public void Setup() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        homepage = loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
        System.out.println("Sales Region Test begins...");
    }

    @Test(priority = 1, description="Creates a new 'jurisdictions' record",enabled= true)
    public void VerifyCreateNewjurisdictionsTest() throws InterruptedException {

        homepage = new HomePage();
        allTabsPage = homepage.ClickAllTabsLnk();
        objHomePage = allTabsPage.ClickAnyTabOnAllTabsPage("Jurisdictions");
        Assert.assertTrue(homepage.ValidateTabLabelDisplayed("Jurisdictions"),"Label Does not exist");

        RecTypePage = objHomePage.ClickOnNewButton();

        jurisdictionEditPage = new JurisdictionsEditPage();

        jurisdictionEditPage.CreateNewJurisdiction("NV-COUNTY CLARK5","NV","Path 1 - Sunrun Permit","NONE");

        jurisdictionsDetailsPage = new JurisdictionDetailsPage();
        jurisdictionsDetailsPage.ValidateJurisdictionDetailsLabel();

    }

    @AfterTest
    public void TearDown()
    {
        driver.quit();
        //System.out.println("Account Test ends...");
    }

}
