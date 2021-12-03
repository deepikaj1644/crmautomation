package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import com.crm.qa.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.*;

public class SalesRegionTest extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    ObjectHomePage objHomePage;
    SelectObjectRecordTypePage RecTypePage;
    SalesRegionEditPage salesRegionEditPage;
    SalesRegionDetailsPage salesRegionDetailspage;
    AllTabsPage allTabsPage;
    //String sheetName = "Residential_Account";


   /*public SalesRegionTest()
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

    @Test(priority = 1, description="Creates a new 'Sales Region' record",enabled= true)
    public void VerifyCreateNewSalesRegionTest() throws InterruptedException {

        homepage = new HomePage();
        allTabsPage = homepage.ClickAllTabsLnk();
        objHomePage = allTabsPage.ClickAnyTabOnAllTabsPage("Sales Regions");
        Assert.assertTrue(homepage.ValidateTabLabelDisplayed("Sales Regions"),"Label Does not exist");

        RecTypePage = objHomePage.ClickOnNewButton();

        salesRegionEditPage = new SalesRegionEditPage();

        salesRegionEditPage.CreateNewSalesRegion("Nevada");

        salesRegionDetailspage = new SalesRegionDetailsPage();
        salesRegionDetailspage.ValidateSalesRegionLabel();


    }

   @AfterTest
    public void TearDown()
    {
        driver.quit();
        //System.out.println("Account Test ends...");
    }

}
