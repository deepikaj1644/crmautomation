package com.crm.qa.pages.splat;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SunrunSalesLoginPage extends TestBase {

    @FindBy(xpath="//input[@name='email']")
    //@CacheLookup
    WebElement Email_Textbox;

    @FindBy(xpath="//input[@name='password']")
    WebElement Password_Textbox;

    @FindBy(xpath="//button[text()='Sign In']")
    WebElement SignIn_Textbox;

    public SunrunSalesLoginPage()
    {
        PageFactory.initElements(driver, this);
    }

    public SplatHomePage loginToSplatAsPartner(String Email, String Password) throws InterruptedException {

        TestUtil.WaitForElementToBeClickable(driver,Email_Textbox,2000);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Email_Textbox.sendKeys(Email);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Password_Textbox.sendKeys(Password);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        SignIn_Textbox.click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        return new SplatHomePage();
    }

}
