package org.crmtesting.pages;

import org.crmtesting.manager.ManagerBase;
import org.crmtesting.model.AccountData;
import org.crmtesting.pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement fieldUserName(){
        return driver.findElement(By.id("field-userName"));
    }
//    @FindBy(id ="field-userName")
//    @CacheLookup
//    private WebElement fieldUserName;

    private WebElement feildPassword(){
        return driver.findElement(By.id("field-password"));
    }
    private WebElement btnLogin(){
        return driver.findElement(By.id("btn-login"));
    }

    public void inputUserName(AccountData accountData) {
          fieldUserName().sendKeys(accountData.name());
     //   fieldUserName.sendKeys(accountData.name());
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
        driver.findElement(By.id("nav-menu-dropdown")).click();
        driver.findElement(By.linkText("Выйти")).click();
    }
}
