package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import com.crm.qa.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WorkOrderCreationTest extends TestBase {


    LoginPage loginpage;
    HomePage homepage;
    ObjectHomePage objHomePage;
    ProposalDetailsPage propDetailspage;
    ProjectPage projectpage;
    TaskPage taskpage;

    public WorkOrderCreationTest()
    {
        super();
    }

    @BeforeClass
    public void Setup() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        homepage = loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
    }

    @Test(priority = 1, description="Creates a new 'WorkOrder' record",enabled= true)
    public void CreateNewServiceContractTest() throws InterruptedException {

        homepage = new HomePage();
        propDetailspage = homepage.PerformGlobalSearch("PK3KN99ZN231:001-K");
        Assert.assertTrue(propDetailspage.ValidateVisibilityofEditButton());
        propDetailspage.ValidateProjectOnProposal();


        projectpage = new ProjectPage();
        String ProjectName = projectpage.StoreProjectName();
        String ProjectID = TestUtil.FetchRecordIDFromBackend("SELECT Id FROM Project__c where Name = '"+ProjectName+"'","https://workbench.developerforce.com/login.php");

        projectpage.NavigateToRequiredTask("Project Handoff");
        taskpage = new TaskPage();
        //String TaskStatusInactive = taskpage.ValidateTaskStatus();
        //Assert.assertEquals(TaskStatusInactive,"Inactive");

        String TaskID  = TestUtil.FetchRecordIDFromBackend("Select(Select Id from Tasks__r where Name='Project Handoff') from Project__c where ID='"+ProjectID+"'","https://workbench.developerforce.com/login.php");
        TestUtil.UpdateRecordsFromBackend("Task__c task=[Select id,Status__c from Task__c where id='"+TaskID+"'];task.Status__c ='Complete'; update task;","https://workbench.developerforce.com/login.php");

        //String TaskStatusComplete = taskpage.ValidateTaskStatus();
        //Assert.assertEquals(TaskStatusComplete,"Complete");


      // String WorkOrderID = TestUtil.FetchRecordIDFromBackend("Select Id,(Select Id from Work_Orders__r where RecordType.Name='Install') from Project__c where Id='"+ProjectID+"'","https://workbench.developerforce.com/login.php");

    }

    @AfterClass
    public void TearDown()
    {
        driver.quit();
    }

}
