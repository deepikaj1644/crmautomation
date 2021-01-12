package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;
import org.openqa.selenium.support.ui.Select;

public class LeadsPage extends TestBase {


    @FindBy(xpath="//input[@class='btn' and @name='new']")
    WebElement NewBtn;

    @FindBy(xpath="//div/h1[text()='Leads']")
    WebElement labelLeads;

    @FindBy(xpath="//label[text()='Record Type of new record']//following::select")
    WebElement SelectRecordTypeList;

    @FindBy(xpath="//input[@type='submit' and @value='Continue']")
    WebElement ContinueBtn;

    @FindBy(xpath="//label[text()='Channel']//following::select[1]")
    WebElement ChannelList;

    @FindBy(xpath="//label[text()='Lead Stage']//following::select[1]")
    WebElement LeadStageList;

    @FindBy(xpath="//label[text()='Lead Status']//following::select[1]")
    WebElement LeadStatusList;

    @FindBy(xpath="//label[text()='Lead Type']//following::select[1]")
    WebElement LeadTypeList;

    @FindBy(xpath="//label[text()='First Name']//following::input[contains(@id,'first')]")
    WebElement FirstName;

    @FindBy(xpath="//label[text()='Last Name']//following::input[contains(@id,'last')]")
    WebElement LastName;

    @FindBy(xpath="//label[text()='Company']//following::input[1]")
    WebElement Company;

    @FindBy(xpath="//label[text()='Street']/following::td/textarea[contains(@name,'street')]")
    WebElement Street;

    @FindBy(xpath="//label[text()='City']/following::td/input[contains(@name,'city')]")
    WebElement City;

    @FindBy(xpath="(//label[text()='State/Province']/following::td/input[contains(@name,'state')])[1]")
    WebElement State;

    @FindBy(xpath="(//label[text()='Zip/Postal Code']/following::td/input[contains(@name,'zip')])[1]")
    WebElement ZipPostalCode;

    @FindBy(xpath="//label[text()='Country']/following::td/input[contains(@name,'country')]")
    WebElement Country;

    @FindBy(xpath="//input[@type='submit' and @name='save']")
    WebElement SaveBtn;



    public LeadsPage()
    {
        PageFactory.initElements(driver, this);
    }


    public void CreateNewLead(String channeLst, String leadStageLst, String leadStatusLst, String leadTypeLst, String fName, String lName, String companyName, String streetName, String cityName, String stateName, String zipCode, String countryName) {

        Select Channel = new Select(ChannelList);
        Channel.selectByVisibleText(channeLst);

        Select Stage = new Select(LeadStageList);
        Stage.selectByVisibleText(leadStageLst);

        Select Status = new Select(LeadStatusList);
        Status.selectByVisibleText(leadStatusLst);

        Select Type = new Select(LeadTypeList);
        Type.selectByVisibleText(leadTypeLst);


        FirstName.sendKeys(fName);
        LastName.sendKeys(lName);
        Company.sendKeys(companyName);
        Street.sendKeys(streetName);
        City.sendKeys(cityName);
        State.sendKeys(stateName);
        ZipPostalCode.sendKeys(zipCode);
        Country.sendKeys(countryName);

        SaveBtn.click();

    }


}
