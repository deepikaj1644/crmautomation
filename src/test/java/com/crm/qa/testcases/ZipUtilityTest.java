package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class ZipUtilityTest extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    ObjectHomePage objHomePage;
    SelectObjectRecordTypePage RecTypePage;
    ZipUtilityEditPage zipUtilityEditPage;
    ZipUtilityDetailsPage zipUtilityDetailsPage;
    AllTabsPage allTabsPage;
    //String sheetName = "Residential_Account";


   /*public ZipUtilityTest()
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

    @Test(priority = 1, description="Creates a new 'Zip Utility' record",enabled= true)
    public void VerifyCreateNewZipUtilityTest() throws InterruptedException {

        homepage = new HomePage();
        allTabsPage = homepage.ClickAllTabsLnk();
        objHomePage = allTabsPage.ClickAnyTabOnAllTabsPage("ZipUtility");
        Assert.assertTrue(homepage.ValidateTabLabelDisplayed("ZipUtility"),"Label Does not exist");

        RecTypePage = objHomePage.ClickOnNewButton();

        zipUtilityEditPage = new ZipUtilityEditPage();

        zipUtilityEditPage.CreateNewZipUtility("Las Vegas","Clark","NV","NV Energy South","NA","Direct Sales","Nevada","89150","Las Vegas","Las Vegas","Las Vegas");

        zipUtilityDetailsPage = new ZipUtilityDetailsPage();
        zipUtilityDetailsPage.ValidateAccountDetailLabel();


    }

    @AfterTest
    public void TearDown()
    {
        driver.quit();
        //System.out.println("Account Test ends...");
    }

}
