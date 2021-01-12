package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class ServiceContractTest extends TestBase {

    LoginPage loginpage;
    HomePage homepage;
    ObjectHomePage objHomePage;
    ServiceContractEditPage SCEditPage;
    ServiceContractDetailsPage SCDetailsPage;
    SelectObjectRecordTypePage SelectObjRecTypePage;

    public ServiceContractTest()
    {
        super();
    }

    @BeforeMethod
    public void Setup() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        homepage = loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
    }

    @Test
    public void CreateNewServiceContractTest() throws InterruptedException {

        objHomePage = homepage.ClickAnyTabOnHomePage("Service Contracts");
        Assert.assertTrue(homepage.ValidateTabLabelDisplayed("Service Contracts"),"Label Does not exist");

        SelectObjRecTypePage = objHomePage.ClickOnNewButton();

        SCEditPage = new ServiceContractEditPage();
        SCDetailsPage = SCEditPage.CreateNewServiceContract("9/20/2019",	"10",	"11/22/2019",	"90",	"1",	"0",	"106.47",	"0",	"0",	"Kitted",	"NTP",	"09. M2 received, Awaiting PTO",	"Customer Owned - Bank Financed",	"9/19/2019",	"Auto1_2115006529",	"Auto1_2115006529",	"4067-32-59-0211",	"Auto1_406732590211",	"0",	"1",	"0",	"MULTI_PARTY",	"deepika16@yopmail.com",	"0",	"0",	"0",	"0",	"Customer Owned - Bank Financed",	"PPA",	"10681",	"1.88",	"20",	"210887.15",	"11054",	"NV Energy",	"0.085",	"10681",	"Roof",	"LGCY Power, LLC",	"Sunrun",	"5.67",	"One-time",	"Email",	"Lease",	"22250",	"10681",	"0",	"999.5",	"0.109",	"0",	"0",	"0",	"0",	"0",	"2037",	"17826",	"3420",	"364.98",	"{0.06784874253663832,0.06450153790483083,0.09073638501899765,0.09444544961100054,0.09996381400398045,0.09363126470056088,0.0915505699294373,0.08856522525782522,0.08856522525782522,0.08377058078523611,0.07101501718834811,0.06540618780531934}",	"7370 Silent Water Way, Las Vegas, NV, USA, 89149; Proposal Name: PK3KN99ZN196-K; Proposal Name: PK3KN99ZN196:001-K; Meter Serial Number: 731B0C35-CF",	"{0.06784874253663832,0.06450153790483083,0.09073638501899765,0.09444544961100054,0.09996381400398045,0.09363126470056088,0.0915505699294373,0.08856522525782522,0.08856522525782522,0.08377058078523611,0.07101501718834811,0.06540618780531934}",	"24614.98",	"11.15",	"LoanPal",	"No Fee",	"Draft",	"0.6",	"0.3",	"0.1",	"2",	"10681",	"0.085",	"11054",	"0",	"08-05-2039",	"1",	"Sandy - UT",	"4.25",	"22250",	"Detached single family home",	"SFR (Single Family Residence)",	"SUNSIM-1.1",	"1",	"Active",	"0.6",	"0.2",	"0.2",	"1",	"08-05-2019",	"19-11-011899",	"24614.98",	"24614.98",	"SH2020",	"SH2019",	"[9949.0,19847.0,29697.0,39497.0,49248.0,58950.0,68604.0,78210.0,87767.0,97277.0,106739.0,116154.0,125522.0,134843.0,144117.0,153345.0,162527.0,171663.0,180754.0,189798.0]",	"57719,0.946354579813443, 0.9416228069143757,0.9369146928798039,0.9322301194154049,0.9275689688183278,0.9229311239742362,0.918316468354365,0.9137248860125932,0.9091562615825302]",	"5/28/2020 2:15 AM",	"deepika16@yopmail.com",	"(702) 324-9897");

        SCDetailsPage.ValidateServiceContractDetailLabel();
        SCDetailsPage.ValidateVisibilityofEditButton();

    }

    @AfterMethod
    public void TearDown()
    {
        driver.quit();
    }

}
