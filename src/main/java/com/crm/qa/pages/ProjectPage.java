package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectPage extends TestBase {

    @FindBy(xpath="//input[@value='Adhoc Work Order']")
    WebElement AdhocWorkOrder_Btn;

    @FindBy(xpath="//h1[@class='slds-page-header__title']")
    WebElement ProjectName_Txt;

    @FindBy(xpath="//div[@id='statusFilter']")
    WebElement StatusFilter;

    @FindBy(xpath="//input[@class='statusCheckbox' and @value='Select All']")
    WebElement status_Checkbox;


    public ProjectPage()
    {
        PageFactory.initElements(driver, this);
    }


    public boolean ValidateAdhocButtonOnProjectPage() {

        TestUtil.WaitForElementToBeVisible(driver,AdhocWorkOrder_Btn,2000);
        return AdhocWorkOrder_Btn.isDisplayed();

    }
    public TaskPage NavigateToRequiredTask(String TaskName) throws InterruptedException {

        //ProjectDetailsText.isDisplayed();
        TestUtil.ClickOn(driver,StatusFilter,20);
        TestUtil.Sleep(TestUtil.SMALL_WAIT_TIME);
        TestUtil.ClickOn(driver,status_Checkbox,20);
        TestUtil.Sleep(TestUtil.MEDIUM_WAIT_TIME);
        TestUtil.ClickOn(driver,driver.findElement(By.xpath("//td/a/span[contains(text(),'" + TaskName + "')]")),20);
        TestUtil.Sleep(TestUtil.SMALL_WAIT_TIME);
        return new TaskPage();
    }

    public String StoreProjectName() {

        TestUtil.WaitForElementToBeVisible(driver,ProjectName_Txt,2000);
        String ProjectName = ProjectName_Txt.getText();
        return ProjectName;

    }

}
