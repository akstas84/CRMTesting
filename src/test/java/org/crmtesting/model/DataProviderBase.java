package org.crmtesting.model;

public class DataProviderBase {

    protected String name = "ContragentName";
    protected String email = "contragent@contragent.contragent";
    protected String type = "Заказчик";
    protected String activity = "Архитектура";

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

    @Override
    public String toString() {
        return "TestData{" +
                ", name ='" + name + '\'' +
                ", email='" + email + '\'' +
                ", type =" + type +
                ", activity =" + activity +
                '}';
    }
}
