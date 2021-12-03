package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.crm.qa.utilities.WebEventListener;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.utilities.TestUtil;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;
    public static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;
    public static WebDriverWait wait;

    public int RESPONSE_STATUS_CODE_200 = 200;
    public int RESPONSE_STATUS_CODE_500 = 500;
    public int RESPONSE_STATUS_CODE_400 = 400;
    public int RESPONSE_STATUS_CODE_401 = 401;
    public int RESPONSE_STATUS_CODE_201 = 201;



    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("D:\\Deepika\\Sunrun\\crmautomation\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");


                prop.load(ip);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void initialization() {
        String BrowserName = prop.getProperty("Browser");
        if (BrowserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:/Deepika/Chromedriver/chromedriver.exe");
            driver = new ChromeDriver();

            e_driver = new EventFiringWebDriver(driver);
            // Now create object of EventListerHandler to register it with EventFiringWebDriver
            eventListener = new WebEventListener();
            e_driver.register(eventListener);
            driver = e_driver;

            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

            driver.get(prop.getProperty("Url"));
            driver.manage().window().maximize();
        }



    }



   /* public static void WaitForElementToBeVisible(WebDriver driver, WebElement locator, int timeout) {
        new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(locator));
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

    public static void SwitchToNewWindow(int TabIndex) {
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

    public static void changeColor(String color, WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
        }
    }

    public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor = element.getCssValue("backgroundColor");
        for (int i = 0; i < 10; i++) {
            changeColor("rgb(0,200,0)", element, driver);//1
            changeColor(bgcolor, element, driver);//2
        }
    }*/
}





