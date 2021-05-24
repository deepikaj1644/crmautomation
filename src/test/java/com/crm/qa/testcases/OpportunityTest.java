package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import com.crm.qa.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpportunityTest extends TestBase{

    LoginPage loginpage;
    HomePage homepage;
    ObjectHomePage objHomePage;
    SelectObjectRecordTypePage RecTypePage;
    OpportunityEditPage oppEditpage;
    OpportunityDetailsPage oppDetailspage;
    String sheetName = "Opportunity";


    /*public OpportunityTest()
    {
        super();
    }
*/
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

    @Test(priority = 1, description="Creates a new Opportunity of type 'Residential'",enabled= true)
    public void VerifyCreateNewResidentialAccountTest() throws InterruptedException {

        //homepage = new HomePage();
        objHomePage = homepage.ClickAnyTabOnHomePage("Opportunities");
        Assert.assertTrue(homepage.ValidateTabLabelDisplayed("Opportunities"),"Label Does not exist");

        RecTypePage = objHomePage.ClickOnNewButton();
        RecTypePage.SelectRecordType("Bronze");

        oppEditpage = new OpportunityEditPage();

        oppEditpage.FillOpportunityInformation("7/31/2019 1:50 PM","raymond.abati@sunrun.com.invalid","Las Vegas","Las Vegas1","SunRun","SNR UR TR","BP 1","(702) 448-8118","Final","Solar + Storage","Sales Partner","LGCY","Partner","7. Closed Won","8/5/2019","0","O-1885107440","Sales Partner","LGCY","Partner","BrightPath Mobile","New Deal");
        oppEditpage.CustomerInformation("Kathy Reaves","(256) 283-3633","kreaves49@yahoo.com.majstg","8/3/2019 11:41 AM","Detached single family home");
        oppEditpage.SiteInformation("Yes","Roof","2100","Sent via E-mail","No","Clearwater Estates HO","Yes","8/26/2019","2","Las Vegas","Concrete Flat Tile","Unknown","Sunrun","No");
        oppEditpage.MonthlyUsage("NV","$51-100","1,680","1,400","1,349","517","507","569","1,005","1,456","1,224","627","509");
        oppEditpage.DesignInformation("Design","High","Open");
        oppEditpage.RetailLeadGeneration("7/31/2019");
        oppEditpage.MarketAssignmentInfo();
        oppEditpage.SystemInformation("Auto1Demo27370 Silent Water Way-89149","BB","BrightPath Mobile","1.3000000000","561404569136","1.2263900000","-0.2642600000","0.2700000000","0.0000000000");
        oppEditpage.SiteAudit("7/31/2019","12/10/2020 7:00 AM","12/9/2020");
        oppEditpage.OracleData("CUSTOMER OWNED-CASH 2","5,670","MHAUPT","8/1/2019","8/8/2019","8/13/2019","661R-370REAV","Active","9/20/2019");

        oppDetailspage = oppEditpage.AdditionalInformation("Individual homeowner","Closed","San Francisco - CA");
        Assert.assertTrue(oppDetailspage.ValidateVisibilityofEditButton());


    }

    @Test(priority = 1, description="Makes Opportunity Stage to Closed Lost'",enabled= false)
    public void MakeOpportunityInactiveTest() throws InterruptedException {

        homepage = new HomePage();
        homepage.PerformGlobalSearch("1248 Broadway-94109");
        Assert.assertTrue(oppDetailspage.ValidateVisibilityofEditButton());
        oppEditpage = oppDetailspage.ClickOnEditButton();
        oppDetailspage = oppEditpage.UpdateOppStageToClosedLost();
        Assert.assertTrue(oppDetailspage.ValidateVisibilityofEditButton());
    }

   /* @AfterClass
    public void TearDown()
    {
        driver.quit();
    }*/
}
