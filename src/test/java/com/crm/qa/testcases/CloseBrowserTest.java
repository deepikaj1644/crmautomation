package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.ObjectHomePage;
import org.testng.annotations.Test;

public class CloseBrowserTest extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    ObjectHomePage objHomePage;

    public CloseBrowserTest()
    {
        super();
    }

    @Test
    public void TearDown()
    {
        driver.quit();
    }
}
