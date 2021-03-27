package org.crmtesting.tests;

import org.crmtesting.model.ContragentDataProvider;
import org.testng.annotations.Test;

public class CreateContragentTests extends TestBase {

    @Test(dataProvider = "ContragentDataProvider",
            dataProviderClass = ContragentDataProvider.class)
    public void createContragentTest(ContragentDataProvider data) throws Exception {
        navigator
                .goToContragentPage();
        contragentsListPage
                .deleteContragent()
                .clickByCreateContragentButton();
        contragentFormPage
                .fillContragentForm(data)
                .clickToSaveBtn()
                .CheckResualsAfterCreatedContragent(data);
    }
}
