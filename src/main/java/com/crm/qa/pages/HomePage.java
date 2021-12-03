package com.crm.qa.pages;

import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class HomePage extends TestBase {


    @FindBy(xpath="//img[@title='Salesforce.com']")
    WebElement HomePgaeLogo;

    @FindBy(xpath="//img[@title='All Tabs']")
    WebElement AllTabs_Lnk;

    @FindBy(xpath="//a[@title=Tab Name]")
    WebElement DynamicTabLabel;

    @FindBy(xpath="//input[contains(@title,'Search')]")
    WebElement GlobalSearchBox;

    @FindBy(xpath="//input[@value='Search']")
    WebElement SearchButton;

    @FindBy(xpath="//a[text()='PR-2115006529']")
    WebElement SearchResultRecord;

    @FindBy(xpath="//a[@class='btn' and @title='Search All']")
    WebElement SearchAll_Lnk;

    @FindBy(xpath="//input[@id='secondSearchButton' and @value='Search All']")
    WebElement SearchAll_Btn;






    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }


    public boolean ValidateHomePageLogo()
    {
        return HomePgaeLogo.isDisplayed();

    }

    public AllTabsPage ClickAllTabsLnk()
    {
        AllTabs_Lnk.click();
        return new AllTabsPage();
    }


    public ObjectHomePage ClickAnyTabOnHomePage(String TabName)
    {
        driver.findElement(By.xpath("//a[contains(@title,'" + TabName  + "')]")).click();
        return new ObjectHomePage();
    }

    public boolean ValidateTabLabelDisplayed(String TabName)
    {
        return driver.findElement(By.xpath("//h1[text()='" + TabName  + "']")).isDisplayed();

    }

    public ProposalDetailsPage PerformGlobalSearch(String Item) throws InterruptedException {
        GlobalSearchBox.sendKeys(Item);
        TestUtil.ClickOn(driver,SearchButton,1000);
       /* Boolean Status = SearchAll_Btn.isDisplayed();
        if(Status==true){
            SearchAll_Btn.click();
        }*/

        TestUtil.WaitForElementToBeClickable(driver,driver.findElement(By.xpath("//th/a[text()='" + Item + "']")),20000);
        try {

            TestUtil.ClickOn(driver,driver.findElement(By.xpath("//th/a[text()='" + Item + "']")),1000);
            //driver.findElement(By.xpath("//a[text()='" + Item + "']")).click();

        }
        catch (StaleElementReferenceException e)
        {
            TestUtil.ClickOn(driver,driver.findElement(By.xpath("//th/a[text()='" + Item + "']")),1000);
            //driver.findElement(By.xpath("//a[text()='" + Item + "']")).click();

        }
        catch (NullPointerException e)
        {
            TestUtil.ClickOn(driver,driver.findElement(By.xpath("//th/a[text()='" + Item + "']")),1000);
            //driver.findElement(By.xpath("//a[text()='" + Item + "']")).click();
        }

        return new ProposalDetailsPage();

    }

    public void SearchAllLink()
    {
        SearchAll_Lnk.click();

    }

}
