package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.crm.qa.utilities.TestUtil;
import org.testng.Assert;

public class ProposalDetailsPage extends TestBase{
    @FindBy(xpath="//h2[text()='Proposal Detail']")
    WebElement ProposalDetail_Label;

    @FindBy(xpath="//input[@name='edit' and @type='button']")
    WebElement EditBtn;

    @FindBy(xpath="//th[text()='Project Name']//following::tr[1]/th/a")
    WebElement ProjectLnk;

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

    public ProjectPage ValidateProjectOnProposal()
    {
        TestUtil.WaitForElementToBeVisible(driver,ProposalDetail_Label,50);
        boolean Status = false;

        while (!Status){

            TestUtil.refreshBrowserByJS(driver);
            Status = ProjectLnk.isDisplayed();
        }

        TestUtil.ClickOn(driver,ProjectLnk,2000);

        return new ProjectPage();
    }
}
