package org.crmtesting.model;

import org.testng.annotations.DataProvider;

public class ContragentDataProvider extends DataProviderBase {

    @DataProvider(name = "ContragentDataProvider")
    public Object[][] parameterIntTestProvider() {
        setName("setContragentName");
        setEmail("setcontragent@setcontragent.setcontragent");
        setType("Партнер");
        setActivity("Защита");
        return new Object[][] { { this } };
    }
}