package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class MarketTest extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    ObjectHomePage objHomePage;
    SelectObjectRecordTypePage RecTypePage;
    MarketEditPage marketEditPage;
    MarketDetailsPage marketDetailsPage;
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

    @Test(priority = 1, description="Creates a new 'Market' record",enabled= true)
    public void VerifyCreateNewMarketTest() throws InterruptedException {

        homepage = new HomePage();
        allTabsPage = homepage.ClickAllTabsLnk();
        objHomePage = allTabsPage.ClickAnyTabOnAllTabsPage("Markets");
        Assert.assertTrue(homepage.ValidateTabLabelDisplayed("Markets"),"Label Does not exist");

        RecTypePage = objHomePage.ClickOnNewButton();

        marketEditPage = new MarketEditPage();

        marketEditPage.CreateNewMarket("NV - NV Energy South","NV","NV Energy South","10");

        marketDetailsPage = new MarketDetailsPage();
        marketDetailsPage.ValidateMarketDetailsLabel();

    }

   @AfterTest
    public void TearDown()
    {
        driver.quit();
        //System.out.println("Account Test ends...");
    }
}
