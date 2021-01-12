package com.crm.qa.testcases;

import com.crm.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.*;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;

public class CreateNewLeadTest extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    public boolean flag;
    String sheetName = "Leads";
    LeadsPage leadpage;
    LeadEditPage leadeditpage;
    ObjectHomePage objecthomepage;
    SelectObjectRecordTypePage selectobjectrecordtypePage;


    public CreateNewLeadTest()
    {
        super();
    }


    @BeforeMethod
    public void Setup() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        homepage = loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
        flag = homepage.ValidateHomePageLogo();
        Assert.assertTrue(flag);
    }




    @DataProvider public Object[][] getLeadTestData() {
        Object data[][] = TestUtil.getTestData(sheetName);
        return data;
    }



 @Test(priority=1, dataProvider="getLeadTestData")
    public void VerifyCreateNewLead(String channelList, String leadStageList, String leadStatusList, String leadTypeList, String firstName, String lastName, String company, String street, String city, String state, String zipPostalCode, String country)
            throws InterruptedException {

        objecthomepage = homepage.ClickAnyTabOnHomePage("Leads");
        boolean flag = homepage.ValidateTabLabelDisplayed("Leads");
        Assert.assertTrue(flag,"Label Does not exist");



        selectobjectrecordtypePage = objecthomepage.ClickOnNewButton();
        selectobjectrecordtypePage.SelectRecordType("New Inside Sales Team (April'13)");


        leadpage = new LeadsPage();

        leadpage.CreateNewLead(channelList, leadStageList, leadStatusList, leadTypeList, firstName, lastName, company, street, city, state, zipPostalCode, country);



    }




    @AfterMethod
    public void TearDown()
    {
        driver.quit();
    }

}

