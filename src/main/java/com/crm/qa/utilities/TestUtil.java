package com.crm.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.*;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TestUtil extends TestBase {
    public static long PAGE_LOAD_TIMEOUT = 60;
    public static long IMPLICIT_WAIT = 30;
    public static long timeInMilliSec;
    public static int XSMALL_WAIT_TIME = 2;
    public static int SMALL_WAIT_TIME = 5;
    public static int MEDIUM_WAIT_TIME = 30;
    public static int LARGE_WAIT_TIME = 60;

    public static String TESTDATA_SHEET_PATH = "D:\\Deepika\\Sunrun\\crmautomation\\src\\main\\java\\com\\crm\\qa\\testdata\\AutomationTestData.xlsx";

    static Workbook book;
    static Sheet sheet;
    static JavascriptExecutor js;




    public static void SwitchToFrame(String Name)
    {
        driver.switchTo().frame(Name);
    }


    public static Object[][] getTestData(String sheetName) {
        FileInputStream file = null;//frame[@name='resultsFrame']
        try {
            file = new FileInputStream(TESTDATA_SHEET_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {

            assert file != null;
            book = WorkbookFactory.create(file);

        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = book.getSheet(sheetName);
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        // System.out.println(sheet.getLastRowNum() + "--------" +
        // sheet.getRow(0).getLastCellNum());
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
                // System.out.println(data[i][k]);
            }
        }
        return data;
    }

    public static void takeScreenshotAtEndOfTest() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("user.dir");
        FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
    }

    public static void WaitForElementToBeVisible(WebDriver driver, WebElement locator, int timeout) {
        new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(locator));
    }

    public static void WaitForElementToBeClickable(WebDriver driver, WebElement locator, int timeout) {
        new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void ClickOn(WebDriver driver, WebElement locator, int timeout) {
        try {
            new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
            locator.click();
        } catch (ElementClickInterceptedException e) {
            locator.click();
        }
    }

    public static void SwitchToMainWindow() {
        String oldTab = driver.getWindowHandle();
        driver.switchTo().window(oldTab);
    }

    public static void SwitchToNewWindow() {
        String NewWindow = driver.getWindowHandle();
        driver.switchTo().window(NewWindow);
    }

    public static void SwitchToNewTab(int TabIndex) {
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(newTab.size());
        driver.switchTo().window(newTab.get(TabIndex));
    }

    public static void drawBorder(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.border='1px solid red'", element);
    }

    public static void ScrollIntoView(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    public static void refreshBrowserByJS(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("history.go(0)");
    }

    public static void clickElementByJS(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", element);

    }

    public static void DoubleclickElementByJS(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("var evt = document.createEvent('MouseEvents');" +
                "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" +
                "arguments[0].dispatchEvent(evt);", element);


    }

    public static void changeColor(String color, WebElement element, WebDriver driver) throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            Thread.sleep(20);
        }
    }

    public static void flash(WebElement element, WebDriver driver) throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor = element.getCssValue("backgroundColor");
        for (int i = 0; i < 10; i++) {
            changeColor("rgb(0,200,0)", element, driver);//1
            changeColor(bgcolor, element, driver);//2
        }
    }

    public static void Sleep(int timeInSeconds) throws InterruptedException {
        timeInMilliSec = timeInSeconds*1000;
        Thread.sleep(timeInMilliSec);
    }

    public static void SelectRequiredObjectFromLookup(String ObjectLabel, String RecordName) throws InterruptedException {

            //SwitchToMainWindow();
            driver.findElement(By.xpath("//label[text()='" + ObjectLabel + "']//following::span/a/img[contains(@title,'" + ObjectLabel + " Lookup')]")).click();
            Sleep(SMALL_WAIT_TIME);
            Set<String> S1 = driver.getWindowHandles();
            Iterator it = S1.iterator();
            String parentwindow =(String) it.next();
            String childWindow =(String) it.next();

           // driver.findElement(By.xpath("//label[text()='" + Object + "']//following::span/a/img[contains(@title,'" + Object + " Lookup')]")).click();

            driver.switchTo().window(childWindow);
            SwitchToFrame("searchFrame");
            driver.findElement(By.xpath("//input[@name='lksrch']")).sendKeys(RecordName);
            driver.findElement(By.xpath("//input[@title='Go!']")).click();
            Sleep(SMALL_WAIT_TIME);
            driver.switchTo().defaultContent();
            Sleep(XSMALL_WAIT_TIME);
            SwitchToFrame("resultsFrame");
            Sleep(XSMALL_WAIT_TIME);
            driver.findElement(By.xpath("//a[text()='" + RecordName + "']")).click();
            Sleep(XSMALL_WAIT_TIME);

            driver.switchTo().window(parentwindow);
            driver.switchTo().defaultContent();

            WaitForElementToBeVisible(driver,driver.findElement(By.xpath("(//img[contains(@title,'" + ObjectLabel + "')]//ancestor::span/input)[1]")),10);
            Assert.assertTrue(driver.findElement(By.xpath("(//img[contains(@title,'" + ObjectLabel + "')]//ancestor::span/input)[1]")).isDisplayed());

    }

    public static void UpdateRecordsFromBackend(String Query, String DBUrl) throws InterruptedException {


        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://workbench.developerforce.com/login.php");

        WebElement Environment_Lst = driver.findElement(By.id("oauth_env"));
        TestUtil.WaitForElementToBeClickable(driver,Environment_Lst,2000);

        Select EnvironmentLst = new Select(Environment_Lst);
        EnvironmentLst.selectByVisibleText("Sandbox");
        TestUtil.Sleep(TestUtil.XSMALL_WAIT_TIME);

        WebElement TermsofService_Checkbox = driver.findElement(By.id("termsAccepted"));
        TermsofService_Checkbox.click();

        WebElement LoginWithSF_Btn = driver.findElement(By.xpath("//input[@value='Login with Salesforce']"));
        LoginWithSF_Btn.click();

        WebElement Utilities = driver.findElement(By.xpath("//span[text()='utilities']"));
        TestUtil.WaitForElementToBeClickable(driver,Utilities,10000);
        Actions action = new Actions(driver);
        action.moveToElement(Utilities).build().perform();
        WebElement ApexExecute_Lnk = driver.findElement(By.xpath("//a[text()='Apex Execute']"));
        TestUtil.WaitForElementToBeClickable(driver,ApexExecute_Lnk,10000);
        ApexExecute_Lnk.click();

        WebElement ScriptInput_Textarea = driver.findElement(By.id("scriptInput"));
        TestUtil.WaitForElementToBeVisible(driver,ScriptInput_Textarea,10000);

        ScriptInput_Textarea.sendKeys(Query);

        WebElement Execute_Btn = driver.findElement(By.xpath("//input[@value='Execute']"));
        Execute_Btn.click();

        WebElement ResultsText = driver.findElement(By.xpath("//div[contains(@id,'async-container')]/pre[contains(text(),'APEX_CODE')]"));
        TestUtil.WaitForElementToBeVisible(driver,ResultsText,200000);

        driver.switchTo().window(tabs.get(0));
        TestUtil.Sleep(2);
        TestUtil.refreshBrowserByJS(driver);
        TestUtil.Sleep(5);


    }

    public static String GetRecordIDFromUrl(){

        String CurrentUrl = driver.getCurrentUrl();
        System.out.println(CurrentUrl);

        String[] Urlsplit1 = CurrentUrl.split("//");
        System.out.println(Urlsplit1[1]);

        String[] Urlsplit2 = Urlsplit1[1].split("/");
        System.out.println(Urlsplit2[1]);

        String[] Urlsplit3 = Urlsplit2[1].split("\\?");
        System.out.println(Urlsplit3[0]);

        String RecordID = Urlsplit3[0].toString();
        System.out.println(RecordID);
        return RecordID;

    }



}
