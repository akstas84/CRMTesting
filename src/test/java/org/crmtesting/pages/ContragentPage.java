package org.crmtesting.pages;

import org.crmtesting.model.ContragentDataProvider;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

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

    public ContragentPage fillContragentForm(ContragentDataProvider data) {
        fieldName.sendKeys(data.getName());
        fieldEmail.sendKeys(data.getEmail());
        Select typeDropdown = new Select(selectType);
        typeDropdown.selectByVisibleText(data.getType());
        Select activityDropdown = new Select(selectActivity);
        activityDropdown.selectByVisibleText(data.getActivity());
        return this;
    }
    public ContragentPage clickToSaveBtn(){
        btnSave.click();
        return this;
    }
    public ContragentPage CheckResualsAfterCreatedContragent(ContragentDataProvider data) throws InterruptedException {
        Thread.sleep(2000); // Todo
        String strName = nameCreatedContragent.getText();
        Assert.assertEquals(strName ,  data.getName(), "Имя контрагента "
                + strName + "не совпадает с проверяемым после создания :" + data.getName());
        return this;
    }
}
