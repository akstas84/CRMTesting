package org.crmtesting.manager;

import org.crmtesting.pages.LoginPage;
import org.crmtesting.pages.ContragentPage;
import org.crmtesting.pages.ContragentsListPage;
import org.openqa.selenium.WebDriver;

// ToDo managerBase

public class ManagerBase {
    protected static WebDriver driver;

    protected static LoginPage loginPage;
    protected static Navigator navigator;
    protected static ContragentsListPage contragentsListPage;
    protected static ContragentPage contragentFormPage;

    public ManagerBase() {
    }

    public static WebDriver driver() {
        return driver;
    }

    public void stop() {
        if (driver != null) {
            loginPage.logoutCRM();
            driver.quit();
        }
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

    public static ContragentPage contragentFormPage() {
        return contragentFormPage;
    }
}
