package com.crm.qa.pages.splat;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SplatHomePage extends TestBase {

    @FindBy(xpath="//button[text()='Do this later (due today)']")
    WebElement DoThisLater_Btn;

    @FindBy(xpath="//button[text()='Disposition now']")
    WebElement DispositionNow_Btn;

    @FindBy(xpath="//img[@alt='Create Prospect']")
    WebElement CreateProspect_Img;

    @FindBy(xpath="//input[@class='search-input']")
    WebElement Search_Textbox;

    @FindBy(xpath="//a[text()='View Prospect']")
    WebElement ViewProspect_Link;

    @FindBy(xpath="//div[@class='user-button']")
    WebElement User_Btn;

    @FindBy(xpath="//button[text()='Sign out']")
    WebElement SignOut_Btn;



    public SplatHomePage()
    {
        PageFactory.initElements(driver, this);
    }

    public void ClickOnDispositionLater() throws InterruptedException {

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        if(driver.findElements(By.xpath("//button[text()='Do this later (due today)']")).size()>0){

            DoThisLater_Btn.click();

        }

        //TestUtil.WaitForElementToBeClickable(driver,DoThisLater_Btn,2000);
        //TestUtil.ClickOn(driver,DoThisLater_Btn,2000);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        TestUtil.WaitForElementToBeClickable(driver,CreateProspect_Img,2000);

    }

    public SplatProspectEditPage ClickOnCreateProspect() throws InterruptedException {

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        TestUtil.WaitForElementToBeClickable(driver,CreateProspect_Img,2000);
        TestUtil.ClickOn(driver,CreateProspect_Img,2000);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        return new SplatProspectEditPage();

    }

    public SplatProspectEditPage SearchProspectByAddress(String HomeAddress) throws InterruptedException {

        TestUtil.WaitForElementToBeClickable(driver,Search_Textbox,2000);
        Search_Textbox.click();
        Search_Textbox.sendKeys(HomeAddress);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        driver.findElement(By.xpath("//div[text()='" + HomeAddress + "']")).click();

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        ViewProspect_Link.click();

        TestUtil.Sleep(TestUtil.LARGE_WAIT_TIME);
        return new SplatProspectEditPage();


    }

    public SplatProspectEditPage ValidateProspectVisibility(String HomeAddress, boolean ExpVisibility) throws InterruptedException {

        TestUtil.WaitForElementToBeClickable(driver,Search_Textbox,2000);
        Search_Textbox.click();
        Search_Textbox.sendKeys(HomeAddress);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        boolean ActVisibility = driver.findElement(By.xpath("//div[text()='" + HomeAddress + "']")).isDisplayed();
        Assert.assertEquals(ActVisibility,ExpVisibility);

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        ViewProspect_Link.click();

        TestUtil.Sleep(TestUtil.LARGE_WAIT_TIME);
        return new SplatProspectEditPage();


    }

    public SplatLoginPage LogOutFromSplat() throws InterruptedException {

        TestUtil.WaitForElementToBeClickable(driver,User_Btn,90000);
        User_Btn.click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        SignOut_Btn.click();
        TestUtil.Sleep(TestUtil.SMALL_WAIT_TIME);

        return new SplatLoginPage();


    }

}
