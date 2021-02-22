package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private WebElement fieldUserName(){
        return driver.findElement(By.id("field-userName"));
    }
    private WebElement feildPassword(){
        return driver.findElement(By.id("field-password"));
    }
    private WebElement btnLogin(){
        return driver.findElement(By.id("btn-login"));
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
        LoginPage loginPage = new LoginPage(driver); //
        loginPage.inputUserName(accountData);
        loginPage.inputPassword(accountData);
        loginPage.clickButton();
    }

    public void logoutCRM(){
        driver.findElement(By.id("nav-menu-dropdown")).click();
        driver.findElement(By.linkText("Выйти")).click();
    }
}
