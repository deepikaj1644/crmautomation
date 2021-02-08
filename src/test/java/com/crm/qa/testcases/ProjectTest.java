package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProjectTest {

    LoginPage loginpage;
    HomePage homepage;
    ObjectHomePage objHomePage;
    SelectObjectRecordTypePage RecTypePage;
    ProposalEditPage propEditpage;
    ProposalDetailsPage propDetailspage;
    ProjectPage projPage;


   /* public ProjectTest()
    {
        super();
    }*/

   /* @BeforeClass
    public void Setup() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        homepage = loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
    }
*/
    @Test(priority = 1, description="Creates a new Project",enabled= true)
    public void VerifyCreateNewProjectTest() throws InterruptedException {

        homepage = new HomePage();
        propDetailspage = homepage.PerformGlobalSearch("PK3KN99ZN231:001-K");

        Assert.assertTrue(propDetailspage.ValidateVisibilityofEditButton());
        propEditpage = propDetailspage.ClickOnEditButton();
        Assert.assertTrue(propEditpage.ValidateVisibilityofSaveButton());
        propEditpage.CreateNewProject();
        projPage = propDetailspage.ValidateProjectOnProposal();
        Assert.assertTrue(projPage.ValidateAdhocButtonOnProjectPage());

    }

    /*@AfterClass
    public void TearDown()
    {
       driver.quit();
    }*/
}
