package org.crmtesting.tests;

import org.crmtesting.ConfProperties;
import org.crmtesting.manager.Navigator;
import org.crmtesting.model.AccountData;
import org.crmtesting.pages.ContragentPage;
import org.crmtesting.pages.ContragentsListPage;
import org.crmtesting.pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected Navigator navigator;
    protected ContragentsListPage contragentsListPage;
    protected ContragentPage contragentFormPage;

    @Before
    public void setUp() throws MalformedURLException {
// ToDo mvn clean test -Dgrid.connection.url=http://example.com:4444/wd/hub -Dgrid.browser.name=firefox -Dgrid.browser.version=85.0
// ToDo mvn clean test -Dgrid.connection.url=http://example.com:4444/wd/hub -Dgrid.browser.name=chrome -Dgrid.browser.version=88.0
// ToDo LocalSetup parametr
//        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.get(ConfProperties.getProperty("loginpage"));


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("browserVersion", "88.0");
        capabilities.setCapability("enableVNC", true);
        //capabilities.setCapability("enableVideo", true);
        driver = new RemoteWebDriver(
                URI.create(ConfProperties.getProperty("wdHub")).toURL(),
                capabilities
        );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));

        loginPage  =  new LoginPage(driver);
        loginPage.inputLogin(new AccountData(ConfProperties.getProperty("login"), ConfProperties.getProperty("password")));
        navigator = new Navigator(driver);
        contragentsListPage = new ContragentsListPage(driver);
        contragentFormPage = new ContragentPage(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            loginPage.logoutCRM();
            driver.quit();
        }
    }
}
