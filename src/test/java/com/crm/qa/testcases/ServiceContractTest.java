package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import com.crm.qa.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.*;

public class ServiceContractTest extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    ObjectHomePage objHomePage;
    ServiceContractEditPage SCEditPage;
    ServiceContractDetailsPage SCDetailsPage;
    SelectObjectRecordTypePage SelectObjRecTypePage;
    ProposalDetailsPage propDetailspage;
    ServiceContractEventDetailsPage SCEDetailsPage;

    public ServiceContractTest()
    {
        super();
    }

   @BeforeClass
    public void Setup() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        homepage = loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
    }

    @Test
    public void CreateNewServiceContractTest() throws InterruptedException {

        homepage = new HomePage();
        propDetailspage = homepage.PerformGlobalSearch("PK3KN99ZN231:001-K");
        Assert.assertTrue(propDetailspage.ValidateVisibilityofEditButton());
        String ProposalID = TestUtil.GetRecordIDFromUrl();
        TestUtil.UpdateRecordsFromBackend("Proposal__c prop=[Select id,Stage__c from Proposal__c where id='"+ProposalID+"'];prop.Stage__c ='SR Approved'; update prop;","https://workbench.developerforce.com/login.php");
        propDetailspage.VerifyProposalStage("SR Approved");
        SCDetailsPage = propDetailspage.GenerateContractfromProposal();

        SCDetailsPage.ValidateServiceContractDetailLabel();
        SCDetailsPage.ValidateVisibilityofEditButton();
        SCEDetailsPage = SCDetailsPage.ClickOnServiceContractEventRecord();
        SCEDetailsPage.ValidateServiceContractEventDetailLabel();

    }

   @AfterClass
    public void TearDown()
    {
        driver.quit();
    }

}
