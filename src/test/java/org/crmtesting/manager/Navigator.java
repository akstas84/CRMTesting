package org.crmtesting.manager;

import org.crmtesting.pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigator extends PageBase {

    public Navigator(WebDriver driver){
        super(driver);
    }

    private WebElement btnContragents() {
        return driver.findElement(By.xpath("//span[.='Контрагенты']"));
    }
    private WebElement btnMain() {
        return driver.findElement(By.xpath("//span[.='Главная']"));
    }

    public void goToContragentPage() {
        btnContragents().click();
    }
    public void goToMainPage() {
        btnMain().click();
    }
}
