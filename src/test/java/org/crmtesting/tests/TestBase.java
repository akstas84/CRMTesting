package org.crmtesting.tests;

import org.crmtesting.ConfProperties;
import org.crmtesting.manager.ManagerBase;
import org.crmtesting.model.AccountData;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static ManagerBase manager;

    @BeforeClass
    public static void setUp() {
        manager = new ManagerBase();
        manager.driver().manage().window().maximize();
        manager.driver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        manager.driver().get(ConfProperties.getProperty("loginpage"));
        manager.loginPage().inputLogin(new AccountData(ConfProperties.getProperty("login"), ConfProperties.getProperty("passwd")));
    }

    @AfterClass
    public static void tearDown() {
        manager.stop();
    }
}
