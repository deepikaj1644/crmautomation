package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectObjectRecordTypePage extends TestBase {

    @FindBy(xpath="//label[contains(text(),'Record Type of new record')]//following::select")
    WebElement SelectRecordTypeList;

    @FindBy(xpath="//input[@type='submit' and @value='Continue']")
    WebElement ContinueBtn;

    public SelectObjectRecordTypePage()
    {
        PageFactory.initElements(driver, this);
    }


    public void SelectRecordType(String RecordType)
    {
        System.out.println(RecordType);
        Select recordtype = new Select(SelectRecordTypeList);
        recordtype.selectByVisibleText(RecordType);
        TestUtil.ClickOn(driver,ContinueBtn,20);


    }
}
