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



    @BeforeSuite
    public void Setup() throws InterruptedException {

        initialization();

    }


    @DataProvider public Object[][] getD2HLeadCreateTestData() {

       Object data[][] = TestUtil.getTestData("D2HLeadCreation");
       return data;
    }


    @Test(priority = 1, description="Create New Lead from Splat As Partner(D2H)",enabled= true, invocationCount = 1,dataProvider = "getD2HLeadCreateTestData")
    public void CreateNewLeadTest(String Username,String Password,String HomeAddress,String FirstName,String LastName,String EmailAddress,String MobilePhone,String LandlinePhone,String AvgMonthlyBill, String HomeType,String RoofType, String HOA,String Ownership,String InterestedInBB) throws InterruptedException, AWTException {

        splatloginpage = new SplatLoginPage();
        sunrunsalesloginpage = splatloginpage.loginToSplatAsPartner();
        sunrunsalesloginpage.loginToSplatAsPartner(Username,Password);

        splathomepage = new SplatHomePage();
        splathomepage.ClickOnDispositionLater();
        splatprospecteditpage = splathomepage.ClickOnCreateProspect();

        splatprospecteditpage.CreateNewProspectByPartner(HomeAddress,FirstName,LastName,EmailAddress,MobilePhone,LandlinePhone,AvgMonthlyBill,HomeType,RoofType,HOA,Ownership,InterestedInBB);
        String HomeAdd = HomeAddress;
        splathomepage = splatprospecteditpage.ClickOnGoBack();
        splatloginpage = splathomepage.LogOutFromSplat();
        splatloginpage.ValidateLoginPage();

    }


    @DataProvider public Object[][] getD2HLeadSearchTestData() {

        Object data[][] = TestUtil.getTestData("D2HLeadSearch");
        return data;
    }

    @Test(priority = 2, description="Search Lead in Splat As Partner(D2H)",enabled= true, invocationCount = 1, dataProvider = "getD2HLeadSearchTestData")
    public void SearchLeadTest(String Username, String Password, String HomeAddress,Boolean Visibility) throws InterruptedException {

        splatloginpage = new SplatLoginPage();
        sunrunsalesloginpage = splatloginpage.loginToSplatAsPartner();
        sunrunsalesloginpage.loginToSplatAsPartner(Username,Password);
        splatprospecteditpage = splathomepage.ValidateProspectVisibility(HomeAddress,Visibility);
        splatprospecteditpage.ValidateProspectEditPage();
        splatloginpage = splathomepage.LogOutFromSplat();
        splatloginpage.ValidateLoginPage();

    }


    @AfterSuite
    public void TearDown()
    {
        driver.quit();
    }

}
