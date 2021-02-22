package org.testing;

public class AccountData {

    private String username;
    private String password;

    AccountData(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String name() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String password() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
