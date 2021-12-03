package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectHomePage extends TestBase {
    @FindBy(xpath="//input[@class='btn' and @name='new']")
    WebElement NewBtn;

    public ObjectHomePage()
    {
        PageFactory.initElements(driver, this);
    }

    public SelectObjectRecordTypePage ClickOnNewButton()
    {
        try {
            TestUtil.ClickOn(driver,NewBtn,200);
        }
        catch (NullPointerException e){
            TestUtil.ClickOn(driver,NewBtn,200);
    }
        return new SelectObjectRecordTypePage();

    }
}
