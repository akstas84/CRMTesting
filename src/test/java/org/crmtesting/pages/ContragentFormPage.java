package org.crmtesting.pages;

import org.crmtesting.manager.ManagerBase;
import org.crmtesting.model.ContragentData;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContragentFormPage extends PageBase {

    public ContragentFormPage(ManagerBase manager){
        super(manager);
    }

    @FindBy(xpath = "//button[contains(text(),'Сохранить')]" )
    private WebElement btnSave;
    @FindBy(xpath = "//button[contains(text(),'Отменить')]" )
    private WebElement btnCancel;
    @FindBy(xpath = "//input[@type='text'][@data-name='name']")
    private WebElement fildName;
    @FindBy(xpath = "//input[@class='form-control email-address']")
    private WebElement fildEmail;
    @FindBy (xpath = "//select[@data-name='type']")
    private WebElement selectType;
    @FindBy (xpath = "//select[@data-name='industry']")
    private WebElement selectActivity;

    public ContragentFormPage  fillContragentForm(ContragentData contragentData) {
        fildName.sendKeys(contragentData.name());
        fildEmail.sendKeys(contragentData.mail());
        Select typeDropdown = new Select(selectType);
        typeDropdown.selectByVisibleText(contragentData.type());
        Select activityDropdown = new Select(selectActivity);
        activityDropdown.selectByVisibleText(contragentData.activity());
        return this;
    }
    public ContragentFormPage clickToSaveBtn(){
        btnSave.click();
        return this;
    }
}
