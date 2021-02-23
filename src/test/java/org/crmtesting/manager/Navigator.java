package org.crmtesting.manager;

import org.crmtesting.manager.ManagerBase;
import org.crmtesting.pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Navigator extends PageBase {

    public Navigator(ManagerBase manager){
        super(manager);
    }

    private WebElement btnContragents() {
        return manager.driver().findElement(By.xpath("//span[.='Контрагенты']"));
    }
    private WebElement btnMain() {
        return manager.driver().findElement(By.xpath("//span[.='Главная']"));
    }

    public void goToContragentPage() {
        btnContragents().click();
    }
    public void goToMainPage() {
        btnMain().click();
    }
}
