package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.crm.qa.utilities.TestUtil;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ProposalDetailsPage extends TestBase{
    @FindBy(xpath="//h2[text()='Proposal Detail']")
    WebElement ProposalDetail_Label;

    @FindBy(xpath="//input[@name='edit' and @type='button']")
    WebElement EditBtn;

    @FindBy(xpath="//th[text()='Project Name']//following::tr[1]/th/a")
    WebElement ProjectLnk;

    @FindBy(xpath="//td[text()='Stage']//following-sibling::td[1]")
    WebElement StageValue;

    @FindBy(xpath="(//input[@value='Generate Contract'])[1]")
    WebElement GenerateBtn;

    @FindBy(xpath="//input[@value='Generate New Service Contract']")
    WebElement GenerateNewServiceContractBtn;

    @FindBy(xpath="//h4[contains(text(),'Errors')]")
    WebElement Errors_Text;

    @FindBy(xpath="//input[@value='Return to Proposal']")
    WebElement ReturnToProposal_Btn;

    @FindBy(xpath="//h3[text()='Service Contracts']//following::tr[2]//th/a")
    WebElement ServiceContracts_Lnk;



    public ProposalDetailsPage()
    {
        PageFactory.initElements(driver, this);
    }

    public boolean ValidateProposalDetailLabel()
    {
        TestUtil.WaitForElementToBeVisible(driver,ProposalDetail_Label,50);
        return ProposalDetail_Label.isDisplayed();
    }

    public boolean ValidateVisibilityofEditButton()
    {
        TestUtil.WaitForElementToBeVisible(driver,EditBtn,50);
        return EditBtn.isDisplayed();
    }

    public ProposalEditPage ClickOnEditButton()
    {
        TestUtil.WaitForElementToBeVisible(driver,EditBtn,50);
        TestUtil.ClickOn(driver,EditBtn,20);
        return new ProposalEditPage();
    }

    public ProjectPage ValidateProjectOnProposal() throws InterruptedException {
        TestUtil.WaitForElementToBeVisible(driver,ProposalDetail_Label,50000);

        boolean displayed = false;
        do {
            try {
                displayed = driver.findElement(By.xpath("//th[text()='Project Name']//following::tr[1]/th/a")).isDisplayed();
            } catch (NoSuchElementException e) {
                System.out.println(e);
                driver.navigate().refresh();
            }
        } while (!displayed);

        TestUtil.ClickOn(driver,ProjectLnk,2000);
        TestUtil.Sleep(10);

        return new ProjectPage();
    }

    public void VerifyProposalStage(String ExpectedStage)
    {
        TestUtil.WaitForElementToBeVisible(driver,EditBtn,50);
        String ActualStage = StageValue.getText();
        Assert.assertEquals(ActualStage,ExpectedStage);

    }

    public ServiceContractDetailsPage GenerateContractfromProposal() throws InterruptedException {
        //GenerateBtn.click();
        TestUtil.ClickOn(driver,GenerateBtn,2000);
        TestUtil.Sleep(2);

        if(driver.findElements(By.xpath("//h4[contains(text(),'Errors')]")).size()>0){

            TestUtil.ClickOn(driver,ReturnToProposal_Btn,20000);
            TestUtil.WaitForElementToBeClickable(driver,ServiceContracts_Lnk,20000);
            TestUtil.ClickOn(driver,ServiceContracts_Lnk,20000);
        }
        else
        {
            TestUtil.ClickOn(driver,GenerateNewServiceContractBtn,20000);

        }
        //TestUtil.WaitForElementToBeClickable(driver,GenerateNewServiceContractBtn,20000);
        //GenerateNewServiceContractBtn.click();
        return new ServiceContractDetailsPage();

    }
}
