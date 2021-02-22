package org.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ManagerBase {
    protected static WebDriver driver;

    protected static LoginPage loginPage;
    protected static Navigator navigator;
    protected static ContragentsListPage contragentsListPage;
    protected static ContragentFormPage contragentFormPage;

    public ManagerBase(){
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        loginPage  =  new LoginPage(this);
        navigator = new Navigator(this);
        contragentsListPage = new ContragentsListPage(this);
        contragentFormPage = new ContragentFormPage(this);
    }

    public static WebDriver driver() {
        return driver;
    }

    public void stop() {
        loginPage.logoutCRM();
        driver.quit();
    }

    public static LoginPage loginPage() {
        return loginPage;
    }

    public static Navigator navigator() {
        return navigator;
    }

    public static ContragentsListPage contragentsListPage() {
        return contragentsListPage;
    }

    public static ContragentFormPage contragentFormPage() {
        return contragentFormPage;
    }
}