package com.crm.qa.testcases;

import com.crm.qa.pages.ObjectHomePage;
import org.testng.Assert;
import org.testng.annotations.*;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginToApplicationTest extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    ObjectHomePage objHomePage;

    public LoginToApplicationTest()
    {
        super();
    }

    @BeforeSuite
    public void Setup() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        homepage = loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
    }

    @AfterSuite
    public void TearDown()
    {
        driver.quit();
        //System.out.println("Account Test ends...");
    }
}
