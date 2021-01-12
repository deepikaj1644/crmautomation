package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class ServiceContractEditPage extends TestBase {

    @FindBy(xpath="(//label[text()='Install Date']/following::td/span/input)[1]")
    WebElement InstallDate_Textbox;

    @FindBy(xpath="(//label[text()='Roof Warranty Length']/following::td/input)[1]")
    WebElement RoofLenght_Textbox;

    @FindBy(xpath="(//label[text()='System Activation Date']/following::td/span/input)[1]")
    WebElement SystemDate_Textbox;

    @FindBy(xpath="(//label[text()='PG Threshold %']/following::td/input)[1]")
    WebElement Threshold_Textbox;

    @FindBy(xpath="(//label[text()='PG Yearly Payment Cadence']/following::td/input)[1]")
    WebElement YearlyPayment_Textbox;

    @FindBy(xpath="(//label[text()='Energy Storage Price']/following::td/input)[1]")
    WebElement EnergyStorage_Textbox;

    @FindBy(xpath="(//label[text()='Lease Payment Amount After Step Down']/following::td/input)[1]")
    WebElement LeasePayment_Textbox;

    @FindBy(xpath="(//label[text()='Step Down Month']/following::td/input)[1]")
    WebElement StepDownMonth_Textbox;

    @FindBy(xpath="(//label[text()='Step Down Product']/following::td/input)[1]")
    WebElement StepDownProduct_Textbox;

    @FindBy(xpath="(//label[text()='Safe Harbor Fulfillment Type']/following::td/span/select)[1]")
    WebElement SafeHarbor_Lst;

    @FindBy(xpath="(//label[text()='Equipment Order Threshold']/following::td/span/select)[1]")
    WebElement EquipmentOrder_Lst;

    @FindBy(xpath="(//label[text()='Status']/following::td/span/select)[1]")
    WebElement Status_Lst;

    @FindBy(xpath="(//label[text()='TE Fund Name']/following::td/span/select)[1]")
    WebElement TEFund_Lst;

    @FindBy(xpath="(//label[text()='In TE Fund']/following::td/span/input)[1]")
    WebElement InTEFund_Textbox;

    @FindBy(xpath="(//label[text()='Agreement Number']/following::td/input)[1]")
    WebElement AgreementNo_Textbox;

    @FindBy(xpath="(//label[text()='Contract Name']/following::div/input)[1]")
    WebElement ContractName_Textbox;

    @FindBy(xpath="(//label[text()='Deal ID']/following::td/input)[1]")
    WebElement DealID_Textbox;

    @FindBy(xpath="(//label[text()='Master ID-M']/following::td/input)[1]")
    WebElement MasterID_Textbox;

    @FindBy(xpath="(//label[text()='C1 Terms']/following::td/input)[1]")
    WebElement C1Terms_Textbox;

    @FindBy(xpath="(//label[text()='C2 Terms']/following::td/input)[1]")
    WebElement C2Terms_Textbox;

    @FindBy(xpath="(//label[text()='C3 Terms']/following::td/input)[1]")
    WebElement C3Terms_Textbox;

    @FindBy(xpath="(//label[text()='Cost Stack']/following::td/input)[1]")
    WebElement CostStack_Textbox;

    @FindBy(xpath="(//label[text()='Collect Rebate']//following::td/input)[1]")
    WebElement CollectRebate_Checkbox;

    @FindBy(xpath="(//label[text()='Original Proposal Submitted By Email']/following::td/input)[1]")
    WebElement OrgProSubEmail_Textbox;

    @FindBy(xpath="(//label[text()='SOW Photos']/following::td/input)[1]")
    WebElement SOWPhotos_Textbox;

    @FindBy(xpath="(//label[text()='Field Service Photos']/following::td/input)[1]")
    WebElement FSPhotos_Textbox;

    @FindBy(xpath="(//label[text()='Installation Photos']/following::td/input)[1]")
    WebElement InstallPhotos_Textbox;

    @FindBy(xpath="(//label[text()='Quality Photos']/following::td/input)[1]")
    WebElement QualityPhotos_Textbox;

    @FindBy(xpath="(//label[text()='Agreement Type']/following::td/span/select)[1]")
    WebElement AgreementType_Lst;

    @FindBy(xpath="(//label[text()='Product Type']/following::td/span/select)[1]")
    WebElement ProductType_Lst;

    @FindBy(xpath="(//label[text()='EPC Price']/following::td/input)[1]")
    WebElement EPCPrice_Textbox;

    @FindBy(xpath="(//label[text()='EPC price per watt']/following::td/input)[1]")
    WebElement EPCPriceWatt_Textbox;

    @FindBy(xpath="(//label[text()='Agreement Term Years']/following::td/input)[1]")
    WebElement AgreeTermYears_Textbox;

    @FindBy(xpath="(//label[text()='20 Year Estimated Generation']/following::td/input)[1]")
    WebElement Years20EstiGener_Textbox;

    @FindBy(xpath="(//label[text()='Est Yr 1 Generation']/following::td/input)[1]")
    WebElement ESTYr1Gen_Textbox;

    @FindBy(xpath="(//label[text()='Utility Company']/following::td/span/select)[1]")
    WebElement UtilityComp_Lst;

    @FindBy(xpath="(//label[text()='Price per kWh']/following::td/input)[1]")
    WebElement PPKWh_Textbox;

    @FindBy(xpath="(//label[text()='Full System cost']/following::td/input)[1]")
    WebElement FullSysCost_Textbox;

    @FindBy(xpath="(//label[text()='Installation Type']/following::td/span/select)[1]")
    WebElement IntsallType_Lst;

    @FindBy(xpath="(//label[text()='Total Solar Prepay Required']/following::td/input)[1]")
    WebElement SolarPrepay_CheckBox;

    @FindBy(xpath="(//label[text()='Sales Organization (text)']/following::td/input)[1]")
    WebElement SalesOrgTxt_Textbox;

    @FindBy(xpath="(//label[text()='Install Partner (text)']/following::td/input)[1]")
    WebElement InstallPartTxt_Textbox;

    @FindBy(xpath="(//label[text()='Install Partner (text)']/following::td/input)[1]")
    WebElement OrigSysSize_Textbox;

    @FindBy(xpath="(//label[text()='Billing Method']/following::td/span/select)[1]")
    WebElement BillingMeth_Lst;

    @FindBy(xpath="(//label[text()='Billing Notification Preference']/following::td/span/select)[1]")
    WebElement BillingNotifPref_Lst;

    @FindBy(xpath="(//label[text()='Billing Type']/following::td/span/select)[1]")
    WebElement BillingType_Lst;

    @FindBy(xpath="(//label[text()='Prepay Amount']/following::td/input)[1]")
    WebElement PrepayAmount_Textbox;

    @FindBy(xpath="(//label[text()='Estimated GAAP Cost']/following::td/input)[1]")
    WebElement GAApCost_Textbox;

    @FindBy(xpath="(//label[text()='Annual Monthly Payment Escalator']/following::td/input)[1]")
    WebElement AnnualPayment_Textbox;

    @FindBy(xpath="(//label[text()='Average Monthly Electricity Usage']/following::td/input)[1]")
    WebElement AnnualElectricity_Textbox;

    @FindBy(xpath="(//label[text()='Yr 1 Avoided Power Cost']/following::td/input)[1]")
    WebElement YrAvoidedPowerCost_Textbox;

    @FindBy(xpath="(//label[text()='Base Lease Payment Amount']/following::td/input)[1]")
    WebElement BaseLeasePaymentAmount_Textbox;

    @FindBy(xpath="(//label[text()='Year 1 Monthly Battery Bill']/following::td/input)[1]")
    WebElement YearMonthlyBatteryBill_Textbox;

    @FindBy(xpath="(//label[text()='Year 1 Monthly Solar Bill']/following::td/input)[1]")
    WebElement YearMonthlySolarBill_Textbox;

    @FindBy(xpath="(//label[text()='Year 1 Solar Price per kWh']/following::td/input)[1]")
    WebElement YearSolarPriceperkWh_Textbox;

    @FindBy(xpath="(//label[text()='Gift Card Amount']/following::td/input)[1]")
    WebElement GiftCardAmount_Textbox;

    @FindBy(xpath="(//label[text()='Power Electronic Price']/following::td/input)[1]")
    WebElement PowerElectronicPrice_Textbox;

    @FindBy(xpath="(//label[text()='Installation Price']/following::td/input)[1]")
    WebElement InstallationPrice_Textbox;

    @FindBy(xpath="(//label[text()='Modules Price']/following::td/input)[1]")
    WebElement ModulesPrice_Textbox;

    @FindBy(xpath="(//label[text()='Tax Amount']/following::td/input)[1]")
    WebElement TaxAmount_Textbox;

    @FindBy(xpath="(//label[text()='Monthly solar prod ratio']/following::td/textarea)[1]")
    WebElement Monthlysolarprodratio_Textarea;

    @FindBy(xpath="(//label[text()='Description']/following::td/textarea)[1]")
    WebElement Description_Textarea;

    @FindBy(xpath="(//label[text()='SR Approved Monthly solar prod ratio']/following::td/textarea)[1]")
    WebElement SRApprovedMonthly_Textarea;

    @FindBy(xpath="(//label[text()='Max Loan Amount']/following::td/input)[1]")
    WebElement MaxLoanAmount_Textbox;

    @FindBy(xpath="(//label[text()='Dealer Fee%']/following::td/input)[1]")
    WebElement DealerFee_Textbox;

    @FindBy(xpath="(//label[text()='Financing Institution']/following::td/input)[1]")
    WebElement FinancingInstitution_Textbox;

    @FindBy(xpath="(//label[text()='ACH Fee Eligible']/following::td/span/select)[1]")
    WebElement ACHFeeEligible_Lst;

    @FindBy(xpath="(//label[text()='Approval Status']/following::td/span/select)[1]")
    WebElement ApprovalStatus_Lst;

    @FindBy(xpath="(//label[text()='M1 Terms']/following::td/input)[1]")
    WebElement M1Terms_Textbox;

    @FindBy(xpath="(//label[text()='M2 Terms']/following::td/input)[1]")
    WebElement M2Terms_Textbox;

    @FindBy(xpath="(//label[text()='M3 Terms']/following::td/input)[1]")
    WebElement M3Terms_Textbox;

    @FindBy(xpath="(//label[text()='Buyout per Watt']/following::td/input)[1]")
    WebElement BuyoutperWatt_Textbox;

    @FindBy(xpath="(//label[text()='Original Full System Cost']/following::td/input)[1]")
    WebElement OriginalFullSystemCost_Textbox;

    @FindBy(xpath="(//label[text()='Original Price per kWh']/following::td/input)[1]")
    WebElement OriginalPriceperkWh_Textbox;

    @FindBy(xpath="(//label[text()='Original Yr 1 Gen']/following::td/input)[1]")
    WebElement OriginalYrGen_Textbox;

    @FindBy(xpath="(//label[text()='Customer Origination Fee Part 2 per W']/following::td/input)[1]")
    WebElement CustomerOriginationFeePartperW_Textbox;

    @FindBy(xpath="(//label[text()='End Date']/following::span/input)[1]")
    WebElement EndDate_Textbox;

    @FindBy(xpath="(//label[text()='Performance guarantee commence year']/following::td/input)[1]")
    WebElement Performancecommenceyear_Textbox;

    @FindBy(xpath="(//label[text()='Partner Office']/following::td/input)[1]")
    WebElement PartnerOffice_Textbox;

    @FindBy(xpath="(//label[text()='Prepay Discount Rate']/following::td/input)[1]")
    WebElement PrepayDiscountRate_Textbox;

    @FindBy(xpath="(//label[text()='Prepay payment for electricity']/following::td/input)[1]")
    WebElement Prepaypaymentforelectricity_Textbox;

    @FindBy(xpath="(//label[text()='Home Type']/following::td/span/select)[1]")
    WebElement HomeType_Lst;

    @FindBy(xpath="(//label[text()='Home Type on Title']/following::td/span/select)[1]")
    WebElement HomeTypeonTitle_Lst;

    @FindBy(xpath="(//label[text()='Production Estimate Source']/following::td/input)[1]")
    WebElement ProductionEstimateSource_Textbox;

    @FindBy(xpath="(//label[text()='Production Estimate Source']/following::td/input)[1]")
    WebElement ProductionEstimateSourceAdjustRatio_Textbox;

    @FindBy(xpath="(//label[text()='Service Contract Status']/following::td/span/select)[1]")
    WebElement ServiceContractStatus_Lst;

    @FindBy(xpath="(//label[text()='SO M1 terms']/following::td/input)[1]")
    WebElement SOM1terms_Textbox;

    @FindBy(xpath="(//label[text()='SO M2 terms']/following::td/input)[1]")
    WebElement SOM2terms_Textbox;

    @FindBy(xpath="(//label[text()='SO M3 terms']/following::td/input)[1]")
    WebElement SOM3terms_Textbox;

    @FindBy(xpath="(//label[text()='SR panel derate']/following::td/input)[1]")
    WebElement SRpanelderate_Textbox;

    @FindBy(xpath="(//label[text()='Start Date']/following::span/input)[1]")
    WebElement StartDate_Textbox;

    @FindBy(xpath="(//label[text()='Shopping Pass']/following::td/input)[1]")
    WebElement ShoppingPass_Textbox;

    @FindBy(xpath="(//label[text()='Required Loan Amount']/following::td/input)[1]")
    WebElement RequiredLoanAmount_Textbox;

    @FindBy(xpath="(//label[text()='Sunrun Loan Draw Amount']/following::td/input)[1]")
    WebElement SunrunLoanDrawAmount_Textbox;

    @FindBy(xpath="(//label[text()='ITC SH Actual Program']/following::td/span/select)[1]")
    WebElement ITCSHAct_Lst;

    @FindBy(xpath="(//label[text()='ITC SH Target Program']/following::td/span/select)[1]")
    WebElement ITCSHTar_Lst;

    @FindBy(xpath="(//label[text()='Guaranteed production to date']/following::td/textarea)[1]")
    WebElement GuaranteedProdToDate_Textarea;

    @FindBy(xpath="(//label[text()='TEYearlyDegradationArray']/following::td/textarea)[1]")
    WebElement TEYearlyDegradationArray_Textarea;

    @FindBy(xpath="(//label[text()='RelatedObjects Last Modified Date']/following::span/input)[1]")
    WebElement RelatedObjectsLMDate_Textbox;

    @FindBy(xpath="(//label[text()='Installation Coordinator Email']/following::td/input)[1]")
    WebElement InstallCoordinatorEmail_Textbox;

    @FindBy(xpath="(//label[text()='Installation Coordinator Phone']/following::td/input)[1]")
    WebElement InstallCoordinatorPhone_Textbox;

    @FindBy(xpath="//input[@type='submit' and @name='save']")
    WebElement SaveBtn;



    public ServiceContractEditPage()
    {
        PageFactory.initElements(driver, this);
    }

    public ServiceContractDetailsPage CreateNewServiceContract(String InstallDate, String RoofLenght, String SystemDate,	String Threshold,	String YearlyPayment,	String EnergyStorage,	String LeasePayment,	String StepDownMonth,	String StepDownProduct,	String SafeHarbor,	String EquipmentOrder,	String Status,	String TEFund,	String InTEFund,	String AgreementNo,	String ContractName,	String DealID,	String MasterID,	String C1Terms,	String C2Terms,	String C3Terms,	String CostStack,	String OrgProSubEmail,	String SOWPhotos,	String FSPhotos,	String InstallPhotos,	String QualityPhotos,	String AgreementType,	String ProductType,	String EPCPrice,	String EPCPriceWatt,	String AgreeTermYears,	String Years20EstiGener,	String ESTYr1Gen,	String UtilityComp,	String PPKWh,	String FullSysCost,	String IntsallType,	String SalesOrgTxt,	String InstallPartTxt,	String OrigSysSize,	String BillingMeth,	String BillingNotifPref,	String BillingType,	String PrepayAmount,	String GAApCost,	String AnnualPayment,	String AnnualElectricity,	String YrAvoidedPowerCost,	String BaseLeasePaymentAmount,	String YearMonthlyBatteryBill,	String YearMonthlySolarBill,	String YearSolarPriceperkWh,	String GiftCardAmount,	String PowerElectronicPrice,	String InstallationPrice,	String ModulesPrice,	String TaxAmount,	String Monthlysolarprodratio,	String Description,	String SRApprovedMonthly,	String MaxLoanAmount,	String DealerFee,	String FinancingInstitution,	String ACHFeeEligible,	String ApprovalStatus,	String M1Terms,	String M2Terms,	String M3Terms,	String BuyoutperWatt,	String OriginalFullSystemCost,	String OriginalPriceperkWh,	String OriginalYrGen,	String CustomerOriginationFeePartperW,	String EndDate,	String Performancecommenceyear,	String PartnerOffice,	String PrepayDiscountRate,	String Prepaypaymentforelectricity,	String HomeType,	String HomeTypeonTitle,	String ProductionEstimateSource,	String ProductionEstimateSourceAdjustRatio,	String ServiceContractStatus,	String SOM1terms,	String SOM2terms,	String SOM3terms,	String SRpanelderate,	String StartDate,	String ShoppingPass,	String RequiredLoanAmount,	String SunrunLoanDrawAmount,	String ITCSHAct,	String ITCSHTar,	String GuaranteedProdToDate,	String TEYearlyDegradationArray,	String RelatedObjectsLMDate,	String InstallCoordinatorEmail,	String InstallCoordinatorPhone) throws InterruptedException {

        TestUtil.SelectRequiredObjectFromLookup("Opportunity","7370 Silent Water Way-89149");
        TestUtil.SelectRequiredObjectFromLookup("Proposal","PK3KN99ZN196:001-K");
        TestUtil.SelectRequiredObjectFromLookup("Account Name","7370 Silent Water Way-89149");
        TestUtil.SelectRequiredObjectFromLookup("Contact Name","Kathy Reaves");
        TestUtil.SelectRequiredObjectFromLookup("Install Partner","Las Vegas");
        TestUtil.SelectRequiredObjectFromLookup("Sales Organization","LGCY Power, LLC");
        TestUtil.SelectRequiredObjectFromLookup("Installed By","Las Vegas");
        TestUtil.SelectRequiredObjectFromLookup("Installation Coordinator","Laura Wood");

        InstallDate_Textbox.sendKeys(InstallDate);
        RoofLenght_Textbox.sendKeys(RoofLenght);
        SystemDate_Textbox.sendKeys(SystemDate);
        SystemDate_Textbox.sendKeys(Keys.TAB);

        Threshold_Textbox.sendKeys(Threshold);
        YearlyPayment_Textbox.sendKeys(YearlyPayment);
        EnergyStorage_Textbox.sendKeys(EnergyStorage);
        LeasePayment_Textbox.sendKeys(LeasePayment);
        StepDownMonth_Textbox.sendKeys(StepDownMonth);
        StepDownProduct_Textbox.sendKeys(StepDownProduct);

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Select SafeHarborLst = new Select(SafeHarbor_Lst);
        SafeHarborLst.selectByVisibleText(SafeHarbor);

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Select EquipmentOrderLst = new Select(EquipmentOrder_Lst);
        EquipmentOrderLst.selectByVisibleText(EquipmentOrder);

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Select StatusLst = new Select(Status_Lst);
        StatusLst.selectByVisibleText(Status);

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Select TEFundLst = new Select(TEFund_Lst);
        TEFundLst.selectByVisibleText(TEFund);

        InTEFund_Textbox.sendKeys(InTEFund);
        AgreementNo_Textbox.sendKeys(AgreementNo);
        ContractName_Textbox.sendKeys(ContractName);
        DealID_Textbox.sendKeys(DealID);
        MasterID_Textbox.sendKeys(MasterID);
        C1Terms_Textbox.sendKeys(C1Terms);
        C2Terms_Textbox.sendKeys(C2Terms);
        C3Terms_Textbox.sendKeys(C3Terms);
        CostStack_Textbox.sendKeys(CostStack);
        CollectRebate_Checkbox.click();
        OrgProSubEmail_Textbox.sendKeys(OrgProSubEmail);
        SOWPhotos_Textbox.sendKeys(SOWPhotos);
        FSPhotos_Textbox.sendKeys(FSPhotos);
        InstallPhotos_Textbox.sendKeys(InstallPhotos);
        QualityPhotos_Textbox.sendKeys(QualityPhotos);
        AgreementType_Lst.sendKeys(AgreementType);

        TestUtil.Sleep(TestUtil.SMALL_WAIT_TIME);
        Select ProductTypeLst = new Select(ProductType_Lst);
        ProductTypeLst.selectByVisibleText(ProductType);


        EPCPrice_Textbox.sendKeys(EPCPrice);
        EPCPriceWatt_Textbox.sendKeys(EPCPriceWatt);
        AgreeTermYears_Textbox.sendKeys(AgreeTermYears);
        Years20EstiGener_Textbox.sendKeys(Years20EstiGener);
        ESTYr1Gen_Textbox.sendKeys(ESTYr1Gen);

        TestUtil.Sleep(TestUtil.SMALL_WAIT_TIME);
        Select UtilityCompLst = new Select(UtilityComp_Lst);
        //ProductTypeLst.selectByVisibleText(UtilityComp);
        UtilityCompLst.selectByValue(UtilityComp);


        PPKWh_Textbox.sendKeys(PPKWh);
        FullSysCost_Textbox.sendKeys(FullSysCost);
        IntsallType_Lst.sendKeys(IntsallType);
        SolarPrepay_CheckBox.click();
        SalesOrgTxt_Textbox.sendKeys(SalesOrgTxt);
        InstallPartTxt_Textbox.sendKeys(InstallPartTxt);
        OrigSysSize_Textbox.sendKeys(OrigSysSize);

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Select BillingMethLst = new Select(BillingMeth_Lst);
        BillingMethLst.selectByVisibleText(BillingMeth);

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Select BillingNotifPrefLST = new Select(BillingNotifPref_Lst);
        BillingNotifPrefLST.selectByVisibleText(BillingNotifPref);

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Select BillingTypeLst = new Select(BillingType_Lst);
        BillingTypeLst.selectByVisibleText(BillingType);


        PrepayAmount_Textbox.sendKeys(PrepayAmount);
        GAApCost_Textbox.sendKeys(GAApCost);
        AnnualPayment_Textbox.sendKeys(AnnualPayment);
        AnnualElectricity_Textbox.sendKeys(AnnualElectricity);
        YrAvoidedPowerCost_Textbox.sendKeys(YrAvoidedPowerCost);
        BaseLeasePaymentAmount_Textbox.sendKeys(BaseLeasePaymentAmount);
        YearMonthlyBatteryBill_Textbox.sendKeys(YearMonthlyBatteryBill);
        YearMonthlySolarBill_Textbox.sendKeys(YearMonthlySolarBill);
        YearSolarPriceperkWh_Textbox.sendKeys(YearSolarPriceperkWh);
        GiftCardAmount_Textbox.sendKeys(GiftCardAmount);
        PowerElectronicPrice_Textbox.sendKeys(PowerElectronicPrice);
        InstallationPrice_Textbox.sendKeys(InstallationPrice);
        ModulesPrice_Textbox.sendKeys(ModulesPrice);
        TaxAmount_Textbox.sendKeys(TaxAmount);
        Monthlysolarprodratio_Textarea.sendKeys(Monthlysolarprodratio);
        Description_Textarea.sendKeys(Description);
        SRApprovedMonthly_Textarea.sendKeys(SRApprovedMonthly);
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        SRApprovedMonthly_Textarea.sendKeys(Keys.TAB);

        MaxLoanAmount_Textbox.clear();
        MaxLoanAmount_Textbox.click();
        MaxLoanAmount_Textbox.sendKeys(MaxLoanAmount);
        DealerFee_Textbox.sendKeys(DealerFee);
        FinancingInstitution_Textbox.sendKeys(FinancingInstitution);

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Select ACHFeeEligibleLst = new Select(ACHFeeEligible_Lst);
        ACHFeeEligibleLst.selectByVisibleText(ACHFeeEligible);

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Select ApprovalStatusLst = new Select(ApprovalStatus_Lst);
        ApprovalStatusLst.selectByVisibleText(ApprovalStatus);

        M1Terms_Textbox.sendKeys(M1Terms);
        M2Terms_Textbox.sendKeys(M2Terms);
        M3Terms_Textbox.sendKeys(M3Terms);
        BuyoutperWatt_Textbox.sendKeys(BuyoutperWatt);
        OriginalFullSystemCost_Textbox.sendKeys(OriginalFullSystemCost);
        OriginalPriceperkWh_Textbox.sendKeys(OriginalPriceperkWh);
        OriginalYrGen_Textbox.sendKeys(OriginalYrGen);
        CustomerOriginationFeePartperW_Textbox.sendKeys(CustomerOriginationFeePartperW);
        EndDate_Textbox.sendKeys(EndDate);
        Performancecommenceyear_Textbox.sendKeys(Performancecommenceyear);
        PartnerOffice_Textbox.sendKeys(PartnerOffice);
        PrepayDiscountRate_Textbox.sendKeys(PrepayDiscountRate);
        Prepaypaymentforelectricity_Textbox.sendKeys(Prepaypaymentforelectricity);

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Select HomeTypeLst = new Select(HomeType_Lst);
        HomeTypeLst.selectByVisibleText(HomeType);

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Select HomeTypeonTitleLst = new Select(HomeTypeonTitle_Lst);
        HomeTypeonTitleLst.selectByVisibleText(HomeTypeonTitle);

        ProductionEstimateSource_Textbox.sendKeys(ProductionEstimateSource);
        ProductionEstimateSourceAdjustRatio_Textbox.sendKeys(ProductionEstimateSourceAdjustRatio);

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Select ServiceContractStatusLst = new Select(ServiceContractStatus_Lst);
        ServiceContractStatusLst.selectByVisibleText(ServiceContractStatus);

        SOM1terms_Textbox.sendKeys(SOM1terms);
        SOM2terms_Textbox.sendKeys(SOM2terms);
        SOM3terms_Textbox.sendKeys(SOM3terms);
        SRpanelderate_Textbox.sendKeys(SRpanelderate);
        StartDate_Textbox.sendKeys(StartDate);
        ShoppingPass_Textbox.sendKeys(ShoppingPass);
        RequiredLoanAmount_Textbox.sendKeys(RequiredLoanAmount);
        SunrunLoanDrawAmount_Textbox.sendKeys(SunrunLoanDrawAmount);

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Select ITCSHActLst = new Select(ITCSHAct_Lst);
        ITCSHActLst.selectByVisibleText(ITCSHAct);

        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);
        Select ITCSHTarLst = new Select(ITCSHTar_Lst);
        ITCSHActLst.selectByVisibleText(ITCSHAct);


        GuaranteedProdToDate_Textarea.sendKeys(GuaranteedProdToDate);
        TEYearlyDegradationArray_Textarea.sendKeys(TEYearlyDegradationArray);
        RelatedObjectsLMDate_Textbox.sendKeys(RelatedObjectsLMDate);
        InstallCoordinatorEmail_Textbox.sendKeys(InstallCoordinatorEmail);
        InstallCoordinatorPhone_Textbox.sendKeys(InstallCoordinatorPhone);


        SaveBtn.click();
        TestUtil.Sleep(TestUtil.MEDIUM_WAIT_TIME);

        return new ServiceContractDetailsPage();

    }
}
