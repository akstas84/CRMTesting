package org.crmtesting.model;

import org.testng.annotations.DataProvider;

public class ContragentDataProvider {

    private String name = "ContragentName";
    private String email = "contragent@contragent.contragent";
    private String type = "Партнер";
    private String activity = "Защита";

    @DataProvider(name = "ContragentDataProvider")
    public Object[][] parameterIntTestProvider() {
        setName("setContragentName");
        setEmail("setcontragent@setcontragent.setcontragent");
        setType("Партнер");
        setActivity("Защита");
        return new Object[][] { { this } };
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getType() {
        return type;
    }
    public String getActivity() {
        return activity;
    }
}
