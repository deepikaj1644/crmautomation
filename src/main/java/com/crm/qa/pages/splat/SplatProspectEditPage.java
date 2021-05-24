package com.crm.qa.pages.splat;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SplatProspectEditPage extends TestBase {

    //General
    @FindBy(xpath="//button[text()='Do this later (due today)']")
    WebElement DoThisLater_Btn;

    @FindBy(xpath="//button[text()='Save']")
    WebElement Save_Btn;

    @FindBy(xpath="//button[text()='I agree to this authorization request']")
    WebElement IAgreeAuthRequest_Btn;

    @FindBy(xpath="//button[text()='Schedule Now']")
    WebElement ScheduleNow_Btn;

    @FindBy(xpath="//button[text()='Go Back']")
    WebElement GoBack_Btn;




    //Channel Selection
    @FindBy(xpath="//button[text()='Self Gen']")
    WebElement SelfGen_Btn;

    @FindBy(xpath="//div[text()='Self Gen Type']/child::div")
    WebElement SelfGenType_dd;

    //HomeOwner Info
    @FindBy(xpath="//input[@name='customerFullAddress']")
    WebElement HomeAddress_textbox;

    @FindBy(xpath="//label[text()='First Name']/following-sibling::input")
    WebElement FisrtName_textbox;

    @FindBy(xpath="//label[text()='Last Name']/following-sibling::input")
    WebElement LastName_textbox;

    @FindBy(xpath="//label[text()='Email Address']/following-sibling::input")
    WebElement EmailAddress_textbox;

    @FindBy(xpath="//label[text()='Mobile Phone']/following-sibling::input")
    WebElement MobilePhone_textbox;

    @FindBy(xpath="//label[text()='Landline Phone']/following-sibling::input")
    WebElement LandlinePhone_textbox;

    @FindBy(xpath="//label[text()='Call Consent']/following-sibling::div/button[text()='Yes']")
    WebElement CallConcentYes_btn;

    //Utility Info

    @FindBy(xpath="//label[text()='Average Monthly Electric Bill']/following-sibling::div")
    WebElement AverageMonthlyElectricBill_dd;


    //Home Info

    @FindBy(xpath="//label[text()='Home Type']/following-sibling::div")
    WebElement HomeType_dd;

    @FindBy(xpath="//label[text()='Roof Type']/following-sibling::div")
    WebElement RoofType_dd;

    @FindBy(xpath="//label[text()='HOA']/following-sibling::div/button[text()='No']")
    WebElement HOANo_btn;

    @FindBy(xpath="//label[text()='Ownership']/following-sibling::div/button[text()='Own']")
    WebElement OwnershipOwn_btn;


    //Additional Notes

    @FindBy(xpath="//label[text()='Interested in Brightbox']/following-sibling::div/button[text()='No']")
    WebElement InterestedinBrightboxNo_btn;


    public SplatProspectEditPage()
    {
        PageFactory.initElements(driver, this);
    }


    public ScheduleApptPage CreateNewProspect(String LeadType,String SelfGenType,String HomeAddress,String FirstName,String LastName,String EmailAddress,String MobilePhone,String LandlinePhone,String AvgMonthlyBill,String HomeType,String RoofType,String HOA,String Ownership,String InterestedInBB) throws InterruptedException, AWTException {


        driver.findElement(By.xpath("//button[text()='" + LeadType  + "']")).click();

        SelfGenType_dd.click();
        driver.findElement(By.xpath("//span[text()='" + SelfGenType  + "']")).click();

        HomeAddress_textbox.click();
        HomeAddress_textbox.sendKeys(HomeAddress);

        Robot robot = new Robot();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        robot.keyPress(KeyEvent.VK_DOWN);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        robot.keyPress(KeyEvent.VK_ENTER);
        TestUtil.Sleep(TestUtil.SMALL_WAIT_TIME);

        FisrtName_textbox.click();
        FisrtName_textbox.sendKeys(FirstName);

        LastName_textbox.click();
        LastName_textbox.sendKeys(LastName);

        EmailAddress_textbox.click();
        EmailAddress_textbox.sendKeys(EmailAddress);

        MobilePhone_textbox.click();
        MobilePhone_textbox.sendKeys(MobilePhone);

        LandlinePhone_textbox.click();
        LandlinePhone_textbox.sendKeys(LandlinePhone);

        CallConcentYes_btn.click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        IAgreeAuthRequest_Btn.click();

        TestUtil.WaitForElementToBeClickable(driver,AverageMonthlyElectricBill_dd,2000);
        AverageMonthlyElectricBill_dd.click();
        TestUtil.Sleep(TestUtil.SMALL_WAIT_TIME);
        driver.findElement(By.xpath("//span[text()='" + AvgMonthlyBill  + "']")).click();

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        HomeType_dd.click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        driver.findElement(By.xpath("//span[text()='" + HomeType  + "']")).click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        RoofType_dd.click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        driver.findElement(By.xpath("//span[text()='" + RoofType  + "']")).click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        driver.findElement(By.xpath("//label[text()='HOA']/following-sibling::div/button[text()='" + HOA  + "']")).click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        driver.findElement(By.xpath("//label[text()='Ownership']/following-sibling::div/button[text()='" + Ownership  + "']")).click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        driver.findElement(By.xpath("//label[text()='Interested in Brightbox']/following-sibling::div/button[text()='" + InterestedInBB  + "']")).click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Save_Btn.click();

        TestUtil.WaitForElementToBeClickable(driver,ScheduleNow_Btn,2000);
        ScheduleNow_Btn.click();

        TestUtil.Sleep(TestUtil.SMALL_WAIT_TIME);

        return new ScheduleApptPage();

    }

    public void CreateNewProspectByPartner(String HomeAddress,String FirstName,String LastName,String EmailAddress,String MobilePhone,String LandlinePhone,String AvgMonthlyBill,String HomeType,String RoofType,String HOA,String Ownership,String InterestedInBB) throws InterruptedException, AWTException {


        HomeAddress_textbox.click();
        HomeAddress_textbox.sendKeys(HomeAddress);

        Robot robot = new Robot();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        robot.keyPress(KeyEvent.VK_DOWN);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        robot.keyPress(KeyEvent.VK_ENTER);
        TestUtil.Sleep(TestUtil.SMALL_WAIT_TIME);

        FisrtName_textbox.click();
        FisrtName_textbox.sendKeys(FirstName);

        LastName_textbox.click();
        LastName_textbox.sendKeys(LastName);

        EmailAddress_textbox.click();
        EmailAddress_textbox.sendKeys(EmailAddress);

        MobilePhone_textbox.click();
        MobilePhone_textbox.sendKeys(MobilePhone);

        LandlinePhone_textbox.click();
        LandlinePhone_textbox.sendKeys(LandlinePhone);

        CallConcentYes_btn.click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        IAgreeAuthRequest_Btn.click();

        TestUtil.WaitForElementToBeClickable(driver,AverageMonthlyElectricBill_dd,2000);
        AverageMonthlyElectricBill_dd.click();
        TestUtil.Sleep(TestUtil.SMALL_WAIT_TIME);
        driver.findElement(By.xpath("//span[text()='" + AvgMonthlyBill  + "']")).click();

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        HomeType_dd.click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        driver.findElement(By.xpath("//span[text()='" + HomeType  + "']")).click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        RoofType_dd.click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        driver.findElement(By.xpath("//span[text()='" + RoofType  + "']")).click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        driver.findElement(By.xpath("//label[text()='HOA']/following-sibling::div/button[text()='" + HOA  + "']")).click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        driver.findElement(By.xpath("//label[text()='Ownership']/following-sibling::div/button[text()='" + Ownership  + "']")).click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        driver.findElement(By.xpath("//label[text()='Interested in Brightbox']/following-sibling::div/button[text()='" + InterestedInBB  + "']")).click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Save_Btn.click();

        TestUtil.Sleep(TestUtil.LARGE_WAIT_TIME);
        TestUtil.Sleep(TestUtil.SMALL_WAIT_TIME);

        TestUtil.WaitForElementToBeVisible(driver,GoBack_Btn,90000);
        //TestUtil.WaitForElementToBeClickable(driver,GoBack_Btn,90000);

    }

    public SplatHomePage ClickOnGoBack(){

        TestUtil.WaitForElementToBeClickable(driver,GoBack_Btn,50000);
        GoBack_Btn.click();

        return new SplatHomePage();

    }

    public void ValidateProspectEditPage(){

        TestUtil.WaitForElementToBeClickable(driver,FisrtName_textbox,20000);
        FisrtName_textbox.isDisplayed();


    }
}
