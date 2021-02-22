package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContragentsListPage extends PageBase {

    public ContragentsListPage(WebDriver driver)  {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='btn-group actions open']/ul[@class='dropdown-menu actions-menu' and 1]")
    @CacheLookup
    private List<WebElement> listDropElement;

    @FindBy(css ="div#main td:nth-child(1) > span > input")
    @CacheLookup
    private WebElement chekboxContragent;

    @FindBy(xpath ="//button[contains(text(),'Действия')]")
    @CacheLookup
    private WebElement btnActions;

    @FindBy(xpath ="//div[@class=\"btn-group actions open\"]//a[contains(text(),'Удалить')]") // Cor
    @CacheLookup
    private WebElement btnDelete;

    @FindBy(xpath = "//button[@data-name=\"confirm\"]")
    @CacheLookup
    private WebElement btnDeleteConfirm;

    public ContragentsListPage deleteContragent(String tmpStr){
        if(isElementPresent(chekboxContragent)) {
            chekboxContragent.click();
            btnActions.click();
            for (WebElement webElement : listDropElement) {
                if(webElement.getText() == tmpStr){
                    webElement.click();
                    break;
                }
            }
            btnDelete.click();
            btnDeleteConfirm.click();
        }
        return this;
    }

    public ContragentsListPage clickByCreateContragentButton() throws InterruptedException {
        driver.findElement(By.linkText("Создать контрагента")).click();
        Thread.sleep(1000);  // temp
        return this;
    }


    public boolean isElementPresent(WebElement element){    //move in tools
        try {
            element.isEnabled();
            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public ContragentsListPage CheckResualsAfterCreatedContragent() {
        // Assert
        return this;
    }
}