package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AllTabsPage extends TestBase {



    @FindBy(xpath="//img[@title='Leads']/parent::a")
    WebElement Leads_Lnk;


    public AllTabsPage()
    {
        PageFactory.initElements(driver, this);
    }



    public ObjectHomePage ClickAnyTabOnAllTabsPage(String TabName)
    {
        driver.findElement(By.xpath("//img[@title='" + TabName  + "']/parent::a")).click();
        return new ObjectHomePage();
    }
}
