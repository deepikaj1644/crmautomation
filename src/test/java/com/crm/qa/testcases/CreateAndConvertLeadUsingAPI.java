package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import com.crm.qa.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateAndConvertLeadUsingAPI extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    ObjectHomePage objHomePage;
    ProposalDetailsPage propDetailspage;
    ProjectPage projectpage;
    TaskPage taskpage;
    String sheetName="LeadAPIData";

    public CreateAndConvertLeadUsingAPI()
    {
        super();
    }

    @DataProvider
    public Object[][] getMyTestData() {
        Object data[][] = TestUtil.getTestData(sheetName);
        return data;
    }


    @BeforeClass
    public void Setup() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        homepage = loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
        Thread.sleep(TestUtil.LARGE_WAIT_TIME);
    }

    @Test(priority = 1, dataProvider="getMyTestData", description="Creates a new lead and convert it",enabled= true)
    //@Test(priority = 1, description="Creates a new lead and convert it",enabled= true)
    public void CreateNewLeadAPITest(String ReqBody) throws InterruptedException {
        //public void CreateNewServiceContractTest() throws InterruptedException {
        homepage = new HomePage();

        Thread.sleep(TestUtil.LARGE_WAIT_TIME);
        String ProspectID = TestUtil.CreateAndConvertLeadUsingRestAPI(ReqBody);


        homepage.PerformGlobalSearch(ProspectID);
    }

    @AfterClass
    public void TearDown()
    {
        driver.quit();
    }





}
