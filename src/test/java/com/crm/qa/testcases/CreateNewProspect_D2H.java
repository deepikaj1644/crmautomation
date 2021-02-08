package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.splat.*;
import com.crm.qa.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;

public class CreateNewProspect_D2H extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    SplatLoginPage splatloginpage;
    SplatHomePage splathomepage;
    SplatProspectEditPage splatprospecteditpage;
    ScheduleApptPage scheduleapptpage;
    SunrunSalesLoginPage sunrunsalesloginpage;
    String sheetName = "D2HLeadCreation";

    @DataProvider public Object[][] getD2HLeadTestData() {
        Object data[][] = TestUtil.getTestData(sheetName);
        return data;
    }



    @BeforeSuite
    public void Setup() throws InterruptedException {
        initialization();
        splatloginpage = new SplatLoginPage();
        sunrunsalesloginpage = splatloginpage.loginToSplatAsPartner();
        sunrunsalesloginpage.loginToSplatAsPartner(prop.getProperty("Username_D2H_User1"), prop.getProperty("Password_D2H_User1"));

    }

    @Test(priority = 1, description="Create New Lead from Splat As Partner(D2H)",enabled= true, invocationCount = 1,dataProvider = "getD2HLeadTestData")
    public void CreateNewLeadTest(String HomeAddress,String FirstName,String LastName,String EmailAddress,String MobilePhone,String LandlinePhone,String AvgMonthlyBill, String HomeType,String RoofType, String HOA,String Ownership,String InterestedInBB) throws InterruptedException, AWTException {

        splathomepage = new SplatHomePage();
        splathomepage.ClickOnDispositionLater();
        splatprospecteditpage = splathomepage.ClickOnCreateProspect();
        //splatprospecteditpage.CreateNewProspectByPartner("1248 Broadway, San Francisco, CA 94109, USA","D2H_Lead5","D2H_Lead5","D2H_Lead5@yopmail.com","(425) 301-5432","(425) 301-5432","$251-300","Detached single family home","Comp Shingle","No","Own","No");
        splatprospecteditpage.CreateNewProspectByPartner(HomeAddress,FirstName,LastName,EmailAddress,MobilePhone,LandlinePhone,AvgMonthlyBill,HomeType,RoofType,HOA,Ownership,InterestedInBB);
        String HomeAdd = HomeAddress;
        splathomepage = splatprospecteditpage.ClickOnGoBack();

    }

    @Test(priority = 2, description="Search Lead in Splat As Partner(D2H)",enabled= true, invocationCount = 1,dataProvider = "getD2HLeadTestData")
    public void SearchLeadTest(String HomeAddress) throws InterruptedException {

        splatprospecteditpage = splathomepage.SearchProspectByAddress(HomeAddress);
        splatprospecteditpage.ValidateProspectEditPage();

    }



    @AfterSuite
    public void TearDown()
    {
        driver.quit();
    }

}
