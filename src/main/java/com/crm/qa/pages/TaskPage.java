package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskPage extends TestBase {

    @FindBy(xpath="//input[@value='Task Complete']")
    WebElement TaskCompleteButton;

    @FindBy(xpath="//td[contains(text(),'Status')]/following-sibling::td[1]")
    WebElement Status;



    public TaskPage()
    {
        PageFactory.initElements(driver, this);
    }



    public String CompleteAnyTask() throws InterruptedException {
        //TestUtil.ClickOn(driver,TaskCompleteButton,20);
        TestUtil.Sleep(TestUtil.MEDIUM_WAIT_TIME);
        TestUtil.WaitForElementToBeClickable(driver,TaskCompleteButton,30);
        TaskCompleteButton.click();
        TestUtil.WaitForElementToBeVisible(driver,Status,60);
        String TaskStatus = Status.getText();
        return TaskStatus;

    }

    public String ValidateTaskStatus() throws InterruptedException {
        //TestUtil.ClickOn(driver,TaskCompleteButton,20);
        TestUtil.WaitForElementToBeVisible(driver,Status,60);
        String TaskStatus = Status.getText();
        return TaskStatus;

    }
}
