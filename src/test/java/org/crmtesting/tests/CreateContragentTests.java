package org.crmtesting.tests;

import org.crmtesting.model.ContragentDataProvider;
import org.crmtesting.model.ContragentWithJsonDataProvider;
import org.testng.annotations.Test;

public class CreateContragentTests extends TestBase {

    @Test(dataProvider = "ContragentDataProvider",
            dataProviderClass = ContragentDataProvider.class)
    public void createContragentTest(ContragentDataProvider data) throws Exception {
        navigator
                .goToContragentPage();
        contragentsListPage
                .clickByCreateContragentButton();
        contragentFormPage
                .fillContragentForm(data)
                .clickToSaveBtn()
                .CheckResualsAfterCreatedContragent(data);
    }

    @Test(dataProvider = "ContragentWithJsonDataProvider",dataProviderClass = ContragentWithJsonDataProvider.class)
    public void createContragentTwoTest(String FirstName, String email, String type,String activity) throws Exception {
        navigator
                .goToContragentPage();
        contragentsListPage
                .clickByCreateContragentButton();
        contragentFormPage
                .fillContragentForm(FirstName, email, type, activity)
                .clickToSaveBtn()
                .CheckResualsAfterCreatedContragent(FirstName); //ToDo
    }
}
