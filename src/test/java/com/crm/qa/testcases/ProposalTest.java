package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import com.crm.qa.utilities.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProposalTest {

    LoginPage loginpage;
    HomePage homepage;
    ObjectHomePage objHomePage;
    SelectObjectRecordTypePage RecTypePage;
    ProposalEditPage propEditpage;
    ProposalDetailsPage propDetailspage;


    /*public ProposalTest()
    {
        super();
    }*/

  /*@BeforeClass
    public void Setup() throws InterruptedException {
       initialization();
        loginpage = new LoginPage();
        homepage = loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
    }*/

    @Test(priority = 1, description="Creates a new Proposal",enabled= true)
    public void VerifyCreateNewResidentialAccountTest() throws InterruptedException {

        homepage = new HomePage();
        objHomePage = homepage.ClickAnyTabOnHomePage("Proposals");
        Assert.assertTrue(homepage.ValidateTabLabelDisplayed("Proposals"),"Label Does not exist");

        RecTypePage = objHomePage.ClickOnNewButton();



        propEditpage = new ProposalEditPage();

        propEditpage.FillProposalOverview("Created","Total Solar","Customer Owned - Bank Financed","0","24,250.00","24,250.00","0.0850","0.109","0.0000","3.92","3.92","22,250.21","20","Detached single family home","22,250.00","12/7/2020 4:47 AM","K","MULTI_PARTY","No Fee","0.985","Customer Owned - Bank Financed","10","90","PK3KN99ZN231-K","Customer Owned - Bank Financed","SR Credit Approved","1/4/2021","PK3KN99ZN231:001-K1","20","10,681.00","10,681.00","10,681.00","22,250.00","5/7/2020 10:02 PM","8/5/2019 12:31 PM","EDP Phase-1");
        propEditpage.SystemInformation("5.670","18","1","1","1","11,054","210,887");
        propEditpage.CreditInformation("Cash Contract");
        propEditpage.HomeownerInformation("Kathy Reaves","REAVES, REAVES KATHRYN RUTH (TE)","7370 Silent Water Way, Las Vegas, NV, 89149","Individual","kreaves49@yahoo.com","(256)283-3633","2,100.00");
        propEditpage.PartnerInformation("Deepika Joshi","Sandy - UT","17,826.00","3,420.00","364.98","eduardoatayde@lgcypower.com","(702) 423-3370","2,037.00");
        propEditpage.UtilityInformation("NV Energy South","12,009","1,492.02","RS","RS-88PCT","23.70","1,207","0.0300","1,680","1,400","1,349","517","507","569","1,005","1,456","1,224","627","509","1,151");
        propEditpage.Information("PK3KN99ZN231:001-K","5.670-kWp_11054-kWh","SunRun","2","abc","8/7/2019 7:19 AM");
        propEditpage.ProductRelatedInformation("[9949.0,19847.0,29697.0,39497.0,49248.0,58950.0,68604.0,78210.0,87767.0,97277.0,106739.0,116154.0,125522.0,134843.0,144117.0,153345.0,162527.0,171663.0,180754.0,189798.0]","[29272.00,25566.00,21629.00,17630.00,13566.00,9435.00,7701.00,5894.00,4011.00,2047.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00,0.00]","[1,0.995,0.990025,0.985074875,0.980149500625,0.975248753121875,0.9703725093562656,0.9655206468094842,0.9606930435754368,0.9558895783575596,0.9511101304657719,0.946354579813443, 0.9416228069143757,0.9369146928798039,0.9322301194154049,0.9275689688183278,0.9229311239742362,0.918316468354365,0.9137248860125932,0.9091562615825302]");
        propDetailspage = propEditpage.COBFInformation("24,614.98","11.15","19-11-011899","01","24,614.98","24,614.98","12","LoanPal","0");

        Assert.assertTrue(propDetailspage.ValidateVisibilityofEditButton());


    }

   /*@AfterClass
    public void TearDown()
    {
        driver.quit();
    }*/
}
