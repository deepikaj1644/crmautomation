package com.crm.qa.pages.splat;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SplatLoginPage extends TestBase {

    //Page Factory -OR

    @FindBy(xpath="//button[text()='Sunrun Sales Reps: Salesforce Login']")
    //@CacheLookup
    WebElement SunrunSalesTeamLogin_Btn;

    @FindBy(xpath="//button[text()='Channel and Sales Partners: Partner Portal Login']")
    WebElement SalesPartnerLogin_Btn;

    public SplatLoginPage()
    {
        PageFactory.initElements(driver, this);
    }

    public LoginPage loginToSplatAsSalesTeam() throws InterruptedException {

        TestUtil.WaitForElementToBeClickable(driver,SunrunSalesTeamLogin_Btn,2000);
        TestUtil.ClickOn(driver,SunrunSalesTeamLogin_Btn,2000);
        return new LoginPage();
    }

    public SunrunSalesLoginPage loginToSplatAsPartner() throws InterruptedException {

        TestUtil.WaitForElementToBeClickable(driver,SalesPartnerLogin_Btn,2000);
        TestUtil.ClickOn(driver,SalesPartnerLogin_Btn,2000);
        return new SunrunSalesLoginPage();
    }

    public void ValidateLoginPage() throws InterruptedException {

        TestUtil.WaitForElementToBeClickable(driver,SalesPartnerLogin_Btn,80000);

    }

}

