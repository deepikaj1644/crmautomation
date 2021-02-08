package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProposalEditPage extends TestBase {

    //InformationProposal Overview

    @FindBy(xpath = "//label[text()='Stage']/following::td[1]/span/select")
    WebElement Stage_Lst;

    @FindBy(xpath = "//label[text()='Deal Type']/following::td[1]/span/select")
    WebElement DealType_Lst;

    @FindBy(xpath = "//label[text()='Agreement Type']/following::td[1]/span/select")
    WebElement AgreementType_Lst;

    @FindBy(xpath = "//label[text()='Deposit']/following::td[1]/input")
    WebElement Deposit_Textbox;

    @FindBy(xpath = "//label[text()='Upfront Payment']/following::td[1]/div/input")
    WebElement UpfrontPayment_Textbox;

    @FindBy(xpath = "//label[text()='Upfront payment amount']/following::td[1]/input")
    WebElement UpfrontPaymentAmout_Textbox;

    @FindBy(xpath = "//label[text()='Year 1 Total Price per kWh']/following::td[1]/input")
    WebElement Year1TotalPriceperkWh_Textbox;

    @FindBy(xpath = "//label[text()='Avoided Cost of Power']/following::td[1]/input")
    WebElement AvoidedCostofPower_Textbox;

    @FindBy(xpath = "//label[text()='Actual Escalator']/following::td[1]/input")
    WebElement ActualEscalator_Textbox;

    @FindBy(xpath = "//label[text()='EPC Price per Watt']/following::td[1]/input")
    WebElement EPCPriceperWatt_Textbox;

    @FindBy(xpath = "//label[text()='Price/Watt for Pricing']/following::td[1]/input")
    WebElement PriceWattforPricing_Textbox;

    @FindBy(xpath = "//label[text()='Gross System Purchase Price']/following::td[1]/input")
    WebElement GrossSystemPurchasePrice_Textbox;

    @FindBy(xpath = "//label[text()='SREC Term']/following::td[1]/input")
    WebElement SRECTerm_Textbox;

    @FindBy(xpath = "//label[text()='Home Type']/following::td[1]/span/select")
    WebElement HomeType_Lst;

    @FindBy(xpath = "//label[text()='Prepay payment for electricity']/following::td[1]/input")
    WebElement Prepaypaymentforelectricity_Textbox;

    @FindBy(xpath = "//label[text()='Revised SR Signoff']/following::td[1]/span/input")
    WebElement RevisedSRSignoff_Textbox;

    @FindBy(xpath = "//label[text()='Product Type']/following::td[1]/span/select")
    WebElement ProductType_Lst;

    @FindBy(xpath = "//label[text()='Cost Stack']/following::td[1]/input")
    WebElement CostStack_Textbox;

    @FindBy(xpath = "//label[text()='Collect Rebate']/following::td[1]/input")
    WebElement CollectRebate_Checkbox;

    @FindBy(xpath = "//label[text()='Last Generated Proposal']/following::td[1]/input")
    WebElement LastGeneratedProposal_Checkbox;

    @FindBy(xpath = "//label[text()='ACH Fee Eligible']/following::td[1]/span/select")
    WebElement ACHFeeEligible_Lst;

    @FindBy(xpath = "//label[text()='TSRF']/following::td[1]/input")
    WebElement TSRF_Textbox;

    @FindBy(xpath = "//label[text()='Design Plan Review Required']/following::td[1]/input")
    WebElement DesignPlanReviewRequired_Checkbox;

    @FindBy(xpath = "//label[text()='Billing Type']/following::td[1]/input")
    WebElement BillingType_Textbox;

    @FindBy(xpath = "//label[text()='Roof_Warranty_Length']/following::td[1]/input")
    WebElement RoofWarrantyLength_Textbox;

    @FindBy(xpath = "//label[text()='PG Threshold %']/following::td[1]/input")
    WebElement PGThresholdPer_Textbox;

    @FindBy(xpath = "//label[text()='Parent Proposal Id']/following::td[1]/input")
    WebElement ParentProposalId_Textbox;

    @FindBy(xpath = "//label[text()='Billing Method']/following::td[1]/input")
    WebElement BillingMethod_Textbox;

    @FindBy(xpath = "//label[text()='Sunrun Credit Status']/following::td[1]/input")
    WebElement SunrunCreditStatus_Textbox;

    @FindBy(xpath = "//label[text()='Date Approved']/following::td[1]/span/input")
    WebElement DateApproved_Textbox;

    @FindBy(xpath = "//label[text()='External Id']/following::td[1]/input")
    WebElement ExternalId_Textbox;

    @FindBy(xpath = "//label[text()='Length of Agreement']/following::td[1]/input")
    WebElement LengthofAgreement_Textbox;

    @FindBy(xpath = "//label[text()='Turnkey Purchase Price']/following::td[1]/input")
    WebElement TurnkeyPurchasePrice_Textbox;

    @FindBy(xpath = "//label[text()='EPC Price']/following::td[1]/input")
    WebElement EPCPrice_Textbox;

    @FindBy(xpath = "//label[text()='Estimated GAAP Cost']/following::td[1]/input")
    WebElement EstimatedGAAPCost_Textbox;

    @FindBy(xpath = "//label[text()='Cash Purchase Price']/following::td[1]/input")
    WebElement CashPurchasePrice_Textbox;

    @FindBy(xpath = "//label[text()='Title Checked Date']/following::td[1]/span/input")
    WebElement TitleCheckedDate_Textbox;

    @FindBy(xpath = "//label[text()='SR Signoff']/following::td[1]/span/input")
    WebElement SRSignoff_Textbox;

    @FindBy(xpath = "//label[text()='EDP_Phase']/following::td[1]/span/select")
    WebElement EDPPhase_Lst;

    @FindBy(xpath = "//label[text()='Completed Approval Process']/following::td[1]/input")
    WebElement CompletedApprovalProcess_Checkbox;

    @FindBy(xpath = "//label[text()='Signed']/following::td[1]/input")
    WebElement Signed_Checkbox;

    //System Information (Overview)

    @FindBy(xpath = "//label[text()='System Size STC DC']/following::td[1]/div/input")
    WebElement SystemSizeSTCDC_Textbox;

    @FindBy(xpath = "//label[text()='Total No. Panels']/following::td[1]/input")
    WebElement TotalNoPanels_Textbox;

    @FindBy(xpath = "//label[text()='Number of Inverters']/following::td[1]/input")
    WebElement NumberofInverters_Textbox;

    @FindBy(xpath = "//label[text()='Number Of Arrays']/following::td[1]/input")
    WebElement NumberOfArrays_Textbox;

    @FindBy(xpath = "//label[text()='System Size CEC AC']/following::td[1]/input")
    WebElement SystemSizeCECAC_Textbox;

    @FindBy(xpath = "//label[text()='Year 1 Production for Pricing']/following::td[1]/input")
    WebElement Year1ProductionforPricing_Textbox;

    @FindBy(xpath = "//label[text()='Year 1 Production for Pricing']/following::td[1]/input")
    WebElement TotalProductionoverAgreementLength_Textbox;

    //Credit Information

    @FindBy(xpath = "//label[text()='Credit Status']/following::td[1]/span/select")
    WebElement CreditStatus_Lst;

    //Home Owner Information

    @FindBy(xpath = "//label[text()='Name']/following::td[1]/input")
    WebElement Name_Textbox;

    @FindBy(xpath = "//label[text()='Name on Title']/following::td[1]/input")
    WebElement NameOnTitle_Textbox;

    @FindBy(xpath = "//label[text()='Address']/following::td[1]/textarea")
    WebElement Address_Textarea;

    @FindBy(xpath = "//label[text()='Home Owner Type']/following::td[1]/span/select")
    WebElement HomeOwnerType_Lst;

    @FindBy(xpath = "//label[text()='Email']/following::td[1]/input")
    WebElement Email_Textbox;

    @FindBy(xpath = "//label[text()='Phone']/following::td[1]/input")
    WebElement Phone_Textbox;

    @FindBy(xpath = "//label[text()='Living Space Square Footage']/following::td[1]/input")
    WebElement LivingSpaceSquareFootage_Textbox;

    //Partner Information

    @FindBy(xpath = "//label[text()='Sales Rep. Name']/following::td[1]/input")
    WebElement SalesRepName_Textbox;

    @FindBy(xpath = "//label[text()='Sales Office']/following::td[1]/input")
    WebElement SalesOffice_Textbox;

    @FindBy(xpath = "//label[text()='Installation Price']/following::td[1]/input")
    WebElement InstallationPrice_Textbox;

    @FindBy(xpath = "//label[text()='Modules Price']/following::td[1]/input")
    WebElement ModulesPrice_Textbox;

    @FindBy(xpath = "//label[text()='Total Tax Amount']/following::td[1]/input")
    WebElement TotalTaxAmount_Textbox;

    @FindBy(xpath = "//label[text()='Sales Rep Email']/following::div[1]/input")
    WebElement SalesRepEmail_Textbox;

    @FindBy(xpath = "//label[text()='Sales Rep. Phone']/following::td[1]/input")
    WebElement SalesRepPhone_Textbox;

    @FindBy(xpath = "//label[text()='Power Electronic Price']/following::td[1]/input")
    WebElement PowerElectronicPrice_Textbox;

    //Utility Information

    @FindBy(xpath = "//label[text()='Utility']/following::td[1]/input")
    WebElement Utility_Textbox;

    @FindBy(xpath = "//label[text()='Annual kWh Usage']/following::td[1]/input")
    WebElement AnnualkWhUsage_Textbox;

    @FindBy(xpath = "//label[text()='Annual Pre-Solar Bill']/following::td[1]/input")
    WebElement AnnualPreSolarBill_Textbox;

    @FindBy(xpath = "//label[text()='Pre-Solar Rate schedule']/following::td[1]/input")
    WebElement PreSolarRateschedule_Textbox;

    @FindBy(xpath = "//label[text()='Post-Solar Rate schedule']/following::td[1]/input")
    WebElement PostSolarRateschedule_Textbox;

    @FindBy(xpath = "//label[text()='Year 1 post-solar monthly electric bill']/following::td[1]/input")
    WebElement Year1postsolarmonthlyelectricbill_Textbox;

    @FindBy(xpath = "//label[text()='Year 1 Annual Savings']/following::td[1]/input")
    WebElement Year1AnnualSavings_Textbox;

    @FindBy(xpath = "//label[text()='Utility Rate Escalator']/following::td[1]/input")
    WebElement UtilityRateEscalator_Textbox;

    @FindBy(xpath = "//label[text()='January kWh']/following::td[1]/input")
    WebElement JanuarykWh_Textbox;

    @FindBy(xpath = "//label[text()='February kWh']/following::td[1]/input")
    WebElement FebruarykWh_Textbox;

    @FindBy(xpath = "//label[text()='March kWh']/following::td[1]/input")
    WebElement MarchkWh_Textbox;

    @FindBy(xpath = "//label[text()='April kWh']/following::td[1]/input")
    WebElement AprilkWh_Textbox;

    @FindBy(xpath = "//label[text()='May kWh']/following::td[1]/input")
    WebElement MaykWh_Textbox;

    @FindBy(xpath = "//label[text()='June kWh']/following::td[1]/input")
    WebElement JunekWh_Textbox;

    @FindBy(xpath = "//label[text()='July kWh']/following::td[1]/input")
    WebElement JulykWh_Textbox;

    @FindBy(xpath = "//label[text()='August kWh']/following::td[1]/input")
    WebElement AugustkWh_Textbox;

    @FindBy(xpath = "//label[text()='September kWh']/following::td[1]/input")
    WebElement SeptemberkWh_Textbox;

    @FindBy(xpath = "//label[text()='October kWh']/following::td[1]/input")
    WebElement OctoberkWh_Textbox;

    @FindBy(xpath = "//label[text()='November kWh']/following::td[1]/input")
    WebElement NovemberkWh_Textbox;

    @FindBy(xpath = "//label[text()='December kWh']/following::td[1]/input")
    WebElement DecemberkWh_Textbox;


    //Information

    @FindBy(xpath = "//label[text()='Proposal ID']/following::td[1]/div/input")
    WebElement ProposalID_Textbox;

    @FindBy(xpath = "//label[text()='Proposal Name']/following::td[1]/input")
    WebElement ProposalName_Textbox;

    @FindBy(xpath = "//label[text()='Production Estimate Source']/following::td[1]/span/select")
    WebElement ProductionEstimateSource_Lst;

    @FindBy(xpath = "//label[text()='Highest Roof Story']/following::td[1]/input")
    WebElement HighestRoofStory_Textbox;

    @FindBy(xpath = "//label[text()='Mode Name']/following::td[1]/input")
    WebElement ModeName_Textbox;

    @FindBy(xpath = "//label[text()='Master ID-M']/following::td[1]/input")
    WebElement MasterIDM_Textbox;

    @FindBy(xpath = "//label[text()='Date Issued']/following::td[1]//span/input")
    WebElement DateIssued_Textbox;

    @FindBy(xpath = "//label[text()='Change Order?']/following::td[1]/input")
    WebElement ChangeOrder_Checkbox;

    @FindBy(xpath = "//label[text()='Create Workflow Project']/following::td[1]/input")
    WebElement CreateWorkflowProject_Checkbox;


    //Product Related Info

    @FindBy(xpath = "//label[text()='Guaranteed production to date']/following::td[1]/textarea")
    WebElement Guaranteedproductiontodate_Textarea;

    @FindBy(xpath = "//label[text()='Minimum Cash Purchase Price']/following::td[1]/textarea")
    WebElement MinimumCashPurchasePrice_Textarea;

    @FindBy(xpath = "//label[text()='TEYearlyDegradationArray']/following::td[1]/textarea")
    WebElement TEYearlyDegradationArray_Textarea;

    //COBF Information

    @FindBy(xpath = "//label[text()='Max Loan Amount']/following::td[1]/input")
    WebElement MaxLoanAmount_Textbox;

    @FindBy(xpath = "//label[text()='Dealer Fee %']/following::td[1]/input")
    WebElement DealerFeePer_Textbox;

    @FindBy(xpath = "//label[text()='Shopping Pass / ID']/following::td[1]/input")
    WebElement ShoppingPassID_Textbox;

    @FindBy(xpath = "//label[text()='Shopping Pass Expiration Month']/following::td/span/select")
    WebElement ShoppingPassExpirationMonth_Lst;

    @FindBy(xpath = "//label[text()='Required Loan Amount']/following::td[1]/input")
    WebElement RequiredLoanAmount_Textbox;

    @FindBy(xpath = "//label[text()='Sunrun Loan Draw Amount']/following::td[1]/input")
    WebElement SunrunLoanDrawAmount_Textbox;

    @FindBy(xpath = "//label[text()='Financing Term Length']/following::td[1]/span/select")
    WebElement FinancingTermLength_Lst;

    @FindBy(xpath = "//label[text()='Financing Institution']/following::td[1]/input")
    WebElement FinancingInstitution_Textbox;

    @FindBy(xpath = "//label[text()='CVV']/following::td[1]/input")
    WebElement CVV_Textbox;



    @FindBy(xpath="//input[@type='submit' and @name='save']")
    WebElement SaveBtn;


    public ProposalEditPage() {
        PageFactory.initElements(driver, this);
    }


    public void FillProposalOverview(String Stage,String DealType,String AgreementType,String Deposit,String UpfrontPayment,String UpfrontPaymentAmout,String Year1TotalPriceperkWh,String AvoidedCostofPower, String ActualEscalator,String EPCPriceperWatt,String PriceWattforPricing,String GrossSystemPurchasePrice,String SRECTerm,String HomeType,String Prepaypaymentforelectricity,String RevisedSRSignoff,String ProductType,String CostStack,String ACHFeeEligible,String TSRF,String BillingType,String RoofWarrantyLength,String PGThresholdPer,String ParentProposalId,String BillingMethod,String SunrunCreditStatus,String DateApproved,String ExternalId,String LengthofAgreement,String TurnkeyPurchasePrice ,String EPCPrice,String EstimatedGAAPCost,String CashPurchasePrice,String TitleCheckedDate,String SRSignoff,String EDPPhase) throws InterruptedException {

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Select StageLst = new Select(Stage_Lst);
        StageLst.selectByVisibleText(Stage);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select DealTypeLst = new Select(DealType_Lst);
        DealTypeLst.selectByVisibleText(DealType);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Select AgreementTypeLst = new Select(AgreementType_Lst);
        AgreementTypeLst.selectByVisibleText(AgreementType);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Deposit_Textbox.sendKeys(Deposit);
        UpfrontPayment_Textbox.sendKeys(UpfrontPayment);
        UpfrontPaymentAmout_Textbox.sendKeys(UpfrontPaymentAmout);
        Year1TotalPriceperkWh_Textbox.sendKeys(Year1TotalPriceperkWh);
        AvoidedCostofPower_Textbox.sendKeys(AvoidedCostofPower);
        ActualEscalator_Textbox.sendKeys(ActualEscalator);
        EPCPriceperWatt_Textbox.sendKeys(EPCPriceperWatt);
        PriceWattforPricing_Textbox.sendKeys(PriceWattforPricing);
        GrossSystemPurchasePrice_Textbox.sendKeys(GrossSystemPurchasePrice);
        SRECTerm_Textbox.sendKeys(SRECTerm);

        Select HomeTypeLst = new Select(HomeType_Lst);
        HomeTypeLst.selectByVisibleText(HomeType);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Prepaypaymentforelectricity_Textbox.sendKeys(Prepaypaymentforelectricity);
        RevisedSRSignoff_Textbox.sendKeys(RevisedSRSignoff);

        Select ProductTypeLst = new Select(ProductType_Lst);
        ProductTypeLst.selectByVisibleText(ProductType);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        CostStack_Textbox.sendKeys(CostStack);
        CollectRebate_Checkbox.click();
        LastGeneratedProposal_Checkbox.click();

        Select ACHFeeEligibleLst = new Select(ACHFeeEligible_Lst);
        ACHFeeEligibleLst.selectByVisibleText(ACHFeeEligible);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        TSRF_Textbox.sendKeys(TSRF);
        DesignPlanReviewRequired_Checkbox.click();

        BillingType_Textbox.sendKeys(BillingType);
        RoofWarrantyLength_Textbox.sendKeys(RoofWarrantyLength);
        PGThresholdPer_Textbox.sendKeys(PGThresholdPer);
        ParentProposalId_Textbox.sendKeys(ParentProposalId);
        BillingMethod_Textbox.sendKeys(BillingMethod);
        SunrunCreditStatus_Textbox.sendKeys(SunrunCreditStatus);
        DateApproved_Textbox.sendKeys(DateApproved);
        ExternalId_Textbox.sendKeys(ExternalId);
        LengthofAgreement_Textbox.sendKeys(LengthofAgreement);
        TurnkeyPurchasePrice_Textbox.sendKeys(TurnkeyPurchasePrice);
        EPCPrice_Textbox.sendKeys(EPCPrice);
        EstimatedGAAPCost_Textbox.sendKeys(EstimatedGAAPCost);
        CashPurchasePrice_Textbox.sendKeys(CashPurchasePrice);
        TitleCheckedDate_Textbox.sendKeys(TitleCheckedDate);
        SRSignoff_Textbox.sendKeys(SRSignoff);

        Select EDPPhaseLst = new Select(EDPPhase_Lst);
        EDPPhaseLst.selectByVisibleText(EDPPhase);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        CompletedApprovalProcess_Checkbox.click();
        Signed_Checkbox.click();

        TestUtil.SelectRequiredObjectFromLookup("Install Partner", "Sunrun");
        TestUtil.SelectRequiredObjectFromLookup("Sales Partner", "LGCY Power, LLC");
        TestUtil.SelectRequiredObjectFromLookup("Assignee", "SR Operations");

    }

    public boolean ValidateVisibilityofSaveButton()
    {
        TestUtil.WaitForElementToBeVisible(driver,SaveBtn,50);
        return SaveBtn.isDisplayed();
    }

    public void SystemInformation(String SystemSizeSTCDC,String TotalNoPanels,String NumberofInverters,String NumberOfArrays,String SystemSizeCECAC,String Year1ProductionforPricing,String TotalProductionoverAgreementLength) throws InterruptedException {

        SystemSizeSTCDC_Textbox.sendKeys(SystemSizeSTCDC);
        TotalNoPanels_Textbox.sendKeys(TotalNoPanels);
        NumberofInverters_Textbox.sendKeys(NumberofInverters);
        NumberOfArrays_Textbox.sendKeys(NumberOfArrays);
        SystemSizeCECAC_Textbox.sendKeys(SystemSizeCECAC);
        Year1ProductionforPricing_Textbox.sendKeys(Year1ProductionforPricing);
        TotalProductionoverAgreementLength_Textbox.sendKeys( TotalProductionoverAgreementLength);

    }

    public void CreditInformation(String CreditStatus) throws InterruptedException {

        Select CreditStatusLst = new Select(CreditStatus_Lst);
        CreditStatusLst.selectByVisibleText(CreditStatus);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

    }

    public void HomeownerInformation(String Name,String NameOnTitle,String Address,String HomeOwnerType,String Email,String Phone,String LivingSpaceSquareFootage) throws InterruptedException {

        Name_Textbox.sendKeys(Name);
        NameOnTitle_Textbox.sendKeys(NameOnTitle);
        Address_Textarea.sendKeys(Address);

        Select HomeOwnerTypeLst = new Select(HomeOwnerType_Lst);
        HomeOwnerTypeLst.selectByVisibleText(HomeOwnerType);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        Email_Textbox.sendKeys(Email);
        Phone_Textbox.sendKeys(Phone);

        LivingSpaceSquareFootage_Textbox.sendKeys(LivingSpaceSquareFootage);

    }

    public void PartnerInformation(String SalesRepName,String SalesOffice,String InstallationPrice,String ModulesPrice,String TotalTaxAmount,String SalesRepEmail,String SalesRepPhone,String PowerElectronicPrice) throws InterruptedException {

        SalesRepName_Textbox.sendKeys(SalesRepName);
        SalesOffice_Textbox.sendKeys(SalesOffice);
        InstallationPrice_Textbox.sendKeys(InstallationPrice);
        ModulesPrice_Textbox.sendKeys(ModulesPrice);
        TotalTaxAmount_Textbox.sendKeys(TotalTaxAmount);
        SalesRepEmail_Textbox.sendKeys(SalesRepEmail);
        SalesRepPhone_Textbox.sendKeys(SalesRepPhone);
        PowerElectronicPrice_Textbox.sendKeys(PowerElectronicPrice);

    }

    public void UtilityInformation(String Utility,String AnnualkWhUsage,String AnnualPreSolarBill,String PreSolarRateschedule,String PostSolarRateschedule,String Year1postsolarmonthlyelectricbill, String Year1AnnualSavings,String UtilityRateEscalator,String JanuarykWh,String FebruarykWh,String MarchkWh,String AprilkWh,String MaykWh,String JunekWh,String JulykWh,String AugustkWh,String SeptemberkWh,String OctoberkWh,String NovemberkWh,String DecemberkWh ) throws InterruptedException {

        Utility_Textbox.sendKeys(Utility);
        AnnualkWhUsage_Textbox.sendKeys(AnnualkWhUsage);
        AnnualPreSolarBill_Textbox.sendKeys(AnnualPreSolarBill);
        PreSolarRateschedule_Textbox.sendKeys(PreSolarRateschedule);
        PostSolarRateschedule_Textbox.sendKeys(PostSolarRateschedule);
        Year1postsolarmonthlyelectricbill_Textbox.sendKeys(Year1postsolarmonthlyelectricbill);
        Year1AnnualSavings_Textbox.sendKeys(Year1AnnualSavings);
        UtilityRateEscalator_Textbox.sendKeys(UtilityRateEscalator);
        JanuarykWh_Textbox.sendKeys(JanuarykWh);
        FebruarykWh_Textbox.sendKeys(FebruarykWh);
        MarchkWh_Textbox.sendKeys(MarchkWh);
        AprilkWh_Textbox.sendKeys(AprilkWh);
        MaykWh_Textbox.sendKeys(MaykWh);
        JunekWh_Textbox.sendKeys(JunekWh);
        JulykWh_Textbox.sendKeys(JulykWh);
        AugustkWh_Textbox.sendKeys(AugustkWh);
        SeptemberkWh_Textbox.sendKeys(SeptemberkWh);
        OctoberkWh_Textbox.sendKeys(OctoberkWh);
        NovemberkWh_Textbox.sendKeys(NovemberkWh);
        DecemberkWh_Textbox.sendKeys(DecemberkWh);

    }

    public void Information(String ProposalID,String ProposalName,String ProductionEstimateSource,String HighestRoofStory,String ModeName,String DateIssued) throws InterruptedException {

        ProposalID_Textbox.sendKeys(ProposalID);
        ProposalName_Textbox.sendKeys(ProposalName);

        Select ProductionEstimateSourceLst = new Select(ProductionEstimateSource_Lst);
        ProductionEstimateSourceLst.selectByVisibleText(ProductionEstimateSource);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        HighestRoofStory_Textbox.sendKeys(HighestRoofStory);
        ModeName_Textbox.sendKeys(ModeName);
        //MasterIDM_Textbox.sendKeys(MasterIDM);
        DateIssued_Textbox.sendKeys(DateIssued);
        ChangeOrder_Checkbox.click();

        TestUtil.SelectRequiredObjectFromLookup("Opportunity", "Auto14Demo27370 Silent Water Way-89149");


    }


    public void ProductRelatedInformation(String Guaranteedproductiontodate,String MinimumCashPurchasePrice,String TEYearlyDegradationArray) throws InterruptedException {

        Guaranteedproductiontodate_Textarea.sendKeys(Guaranteedproductiontodate);
        MinimumCashPurchasePrice_Textarea.sendKeys(MinimumCashPurchasePrice);
        TEYearlyDegradationArray_Textarea.sendKeys(TEYearlyDegradationArray);

    }

    public ProposalDetailsPage COBFInformation(String MaxLoanAmount,String DealerFeePer,String ShoppingPassID,String ShoppingPassExpirationMonth,String RequiredLoanAmount,String SunrunLoanDrawAmount,String FinancingTermLength,String FinancingInstitution,String CVV) throws InterruptedException {

        MaxLoanAmount_Textbox.sendKeys(MaxLoanAmount);
        DealerFeePer_Textbox.sendKeys(DealerFeePer);
        ShoppingPassID_Textbox.sendKeys(ShoppingPassID);

        Select ShoppingPassExpirationMonthLst = new Select(ShoppingPassExpirationMonth_Lst);
        ShoppingPassExpirationMonthLst.selectByVisibleText(ShoppingPassExpirationMonth);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        RequiredLoanAmount_Textbox.sendKeys(RequiredLoanAmount);
        SunrunLoanDrawAmount_Textbox.sendKeys(SunrunLoanDrawAmount);

        Select FinancingTermLengthLst = new Select(FinancingTermLength_Lst);
        FinancingTermLengthLst.selectByVisibleText(FinancingTermLength);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        FinancingInstitution_Textbox.sendKeys(FinancingInstitution);
        CVV_Textbox.sendKeys(CVV);

        TestUtil.ClickOn(driver,SaveBtn,20);

        return new ProposalDetailsPage();

    }


    public void CreateNewProject() throws InterruptedException {
        TestUtil.WaitForElementToBeClickable(driver,CreateWorkflowProject_Checkbox,20000);
        TestUtil.ScrollIntoView(CreateWorkflowProject_Checkbox,driver);
        TestUtil.Sleep(2);
        CreateWorkflowProject_Checkbox.click();
        TestUtil.Sleep(3);
        TestUtil.ClickOn(driver,SaveBtn,20);
        TestUtil.Sleep(3);
    }






}
