package org.crmtesting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContragentsListPage extends PageBase {

    public ContragentsListPage(WebDriver driver)  {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='btn-group actions open']/ul[@class='dropdown-menu actions-menu' and 1]")
    private List<WebElement> listDropElement;
    @FindBy(css ="div#main td:nth-child(1) > span > input")
    private WebElement chekboxContragent;
    @FindBy(xpath ="//button[contains(text(),'Действия')]")
    private WebElement btnActions;
    @FindBy(xpath ="//div[@class=\"btn-group actions open\"]//a[contains(text(),'Удалить')]") // Cor
    private WebElement btnDelete;
    @FindBy(xpath = "//button[@data-name=\"confirm\"]")
    private WebElement btnDeleteConfirm;
    @FindBy(xpath = "//a[@class='btn btn-default action']")
    private WebElement btnCreateContragent;

    public ContragentsListPage deleteContragent(){
        if(isElementPresent(chekboxContragent)) {
            chekboxContragent.click();
            btnActions.click();
            for (WebElement webElement : listDropElement) {
                if(webElement.getText() == "Удалить"){
                    webElement.click();
                    break;
                }
            }
            btnDelete.click();
            btnDeleteConfirm.click();
        }
        return this;
    }

    public ContragentsListPage clickByCreateContragentButton() {
        btnCreateContragent.click();
        return this;
    }

    public boolean isElementPresent(WebElement element){    //move to tools
        try {
            element.isEnabled();
            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
