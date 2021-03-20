package org.crmtesting.pages;

import org.crmtesting.model.ContragentData;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContragentPage extends PageBase {

    public ContragentPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'Сохранить')]" )
    private WebElement btnSave;
    @FindBy(xpath = "//button[contains(text(),'Отменить')]" )
    private WebElement btnCancel;
    @FindBy(xpath = "//input[@type='text'][@data-name='name']")
    private WebElement fieldName;
    @FindBy(xpath = "//input[@class='form-control email-address']")
    private WebElement fieldEmail;
    @FindBy (xpath = "//select[@data-name='type']")
    private WebElement selectType;
    @FindBy (xpath = "//select[@data-name='industry']")
    private WebElement selectActivity;
    @FindBy(xpath = "//div[@class='field'][@data-name='name']")
    private WebElement nameCreatedContragent;

    public ContragentPage fillContragentForm(ContragentData contragentData) {
        fieldName.sendKeys(contragentData.name());
        fieldEmail.sendKeys(contragentData.mail());
        Select typeDropdown = new Select(selectType);
        typeDropdown.selectByVisibleText(contragentData.type());
        Select activityDropdown = new Select(selectActivity);
        activityDropdown.selectByVisibleText(contragentData.activity());
        return this;
    }
    public ContragentPage clickToSaveBtn(){
        btnSave.click();
        return this;
    }
    public ContragentPage CheckResualsAfterCreatedContragent(String str) throws InterruptedException {
        Thread.sleep(2000); //temp
        String strName = nameCreatedContragent.getText();
        Assert.assertEquals("", strName ,  str);
        return this;
    }
}
