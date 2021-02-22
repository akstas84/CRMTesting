package org.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected static WebDriver driver;
    protected static LoginPage loginPage;
    protected static Navigator navigator;
    protected static ContragentsListPage contragentsListPage;
    protected static ContragentFormPage contragentFormPage;

    @BeforeClass
    public static void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));
        loginPage  =  new LoginPage(driver);
        navigator = new Navigator(driver);
        contragentsListPage = new ContragentsListPage(driver);
        contragentFormPage = new ContragentFormPage(driver);
        loginPage.inputLogin(new AccountData(ConfProperties.getProperty("login"), ConfProperties.getProperty("passwd")));
    }

    @AfterClass
    public static void tearDown() throws Exception {
        loginPage.logoutCRM();
        driver.quit();
    }
}
