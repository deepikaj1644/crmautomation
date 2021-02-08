package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import com.crm.qa.pages.splat.ScheduleApptPage;
import com.crm.qa.pages.splat.SplatHomePage;
import com.crm.qa.pages.splat.SplatLoginPage;
import com.crm.qa.pages.splat.SplatProspectEditPage;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;

public class CreateNewProspectFromSplat extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    SplatLoginPage splatloginpage;
    SplatHomePage splathomepage;
    SplatProspectEditPage splatprospecteditpage;
    ScheduleApptPage scheduleapptpage;



   @BeforeSuite
   public void Setup() throws InterruptedException {
        initialization();
        splatloginpage = new SplatLoginPage();
        loginpage = splatloginpage.loginToSplatAsSalesTeam();
        homepage = loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
    }

    @Test(priority = 1, description="Create New Lead from Splat as a Sales User'",enabled= true)
    public void CreateNewLeadTest() throws InterruptedException, AWTException {

        splathomepage = new SplatHomePage();
        splathomepage.ClickOnDispositionLater();
        splatprospecteditpage = splathomepage.ClickOnCreateProspect();
        scheduleapptpage = splatprospecteditpage.CreateNewProspect("Self Gen","Sales Self Gen","1286 Broadway, San Francisco, CA 94109, USA","Sales_Lead10","Sales_Lead10","Sales_Lead10@yopmail.com","(425) 301-5432","(425) 301-5432","$251-300","Detached single family home","Comp Shingle","No","Own","No");
        splatprospecteditpage = scheduleapptpage.ScheduleNewAppointment();
        splathomepage = splatprospecteditpage.ClickOnGoBack();
        splatprospecteditpage = splathomepage.SearchProspectByAddress("1286 Broadway San Francisco CA");
        splatprospecteditpage.ValidateProspectEditPage();
    }

   @AfterSuite
    public void TearDown()
    {
        driver.quit();
    }

}
