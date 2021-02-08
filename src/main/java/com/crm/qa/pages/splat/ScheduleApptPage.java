package com.crm.qa.pages.splat;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScheduleApptPage extends TestBase {

    //General
    @FindBy(xpath = "(//button[contains(@class,'appt-select-button')])[3]")
    WebElement FirstSlot_Btn;

    @FindBy(xpath = "//button[text()='Schedule Appointment']")
    WebElement ScheduleAppt_Btn;

    @FindBy(xpath = "//button[text()='Got It!']")
    WebElement GotIt_Btn;

    public ScheduleApptPage() {
        PageFactory.initElements(driver, this);
    }


    public SplatProspectEditPage ScheduleNewAppointment() throws InterruptedException {

        TestUtil.Sleep(TestUtil.SMALL_WAIT_TIME);

        if(driver.findElements(By.xpath("//button[text()='Got It!']")).size()>0){

            GotIt_Btn.click();

        }


        FirstSlot_Btn.click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        ScheduleAppt_Btn.click();
        TestUtil.WaitForElementToBeClickable(driver, GotIt_Btn, 2000);
        GotIt_Btn.click();
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        return new SplatProspectEditPage();

    }
}


