package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class LeadEditPage extends TestBase {

    @FindBy(xpath="//label[text()='Channel']//following::select[1]")
    WebElement ChannelList;

    @FindBy(xpath="//label[text()='Lead Stage']//following::select[1]")
    WebElement LeadStageList;

    @FindBy(xpath="//label[text()='Lead Status']//following::select[1]")
    WebElement LeadStatusList;

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

    @FindBy(xpath="//input[@type='submit' and @value='Save']")
    WebElement SaveBtn;

    public LeadEditPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void CreateNewLead(String channeLst, String leadStageLst, String leadStatusLst, String fName, String lName, String companyName, String streetName, String cityName, String stateName, String zipCode, String countryName) {

        Select Channel = new Select(ChannelList);
        Channel.selectByVisibleText(channeLst);

        Select Stage = new Select(LeadStageList);
        Stage.selectByVisibleText(leadStageLst);

        Select Status = new Select(LeadStatusList);
        Status.selectByVisibleText(leadStatusLst);

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
