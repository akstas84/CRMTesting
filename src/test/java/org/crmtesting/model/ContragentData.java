package org.crmtesting.model;

public class ContragentData {

    private String name = "ContragentName";
    private String email = "contragent@contragent.contragent";
    private String type = "Партнер";
    private String activity = "Защита";

    public ContragentData(){}

    public ContragentData(String name, String email, String type, String activity){
        this.name = name;
        this.email = email;
        this.type = type;
        this.activity =  activity;
    }

    public String name() {
        return name;
    }
    public String mail() {
        return email;
    }
    public String type() {
        return type;
    }
    public String activity() {
        return activity;
    }
}
