package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginToApplicationTest extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    public boolean flag;


    public LoginToApplicationTest()
    {
        super();
    }


    @BeforeMethod
    public void Setup() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        homepage = loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));


    }



    @Test(priority=1)
    public void ValidateSFLogo() {

        flag = homepage.ValidateHomePageLogo();
        Assert.assertTrue(flag);

    }


    @AfterMethod
    public void TearDown()
    {
        driver.quit();
    }
}
