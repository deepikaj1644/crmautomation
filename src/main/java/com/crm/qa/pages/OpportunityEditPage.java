package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpportunityEditPage extends TestBase {

    //Opportunity Information
    @FindBy(xpath = "(//label[text()='Site Design Requested']/following::td/span/input)[1]")
    WebElement SiteDesignRequested_Textbox;

    @FindBy(xpath = "(//label[text()='Sales Rep Email']/following::td/input)[1]")
    WebElement SalesRepEmail_Textbox;

    @FindBy(xpath = "(//label[text()='Sales Branch']/following::td/span/select)[1]")
    WebElement SalesBranch_Lst;

    @FindBy(xpath = "(//label[text()='Sales Territory']/following::td/input)[1]")
    WebElement SalesTerritory_Textbox;

    @FindBy(xpath = "(//label[text()='Install Branch (Old)']/following::td/span/select)[1]")
    WebElement SalesBranchOld_Lst;

    @FindBy(xpath = "(//label[text()='Auto-dialer Opt-in']/following::td/input)[1]")
    WebElement AutodialerOption_Checkbox;

    @FindBy(xpath = "(//label[text()='Lead Origin']/following::td/span/select)[1]")
    WebElement LeadOrigin_Lst;

    @FindBy(xpath = "(//label[text()='Racking Type']/following::td/span/select)[1]")
    WebElement RackingType_Lst;

    @FindBy(xpath = "(//label[text()='Program']/following::td/span/select)[1]")
    WebElement Program_Lst;

    @FindBy(xpath = "(//label[text()='HOA Phone']/following::td/input)[1]")
    WebElement HOAPhone_Textbox;

    @FindBy(xpath = "(//label[text()='Dial Status']/following::td/input)[1]")
    WebElement DialStatus_Textbox;

    @FindBy(xpath = "(//label[text()='Product Offering']/following::td/span/select)[1]")
    WebElement ProductOffering_Lst;

    @FindBy(xpath = "//label[text()='Channel']/following::td[1]//select")
    WebElement Channel_Lst;

    @FindBy(xpath = "//label[text()='Lead Source']/following::td[1]//select")
    WebElement LeadSource_Lst;

    @FindBy(xpath = "//label[text()='Lead Type']/following::td[1]//select")
    WebElement LeadType_Lst;

    @FindBy(xpath = "//label[text()='Stage']/following::td[1]//select")
    WebElement Stage_Lst;

    @FindBy(xpath = "(//label[text()='Close Date']/following::td//span/input)[1]")
    WebElement CloseDate_Textbox;

    @FindBy(xpath = "(//label[text()='Probability (%)']/following::td/input)[1]")
    WebElement Probability_Textbox;

    @FindBy(xpath = "(//label[text()='Opportunity Number']/following::td/input)[1]")
    WebElement OpportunityNumber_Textbox;

    @FindBy(xpath = "(//label[text()='Channel Last']/following::td/input)[1]")
    WebElement ChannelLast_Textbox;

    @FindBy(xpath = "(//label[text()='Lead Source Last']/following::td/input)[1]")
    WebElement LeadSourceLast_Textbox;

    @FindBy(xpath = "//label[text()='Lead Type Last']/following::td[1]//select")
    WebElement LeadTypeLast_Lst;

    @FindBy(xpath = "(//label[text()='Technology Last']/following::td/input)[1]")
    WebElement TechnologyLast_Textbox;

    @FindBy(xpath = "//label[text()='Deal Registration Status']/following::td[1]//select")
    WebElement DealRegistrationStatus_Lst;


    //Customer Information

    @FindBy(xpath = "(//label[text()='Homeowner Full Name']/following::td/input)[1]")
    WebElement HomeownerFullName_Textbox;

    @FindBy(xpath = "(//label[text()='Phone']/following::td/input)[1]")
    WebElement Phone_Textbox;

    @FindBy(xpath = "(//label[text()='Homeowner Email']/following::td/input)[1]")
    WebElement HomeownerEmail_Textbox;

    @FindBy(xpath = "(//label[text()='Do not call']/following::td/input)[1]")
    WebElement Donotcall_Checkbox;

    @FindBy(xpath = "(//label[text()='Email Opt-Out (All)']/following::td/input)[1]")
    WebElement EmailOptOutAll_Checkbox;

    @FindBy(xpath = "(//label[text()='Verification Call Completed']/following::td/span/input)[1]")
    WebElement VerificationCallCompleted_Textbox;

    @FindBy(xpath = "(//label[text()='Home Type']/following::td/span/select)[1]")
    WebElement HomeType_Lst;

    //Proposal Detail

    @FindBy(xpath = "(//label[text()='First Proposal Created Date']/following::td/input)[1]")
    WebElement FirstProposalCreatedDate_Textbox;

    //Site Information

    @FindBy(xpath = "(//label[text()='HOA?']/following::td/span/select)[1]")
    WebElement HOA_Lst;

    @FindBy(xpath = "(//label[text()='Installation Type']/following::td/span/select)[1]")
    WebElement InstallationType_Lst;

    @FindBy(xpath = "(//label[text()='Square footage']/following::td/input)[1]")
    WebElement Squarefootage_Textbox;

    @FindBy(xpath = "(//label[text()='HOA App Signature Status']/following::td/span/select)[1]")
    WebElement HOAAppSignatureStatus_Lst;

    @FindBy(xpath = "(//label[text()='HOA Fee']/following::td/span/select)[1]")
    WebElement HOAFee_Lst;

    @FindBy(xpath = "(//label[text()='HOA Name']/following::td/input)[1]")
    WebElement HOAName_Textbox;

    @FindBy(xpath = "(//label[text()='HOA: Neighbor Signature Required']/following::td/span/select)[1]")
    WebElement HOANeighborSignatureRequired_Lst;

    @FindBy(xpath = "(//label[text()='HOA Approved']/following::td/span/input)[1]")
    WebElement HOAApproved_Textbox;

    @FindBy(xpath = "(//label[text()='Highest Roof Story']/following::td/input)[1]")
    WebElement HighestRoofStory_Textbox;

    @FindBy(xpath = "(//label[text()='City']/following::td/input)[1]")
    WebElement City_Textbox;

    @FindBy(xpath = "(//label[text()='Roofing Type']/following::td/span/select)[1]")
    WebElement RoofingType_Lst;

    @FindBy(xpath = "(//label[text()='Age of Roof']/following::td/span/select)[1]")
    WebElement AgeofRoof_Lst;

    @FindBy(xpath = "(//label[text()='HOA App Submitted By']/following::td/span/select)[1]")
    WebElement HOAAppSubmittedBy_Lst;

    @FindBy(xpath = "(//label[text()='HOA: Customer Signature Required']/following::td/span/select)[1]")
    WebElement HOACustomerSignatureRequired_Lst;

    @FindBy(xpath = "(//label[text()='Electrical PE Stamp']/following::td/span/select)[1]")
    WebElement ElectricalPEStamp_Lst;

    //Monthly Usage

    @FindBy(xpath = "(//label[text()='State']/following::td/span/select)[1]")
    WebElement State_Lst;

    @FindBy(xpath = "(//label[text()='Average Monthly Electric Bill ($)']/following::td/span/select)[1]")
    WebElement AverageMonthlyElectricBill_Lst;

    @FindBy(xpath = "(//label[text()='January Usage']/following::td/input)[1]")
    WebElement JanuaryUsage_Textbox;

    @FindBy(xpath = "(//label[text()='February Usage']/following::td/input)[1]")
    WebElement FebruaryUsage_Textbox;

    @FindBy(xpath = "(//label[text()='March Usage']/following::td/input)[1]")
    WebElement MarchUsage_Textbox;

    @FindBy(xpath = "(//label[text()='April Usage']/following::td/input)[1]")
    WebElement AprilUsage_Textbox;

    @FindBy(xpath = "(//label[text()='May Usage']/following::td/input)[1]")
    WebElement MayUsage_Textbox;

    @FindBy(xpath = "(//label[text()='June Usage']/following::td/input)[1]")
    WebElement JuneUsage_Textbox;

    @FindBy(xpath = "(//label[text()='July Usage']/following::td/input)[1]")
    WebElement JulyUsage_Textbox;

    @FindBy(xpath = "(//label[text()='August Usage']/following::td/input)[1]")
    WebElement AugustUsage_Textbox;

    @FindBy(xpath = "(//label[text()='September Usage']/following::td/input)[1]")
    WebElement SeptemberUsage_Textbox;

    @FindBy(xpath = "(//label[text()='October Usage']/following::td/input)[1]")
    WebElement OctoberUsage_Textbox;

    @FindBy(xpath = "(//label[text()='November Usage']/following::td/input)[1]")
    WebElement NovemberUsage_Textbox;

    //Design Information

    @FindBy(xpath = "(//label[text()='Ready for']/following::td/span/select)[1]")
    WebElement Readyfor_Lst;

    @FindBy(xpath = "(//label[text()='BrightBox']/following::td/input)[1]")
    WebElement BrightBox_Checkbox;

    @FindBy(xpath = "(//label[text()='Site Design Priority']/following::td/span/select)[1]")
    WebElement SiteDesignPriority_Lst;

    @FindBy(xpath = "(//label[text()='Site Design Status']/following::td/span/select)[1]")
    WebElement SiteDesignStatus_Lst;

    //Retail Lead Generation

    @FindBy(xpath = "(//label[text()='Lead Created Date']/following::td/input)[1]")
    WebElement LeadCreatedDate_Textbox;

    //System Information

    @FindBy(xpath = "(//label[text()='Opportunity Name']/following::div/input)[1]")
    WebElement OpportunityName_Textbox;

    @FindBy(xpath = "(//label[text()='Deal Id']/following::td/input)[1]")
    WebElement DealId_Textbox;

    @FindBy(xpath = "(//label[text()='Master ID-M']/following::td/input)[1]")
    WebElement MasterIDM_Textbox;

    @FindBy(xpath = "(//label[text()='Opportunity Source Type']/following::td/span/select)[1]")
    WebElement OpportunitySourceType_Lst;

    @FindBy(xpath = "(//label[text()='External Source']/following::td/input)[1]")
    WebElement ExternalSource_Textbox;

    @FindBy(xpath = "(//label[text()='National Branch Constant']/following::td/input)[1]")
    WebElement NationalBranchConstant_Textbox;

    @FindBy(xpath = "(//label[text()='Prospect Id']/following::td/input)[1]")
    WebElement ProspectId_Textbox;

    @FindBy(xpath = "(//label[text()='Local Branch Constant']/following::td/input)[1]")
    WebElement LocalBranchConstant_Textbox;

    @FindBy(xpath = "(//label[text()='Local System Size Exponent']/following::td/input)[1]")
    WebElement LocalSystemSizeExponent_Textbox;

    @FindBy(xpath = "(//label[text()='Overhead Per Watt']/following::td/input)[1]")
    WebElement OverheadPerWatt_Textbox;

    @FindBy(xpath = "(//label[text()='Overhead Per Project']/following::td/input)[1]")
    WebElement OverheadPerProject_Textbox;


    //Site Audit

    @FindBy(xpath = "(//label[text()='Date when Site Audit was Scheduled']/following::td/span/input)[1]")
    WebElement DatewhenSiteAuditwasScheduled_Textbox;

    @FindBy(xpath = "(//label[text()='Site Audit Scheduled']/following::td/span/input)[1]")
    WebElement SiteAuditScheduled_Textbox;

    @FindBy(xpath = "(//label[text()='Site Audit Completed']/following::td/span/input)[1]")
    WebElement SiteAuditCompleted_Textbox;

    //Oracle Data

    @FindBy(xpath = "(//label[text()='Site Audit Completed']/following::td/input)[1]")
    WebElement JobType_Textbox;

    @FindBy(xpath = "(//label[text()='Oracle DC Watts']/following::td/input)[1]")
    WebElement OracleDCWatts_Textbox;

    @FindBy(xpath = "(//label[text()='Oracle Project Created By']/following::td/input)[1]")
    WebElement OracleProjectCreatedBy_Textbox;

    @FindBy(xpath = "(//label[text()='Project Creation Date']/following::td/span/input)[1]")
    WebElement ProjectCreationDate_Textbox;

    @FindBy(xpath = "(//label[text()='Plans Reviewed Date']/following::td/span/input)[1]")
    WebElement PlansReviewedDate_Textbox;

    @FindBy(xpath = "(//label[text()='Plans Completed Date']/following::td/span/input)[1]")
    WebElement PlansCompletedDate_Textbox;

    @FindBy(xpath = "(//label[text()='Job Code']/following::td/input)[1]")
    WebElement JobCode_Textbox;

    @FindBy(xpath = "(//label[text()='Project Status']/following::td/span/select)[1]")
    WebElement ProjectStatus_Lst;

    @FindBy(xpath = "(//label[text()='Estimated Construction Start Date']/following::td/span/input)[1]")
    WebElement EstimatedConstructionStartDate_Textbox;

    //Additional Information

    @FindBy(xpath = "(//label[text()='Acquisition Channel']/following::td/span/select)[1]")
    WebElement AcquisitionChannel_Lst;

    @FindBy(xpath = "//label[text()='Forecast Category']/following::td[1]/div/select")
    WebElement ForecastCategory_Lst;

    @FindBy(xpath = "(//label[text()='Installation Office']/following::td/input)[1]")
    WebElement InstallationOffice_Textbox;

    //General
    @FindBy(xpath="//input[@type='submit' and @name='save']")
    WebElement SaveBtn;


    public OpportunityEditPage() {
        PageFactory.initElements(driver, this);
    }


    public void FillOpportunityInformation(String SiteDesignReqDate, String SalesRepEmail, String SalesBranch, String SalesTerritory, String LeadOrigin, String RackingType, String Program, String HOAPhone, String DialStatus, String ProductOffering, String Channel, String LeadSource, String LeadType, String Stage, String CloseDate, String Probability, String OpportunityNumber, String ChannelLast, String LeadSourceLast, String LeadTypeLast, String TechnologyLast, String DealRegistrationStatus) throws InterruptedException {
        TestUtil.WaitForElementToBeVisible(driver, SiteDesignRequested_Textbox, 30);
        SiteDesignRequested_Textbox.sendKeys(SiteDesignReqDate);
        SalesRepEmail_Textbox.sendKeys(SalesRepEmail);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select SalesBranchLst = new Select(SalesBranch_Lst);
        SalesBranchLst.selectByVisibleText(SalesBranch);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        SalesTerritory_Textbox.sendKeys(SalesTerritory);

        Select SalesBranchOldLst = new Select(SalesBranchOld_Lst);
        SalesBranchLst.selectByVisibleText(SalesBranch);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        AutodialerOption_Checkbox.click();

        Select LeadOriginLst = new Select(LeadOrigin_Lst);
        LeadOriginLst.selectByVisibleText(LeadOrigin);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select RackingTypeLst = new Select(RackingType_Lst);
        RackingTypeLst.selectByVisibleText(RackingType);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select ProgramLst = new Select(Program_Lst);
        ProgramLst.selectByVisibleText(Program);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        HOAPhone_Textbox.sendKeys(HOAPhone);
        DialStatus_Textbox.sendKeys(DialStatus);

        Select ProductOfferingLst = new Select(ProductOffering_Lst);
        ProductOfferingLst.selectByVisibleText(ProductOffering);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select ChannelLst = new Select(Channel_Lst);
        ChannelLst.selectByVisibleText(Channel);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select LeadSourceLst = new Select(LeadSource_Lst);
        LeadSourceLst.selectByVisibleText(LeadSource);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select LeadTypeLst = new Select(LeadType_Lst);
        LeadTypeLst.selectByVisibleText(LeadType);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select StageLst = new Select(Stage_Lst);
        StageLst.selectByVisibleText(Stage);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        CloseDate_Textbox.sendKeys(CloseDate);
        CloseDate_Textbox.sendKeys(Keys.TAB);

        //Probability_Textbox.sendKeys(Probability);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        OpportunityNumber_Textbox.sendKeys(OpportunityNumber);
        ChannelLast_Textbox.sendKeys(ChannelLast);
        LeadSourceLast_Textbox.sendKeys(LeadSourceLast);

        Select LeadTypeLastLst = new Select(LeadTypeLast_Lst);
        LeadTypeLastLst.selectByVisibleText(LeadTypeLast);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TechnologyLast_Textbox.sendKeys(TechnologyLast);

        Select DealRegistrationStatusLst = new Select(DealRegistrationStatus_Lst);
        DealRegistrationStatusLst.selectByVisibleText(DealRegistrationStatus);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TestUtil.SelectRequiredObjectFromLookup("Sales Rep", "Ray Abati");
        TestUtil.SelectRequiredObjectFromLookup("Install Branch", "Las Vegas");
        TestUtil.SelectRequiredObjectFromLookup("Account Name", "Demo17370 Silent Water Way-89149");
        TestUtil.SelectRequiredObjectFromLookup("PV Designer", "Laura Wood");
        TestUtil.SelectRequiredObjectFromLookup("Project Coordinator", "Laura Wood");
        TestUtil.SelectRequiredObjectFromLookup("Sales Organization Name", "LGCY Power, LLC");


    }

    public void CustomerInformation(String HomeownerFullName,String Phone,String HomeownerEmail,String VerificationCallCompleted, String HomeType ) throws InterruptedException {

        HomeownerFullName_Textbox.sendKeys(HomeownerFullName);
        Phone_Textbox.sendKeys(Phone);
        HomeownerEmail_Textbox.sendKeys(HomeownerEmail);
        Donotcall_Checkbox.click();
        EmailOptOutAll_Checkbox.click();
        VerificationCallCompleted_Textbox.sendKeys(VerificationCallCompleted);
        VerificationCallCompleted_Textbox.sendKeys(Keys.TAB);

        Select HomeTypeLst = new Select(HomeType_Lst);
        HomeTypeLst.selectByVisibleText(HomeType);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

    }

    public void SiteInformation(String HOA,String InstallationType,String Squarefootage,String HOAAppSignatureStatus, String HOAFee, String HOAName, String HOANeighborSignatureRequired, String HOAApproved,String HighestRoofStory, String City, String RoofingType, String AgeofRoof, String HOAAppSubmittedBy, String ElectricalPEStamp) throws InterruptedException {

        Select HOALst = new Select(HOA_Lst);
        HOALst.selectByVisibleText(HOA);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select InstallationTypeLst = new Select(InstallationType_Lst);
        InstallationTypeLst.selectByVisibleText(InstallationType);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

       // Squarefootage_Textbox.sendKeys(Squarefootage);
        //TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select HOAAppSignatureStatusLst = new Select(HOAAppSignatureStatus_Lst);
        HOAAppSignatureStatusLst.selectByVisibleText(HOAAppSignatureStatus);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select HOAFeeLst = new Select(HOAFee_Lst);
        HOAFeeLst.selectByVisibleText(HOAFee);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        HOAName_Textbox.sendKeys(HOAName);

        Select HOANeighborSignatureRequiredLst = new Select(HOANeighborSignatureRequired_Lst);
        HOANeighborSignatureRequiredLst.selectByVisibleText(HOANeighborSignatureRequired);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        HOAApproved_Textbox.sendKeys(HOAApproved);
        HOAApproved_Textbox.sendKeys(Keys.TAB);

        HighestRoofStory_Textbox.sendKeys(HighestRoofStory);
        City_Textbox.sendKeys(City);

        Select RoofingTypeLst = new Select(RoofingType_Lst);
        RoofingTypeLst.selectByVisibleText(RoofingType);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select AgeofRoofLst = new Select(AgeofRoof_Lst);
        AgeofRoofLst.selectByVisibleText(AgeofRoof);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select HOAAppSubmittedByLst = new Select(HOAAppSubmittedBy_Lst);
        HOAAppSubmittedByLst.selectByVisibleText(HOAAppSubmittedBy);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select ElectricalPEStampLst = new Select(ElectricalPEStamp_Lst);
        ElectricalPEStampLst.selectByVisibleText(ElectricalPEStamp);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

    }

    public void MonthlyUsage(String State,String AverageMonthlyElectricBill,String JanuaryUsage,String FebruaryUsage,String MarchUsage,String AprilUsage,String MayUsage,String JuneUsage, String JulyUsage, String AugustUsage,String SeptemberUsage,String OctoberUsage,String NovemberUsage )throws InterruptedException{

        Select StateLst = new Select(State_Lst);
        StateLst.selectByVisibleText(State);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select AverageMonthlyElectricBillLst = new Select(AverageMonthlyElectricBill_Lst);
        AverageMonthlyElectricBillLst.selectByVisibleText(AverageMonthlyElectricBill);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        JanuaryUsage_Textbox.sendKeys(JanuaryUsage);
        FebruaryUsage_Textbox.sendKeys(FebruaryUsage);
        MarchUsage_Textbox.sendKeys(MarchUsage);
        AprilUsage_Textbox.sendKeys(AprilUsage);
        MayUsage_Textbox.sendKeys(MayUsage);
        JuneUsage_Textbox.sendKeys(JuneUsage);
        JulyUsage_Textbox.sendKeys(JulyUsage);
        AugustUsage_Textbox.sendKeys(AugustUsage);
        SeptemberUsage_Textbox.sendKeys(SeptemberUsage);
        OctoberUsage_Textbox.sendKeys(OctoberUsage);
        NovemberUsage_Textbox.sendKeys(NovemberUsage);

        TestUtil.SelectRequiredObjectFromLookup("Zip-Utility", "Z-58419");
        TestUtil.SelectRequiredObjectFromLookup("Jurisdiction", "NV-COUNTY CLARK");

    }

    public void DesignInformation(String Readyfor, String SiteDesignPriority, String SiteDesignStatus) throws InterruptedException{

        Select ReadyforLst = new Select(Readyfor_Lst);
        ReadyforLst.selectByVisibleText(Readyfor);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        BrightBox_Checkbox.click();

        Select SiteDesignPriorityLst = new Select(SiteDesignPriority_Lst);
        SiteDesignPriorityLst.selectByVisibleText(SiteDesignPriority);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select SiteDesignStatusLst = new Select(SiteDesignStatus_Lst);
        SiteDesignStatusLst.selectByVisibleText(SiteDesignStatus);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

    }

    public void RetailLeadGeneration(String LeadCreatedDate) throws InterruptedException{

        LeadCreatedDate_Textbox.sendKeys(LeadCreatedDate);

        TestUtil.SelectRequiredObjectFromLookup("Lead Gen Partner", "LGCY Power, LLC");
        TestUtil.SelectRequiredObjectFromLookup("Partner for Lead Passing", "LGCY Power, LLC");

    }

    public void MarketAssignmentInfo() throws InterruptedException{

        TestUtil.SelectRequiredObjectFromLookup("Sales Partner", "LGCY Power, LLC");
        TestUtil.SelectRequiredObjectFromLookup("Market Assignment(Sales)", "MA-50984");

    }

    public void SystemInformation(String OpportunityName, String DealId,String MasterIDM,String OpportunitySourceType,String ExternalSource,String NationalBranchConstant,String ProspectId,String LocalBranchConstant,String LocalSystemSizeExponent,String OverheadPerWatt,String OverheadPerProject) throws InterruptedException{

        OpportunityName_Textbox.sendKeys(OpportunityName);
        DealId_Textbox.sendKeys(DealId);
        MasterIDM_Textbox.sendKeys(MasterIDM);

        Select OpportunitySourceTypeLst = new Select(OpportunitySourceType_Lst);
        OpportunitySourceTypeLst.selectByVisibleText(OpportunitySourceType);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        ExternalSource_Textbox.sendKeys(ExternalSource);
        NationalBranchConstant_Textbox.sendKeys(NationalBranchConstant);
        ProspectId_Textbox.sendKeys(ProspectId);
        LocalBranchConstant_Textbox.sendKeys(LocalBranchConstant);
        LocalSystemSizeExponent_Textbox.sendKeys(LocalSystemSizeExponent);
        OverheadPerWatt_Textbox.sendKeys(OverheadPerWatt);
        OverheadPerProject_Textbox.sendKeys(OverheadPerProject);

    }

    public void SiteAudit(String DatewhenSiteAuditwasScheduled,String SiteAuditScheduled,String SiteAuditCompleted){

        DatewhenSiteAuditwasScheduled_Textbox.sendKeys(DatewhenSiteAuditwasScheduled);
        DatewhenSiteAuditwasScheduled_Textbox.sendKeys(Keys.TAB);

        SiteAuditScheduled_Textbox.sendKeys(SiteAuditScheduled);
        SiteAuditScheduled_Textbox.sendKeys(Keys.TAB);

        SiteAuditCompleted_Textbox.sendKeys(SiteAuditCompleted);
        SiteAuditCompleted_Textbox.sendKeys(Keys.TAB);

    }

    public void OracleData(String JobType, String OracleDCWatts,String OracleProjectCreatedBy,String ProjectCreationDate,String PlansReviewedDate,String PlansCompletedDate, String JobCode, String ProjectStatus, String EstimatedConstructionStartDate)throws InterruptedException {
        JobType_Textbox.sendKeys(JobType);
        OracleDCWatts_Textbox.sendKeys(OracleDCWatts);
        OracleProjectCreatedBy_Textbox.sendKeys(OracleProjectCreatedBy);
        ProjectCreationDate_Textbox.sendKeys(ProjectCreationDate);
        ProjectCreationDate_Textbox.sendKeys(Keys.TAB);

        PlansReviewedDate_Textbox.sendKeys(PlansReviewedDate);
        PlansReviewedDate_Textbox.sendKeys(Keys.TAB);

        PlansCompletedDate_Textbox.sendKeys(PlansCompletedDate);
        PlansCompletedDate_Textbox.sendKeys(Keys.TAB);

        JobCode_Textbox.sendKeys(JobCode);

        Select ProjectStatusLst = new Select(ProjectStatus_Lst);
        ProjectStatusLst.selectByVisibleText(ProjectStatus);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        EstimatedConstructionStartDate_Textbox.sendKeys(EstimatedConstructionStartDate);
        EstimatedConstructionStartDate_Textbox.sendKeys(Keys.TAB);

    }

    public OpportunityDetailsPage AdditionalInformation(String AcquisitionChannel,String ForecastCategory,String InstallationOffice ) throws InterruptedException {
        Select AcquisitionChannelLst = new Select(AcquisitionChannel_Lst);
        AcquisitionChannelLst.selectByVisibleText(AcquisitionChannel);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select ForecastCategoryLst = new Select(ForecastCategory_Lst);
        ForecastCategoryLst.selectByVisibleText(ForecastCategory);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        InstallationOffice_Textbox.sendKeys(InstallationOffice);

        TestUtil.ClickOn(driver,SaveBtn,20);

        return new OpportunityDetailsPage();

    }

}