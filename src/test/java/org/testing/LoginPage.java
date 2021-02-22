package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage extends PageBase {

    public LoginPage(ManagerBase manager) {
        super(manager);
    }

    private WebElement fieldUserName(){
        return manager.driver().findElement(By.id("field-userName"));
    }
    private WebElement feildPassword(){
        return manager.driver().findElement(By.id("field-password"));
    }
    private WebElement btnLogin(){
        return manager.driver().findElement(By.id("btn-login"));
    }

    public void inputUserName(AccountData accountData) {
        fieldUserName().sendKeys(accountData.name());
    }
    public void inputPassword(AccountData accountData) {
        feildPassword().sendKeys(accountData.password());
    }
    public void clickButton() {
        btnLogin().click();
    }

    public void inputLogin(AccountData accountData) {
        inputUserName(accountData);
        inputPassword(accountData);
        clickButton();
    }

    public void logoutCRM(){
        manager.driver().findElement(By.id("nav-menu-dropdown")).click();
        manager.driver().findElement(By.linkText("Выйти")).click();
    }
}
