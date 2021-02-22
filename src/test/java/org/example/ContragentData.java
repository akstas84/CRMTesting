package org.example;

public class ContragentData {

    private String name;
    private String email;
    private String type;
    private String activity;

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
