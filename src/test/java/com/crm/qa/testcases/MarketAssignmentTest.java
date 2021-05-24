package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class MarketAssignmentTest extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    ObjectHomePage objHomePage;
    SelectObjectRecordTypePage RecTypePage;
    MarketAssignmentEditPage marketassignmentEditPage;
    MarketDetailsPage marketdetailspage;
    MarketAssignmentDetailsPage marketassignmentDetailsPage;
    AllTabsPage allTabsPage;
    //String sheetName = "Residential_Account";


   /*public MarketTest()
    {
        super();
    }

    @DataProvider
    public Object[][] getLeadTestData() {
        Object data[][] = TestUtil.getTestData(sheetName);
        return data;
    }*/

   @BeforeTest
    public void Setup() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        homepage = loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
        System.out.println("Sales Region Test begins...");
    }

    @Test(priority = 1, description="Creates a new 'Market Assignment' record",enabled= true)
    public void VerifyCreateNewMarketAssignmentTest() throws InterruptedException {

        homepage = new HomePage();
        homepage.PerformGlobalSearch("NV - NV Energy South");

        marketdetailspage = new MarketDetailsPage();
        marketassignmentEditPage =  marketdetailspage.ClickonNewMarketAssignmentButton();

        marketassignmentEditPage.CreateNewMarketAssignment("2","17","Sales","10/1/2014","9/13/2019");

        marketassignmentDetailsPage = new MarketAssignmentDetailsPage();
        marketassignmentDetailsPage.ValidateMarketAssignmentDetailsLabel();
    }

  @AfterTest
    public void TearDown()
    {
        driver.quit();
        //System.out.println("Account Test ends...");
    }
}
